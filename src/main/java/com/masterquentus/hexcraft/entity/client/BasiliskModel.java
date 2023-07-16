package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.BasiliskEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BasiliskModel extends AnimatedGeoModel<BasiliskEntity> {
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
