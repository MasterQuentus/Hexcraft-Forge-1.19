package com.masterquentus.hexcraft.entity.client;

import com.google.common.collect.Maps;
import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.MermaidEntity;
import com.masterquentus.hexcraft.entity.variant.SirenVariant;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;
import java.util.Map;

public class MermaidRenderer extends GeoEntityRenderer<MermaidEntity> {
    public static final Map<SirenVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SirenVariant.class), (p_114874_) -> {
                p_114874_.put(SirenVariant.DEFAULT,
                        new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/mermaid/mermaid.png"));
                p_114874_.put(SirenVariant.RED,
                        new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/mermaid/mermaid.png"));
                p_114874_.put(SirenVariant.GREEN,
                        new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/mermaid/mermaid.png"));
            });

    public MermaidRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MermaidModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(MermaidEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getType());
    }

    @Override
    public RenderType getRenderType (MermaidEntity animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}