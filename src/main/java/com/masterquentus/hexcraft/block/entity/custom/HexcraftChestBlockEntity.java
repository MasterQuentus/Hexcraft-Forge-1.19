package com.masterquentus.hexcraft.block.entity.custom;

import com.masterquentus.hexcraft.block.entity.HexcraftBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class HexcraftChestBlockEntity extends ChestBlockEntity {

    public HexcraftChestBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(HexcraftBlockEntities.CHEST.get(), pPos, pBlockState);
    }
}