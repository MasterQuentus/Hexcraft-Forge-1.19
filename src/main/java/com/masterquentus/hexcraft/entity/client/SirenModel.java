package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.SirenEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SirenModel extends GeoModel<SirenEntity> {
    @Override
    public ResourceLocation getModelResource(SirenEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "geo/siren.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SirenEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/siren.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SirenEntity animatable) {
        return new ResourceLocation(Hexcraft.MOD_ID, "animations/siren.animation.json");
    }
}
