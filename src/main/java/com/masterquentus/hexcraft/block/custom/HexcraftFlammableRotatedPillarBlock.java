package com.masterquentus.hexcraft.block.custom;

import com.masterquentus.hexcraft.block.HexcraftBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class HexcraftFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public HexcraftFlammableRotatedPillarBlock(Properties properties) {

        super(properties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            if(state.is(HexcraftBlocks.EBONY_LOG.get())) {
                return HexcraftBlocks.STRIPPED_EBONY_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(HexcraftBlocks.EBONY_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_EBONY_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.BLOOD_OAK_LOG.get())) {
                return HexcraftBlocks.STRIPPED_BLOOD_OAK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.BLOOD_OAK_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_BLOOD_OAK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.HELL_BARK_LOG.get())) {
                return HexcraftBlocks.STRIPPED_HELL_BARK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.HELL_BARK_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_HELL_BARK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.WHITE_OAK_LOG.get())) {
                return HexcraftBlocks.STRIPPED_WHITE_OAK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.WHITE_OAK_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_WHITE_OAK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.ALDER_LOG.get())) {
                return HexcraftBlocks.STRIPPED_ALDER_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.ALDER_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_ALDER_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.WITCH_HAZEL_LOG.get())) {
                return HexcraftBlocks.STRIPPED_WITCH_HAZEL_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(HexcraftBlocks.WITCH_HAZEL_WOOD.get())) {
                return HexcraftBlocks.STRIPPED_WITCH_HAZEL_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}