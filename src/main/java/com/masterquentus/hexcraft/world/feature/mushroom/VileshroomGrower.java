package com.masterquentus.hexcraft.world.feature.mushroom;

import com.masterquentus.hexcraft.world.feature.HexcraftConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class VileshroomGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource p_204307_, boolean p_204308_) {
        return HexcraftConfiguredFeatures.VILESHROOM.getHolder().get();
    }
}