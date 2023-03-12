package com.masterquentus.hexcraft.client.renderer;

import com.google.common.collect.ImmutableMap;
import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.client.model.HexcraftBoatModel;
import com.masterquentus.hexcraft.entity.custom.HexcraftBoatEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.datafixers.util.Pair;
import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

import java.util.Map;
import java.util.stream.Stream;

public class HexcraftBoatRenderer extends EntityRenderer<HexcraftBoatEntity> {

    private final Map<HexcraftBoatEntity.Type, Pair<ResourceLocation, HexcraftBoatModel>> boatResources;

    public HexcraftBoatRenderer(EntityRendererProvider.Context p_234563_) {
        super(p_234563_);
        this.shadowRadius = 0.8F;
        this.boatResources = Stream.of(HexcraftBoatEntity.Type.values()).collect(ImmutableMap.toImmutableMap((type) -> type,
                (type) -> Pair.of(new ResourceLocation(getTextureLocation(type)), this.createBoatModel(p_234563_, type))));
    }

    private HexcraftBoatModel createBoatModel(EntityRendererProvider.Context context, HexcraftBoatEntity.Type type) {
        ModelLayerLocation modellayerlocation =
                new ModelLayerLocation(new ResourceLocation(Hexcraft.MOD_ID, "boat/" + type.getName()), "main");
        return new HexcraftBoatModel<>(context.bakeLayer(modellayerlocation));
    }

    private static String getTextureLocation(HexcraftBoatEntity.Type type) {
        return "textures/entity/boats/" + type.getName() + ".png";
    }

    public void render(HexcraftBoatEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.pushPose();
        pMatrixStack.translate(0.0D, 0.375D, 0.0D);
        pMatrixStack.mulPose(Vector3f.YP.rotationDegrees(180.0F - pEntityYaw));
        float f = (float)pEntity.getHurtTime() - pPartialTicks;
        float f1 = pEntity.getDamage() - pPartialTicks;
        if (f1 < 0.0F) {
            f1 = 0.0F;
        }

        if (f > 0.0F) {
            pMatrixStack.mulPose(Vector3f.XP.rotationDegrees(Mth.sin(f) * f * f1 / 10.0F * (float)pEntity.getHurtDir()));
        }

        float f2 = pEntity.getBubbleAngle(pPartialTicks);
        if (!Mth.equal(f2, 0.0F)) {
            pMatrixStack.mulPose(new Quaternion(new Vector3f(1.0F, 0.0F, 1.0F), pEntity.getBubbleAngle(pPartialTicks), true));
        }

        Pair<ResourceLocation, HexcraftBoatModel> pair = getModelWithLocation(pEntity);
        ResourceLocation resourcelocation = pair.getFirst();
        HexcraftBoatModel boatmodel = pair.getSecond();
        pMatrixStack.scale(-1.0F, -1.0F, 1.0F);
        pMatrixStack.mulPose(Vector3f.YP.rotationDegrees(90.0F));
        boatmodel.setupAnim(pEntity, pPartialTicks, 0.0F, -0.1F, 0.0F, 0.0F);
        VertexConsumer vertexconsumer = pBuffer.getBuffer(boatmodel.renderType(resourcelocation));
        boatmodel.renderToBuffer(pMatrixStack, vertexconsumer, pPackedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        if (!pEntity.isUnderWater()) {
            VertexConsumer vertexconsumer1 = pBuffer.getBuffer(RenderType.waterMask());
            boatmodel.getWaterPatch().render(pMatrixStack, vertexconsumer1, pPackedLight, OverlayTexture.NO_OVERLAY);
        }

        pMatrixStack.popPose();
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

    public ResourceLocation getTextureLocation(HexcraftBoatEntity boat) {
        return getModelWithLocation(boat).getFirst();
    }

    public Pair<ResourceLocation, HexcraftBoatModel> getModelWithLocation(HexcraftBoatEntity boat) {
        return this.boatResources.get(boat.getHexcraftBoatType());
    }
}
