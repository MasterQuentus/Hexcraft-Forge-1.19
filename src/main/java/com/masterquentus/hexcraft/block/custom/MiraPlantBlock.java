package com.masterquentus.hexcraft.block.custom;

import com.masterquentus.hexcraft.item.HexcraftItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class MiraPlantBlock extends CropBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;
    public MiraPlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return HexcraftItems.MIRA_SEEDS.get();
    }
}
