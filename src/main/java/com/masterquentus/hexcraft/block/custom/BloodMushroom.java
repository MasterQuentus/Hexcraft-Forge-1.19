package com.masterquentus.hexcraft.block.custom;

import net.minecraft.core.Holder;
import net.minecraft.world.level.block.MushroomBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import java.util.function.Supplier;

public class BloodMushroom extends MushroomBlock {
    public BloodMushroom(Properties properties, Supplier<Holder<? extends ConfiguredFeature<?, ?>>> supplier) {
        super(properties, supplier);
    }
}
