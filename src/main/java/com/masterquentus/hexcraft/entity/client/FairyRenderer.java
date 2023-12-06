package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.FairyEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class FairyRenderer extends GeoEntityRenderer<FairyEntity> {
    public FairyRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new FairyModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(FairyEntity instance) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/fairies/fairy.png");
    }

    @Override
    public RenderType getRenderType (FairyEntity animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}