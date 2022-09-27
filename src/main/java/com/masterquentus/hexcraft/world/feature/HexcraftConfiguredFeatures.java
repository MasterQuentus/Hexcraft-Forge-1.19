package com.masterquentus.hexcraft.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.CaveFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.HugeFungusConfiguration;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.DarkOakFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.DarkOakTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static net.minecraft.data.worldgen.features.CaveFeatures.MOSS_VEGETATION;

public class HexcraftConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Hexcraft.MOD_ID);

    public static final RegistryObject<ConfiguredFeature<?,?>> EBONY_TREE = CONFIGURED_FEATURES.register("ebony_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.EBONY_LOG.get()),
                            new StraightTrunkPlacer(5,2,1),
                            BlockStateProvider.simple(HexcraftBlocks.EBONY_LEAVES.get()),
                            new SpruceFoliagePlacer(UniformInt.of(3, 3), UniformInt.of(0, 0),
                                    UniformInt.of(3, 4)),
                            new TwoLayersFeatureSize(2,0,2)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> BLOOD_OAK_TREE = CONFIGURED_FEATURES.register("blood_oak_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.BLOOD_OAK_LOG.get()),
                            new DarkOakTrunkPlacer(2,3,3),
                            BlockStateProvider.simple(HexcraftBlocks.BLOOD_OAK_LEAVES.get()),
                            new DarkOakFoliagePlacer (UniformInt.of(0, 0),
                                    UniformInt.of(0, 0)),
                            new TwoLayersFeatureSize(1,1,0)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> HELL_BARK_TREE = CONFIGURED_FEATURES.register("hell_bark_tree", () ->
            new ConfiguredFeature<>(Feature.HUGE_FUNGUS,
                    new HugeFungusConfiguration(Blocks.GRASS_BLOCK.defaultBlockState(), HexcraftBlocks.HELL_BARK_LOG.get().defaultBlockState(),
                            HexcraftBlocks.HELL_BARK_LEAVES.get().defaultBlockState(), HexcraftBlocks.HELL_FUNGAL_LAMP.get().defaultBlockState(), true)));
    public static final RegistryObject<ConfiguredFeature<?,?>> WHITE_OAK_TREE = CONFIGURED_FEATURES.register("white_oak_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.WHITE_OAK_LOG.get()),
                            new DarkOakTrunkPlacer(2,3,3),
                            BlockStateProvider.simple(HexcraftBlocks.WHITE_OAK_LEAVES.get()),
                            new DarkOakFoliagePlacer (UniformInt.of(0, 0),
                                    UniformInt.of(0, 0)),
                            new TwoLayersFeatureSize(1,1,0)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ALDER_TREE =
            CONFIGURED_FEATURES.register("alder_tree", () ->
                    new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(HexcraftBlocks.ALDER_LOG.get()),
                            new StraightTrunkPlacer(2, 3, 2),
                            BlockStateProvider.simple(HexcraftBlocks.ALDER_LEAVES.get()),
                            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                            new TwoLayersFeatureSize(1, 0, 2)).build()));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ALDER_SPAWN =
            CONFIGURED_FEATURES.register("alder_spawn", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                            HexcraftPlacedFeatures.ALDER_CHECKED.getHolder().get(),
                            0.5F)), HexcraftPlacedFeatures.ALDER_CHECKED.getHolder().get())));
    public static final RegistryObject<ConfiguredFeature<?,?>> WITCH_HAZEL_TREE = CONFIGURED_FEATURES.register("witch_hazel_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.WITCH_HAZEL_LOG.get()),
                            new StraightTrunkPlacer(2,3,3),
                            BlockStateProvider.simple(HexcraftBlocks.WITCH_HAZEL_LEAVES.get()),
                            new DarkOakFoliagePlacer (UniformInt.of(0, 0),
                                    UniformInt.of(0, 0)),
                            new TwoLayersFeatureSize(1,1,0)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> WILLOW_TREE = CONFIGURED_FEATURES.register("willow_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.WILLOW_LOG.get()),
                            new StraightTrunkPlacer(2,3,3),
                            BlockStateProvider.simple(HexcraftBlocks.WILLOW_LEAVES.get()),
                            new DarkOakFoliagePlacer (UniformInt.of(0, 0),
                                    UniformInt.of(0, 0)),
                            new TwoLayersFeatureSize(1,1,0)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> HAWTHORN_TREE = CONFIGURED_FEATURES.register("hawthorn_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.HAWTHORN_LOG.get()),
                            new StraightTrunkPlacer(2,3,3),
                            BlockStateProvider.simple(HexcraftBlocks.HAWTHORN_LEAVES.get()),
                            new DarkOakFoliagePlacer (UniformInt.of(0, 0),
                                    UniformInt.of(0, 0)),
                            new TwoLayersFeatureSize(1,1,0)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> CEDAR_TREE = CONFIGURED_FEATURES.register("cedar_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.CEDAR_LOG.get()),
                            new StraightTrunkPlacer(2,3,3),
                            BlockStateProvider.simple(HexcraftBlocks.CEDAR_LEAVES.get()),
                            new DarkOakFoliagePlacer (UniformInt.of(0, 0),
                                    UniformInt.of(0, 0)),
                            new TwoLayersFeatureSize(1,1,0)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> DISTORTED_TREE = CONFIGURED_FEATURES.register("distorted_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.DISTORTED_LOG.get()),
                            new StraightTrunkPlacer(2,3,3),
                            BlockStateProvider.simple(HexcraftBlocks.DISTORTED_LEAVES.get()),
                            new DarkOakFoliagePlacer (UniformInt.of(0, 0),
                                    UniformInt.of(0, 0)),
                            new TwoLayersFeatureSize(1,1,0)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> ELDER_TREE = CONFIGURED_FEATURES.register("elder_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.ELDER_LOG.get()),
                            new StraightTrunkPlacer(2,3,3),
                            BlockStateProvider.simple(HexcraftBlocks.ELDER_LEAVES.get()),
                            new DarkOakFoliagePlacer (UniformInt.of(0, 0),
                                    UniformInt.of(0, 0)),
                            new TwoLayersFeatureSize(1,1,0)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> JUNIPER_TREE = CONFIGURED_FEATURES.register("juniper_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.JUNIPER_LOG.get()),
                            new StraightTrunkPlacer(2,3,3),
                            BlockStateProvider.simple(HexcraftBlocks.JUNIPER_LEAVES.get()),
                            new DarkOakFoliagePlacer (UniformInt.of(0, 0),
                                    UniformInt.of(0, 0)),
                            new TwoLayersFeatureSize(1,1,0)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> ROWAN_TREE = CONFIGURED_FEATURES.register("rowan_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.ROWAN_LOG.get()),
                            new StraightTrunkPlacer(2,3,3),
                            BlockStateProvider.simple(HexcraftBlocks.ROWAN_LEAVES.get()),
                            new DarkOakFoliagePlacer (UniformInt.of(0, 0),
                                    UniformInt.of(0, 0)),
                            new TwoLayersFeatureSize(1,1,0)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> TWISTED_TREE = CONFIGURED_FEATURES.register("twisted_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.TWISTED_LOG.get()),
                            new StraightTrunkPlacer(2,3,3),
                            BlockStateProvider.simple(HexcraftBlocks.TWISTED_LEAVES.get()),
                            new DarkOakFoliagePlacer (UniformInt.of(0, 0),
                                    UniformInt.of(0, 0)),
                            new TwoLayersFeatureSize(1,1,0)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> WITCH_WOOD_TREE = CONFIGURED_FEATURES.register("witch_wood_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.WITCH_WOOD_LOG.get()),
                            new StraightTrunkPlacer(2,3,3),
                            BlockStateProvider.simple(HexcraftBlocks.WITCH_WOOD_LEAVES.get()),
                            new DarkOakFoliagePlacer (UniformInt.of(0, 0),
                                    UniformInt.of(0, 0)),
                            new TwoLayersFeatureSize(1,1,0)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> ECHO_WOOD_TREE = CONFIGURED_FEATURES.register("echo_wood_tree", () ->
            new ConfiguredFeature<>(Feature.HUGE_FUNGUS,
                    new HugeFungusConfiguration(Blocks.GRASS_BLOCK.defaultBlockState(), HexcraftBlocks.ECHO_WOOD_LOG.get().defaultBlockState(),
                            HexcraftBlocks.ECHO_WOOD_LEAVES.get().defaultBlockState(), HexcraftBlocks.ECHO_FUNGAL_LAMP.get().defaultBlockState(), true)));
    public static final RegistryObject<ConfiguredFeature<?,?>> BLOOD_MUSHROOM = CONFIGURED_FEATURES.register("blood_mushroom", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.BLOOD_MUSHROOM_STEM.get()),
                            new StraightTrunkPlacer(2,3,3),
                            BlockStateProvider.simple(HexcraftBlocks.BLOOD_MUSHROOM_BLOCK.get()),
                            new DarkOakFoliagePlacer (UniformInt.of(0, 0),
                                    UniformInt.of(0, 0)),
                            new TwoLayersFeatureSize(1,1,0)).ignoreVines().build()));


    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_PEARLSTONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, HexcraftBlocks.PEARL_STONE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CRIMSON_STONE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, HexcraftBlocks.CRIMSON_STONE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_BLACK_OBSIDIAN = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), HexcraftBlocks.BLACK_OBSIDIAN.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_MOONSTONE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, HexcraftBlocks.MOONSTONE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, HexcraftBlocks.DEEPSLATE_MOONSTONE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_MOONSTONE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), HexcraftBlocks.END_MOONSTONE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_MOONSTONE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, HexcraftBlocks.NETHER_MOONSTONE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SILVER_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, HexcraftBlocks.SILVER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, HexcraftBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_SILVER_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), HexcraftBlocks.END_SILVER_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_SILVER_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, HexcraftBlocks.NETHER_SILVER_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_VAMPIRIC_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, HexcraftBlocks.VAMPIRIC_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, HexcraftBlocks.DEEPSLATE_VAMPIRIC_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_VAMPIRIC_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), HexcraftBlocks.END_VAMPIRIC_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_VAMPIRIC_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, HexcraftBlocks.NETHER_VAMPIRIC_ORE.get().defaultBlockState())));


    public static final RegistryObject<ConfiguredFeature<?, ?>> PEARL_STONE = CONFIGURED_FEATURES.register("pearl_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_PEARLSTONE.get(),40)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> CRIMSON_STONE = CONFIGURED_FEATURES.register("crimson_stone",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_CRIMSON_STONE.get(), 40)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> BLACK_OBSIDIAN = CONFIGURED_FEATURES.register("black_obsidian",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_BLACK_OBSIDIAN.get(), 14)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> MOONSTONE_ORE = CONFIGURED_FEATURES.register("moonstone_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_MOONSTONE_ORES.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> END_MOONSTONE_ORE = CONFIGURED_FEATURES.register("end_moonstone_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_MOONSTONE_ORES.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_MOONSTONE_ORE = CONFIGURED_FEATURES.register("nether_moonstone_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_MOONSTONE_ORES.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SILVER_ORE = CONFIGURED_FEATURES.register("silver_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> END_SILVER_ORE = CONFIGURED_FEATURES.register("end_silver_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_SILVER_ORES.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_SILVER_ORE = CONFIGURED_FEATURES.register("nether_silver_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_SILVER_ORES.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> VAMPIRIC_ORE = CONFIGURED_FEATURES.register("vampiric_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_VAMPIRIC_ORES.get(),7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> END_VAMPIRIC_ORE = CONFIGURED_FEATURES.register("end_vampiric_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_VAMPIRIC_ORES.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_VAMPIRIC_ORE = CONFIGURED_FEATURES.register("nether_vampiric_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_VAMPIRIC_ORES.get(), 9)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> MAGIC_CRYSTAL_GEODE = CONFIGURED_FEATURES.register("magic_crystal_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE,
                    new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                            BlockStateProvider.simple(HexcraftBlocks.BUDDING_MAGIC_CRYSTAL.get()),
                            BlockStateProvider.simple(HexcraftBlocks.MAGIC_CRYSTAL_BLOCK.get()),
                            BlockStateProvider.simple(HexcraftBlocks.MAGIC_CRYSTAL_BLOCK.get()),
                            BlockStateProvider.simple(Blocks.CALCITE),
                            List.of(Blocks.SMOOTH_BASALT.defaultBlockState()),
                            BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerSettings(1.7D, 1.2D, 2.5D, 3.5D),
                            new GeodeCrackSettings(0.25D, 1.5D, 1), 0.5D, 0.1D,
                            true, UniformInt.of(3, 8),
                            UniformInt.of(2, 6), UniformInt.of(1, 2),
                            -18, 18, 0.075D, 1)));


    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
