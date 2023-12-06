package com.masterquentus.hexcraft.entity.client.vampire;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.VampirePiglinEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class VampirePiglinRenderer extends GeoEntityRenderer<VampirePiglinEntity> {
    public VampirePiglinRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new VampirePiglinModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(VampirePiglinEntity instance) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/vampires/vampire_piglin.png");
    }

    @Override
    public RenderType getRenderType (VampirePiglinEntity animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}