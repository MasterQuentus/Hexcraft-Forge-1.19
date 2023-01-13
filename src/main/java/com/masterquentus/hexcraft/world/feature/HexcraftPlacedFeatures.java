package com.masterquentus.hexcraft.world.feature;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.config.HexcraftCommonConfigs;
import com.masterquentus.hexcraft.world.feature.HexcraftConfiguredFeatures;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
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
    public static final RegistryObject<PlacedFeature> EBONY_CHECKED = PLACED_FEATURES.register("ebony_checked",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.EBONY_TREE.getHolder().get(),
                    List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.EBONY_SAPLING.get()))));

    public static final RegistryObject<PlacedFeature> EBONY_PLACED = PLACED_FEATURES.register("ebony_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.EBONY_SPAWN.getHolder().get(), VegetationPlacements.treePlacement
                    (RarityFilter.onAverageOnceEvery(70))));
    public static final RegistryObject<PlacedFeature> ALDER_CHECKED = PLACED_FEATURES.register("alder_checked",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.ALDER_TREE.getHolder().get(),
                    List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.ALDER_SAPLING.get()))));

    public static final RegistryObject<PlacedFeature> ALDER_PLACED = PLACED_FEATURES.register("alder_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.ALDER_SPAWN.getHolder().get(), VegetationPlacements.treePlacement
                    (RarityFilter.onAverageOnceEvery(70))));
    public static final RegistryObject<PlacedFeature> WITCH_HAZEL_CHECKED = PLACED_FEATURES.register("witch_hazel_checked",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.WITCH_HAZEL_TREE.getHolder().get(),
                    List.of(PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.WITCH_WOOD_SAPLING.get()))));

    public static final RegistryObject<PlacedFeature> WITCH_HAZEL_PLACED = PLACED_FEATURES.register("witch_hazel_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.WITCH_HAZEL_SPAWN.getHolder().get(), VegetationPlacements.treePlacement
                    (RarityFilter.onAverageOnceEvery(70))));

    public static final RegistryObject<PlacedFeature> MAGIC_CRYSTAL_GEODE_PLACED = PLACED_FEATURES.register("magic_crystal_geode_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.MAGIC_CRYSTAL_GEODE.getHolder().get(), List.of(
                    RarityFilter.onAverageOnceEvery(70), InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                    BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> TAINTED_MAGIC_PLACED = PLACED_FEATURES.register("tainted_magic_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.TAINTED_MAGIC_PATCH.getHolder().get(), List.of(
                    RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                    BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> JASMINE_PLACED = PLACED_FEATURES.register("vampire_orchid_placed",
            () -> new PlacedFeature(HexcraftConfiguredFeatures.VAMPIRE_ORCHID.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));


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