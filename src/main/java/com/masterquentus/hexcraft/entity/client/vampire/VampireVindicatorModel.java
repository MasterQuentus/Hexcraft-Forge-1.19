package com.masterquentus.hexcraft.entity.client.vampire;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.vampire.VampireVindicatorEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class VampireVindicatorModel extends GeoModel<VampireVindicatorEntity> {
    @Override
    public ResourceLocation getModelResource(VampireVindicatorEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "geo/vampire_vindicator.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(VampireVindicatorEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/vampires/vampire_vindicator.png");
    }

    @Override
    public ResourceLocation getAnimationResource(VampireVindicatorEntity animatable) {
        return new ResourceLocation(Hexcraft.MOD_ID, "animations/vampire_vindicator.animation.json");
    }
}
