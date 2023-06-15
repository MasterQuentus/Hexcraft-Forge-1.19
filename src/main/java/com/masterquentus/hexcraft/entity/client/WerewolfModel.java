package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.WerewolfEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WerewolfModel extends AnimatedGeoModel<WerewolfEntity> {
    @Override
    public ResourceLocation getModelResource(WerewolfEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "geo/werewolf.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WerewolfEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/entity/werewolf/werewolf.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WerewolfEntity animatable) {
        return new ResourceLocation(Hexcraft.MOD_ID, "animations/werewolf.animation.json");
    }
}
