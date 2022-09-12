package com.masterquentus.hexcraft.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.block.*;

public class TaintedMagicBlock extends SculkBlock implements SculkBehaviour {
    public TaintedMagicBlock(Properties p_151999_) {
        super(p_151999_);
    }

    private static int getDecayPenalty(SculkSpreader p_222080_, BlockPos p_222081_, BlockPos p_222082_, int p_222083_) {
        int i = p_222080_.noGrowthRadius();
        float f = Mth.square((float)Math.sqrt(p_222081_.distSqr(p_222082_)) - (float)i);
        int j = Mth.square(24 - i);
        float f1 = Math.min(1.0F, f / (float)j);
        return Math.max(1, (int)((float)p_222083_ * f1 * 0.5F));
    }
}