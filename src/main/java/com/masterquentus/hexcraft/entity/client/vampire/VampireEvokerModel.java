package com.masterquentus.hexcraft.entity.client.vampire;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.vampire.VampireEvokerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class VampireEvokerModel extends AnimatedGeoModel<VampireEvokerEntity> {
    @Override
    public ResourceLocation getModelResource(VampireEvokerEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "geo/vampire_evoker.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(VampireEvokerEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/vampires/vampire_evoker.png");
    }

    @Override
    public ResourceLocation getAnimationResource(VampireEvokerEntity animatable) {
        return new ResourceLocation(Hexcraft.MOD_ID, "animations/vampire_evoker.animation.json");
    }
}
