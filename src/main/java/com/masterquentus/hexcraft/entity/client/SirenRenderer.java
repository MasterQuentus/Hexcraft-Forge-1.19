package com.masterquentus.hexcraft.entity.client;

import com.google.common.collect.Maps;
import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.SirenEntity;
import com.masterquentus.hexcraft.entity.variant.SirenVariant;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SirenRenderer extends GeoEntityRenderer<SirenEntity> {
    public static final Map<SirenVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SirenVariant.class), (p_114874_) -> {
                p_114874_.put(SirenVariant.DEFAULT,
                        new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/siren/siren.png"));
                p_114874_.put(SirenVariant.RED,
                        new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/siren/sirenred.png"));
                p_114874_.put(SirenVariant.GREEN,
                        new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/siren/sirengreen.png"));
            });

    public SirenRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SirenModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(SirenEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getType());
    }

    @Override
    public RenderType getRenderType(SirenEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        if(animatable.isBaby()) {
            stack.scale(0.4F, 0.4F, 0.4F);
        } else {
            stack.scale(0.8F, 0.8F, 0.8F);
        }

        stack.mulPose(Quaternion.fromXYZDegrees(new Vector3f(0f, 90f, 0f)));

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}