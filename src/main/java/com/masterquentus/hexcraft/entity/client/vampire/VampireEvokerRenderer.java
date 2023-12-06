package com.masterquentus.hexcraft.entity.client.vampire;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.vampire.VampireEvokerEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class VampireEvokerRenderer extends GeoEntityRenderer<VampireEvokerEntity> {
    public VampireEvokerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new VampireEvokerModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(VampireEvokerEntity instance) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/vampires/vampire_evoker.png");
    }

    @Override
    public RenderType getRenderType (VampireEvokerEntity animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}