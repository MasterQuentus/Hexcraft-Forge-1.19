package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.BasiliskEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class BasiliskRenderer extends GeoEntityRenderer<BasiliskEntity> {
    public BasiliskRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BasiliskModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(BasiliskEntity instance) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/basilisk.png");
    }

    @Override
    public RenderType getRenderType (BasiliskEntity animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}