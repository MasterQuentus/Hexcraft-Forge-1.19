package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.SirenEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;
import java.util.Map;

public class SirenRenderer extends GeoEntityRenderer<SirenEntity> {
    public SirenRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SirenModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(SirenEntity instance) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/siren.png");
    }

    @Override
    public RenderType getRenderType (SirenEntity animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}