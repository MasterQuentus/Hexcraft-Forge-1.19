package com.masterquentus.hexcraft.client.model;

import com.google.common.collect.ImmutableList;
import com.masterquentus.hexcraft.entity.custom.HexcraftBoatEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.vehicle.Boat;

public class HexcraftBoatModel<T extends HexcraftBoatEntity> extends EntityModel<T> {

    private final ModelPart root;
    private final ModelPart leftPaddle;
    private final ModelPart rightPaddle;
    private final ModelPart waterPatch;

    public HexcraftBoatModel(ModelPart root) {
        this.root = root;
        this.leftPaddle = root.getChild("left_paddle");
        this.rightPaddle = root.getChild("right_paddle");
        this.waterPatch = root.getChild("water_patch");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        partdefinition.addOrReplaceChild("water_patch", CubeListBuilder.create().texOffs(0, 32).addBox(-10.0F, -2.0F, -8.0F, 20.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        partdefinition.addOrReplaceChild("left_side", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 1.0F, 8.0F, 20.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        partdefinition.addOrReplaceChild("front_side", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 0.0F, 10.0F, 20.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
        partdefinition.addOrReplaceChild("right_side", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 0.0F, 8.0F, 20.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
        partdefinition.addOrReplaceChild("back_side", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 0.0F, 10.0F, 20.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
        partdefinition.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 8).addBox(-12.0F, -8.0F, -2.0F, 24.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
        partdefinition.addOrReplaceChild("left_paddle", CubeListBuilder.create().texOffs(4, 12).addBox(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).addBox(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F), PartPose.offsetAndRotation(3.0F, -5.0F, 9.0F, 0.0F, 0.0F, 0.19634955F));
        partdefinition.addOrReplaceChild("right_paddle", CubeListBuilder.create().texOffs(4, 12).addBox(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).addBox(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F), PartPose.offsetAndRotation(3.0F, -5.0F, -9.0F, 0.0F, (float)Math.PI, 0.19634955F));

        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    public ModelPart getWaterPatch() {
        return this.waterPatch;
    }

    @Override
    public void setupAnim(T boat, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root.y = 4F;
        this.root.xRot = Mth.PI;
        this.leftPaddle.y = 10F;
        this.rightPaddle.y = 10F;
        animatePaddle(boat, 0, this.leftPaddle, limbSwing);
        animatePaddle(boat, 1, this.rightPaddle, limbSwing);
    }

    @Override
    public void renderToBuffer(PoseStack pPoseStack, VertexConsumer pBuffer, int pPackedLight, int pPackedOverlay, float pRed, float pGreen, float pBlue, float pAlpha) {
        root.render(pPoseStack, pBuffer, pPackedLight, pPackedOverlay, pRed, pGreen, pBlue, pAlpha);
    }

    private static void animatePaddle(HexcraftBoatEntity pBoat, int pSide, ModelPart pPaddle, float pLimbSwing) {
        float f = pBoat.getRowingTime(pSide, pLimbSwing);
        pPaddle.xRot = Mth.clampedLerp((-(float)Math.PI / 3F), -0.2617994F, (Mth.sin(-f) + 1.0F) / 2.0F) + Mth.PI;
        pPaddle.yRot = Mth.clampedLerp((-(float)Math.PI / 4F), ((float)Math.PI / 4F), (Mth.sin(-f + 1.0F) + 1.0F) / 2.0F) + Mth.PI;
        if (pSide == 1) {
            pPaddle.yRot = (float)Math.PI - pPaddle.yRot;
        }
    }
}
