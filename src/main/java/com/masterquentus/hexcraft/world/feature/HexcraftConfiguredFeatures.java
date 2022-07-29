package com.masterquentus.hexcraft.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class HexcraftConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Hexcraft.MOD_ID);

    public static final RegistryObject<ConfiguredFeature<?,?>> EBONY_TREE = CONFIGURED_FEATURES.register("ebony_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.EBONY_LOG.get()),
                            new StraightTrunkPlacer(5,2,1),
                            BlockStateProvider.simple(HexcraftBlocks.EBONY_LEAVES.get()),
                            new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2),
                                    UniformInt.of(1, 2)),
                            new TwoLayersFeatureSize(2,0,2)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> BLOOD_OAK_TREE = CONFIGURED_FEATURES.register("blood_oak_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.BLOOD_OAK_LOG.get()),
                            new StraightTrunkPlacer(5,2,1),
                            BlockStateProvider.simple(HexcraftBlocks.BLOOD_OAK_LEAVES.get()),
                            new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2),
                                    UniformInt.of(1, 1)),
                            new TwoLayersFeatureSize(1,0,1)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> HELL_BARK_TREE = CONFIGURED_FEATURES.register("hell_bark_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.HELL_BARK_LOG.get()),
                            new StraightTrunkPlacer(3,5,1),
                            BlockStateProvider.simple(HexcraftBlocks.HELL_BARK_LEAVES.get()),
                            new SpruceFoliagePlacer(UniformInt.of(2, 1), UniformInt.of(0, 1),
                                    UniformInt.of(1, 1)),
                            new TwoLayersFeatureSize(1,0,1)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> WHITE_OAK_TREE = CONFIGURED_FEATURES.register("white_oak_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.WHITE_OAK_LOG.get()),
                            new StraightTrunkPlacer(5,2,1),
                            BlockStateProvider.simple(HexcraftBlocks.WHITE_OAK_LEAVES.get()),
                            new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2),
                                    UniformInt.of(1, 1)),
                            new TwoLayersFeatureSize(1,0,1)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> ALDER_TREE = CONFIGURED_FEATURES.register("alder_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.ALDER_LOG.get()),
                            new StraightTrunkPlacer(5,2,2),
                            BlockStateProvider.simple(HexcraftBlocks.ALDER_LEAVES.get()),
                            new SpruceFoliagePlacer(UniformInt.of(2, 0), UniformInt.of(0, 2),
                                    UniformInt.of(1, 1)),
                            new TwoLayersFeatureSize(1,0,2)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> WITCH_HAZEL_TREE = CONFIGURED_FEATURES.register("witch_hazel_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.WITCH_HAZEL_LOG.get()),
                            new StraightTrunkPlacer(3,2,2),
                            BlockStateProvider.simple(HexcraftBlocks.WITCH_HAZEL_LEAVES.get()),
                            new SpruceFoliagePlacer(UniformInt.of(1, 2), UniformInt.of(1, 3),
                                    UniformInt.of(0, 1)),
                            new TwoLayersFeatureSize(1,2,1)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> WILLOW_TREE = CONFIGURED_FEATURES.register("willow_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.WILLOW_LOG.get()),
                            new StraightTrunkPlacer(2,1,0),
                            BlockStateProvider.simple(HexcraftBlocks.WILLOW_LEAVES.get()),
                            new SpruceFoliagePlacer(UniformInt.of(1, 1), UniformInt.of(1, 1),
                                    UniformInt.of(0, 1)),
                            new TwoLayersFeatureSize(1,1,1)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> HAWTHORN_TREE = CONFIGURED_FEATURES.register("hawthorn_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.HAWTHORN_LOG.get()),
                            new StraightTrunkPlacer(3,2,1),
                            BlockStateProvider.simple(HexcraftBlocks.HAWTHORN_LEAVES.get()),
                            new SpruceFoliagePlacer(UniformInt.of(1, 1), UniformInt.of(1, 1),
                                    UniformInt.of(0, 1)),
                            new TwoLayersFeatureSize(1,1,1)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> CEDAR_TREE = CONFIGURED_FEATURES.register("cedar_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.CEDAR_LOG.get()),
                            new StraightTrunkPlacer(1,0,0),
                            BlockStateProvider.simple(HexcraftBlocks.CEDAR_LEAVES.get()),
                            new SpruceFoliagePlacer(UniformInt.of(1, 0), UniformInt.of(1, 0),
                                    UniformInt.of(0, 1)),
                            new TwoLayersFeatureSize(1,0,0)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> DISTORTED_TREE = CONFIGURED_FEATURES.register("distorted_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.DISTORTED_LOG.get()),
                            new StraightTrunkPlacer(1,1,1),
                            BlockStateProvider.simple(HexcraftBlocks.DISTORTED_LEAVES.get()),
                            new SpruceFoliagePlacer(UniformInt.of(1, 1), UniformInt.of(1, 1),
                                    UniformInt.of(1, 1)),
                            new TwoLayersFeatureSize(1,1,1)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> ELDER_TREE = CONFIGURED_FEATURES.register("elder_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.ELDER_LOG.get()),
                            new StraightTrunkPlacer(3,2,2),
                            BlockStateProvider.simple(HexcraftBlocks.ELDER_LEAVES.get()),
                            new SpruceFoliagePlacer(UniformInt.of(1, 2), UniformInt.of(1, 3),
                                    UniformInt.of(0, 1)),
                            new TwoLayersFeatureSize(1,2,1)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> JUNIPER_TREE = CONFIGURED_FEATURES.register("juniper_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.JUNIPER_LOG.get()),
                            new StraightTrunkPlacer(1,2,2),
                            BlockStateProvider.simple(HexcraftBlocks.JUNIPER_LEAVES.get()),
                            new SpruceFoliagePlacer(UniformInt.of(1, 2), UniformInt.of(1, 2),
                                    UniformInt.of(0, 1)),
                            new TwoLayersFeatureSize(1,0,1)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> ROWAN_TREE = CONFIGURED_FEATURES.register("rowan_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.ROWAN_LOG.get()),
                            new StraightTrunkPlacer(1,1,0),
                            BlockStateProvider.simple(HexcraftBlocks.ROWAN_LEAVES.get()),
                            new SpruceFoliagePlacer(UniformInt.of(1, 0), UniformInt.of(1, 0),
                                    UniformInt.of(0, 1)),
                            new TwoLayersFeatureSize(1,0,1)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> TWISTED_TREE = CONFIGURED_FEATURES.register("twisted_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.TWISTED_LOG.get()),
                            new StraightTrunkPlacer(0,1,2),
                            BlockStateProvider.simple(HexcraftBlocks.TWISTED_LEAVES.get()),
                            new SpruceFoliagePlacer(UniformInt.of(1, 2), UniformInt.of(1, 1),
                                    UniformInt.of(0, 1)),
                            new TwoLayersFeatureSize(1,2,1)).ignoreVines().build()));
    public static final RegistryObject<ConfiguredFeature<?,?>> WITCH_WOOD_TREE = CONFIGURED_FEATURES.register("witch-wood_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(HexcraftBlocks.WITCH_WOOD_LOG.get()),
                            new StraightTrunkPlacer(5,2,1),
                            BlockStateProvider.simple(HexcraftBlocks.WITCH_WOOD_LEAVES.get()),
                            new SpruceFoliagePlacer(UniformInt.of(2, 1), UniformInt.of(1, 0),
                                    UniformInt.of(1, 2)),
                            new TwoLayersFeatureSize(1,2,0)).ignoreVines().build()));


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
