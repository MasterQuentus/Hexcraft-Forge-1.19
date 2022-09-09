package com.masterquentus.hexcraft.world.feature;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.config.HexcraftCommonConfigs;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class HexcraftPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Hexcraft.MOD_ID);


    public static final RegistryObject<PlacedFeature> PEARL_STONE_PLACED = PLACED_FEATURES.register("pearl_stone_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.PEARL_STONE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(100)))));

    public static final RegistryObject<PlacedFeature> CRIMSON_STONE_PLACED = PLACED_FEATURES.register("crimson_stone_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.CRIMSON_STONE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(100)))));

    public static final RegistryObject<PlacedFeature> BLACK_OBSIDIAN_PLACED = PLACED_FEATURES.register("black_obsidian_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.BLACK_OBSIDIAN.getHolder().get(), commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> MOONSTONE_ORE_PLACED = PLACED_FEATURES.register("moonstone_ore_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.MOONSTONE_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> END_MOONSTONE_ORE_PLACED = PLACED_FEATURES.register("end_moonstone_ore_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.END_MOONSTONE_ORE.getHolder().get(), commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> NETHER_MOONSTONE_ORE_PLACED = PLACED_FEATURES.register("nether_moonstone_ore_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.NETHER_MOONSTONE_ORE.getHolder().get(), commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> SILVER_ORE_PLACED = PLACED_FEATURES.register("silver_ore_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.SILVER_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> END_SILVER_ORE_PLACED = PLACED_FEATURES.register("end_silver_ore_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.END_SILVER_ORE.getHolder().get(), commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> NETHER_SILVER_ORE_PLACED = PLACED_FEATURES.register("nether_silver_ore_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.NETHER_SILVER_ORE.getHolder().get(), commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> VAMPIRIC_ORE_PLACED = PLACED_FEATURES.register("vampiric_ore_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.VAMPIRIC_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> END_VAMPIRIC_ORE_PLACED = PLACED_FEATURES.register("end_vampiric_ore_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.END_VAMPIRIC_ORE.getHolder().get(), commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static final RegistryObject<PlacedFeature> NETHER_VAMPIRIC_ORE_PLACED = PLACED_FEATURES.register("nether_vampiric_ore_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.NETHER_VAMPIRIC_ORE.getHolder().get(), commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));




    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}