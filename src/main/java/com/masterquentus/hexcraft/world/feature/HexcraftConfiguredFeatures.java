package com.masterquentus.hexcraft.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class HexcraftConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Hexcraft.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_PEARLSTONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, HexcraftBlocks.PEARL_STONE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CRIMSON_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, HexcraftBlocks.CRIMSON_STONE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_BLACK_OBSIDIAN = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), HexcraftBlocks.BLACK_OBSIDIAN.get().defaultBlockState())));


    public static final RegistryObject<ConfiguredFeature<?, ?>> PEARL_STONE = CONFIGURED_FEATURES.register("pearl_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_PEARLSTONE.get(),40)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> CRIMSON_STONE = CONFIGURED_FEATURES.register("crimson_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_CRIMSON_STONE.get(), 40)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> BLACK_OBSIDIAN = CONFIGURED_FEATURES.register("black_obsidian",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_BLACK_OBSIDIAN.get(), 14)));


    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
