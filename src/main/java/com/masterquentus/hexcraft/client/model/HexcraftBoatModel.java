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

public class HexcraftBoatModel<T extends HexcraftBoatEntity> extends EntityModel<T> {

    private final ModelPart root;
    private final ModelPart waterPatch;

    public HexcraftBoatModel(ModelPart root) {
        this.root = root;
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

        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    public ModelPart getWaterPatch() {
        return this.waterPatch;
    }

    @Override
    public void setupAnim(T boat, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root.y = 4F;
        this.root.xRot = Mth.PI;
    }

    @Override
    public void renderToBuffer(PoseStack pPoseStack, VertexConsumer pBuffer, int pPackedLight, int pPackedOverlay, float pRed, float pGreen, float pBlue, float pAlpha) {
        root.render(pPoseStack, pBuffer, pPackedLight, pPackedOverlay, pRed, pGreen, pBlue, pAlpha);
    }
}
