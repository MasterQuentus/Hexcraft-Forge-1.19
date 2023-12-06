package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.LilithEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class LilithRenderer extends GeoEntityRenderer<LilithEntity> {
    public LilithRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new LilithModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(LilithEntity instance) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/lilith/lilith.png");
    }

    @Override
    public RenderType getRenderType (LilithEntity animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}