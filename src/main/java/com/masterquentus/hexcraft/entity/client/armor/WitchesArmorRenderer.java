package com.masterquentus.hexcraft.entity.client.armor;

import com.masterquentus.hexcraft.item.custom.WitchesArmorItem;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class WitchesArmorRenderer extends GeoArmorRenderer<WitchesArmorItem> {


    public WitchesArmorRenderer() {
        super(new WitchesArmorModel());
    }
}
