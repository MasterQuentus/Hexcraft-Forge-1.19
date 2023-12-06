package com.masterquentus.hexcraft.entity.client.armor;

import com.masterquentus.hexcraft.item.custom.GoogglesOfRevealingItem;
import com.masterquentus.hexcraft.item.custom.WitchesArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GogglesOfRevealingRenderer extends GeoArmorRenderer<GoogglesOfRevealingItem> {


    public GogglesOfRevealingRenderer() {
        super(new GogglesOfRevealingModel());
    }
}