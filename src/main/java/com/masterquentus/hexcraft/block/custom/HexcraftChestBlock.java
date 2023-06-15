package com.masterquentus.hexcraft.block.custom;

import com.masterquentus.hexcraft.block.entity.HexcraftBlockEntities;
import com.masterquentus.hexcraft.block.entity.custom.HexcraftChestBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class HexcraftChestBlock extends ChestBlock {

    public HexcraftChestBlock(Properties properties) {
        super(properties, HexcraftBlockEntities.CHEST::get);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new HexcraftChestBlockEntity(pos, state);
    }
}