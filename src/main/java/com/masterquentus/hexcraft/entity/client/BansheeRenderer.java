package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.BansheeEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class BansheeRenderer extends GeoEntityRenderer<BansheeEntity> {
    public BansheeRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BansheeModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(BansheeEntity instance) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/banshee.png");
    }

    @Override
    public RenderType getRenderType (BansheeEntity animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}