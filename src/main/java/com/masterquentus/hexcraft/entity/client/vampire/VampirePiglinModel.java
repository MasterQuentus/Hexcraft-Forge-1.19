package com.masterquentus.hexcraft.entity.client.vampire;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.VampirePiglinEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class VampirePiglinModel extends GeoModel<VampirePiglinEntity> {
    @Override
    public ResourceLocation getModelResource(VampirePiglinEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "geo/vampire_piglin.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(VampirePiglinEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/vampires/vampire_piglin.png");
    }

    @Override
    public ResourceLocation getAnimationResource(VampirePiglinEntity animatable) {
        return new ResourceLocation(Hexcraft.MOD_ID, "animations/vampire_piglin.animation.json");
    }
}
