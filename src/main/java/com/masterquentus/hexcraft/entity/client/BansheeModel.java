package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.BansheeEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BansheeModel extends GeoModel<BansheeEntity> {
    @Override
    public ResourceLocation getModelResource(BansheeEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "geo/banshee.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BansheeEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/banshee.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BansheeEntity animatable) {
        return new ResourceLocation(Hexcraft.MOD_ID, "animations/banshee.animation.json");
    }
}
