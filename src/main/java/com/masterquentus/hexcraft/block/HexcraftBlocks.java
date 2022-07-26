package com.masterquentus.hexcraft.block;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.block.custom.*;
import com.masterquentus.hexcraft.block.custom.crate.*;
import com.masterquentus.hexcraft.block.entity.HexcraftWoodTypes;
import com.masterquentus.hexcraft.item.HexcraftItems;
import com.masterquentus.hexcraft.item.custom.HexcraftCreativeModeTab;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class HexcraftBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Hexcraft.MOD_ID);
    //Blocks
    public static final RegistryObject <Block> BLACK_OBSIDIAN = registerBlock("black_obsidian",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(50.0F, 1200.0F).sound(SoundType.STONE)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> EMBER_MOSS_BLOCK = registerBlock("ember_moss_block",
            () -> new EmberMossBlock(BlockBehaviour.Properties.of(Material.MOSS).strength(0.1F).sound(SoundType.MOSS)),
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> EMBER_MOSS_CARPET = registerBlock("ember_moss_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.MOSS).strength(0.1F).sound(SoundType.MOSS)),
            HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> PEARL_STONE = registerBlock("pearl_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> PEARL_COBBLESTONE = registerBlock("pearl_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> PEARL_STONE_BRICKS = registerBlock("pearl_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> POLISHED_PEARL_STONE = registerBlock("polished_pearl_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CHISELED_PEARL_STONE = registerBlock("chiseled_pearl_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRACKED_PEARL_STONE = registerBlock("cracked_pearl_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> CRIMSON_STONE = registerBlock("crimson_stone",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_COBBLESTONE = registerBlock("crimson_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> CRIMSON_STONE_BRICKS = registerBlock("crimson_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> POLISHED_CRIMSON_STONE = registerBlock("polished_crimson_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CHISELED_CRIMSON_STONE = registerBlock("chiseled_crimson_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRACKED_CRIMSON_STONE = registerBlock("cracked_crimson_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> UNDER_WORLD_STONE = registerBlock("under_world_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> UNDER_WORLD_COBBLESTONE = registerBlock("under_world_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> UNDER_WORLD_STONE_BRICKS = registerBlock("under_world_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> POLISHED_UNDER_WORLD_STONE = registerBlock("polished_under_world_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CHISELED_UNDER_WORLD_STONE = registerBlock("chiseled_under_world_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRACKED_UNDER_WORLD_STONE = registerBlock("cracked_under_world_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> CRIMSON_SAND = registerBlock("crimson_sand",
            () -> new SandBlock(14406560,BlockBehaviour.Properties.of(Material.SAND)
                    .strength(0.5F).sound(SoundType.SAND)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> CRIMSON_SAND_STONE = registerBlock("crimson_sand_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> SMOOTH_CRIMSON_SAND_STONE = registerBlock("smooth_crimson_sand_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F).sound(SoundType.STONE)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> CHISELED_CRIMSON_SAND_STONE = registerBlock("chiseled_crimson_sand_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> CUT_CRIMSON_SAND_STONE = registerBlock("cut_crimson_sand_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> CRIMSON_GLASS = registerBlock("crimson_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).requiresCorrectToolForDrops()
                    .strength(0.3F).sound(SoundType.GLASS).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> CRIMSON_GLASS_PANE = registerBlock("crimson_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.RED, BlockBehaviour.Properties.of(Material.GLASS).requiresCorrectToolForDrops()
                    .strength(0.3F).sound(SoundType.GLASS).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> CRIMSON_ICE = registerBlock("crimson_ice",
            () -> new IceBlock(BlockBehaviour.Properties.of(Material.ICE).friction(0.98F).randomTicks().strength(0.5F)
                    .sound(SoundType.GLASS).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> CRIMSON_PACKED_ICE = registerBlock("crimson_packed_ice",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID).friction(0.98F)
                    .strength(0.5F).sound(SoundType.GLASS)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> CRIMSON_MAGMA = registerBlock("crimson_magma",
            () -> new MagmaBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_BRICKS)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> MAGIC_CRYSTAL_BLOCK = registerBlock("magic_crystal_block",
            () -> new MagicalCrystalBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> BUDDING_MAGIC_CRYSTAL = registerBlock("budding_magic_crystal",
            () -> new BuddingMagicalCrystalBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> MAGIC_CRYSTAL_CLUSTER = registerBlock("magic_crystal_cluster",
            () -> new MagicCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion()
                    .randomTicks().strength(1.5F).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST).lightLevel((state) -> 5)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> LARGE_MAGIC_CRYSTAL_BUD = registerBlock("large_magic_crystal_bud",
            () -> new MagicCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion()
                    .randomTicks().strength(1.5F).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST).lightLevel((state) -> 4)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> MEDIUM_MAGIC_CRYSTAL_BUD = registerBlock("medium_magic_crystal_bud",
            () -> new MagicCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion()
                    .randomTicks().strength(1.5F).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST).lightLevel((state) -> 2)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> SMALL_MAGIC_CRYSTAL_BUD = registerBlock("small_magic_crystal_bud",
            () -> new MagicCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion()
                    .randomTicks().strength(1.5F).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST).lightLevel((state) -> 1)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> AMETHYST_CHIMES = registerBlock("amethyst_chimes",
            () -> new AmethysChimesBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(1.7F).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> FAIRY_HOUSE = registerBlock("fairy_house",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F).sound(SoundType.WOOD).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> PIXIE_HOUSE = registerBlock("pixie_house",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion()
                    .strength(2.0F).sound(SoundType.WOOD)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Stairs
    public static final RegistryObject<Block> PEARL_STONE_STAIRS = registerBlock("pearl_stone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.PEARL_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> PEARL_COBBLESTONE_STAIRS = registerBlock("pearl_cobblestone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.PEARL_COBBLESTONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> PEARL_STONE_BRICKS_STAIRS = registerBlock("pearl_stone_bricks_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.PEARL_STONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_PEARL_STONE_STAIRS = registerBlock("polished_pearl_stone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.POLISHED_PEARL_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_STONE_STAIRS = registerBlock("crimson_stone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.PEARL_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_COBBLESTONE_STAIRS = registerBlock("crimson_cobblestone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.PEARL_COBBLESTONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_STONE_BRICKS_STAIRS = registerBlock("crimson_stone_bricks_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.CRIMSON_STONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_CRIMSON_STONE_STAIRS = registerBlock("polished_crimson_stone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.POLISHED_CRIMSON_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_STONE_STAIRS = registerBlock("under_world_stone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.UNDER_WORLD_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_COBBLESTONE_STAIRS = registerBlock("under_world_cobblestone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.UNDER_WORLD_COBBLESTONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_STONE_BRICKS_STAIRS = registerBlock("under_world_stone_bricks_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_UNDER_WORLD_STONE_STAIRS = registerBlock("polished_under_world_stone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.POLISHED_UNDER_WORLD_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_SAND_STONE_STAIRS = registerBlock("crimson_sand_stone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.UNDER_WORLD_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> SMOOTH_CRIMSON_SAND_STONE_STAIRS = registerBlock("smooth_crimson_sand_stone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.UNDER_WORLD_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> EBONY_STAIRS = registerBlock("ebony_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.EBONY_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_STAIRS = registerBlock("blood_oak_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.BLOOD_OAK_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_STAIRS = registerBlock("hell_bark_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.HELL_BARK_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WHITE_OAK_STAIRS = registerBlock("white_oak_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.WHITE_OAK_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ALDER_STAIRS = registerBlock("alder_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.ALDER_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_HAZEL_STAIRS = registerBlock("witch_hazel_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.WITCH_HAZEL_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WILLOW_STAIRS = registerBlock("willow_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.WILLOW_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HAWTHORN_STAIRS = registerBlock("hawthorn_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.HAWTHORN_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CEDAR_STAIRS = registerBlock("cedar_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.CEDAR_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> DISTORTED_STAIRS = registerBlock("distorted_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.DISTORTED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ELDER_STAIRS = registerBlock("elder_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.ELDER_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> JUNIPER_STAIRS = registerBlock("juniper_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.JUNIPER_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ROWAN_STAIRS = registerBlock("rowan_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.ROWAN_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> TWISTED_STAIRS = registerBlock("twisted_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.TWISTED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_WOOD_STAIRS = registerBlock("witch_wood_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.WITCH_WOOD_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Slabs
    public static final RegistryObject<Block> PEARL_STONE_SLAB = registerBlock("pearl_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> PEARL_COBBLESTONE_SLAB = registerBlock("pearl_cobblestone_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> PEARL_STONE_BRICKS_SLAB = registerBlock("pearl_stone_bricks_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_PEARL_STONE_SLAB = registerBlock("polished_pearl_stone_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_STONE_SLAB = registerBlock("crimson_stone_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_COBBLESTONE_SLAB = registerBlock("crimson_cobblestone_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_STONE_BRICKS_SLAB = registerBlock("crimson_stone_bricks_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_CRIMSON_STONE_SLAB = registerBlock("polished_crimson_stone_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_STONE_SLAB = registerBlock("under_world_stone_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_COBBLESTONE_SLAB = registerBlock("under_world_cobblestone_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_STONE_BRICKS_SLAB = registerBlock("under_world_stone_bricks_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_UNDER_WORLD_STONE_SLAB = registerBlock("polished_under_world_stone_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_SAND_STONE_SLAB = registerBlock("crimson_sand_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CUT_CRIMSON_SAND_STONE_SLAB = registerBlock("cut_crimson_sand_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> SMOOTH_CRIMSON_SAND_STONE_SLAB = registerBlock("smooth_crimson_sand_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> EBONY_SLAB = registerBlock("ebony_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_SLAB = registerBlock("blood_oak_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_SLAB = registerBlock("hell_bark_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WHITE_OAK_SLAB = registerBlock("white_oak_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ALDER_SLAB = registerBlock("alder_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_HAZEL_SLAB = registerBlock("witch_hazel_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WILLOW_SLAB = registerBlock("willow_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HAWTHORN_SLAB = registerBlock("hawthorn_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CEDAR_SLAB = registerBlock("cedar_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> DISTORTED_SLAB = registerBlock("distorted_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ELDER_SLAB = registerBlock("elder_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> JUNIPER_SLAB = registerBlock("juniper_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ROWAN_SLAB = registerBlock("rowan_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> TWISTED_SLAB = registerBlock("twisted_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_WOOD_SLAB = registerBlock("witch_wood_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Walls
    public static final RegistryObject<Block> PEARL_STONE_WALL = registerBlock("pearl_stone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> PEARL_COBBLESTONE_WALL = registerBlock("pearl_cobblestone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> PEARL_STONE_BRICKS_WALL = registerBlock("pearl_stone_bricks_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_PEARL_STONE_WALL = registerBlock("polished_pearl_stone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_STONE_WALL = registerBlock("crimson_stone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_COBBLESTONE_WALL = registerBlock("crimson_cobblestone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_STONE_BRICKS_WALL = registerBlock("crimson_stone_bricks_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_CRIMSON_STONE_WALL = registerBlock("polished_crimson_stone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_STONE_WALL = registerBlock("under_world_stone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_COBBLESTONE_WALL = registerBlock("under_world_cobblestone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_STONE_BRICKS_WALL = registerBlock("under_world_stone_bricks_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_UNDER_WORLD_STONE_WALL = registerBlock("polished_under_world_stone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_SAND_STONE_WALL = registerBlock("crimson_sand_stone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Saplings
    //public static final RegistryObject<Block> EBONY_SAPLING = registerBlock("ebony_sapling",
            //() -> new SaplingBlock (new EbonyTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            //), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //public static final RegistryObject<Block> BLOOD_OAK_SAPLING = registerBlock("blood_oak_sapling",
            //() -> new SaplingBlock (new BloodOakTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            //), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //public static final RegistryObject<Block> HELL_BARK_SAPLING = registerBlock("hell_bark_sapling",
            //() -> new SaplingBlock (new HellbarkTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            //), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //public static final RegistryObject<Block> WHITE_OAK_SAPLING = registerBlock("white_oak_sapling",
             //() -> new SaplingBlock (new WhiteOakTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            //), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //public static final RegistryObject<Block> ALDER_SAPLING = registerBlock("alder_sapling",
            //() -> new SaplingBlock (new AlderTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            //), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //public static final RegistryObject<Block> WITCH_HAZEL_SAPLING = registerBlock("witch_hazel_sapling",
            //() -> new SaplingBlock (new WitchHazelTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            //), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //public static final RegistryObject<Block> WILLOW_SAPLING = registerBlock("willow_sapling",
            //() -> new SaplingBlock (new WillowTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            //), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //public static final RegistryObject<Block> HAWTHORN_SAPLING = registerBlock("hawthorn_sapling",
            //() -> new SaplingBlock (new HawthornTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            //), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //public static final RegistryObject<Block> CEDAR_SAPLING = registerBlock("cedar_sapling",
            //() -> new SaplingBlock (new CedarTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            //), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //public static final RegistryObject<Block> DISTORTED_SAPLING = registerBlock("distorted_sapling",
            //() -> new SaplingBlock (new DistortedTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            //), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //public static final RegistryObject<Block> ELDER_SAPLING = registerBlock("elder_sapling",
            //() -> new SaplingBlock (new ElderTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            //), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //public static final RegistryObject<Block> JUNIPER_SAPLING = registerBlock("juniper_sapling",
            //() -> new SaplingBlock (new CedarTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            //), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //public static final RegistryObject<Block> ROWAN_SAPLING = registerBlock("rowan_sapling",
            //() -> new SaplingBlock (new RowanTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            //), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //public static final RegistryObject<Block> TWISTED_SAPLING = registerBlock("twisted_sapling",
            //() -> new SaplingBlock (new CedarTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            //), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //public static final RegistryObject<Block> WITCH_WOOD_SAPLING = registerBlock("witch_wood_sapling",
            //() -> new SaplingBlock (new WitchWoodTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            //), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Stripped Wood
    public static final RegistryObject<Block> STRIPPED_EBONY_WOOD = registerBlock("stripped_ebony_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> STRIPPED_BLOOD_OAK_WOOD = registerBlock("stripped_blood_oak_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> STRIPPED_HELL_BARK_WOOD = registerBlock("stripped_hell_bark_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> STRIPPED_WHITE_OAK_WOOD = registerBlock("stripped_white_oak_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> STRIPPED_ALDER_WOOD = registerBlock("stripped_alder_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> STRIPPED_WITCH_HAZEL_WOOD = registerBlock("stripped_witch_hazel_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> STRIPPED_HAWTHORN_WOOD = registerBlock("stripped_hawthorn_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> STRIPPED_CEDAR_WOOD = registerBlock("stripped_cedar_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> STRIPPED_DISTORTED_WOOD = registerBlock("stripped_distorted_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> STRIPPED_ELDER_WOOD = registerBlock("stripped_elder_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> STRIPPED_JUNIPER_WOOD = registerBlock("stripped_juniper_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> STRIPPED_ROWAN_WOOD = registerBlock("stripped_rowan_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> STRIPPED_TWISTED_WOOD = registerBlock("stripped_twisted_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> STRIPPED_WITCH_WOOD_WOOD = registerBlock("stripped_witch_wood_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);


    //Stripped Log
    public static final RegistryObject<Block> STRIPPED_EBONY_LOG = registerBlock("stripped_ebony_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> STRIPPED_BLOOD_OAK_LOG = registerBlock("stripped_blood_oak_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> STRIPPED_HELL_BARK_LOG = registerBlock("stripped_hell_bark_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> STRIPPED_WHITE_OAK_LOG = registerBlock("stripped_white_oak_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> STRIPPED_ALDER_LOG = registerBlock("stripped_alder_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> STRIPPED_WITCH_HAZEL_LOG = registerBlock("stripped_witch_hazel_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> STRIPPED_HAWTHORN_LOG = registerBlock("stripped_hawthorn_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> STRIPPED_CEDAR_LOG = registerBlock("stripped_cedar_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> STRIPPED_DISTORTED_LOG = registerBlock("stripped_distorted_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> STRIPPED_ELDER_LOG = registerBlock("stripped_elder_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> STRIPPED_JUNIPER_LOG = registerBlock("stripped_juniper_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> STRIPPED_ROWAN_LOG = registerBlock("stripped_rowan_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> STRIPPED_TWISTED_LOG = registerBlock("stripped_twisted_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> STRIPPED_WITCH_WOOD_LOG = registerBlock("stripped_witch_wood_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Wood
    public static final RegistryObject<Block> EBONY_WOOD = registerBlock("ebony_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> BLOOD_OAK_WOOD = registerBlock("blood_oak_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> HELL_BARK_WOOD = registerBlock("hell_bark_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> WHITE_OAK_WOOD = registerBlock("white_oak_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> ALDER_WOOD = registerBlock("alder_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> WITCH_HAZEL_WOOD = registerBlock("witch_hazel_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> WILLOW_WOOD = registerBlock("willow_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> HAWTHORN_WOOD = registerBlock("hawthorn_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> CEDAR_WOOD = registerBlock("cedar_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> DISTORTED_WOOD = registerBlock("distorted_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ELDER_WOOD = registerBlock("elder_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> JUNIPER_WOOD = registerBlock("juniper_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ROWAN_WOOD = registerBlock("rowan_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> TWISTED_WOOD = registerBlock("twisted_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_WOOD_WOOD = registerBlock("witch_wood_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);


    //Log
    public static final RegistryObject<Block> EBONY_LOG = registerBlock("ebony_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> BLOOD_OAK_LOG = registerBlock("blood_oak_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> HELL_BARK_LOG = registerBlock("hell_bark_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> WHITE_OAK_LOG = registerBlock("white_oak_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> ALDER_LOG = registerBlock("alder_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> WITCH_HAZEL_LOG = registerBlock("witch_hazel_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> WILLOW_LOG = registerBlock("willow_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> HAWTHORN_LOG = registerBlock("hawthorn_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> CEDAR_LOG = registerBlock("cedar_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> DISTORTED_LOG = registerBlock("distorted_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ELDER_LOG = registerBlock("elder_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> JUNIPER_LOG = registerBlock("juniper_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ROWAN_LOG = registerBlock("rowan_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> TWISTED_LOG = registerBlock("twisted_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_WOOD_LOG = registerBlock("witch_wood_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Planks
    public static final RegistryObject<Block> EBONY_PLANKS = registerBlock("ebony_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_PLANKS = registerBlock("blood_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_PLANKS = registerBlock("hell_bark_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WHITE_OAK_PLANKS = registerBlock("white_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ALDER_PLANKS = registerBlock("alder_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_HAZEL_PLANKS = registerBlock("witch_hazel_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WILLOW_PLANKS = registerBlock("willow_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HAWTHORN_PLANKS = registerBlock("hawthorn_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CEDAR_PLANKS = registerBlock("cedar_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> DISTORTED_PLANKS = registerBlock("distorted_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ELDER_PLANKS = registerBlock("elder_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> JUNIPER_PLANKS = registerBlock("juniper_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ROWAN_PLANKS = registerBlock("rowan_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> TWISTED_PLANKS = registerBlock("twisted_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_WOOD_PLANKS = registerBlock("witch_wood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);


    //Leaves
    public static final RegistryObject<Block> EBONY_LEAVES = registerBlock("ebony_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> EBONY_LEAVES_PILE = registerBlock("ebony_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> BLOOD_OAK_LEAVES = registerBlock("blood_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> BLOOD_OAK_LEAVES_PILE = registerBlock("blood_oak_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> HELL_BARK_LEAVES = registerBlock("hell_bark_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> HELL_BARK_LEAVES_PILE = registerBlock("hell_bark_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> WHITE_OAK_LEAVES = registerBlock("white_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> WHITE_OAK_LEAVES_PILE = registerBlock("white_oak_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ALDER_LEAVES = registerBlock("alder_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> ALDER_LEAVES_PILE = registerBlock("alder_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_HAZEL_LEAVES = registerBlock("witch_hazel_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> WITCH_HAZEL_LEAVES_PILE = registerBlock("witch_hazel_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WILLOW_LEAVES = registerBlock("willow_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> WILLOW_LEAVES_PILE = registerBlock("willow_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HAWTHORN_LEAVES = registerBlock("hawthorn_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> HAWTHORN_LEAVES_PILE = registerBlock("hawthorn_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CEDAR_LEAVES = registerBlock("cedar_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> CEDAR_LEAVES_PILE = registerBlock("cedar_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> DISTORTED_LEAVES = registerBlock("distorted_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> DISTORTED_LEAVES_PILE = registerBlock("distorted_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ELDER_LEAVES = registerBlock("elder_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> ELDER_LEAVES_PILE = registerBlock("elder_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> JUNIPER_LEAVES = registerBlock("juniper_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> JUNIPER_LEAVES_PILE = registerBlock("juniper_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ROWAN_LEAVES = registerBlock("rowan_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> ROWAN_LEAVES_PILE = registerBlock("rowan_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> TWISTED_LEAVES = registerBlock("twisted_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> TWISTED_LEAVES_PILE = registerBlock("twisted_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_WOOD_LEAVES = registerBlock("witch_wood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject <Block> WITCH_WOOD_LEAVES_PILE = registerBlock("witch_wood_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Doors
    public static final RegistryObject<Block> EBONY_DOOR = registerBlock("ebony_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> BLOOD_OAK_DOOR = registerBlock("blood_oak_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_DOOR = registerBlock("hell_bark_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> WHITE_OAK_DOOR = registerBlock("white_oak_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> ALDER_DOOR = registerBlock("alder_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> WITCH_HAZEL_DOOR = registerBlock("witch_hazel_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> WILLOW_DOOR = registerBlock("willow_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> HAWTHORN_DOOR = registerBlock("hawthorn_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> CEDAR_DOOR = registerBlock("cedar_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> DISTORTED_DOOR = registerBlock("distorted_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> ELDER_DOOR = registerBlock("elder_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> JUNIPER_DOOR = registerBlock("juniper_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ROWAN_DOOR = registerBlock("rowan_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> TWISTED_DOOR = registerBlock("twisted_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_WOOD_DOOR = registerBlock("witch_wood_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Trapdoors
    public static final RegistryObject<Block> EBONY_TRAPDOOR = registerBlock("ebony_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> BLOOD_OAK_TRAPDOOR = registerBlock("blood_oak_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_TRAPDOOR = registerBlock("hell_bark_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WHITE_OAK_TRAPDOOR = registerBlock("white_oak_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> ALDER_TRAPDOOR = registerBlock("alder_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> WITCH_HAZEL_TRAPDOOR = registerBlock("witch_hazel_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> WILLOW_TRAPDOOR = registerBlock("willow_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HAWTHORN_TRAPDOOR = registerBlock("hawthorn_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CEDAR_TRAPDOOR = registerBlock("cedar_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> DISTORTED_TRAPDOOR = registerBlock("distorted_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> ELDER_TRAPDOOR = registerBlock("elder_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> JUNIPER_TRAPDOOR = registerBlock("juniper_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ROWAN_TRAPDOOR = registerBlock("rowan_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> TWISTED_TRAPDOOR = registerBlock("twisted_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_WOOD_TRAPDOOR = registerBlock("witch_wood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Pressure Plates
    public static final RegistryObject<Block> EBONY_PRESSURE_PLATE = registerBlock("ebony_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noLootTable()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_PRESSURE_PLATE = registerBlock("blood_oak_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_PRESSURE_PLATE = registerBlock("hell_bark_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WHITE_OAK_PRESSURE_PLATE = registerBlock("white_oak_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ALDER_PRESSURE_PLATE = registerBlock("alder_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_HAZEL_PRESSURE_PLATE = registerBlock("witch_hazel_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WILLOW_PRESSURE_PLATE = registerBlock("willow_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HAWTHORN_PRESSURE_PLATE = registerBlock("hawthorn_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CEDAR_PRESSURE_PLATE = registerBlock("cedar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> DISTORTED_PRESSURE_PLATE = registerBlock("distorted_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ELDER_PRESSURE_PLATE = registerBlock("elder_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> JUNIPER_PRESSURE_PLATE = registerBlock("juniper_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ROWAN_PRESSURE_PLATE = registerBlock("rowan_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> TWISTED_PRESSURE_PLATE = registerBlock("twisted_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_WOOD_PRESSURE_PLATE = registerBlock("witch_wood_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);


    //Buttons
    public static final RegistryObject<Block> PEARL_STONE_BUTTON = registerBlock("pearl_stone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_STONE_BUTTON = registerBlock("crimson_stone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_STONE_BUTTON = registerBlock("under_world_stone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> EBONY_BUTTON = registerBlock("ebony_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_BUTTON = registerBlock("blood_oak_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_BUTTON = registerBlock("hell_bark_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WHITE_OAK_BUTTON = registerBlock("white_oak_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ALDER_BUTTON = registerBlock("alder_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_HAZEL_BUTTON = registerBlock("witch_hazel_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WILLOW_BUTTON = registerBlock("willow_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HAWTHORN_BUTTON = registerBlock("hawthorn_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CEDAR_BUTTON = registerBlock("cedar_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> DISTORTED_BUTTON = registerBlock("distorted_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ELDER_BUTTON = registerBlock("elder_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> JUNIPER_BUTTON = registerBlock("juniper_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ROWAN_BUTTON = registerBlock("rowan_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> TWISTED_BUTTON = registerBlock("twisted_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_WOOD_BUTTON = registerBlock("witch_wood_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Fences
    public static final RegistryObject<Block> EBONY_FENCE = registerBlock("ebony_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_FENCE = registerBlock("blood_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_FENCE = registerBlock("hell_bark_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WHITE_OAK_FENCE = registerBlock("white_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ALDER_FENCE = registerBlock("alder_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_HAZEL_FENCE = registerBlock("witch_hazel_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WILLOW_FENCE = registerBlock("willow_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HAWTHORN_FENCE = registerBlock("hawthorn_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CEDAR_FENCE = registerBlock("cedar_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> DISTORTED_FENCE = registerBlock("distorted_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ELDER_FENCE = registerBlock("elder_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> JUNIPER_FENCE = registerBlock("juniper_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ROWAN_FENCE = registerBlock("rowan_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> TWISTED_FENCE = registerBlock("twisted_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_WOOD_FENCE = registerBlock("witch_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Fence Gates
    public static final RegistryObject<Block> EBONY_FENCE_GATE = registerBlock("ebony_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_FENCE_GATE = registerBlock("blood_oak_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_FENCE_GATE = registerBlock("hell_bark_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WHITE_OAK_FENCE_GATE = registerBlock("white_oak_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ALDER_FENCE_GATE = registerBlock("alder_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_HAZEL_FENCE_GATE = registerBlock("witch_hazel_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WILLOW_FENCE_GATE = registerBlock("willow_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HAWTHORN_FENCE_GATE = registerBlock("hawthorn_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CEDAR_FENCE_GATE = registerBlock("cedar_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> DISTORTED_FENCE_GATE = registerBlock("distorted_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ELDER_FENCE_GATE = registerBlock("elder_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> JUNIPER_FENCE_GATE = registerBlock("juniper_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ROWAN_FENCE_GATE = registerBlock("rowan_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).
                    strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> TWISTED_FENCE_GATE = registerBlock("twisted_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_WOOD_FENCE_GATE = registerBlock("witch_wood_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Signs
    public static final RegistryObject<Block> EBONY_WALL_SIGN = registerBlockWithoutBlockItem("ebony_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.EBONY));
    public static final RegistryObject<Block> EBONY_SIGN = registerBlockWithoutBlockItem("ebony_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.EBONY));
    public static final RegistryObject<Block> BLOOD_OAK_WALL_SIGN = registerBlockWithoutBlockItem("blood_oak_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.BLOOD_OAK));
    public static final RegistryObject<Block> BLOOD_OAK_SIGN = registerBlockWithoutBlockItem("blood_oak_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.BLOOD_OAK));
    public static final RegistryObject<Block> HELL_BARK_WALL_SIGN = registerBlockWithoutBlockItem("hell_bark_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.HELL_BARK));
    public static final RegistryObject<Block> HELL_BARK_SIGN = registerBlockWithoutBlockItem("hell_bark_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.HELL_BARK));
    public static final RegistryObject<Block> WHITE_OAK_WALL_SIGN = registerBlockWithoutBlockItem("white_oak_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.WHITE_OAK));
    public static final RegistryObject<Block> WHITE_OAK_SIGN = registerBlockWithoutBlockItem("white_oak_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.WHITE_OAK));
    public static final RegistryObject<Block> ALDER_WALL_SIGN = registerBlockWithoutBlockItem("alder_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.ALDER));
    public static final RegistryObject<Block> ALDER_SIGN = registerBlockWithoutBlockItem("alder_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.ALDER));
    public static final RegistryObject<Block> WITCH_HAZEL_WALL_SIGN = registerBlockWithoutBlockItem("witch_hazel_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.WITCH_HAZEL));
    public static final RegistryObject<Block> WITCH_HAZEL_SIGN = registerBlockWithoutBlockItem("witch_hazel_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.WITCH_HAZEL));
    public static final RegistryObject<Block> WILLOW_WALL_SIGN = registerBlockWithoutBlockItem("willow_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.WILLOW));
    public static final RegistryObject<Block> WILLOW_SIGN = registerBlockWithoutBlockItem("willow_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.WILLOW));
    public static final RegistryObject<Block> HAWTHORN_WALL_SIGN = registerBlockWithoutBlockItem("hawthorn_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.HAWTHORN));
    public static final RegistryObject<Block> HAWTHORN_SIGN = registerBlockWithoutBlockItem("hawthorn_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.HAWTHORN));
    public static final RegistryObject<Block> CEDAR_WALL_SIGN = registerBlockWithoutBlockItem("cedar_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.CEDAR));
    public static final RegistryObject<Block> CEDAR_SIGN = registerBlockWithoutBlockItem("cedar_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.CEDAR));
    public static final RegistryObject<Block> DISTORTED_WALL_SIGN = registerBlockWithoutBlockItem("distorted_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.DISTORTED));
    public static final RegistryObject<Block> DISTORTED_SIGN = registerBlockWithoutBlockItem("distorted_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.DISTORTED));
    public static final RegistryObject<Block> ELDER_WALL_SIGN = registerBlockWithoutBlockItem("elder_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.ELDER));
    public static final RegistryObject<Block> ELDER_SIGN = registerBlockWithoutBlockItem("elder_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.ELDER));
    public static final RegistryObject<Block> JUNIPER_WALL_SIGN = registerBlockWithoutBlockItem("juniper_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.JUNIPER));
    public static final RegistryObject<Block> JUNIPER_SIGN = registerBlockWithoutBlockItem("juniper_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.JUNIPER));
    public static final RegistryObject<Block> ROWAN_WALL_SIGN = registerBlockWithoutBlockItem("rowan_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.ROWAN));
    public static final RegistryObject<Block> ROWAN_SIGN = registerBlockWithoutBlockItem("rowan_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.ROWAN));
    public static final RegistryObject<Block> TWISTED_WALL_SIGN = registerBlockWithoutBlockItem("twisted_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.TWISTED));
    public static final RegistryObject<Block> TWISTED_SIGN = registerBlockWithoutBlockItem("twisted_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.TWISTED));
    public static final RegistryObject<Block> WITCH_WOOD_WALL_SIGN = registerBlockWithoutBlockItem("witch_wood_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.WITCH_WOOD));
    public static final RegistryObject<Block> WITCH_WOOD_SIGN = registerBlockWithoutBlockItem("witch_wood_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.WITCH_WOOD));


    //Portal Blocks
    //public static final RegistryObject<Block> UNDERWORLD_PORTAL = registerBlockWithoutBlockItem("underworld_portal",
            //UnderworldPortalBlock::new);

    //Bookshelves
    public static final RegistryObject<Block> EBONY_BOOKSHELF = registerBlock("ebony_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_BOOKSHELF = registerBlock("blood_oak_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_BOOKSHELF = registerBlock("hell_bark_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WHITE_OAK_BOOKSHELF = registerBlock("white_oak_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ALDER_BOOKSHELF = registerBlock("alder_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_HAZEL_BOOKSHELF = registerBlock("witch_hazel_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WILLOW_BOOKSHELF = registerBlock("willow_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HAWTHORN_BOOKSHELF = registerBlock("hawthorn_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CEDAR_BOOKSHELF = registerBlock("cedar_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> DISTORTED_BOOKSHELF = registerBlock("distorted_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ELDER_BOOKSHELF = registerBlock("elder_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> JUNIPER_BOOKSHELF = registerBlock("juniper_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> ROWAN_BOOKSHELF = registerBlock("rowan_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> TWISTED_BOOKSHELF = registerBlock("twisted_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> WITCH_WOOD_BOOKSHELF = registerBlock("witch_wood_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Crates
    public static final RegistryObject<Block> CRATE_EBONY = BLOCKS.register("crate_ebony", () -> new CrateEbonyBlock());
    public static final RegistryObject<Block> CRATE_BLOOD_OAK = BLOCKS.register("crate_blood_oak", () -> new CrateBloodOakBlock());
    public static final RegistryObject<Block> CRATE_HELLBARK = BLOCKS.register("crate_hellbark", () -> new CrateHellbarkBlock());
    public static final RegistryObject<Block> CRATE_WHITE_OAK = BLOCKS.register("crate_white_oak", () -> new CrateWhiteOakBlock());
    public static final RegistryObject<Block> CRATE_ALDER = BLOCKS.register("crate_alder", () -> new CrateAlderBlock());
    public static final RegistryObject<Block> CRATE_WITCH_HAZEL = BLOCKS.register("crate_witch_hazel", () -> new CrateWitchHazelBlock());
    public static final RegistryObject<Block> CRATE_WILLOW = BLOCKS.register("crate_willow", () -> new CrateWillowBlock());
    public static final RegistryObject<Block> CRATE_HAWTHORN = BLOCKS.register("crate_hawthorn", () -> new CrateHawthornBlock());
    public static final RegistryObject<Block> CRATE_CEDAR = BLOCKS.register("crate_cedar", () -> new CrateCedarBlock());
    public static final RegistryObject<Block> CRATE_DISTORTED = BLOCKS.register("crate_distorted", () -> new CrateDistortedBlock());
    public static final RegistryObject<Block> CRATE_ELDER = BLOCKS.register("crate_elder", () -> new CrateElderBlock());
    public static final RegistryObject<Block> CRATE_JUNIPER = BLOCKS.register("crate_juniper", () -> new CrateJuniperBlock());
    public static final RegistryObject<Block> CRATE_ROWAN = BLOCKS.register("crate_rowan", () -> new CrateRowanBlock());
    public static final RegistryObject<Block> CRATE_TWISTED = BLOCKS.register("crate_twisted", () -> new CrateTwistedBlock());
    public static final RegistryObject<Block> CRATE_WITCH_WOOD = BLOCKS.register("crate_witch_wood", () -> new CrateWitchWoodBlock());
    public static final RegistryObject<Block> CRATE_OAK = BLOCKS.register("crate_oak", () -> new CrateOakBlock());
    public static final RegistryObject<Block> CRATE_SPRUCE = BLOCKS.register("crate_spruce", () -> new CrateSpruceBlock());
    public static final RegistryObject<Block> CRATE_BIRCH = BLOCKS.register("crate_birch", () -> new CrateBirchBlock());
    public static final RegistryObject<Block> CRATE_JUNGLE = BLOCKS.register("crate_jungle", () -> new CrateJungleBlock());
    public static final RegistryObject<Block> CRATE_ACACIA = BLOCKS.register("crate_acacia", () -> new CrateAcaciaBlock());
    public static final RegistryObject<Block> CRATE_DARK_OAK = BLOCKS.register("crate_dark_oak", () -> new CrateDarkOakBlock());
    public static final RegistryObject<Block> CRATE_CRIMSON = BLOCKS.register("crate_crimson", () -> new CrateCrimsonBlock());
    public static final RegistryObject<Block> CRATE_WARPED = BLOCKS.register("crate_warped", () -> new CrateWarpedBlock());
    public static final RegistryObject<Block> CRATE_MANGROVE = BLOCKS.register("crate_mangrove", () -> new CrateMangroveBlock());


    //Chest


    //Boats


    //Lanterns
    public static final RegistryObject<Block> FAIRY_LANTERN = registerBlock("fairy_lantern",
            () -> new FairyLanternBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN)
                    .lightLevel((state) -> 15)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Plants
    public static final RegistryObject<Block> BLOODY_ROSE = registerBlock("bloody_rose",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 4, BlockBehaviour.Properties.copy(Blocks.POPPY)
                    .instabreak().noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> POTTED_BLOODY_ROSE = registerBlockWithoutItem("potted_bloody_rose",
            () -> new FlowerPotBlock(null, HexcraftBlocks.BLOODY_ROSE,
                    BlockBehaviour.Properties.copy(Blocks.BRICKS)
                            .instabreak().noOcclusion()));
    public static final RegistryObject<Block> WILD_BRAMBLE = registerBlock("wild_bramble",
            () -> new WildBrambleBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE)
                    .instabreak().noOcclusion().noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //public static final RegistryObject<Block> ENDER_BRAMBLE = registerBlock("ender_bramble",
            //() -> new EnderBrambleBlock(BlockBehaviour.Properties.copy(Blocks.SUGAR_CANE)
                    //.instabreak().noOcclusion().noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> WITCHES_LADDER = BLOCKS.register("witches_ladder",
            () -> new WitchesLadderBlock(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES)
                    .instabreak().noOcclusion().randomTicks()));
    public static final RegistryObject<Block> WITCHES_LADDER_PLANT = BLOCKS.register("witches_ladder_plant",
            () -> new WitchesLadderPlant(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES)
                    .instabreak().noOcclusion()));
    public static final RegistryObject<Block> LIVING_KELP = BLOCKS.register("living_kelp",
            () -> new LivingKelpBlock(BlockBehaviour.Properties.copy(Blocks.KELP)
                    .noCollission().randomTicks().instabreak().sound(SoundType.WET_GRASS)
                    .lightLevel((state) -> 15)));
    public static final RegistryObject<Block> LIVING_KELP_PLANT = BLOCKS.register("living_kelp_plant",
            () -> new LivingkelpPlant(BlockBehaviour.Properties.copy(Blocks.KELP_PLANT)
                    .instabreak().lightLevel((state) -> 15).noOcclusion()));

    public static final RegistryObject<Block> LIVING_KELP_BLOCK = registerBlock("living_kelp_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.WATER_PLANT).sound(SoundType.GRASS)
                    .strength(0.5F, 2.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    public static final RegistryObject<Block> MANDRAKE_FLOWER = registerBlockWithoutBlockItem("mandrake_flower",
            () -> new MandrakePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().randomTicks()));
    public static final RegistryObject<Block> GARLIC_PLANT = registerBlockWithoutBlockItem("garlic_plant",
            () -> new GarlicPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().randomTicks()));
    public static final RegistryObject<Block> VERVAIN_FLOWER = registerBlockWithoutBlockItem("vervain_flower",
            () -> new VervainPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().randomTicks()));
    public static final RegistryObject<Block> CINDER_PLANT = registerBlockWithoutBlockItem("cinder_plant",
            () -> new CinderBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).noOcclusion().randomTicks()));

    public static final RegistryObject<Block> BLOOD_MUSHROOM_BLOCK = registerBlock("blood_mushroom_block",
            () -> new HugeMushroomBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.2F, 0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_MUSHROOM_STEM = registerBlock("blood_mushroom_stem",
            () -> new HugeMushroomBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.2F, 0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_FIRE = BLOCKS.register("hell_fire",
            () -> new HellFireBlock(BlockBehaviour.Properties.of(Material.FIRE)
                    .instabreak().noOcclusion().randomTicks().lightLevel((state) -> 15)));
    public static final RegistryObject<Block> HELLFIRE_CAMP = registerBlock("hellfire_camp",
            () -> new HellfireCampfireBlock(true, 1, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F).sound(SoundType.WOOD).noOcclusion().lightLevel((state) -> 15)),
            HexcraftCreativeModeTab.HEXCRAFT_TAB);



    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        return  BLOCKS.register(name, block);

    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return HexcraftItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}