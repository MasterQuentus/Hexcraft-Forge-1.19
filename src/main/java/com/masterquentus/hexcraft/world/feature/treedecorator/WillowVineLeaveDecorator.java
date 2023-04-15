package com.masterquentus.hexcraft.world.feature.treedecorator;

import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.world.feature.HexcraftTreeFeatures;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;

/*
    Modified version of Minecraft's LeaveVineDecorator class to make
    vines made of leaves.
 */
public class WillowVineLeaveDecorator extends TreeDecorator {
    public static final Codec<WillowVineLeaveDecorator> CODEC = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(WillowVineLeaveDecorator::new, (p_226037_) -> {
        return p_226037_.probability;
    }).codec();
    private final float probability;

    protected TreeDecoratorType<?> type() {
        return HexcraftTreeFeatures.WILLOW_VINE_LEAVE_DECORATOR.get();
    }

    public WillowVineLeaveDecorator(float p_226031_) {
        this.probability = p_226031_;
    }

    public void place(TreeDecorator.Context pContext) {
        RandomSource randomsource = pContext.random();
        pContext.leaves().forEach((p_226035_) -> {
            if (randomsource.nextFloat() < this.probability) {
                BlockPos blockpos = p_226035_.west();
                if (pContext.isAir(blockpos)) {
                    addHangingLeave(blockpos, pContext, HexcraftBlocks.WILLOW_LEAVES.get().defaultBlockState());
                }
            }

            if (randomsource.nextFloat() < this.probability) {
                BlockPos blockpos1 = p_226035_.east();
                if (pContext.isAir(blockpos1)) {
                    addHangingLeave(blockpos1, pContext, HexcraftBlocks.WILLOW_LEAVES.get().defaultBlockState());
                }
            }

            if (randomsource.nextFloat() < this.probability) {
                BlockPos blockpos2 = p_226035_.north();
                if (pContext.isAir(blockpos2)) {
                    addHangingLeave(blockpos2, pContext, HexcraftBlocks.WILLOW_LEAVES.get().defaultBlockState());
                }
            }

            if (randomsource.nextFloat() < this.probability) {
                BlockPos blockpos3 = p_226035_.south();
                if (pContext.isAir(blockpos3)) {
                    addHangingLeave(blockpos3, pContext, HexcraftBlocks.WILLOW_LEAVES.get().defaultBlockState());
                }
            }

        });
    }

    private static void addHangingLeave(BlockPos pPos, TreeDecorator.Context pContext, BlockState blockState) {
        pContext.setBlock(pPos, blockState);
        int i = 4;

        for (BlockPos blockpos = pPos.below(); pContext.isAir(blockpos) && i > 0; --i) {
            pContext.setBlock(blockpos, blockState);
            blockpos = blockpos.below();
        }
    }
}
