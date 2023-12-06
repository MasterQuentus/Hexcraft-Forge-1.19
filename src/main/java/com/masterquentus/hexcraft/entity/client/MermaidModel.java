package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.MermaidEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MermaidModel extends GeoModel<MermaidEntity> {
    @Override
    public ResourceLocation getModelResource(MermaidEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "geo/mermaid.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MermaidEntity object) {
        return MermaidRenderer.LOCATION_BY_VARIANT.get(object.getType());
    }

    @Override
    public ResourceLocation getAnimationResource(MermaidEntity animatable) {
        return new ResourceLocation(Hexcraft.MOD_ID, "animations/mermaid.animation.json");
    }
}