package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.MermaidEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class MermaidModel extends AnimatedGeoModel<MermaidEntity> {
    @Override
    public ResourceLocation getModelResource(MermaidEntity object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "geo/mermaid.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MermaidEntity object) {
        return MermaidRenderer.LOCATION_BY_VARIANT.get(object.getType());
    }

    @Override
    public ResourceLocation getAnimationResource(MermaidEntity animatable) {
        return new ResourceLocation(Hexcraft.MOD_ID, "animations/mermaid.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(MermaidEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}