package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.BasiliskEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BasiliskModel extends GeoModel<BasiliskEntity> {
    @Override
    public ResourceLocation getModelResource(BasiliskEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "geo/basilisk.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BasiliskEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/basilisk.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BasiliskEntity animatable) {
        return new ResourceLocation(Hexcraft.MOD_ID, "animations/basilisk.animation.json");
    }
}
