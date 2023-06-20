package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.BansheeEntity;
import com.masterquentus.hexcraft.entity.custom.SirenEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class SirenModel extends AnimatedGeoModel<SirenEntity> {
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
