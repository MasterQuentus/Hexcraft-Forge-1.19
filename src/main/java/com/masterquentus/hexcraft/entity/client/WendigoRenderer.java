package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.WendigoEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class WendigoRenderer extends GeoEntityRenderer<WendigoEntity> {
    public WendigoRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new WendigoModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(WendigoEntity instance) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/wendigo/wendigo.png");
    }

    @Override
    public RenderType getRenderType (WendigoEntity animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}