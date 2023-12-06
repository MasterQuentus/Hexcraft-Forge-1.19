package com.masterquentus.hexcraft.block.custom;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.MushroomBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import java.util.function.Supplier;

public class BloodMushroom extends MushroomBlock {

    public BloodMushroom(Properties pProperties, ResourceKey<ConfiguredFeature<?, ?>> pFeature) {
        super(pProperties, pFeature);
    }
}

