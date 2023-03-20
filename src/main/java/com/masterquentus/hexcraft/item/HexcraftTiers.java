package com.masterquentus.hexcraft.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class HexcraftTiers {
    public static final ForgeTier SILVER = new ForgeTier(2, 1400, 1.5f,
            2f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(HexcraftItems.SILVER_INGOT.get()));

    public static final ForgeTier DARK_STEEL = new ForgeTier(2, 1400, 1.5f,
            2f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(HexcraftItems.DARK_STEEL.get()));

    public static final ForgeTier STEEL = new ForgeTier(2, 1671, 6.0F,
            2.0F, 14, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(HexcraftItems.STEEL_INGOT.get()));

    public static final ForgeTier NYKIUM = new ForgeTier(2, 1400, 1.5f,
            2f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(HexcraftItems.BLOODY_NYKIUM.get()));

    public static final ForgeTier CUROGEN = new ForgeTier(2, 1400, 1.5f,
            2f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(HexcraftItems.CUROGEN.get()));

    public static final ForgeTier JORMUIM = new ForgeTier(2, 1400, 1.5f,
            2f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(HexcraftItems.JORMIUM_INGOT.get()));
}