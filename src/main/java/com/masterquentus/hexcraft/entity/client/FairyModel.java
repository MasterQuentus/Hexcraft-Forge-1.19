package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.FairyEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FairyModel extends GeoModel<FairyEntity> {
    @Override
    public ResourceLocation getModelResource(FairyEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "geo/fairy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FairyEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/fairies/fairy.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FairyEntity animatable) {
        return new ResourceLocation(Hexcraft.MOD_ID, "animations/fairy.animation.json");
    }
}
