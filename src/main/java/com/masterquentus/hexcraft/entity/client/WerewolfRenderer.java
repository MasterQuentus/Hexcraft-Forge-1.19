package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.WerewolfEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class WerewolfRenderer extends GeoEntityRenderer<WerewolfEntity> {
    public WerewolfRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new WerewolfModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(WerewolfEntity instance) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/werewolf/werewolf.png");
    }

    @Override
    public RenderType getRenderType (WerewolfEntity animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}