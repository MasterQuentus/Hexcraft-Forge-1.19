package com.masterquentus.hexcraft.entity.client.armor;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.item.custom.WitchesArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class WitchesArmorModel extends GeoModel<WitchesArmorItem> {
    @Override
    public ResourceLocation getModelResource(WitchesArmorItem object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "geo/witch_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WitchesArmorItem object) {
        return new ResourceLocation(Hexcraft.MOD_ID, "textures/models/armor/witch_armor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WitchesArmorItem animatable) {
        return new ResourceLocation(Hexcraft.MOD_ID, "animations/armor_animation.json");
    }
}
