package com.masterquentus.hexcraft.entity.client;

import com.google.common.collect.Maps;
import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.BansheeEntity;
import com.masterquentus.hexcraft.entity.custom.SirenEntity;
import com.masterquentus.hexcraft.entity.variant.SirenVariant;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

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
    public RenderType getRenderType(SirenEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}