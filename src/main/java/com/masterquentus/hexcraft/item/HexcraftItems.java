package com.masterquentus.hexcraft.item;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.entity.HexcraftEntityTypes;
import com.masterquentus.hexcraft.entity.custom.HexcraftBoatEntity;
import com.masterquentus.hexcraft.fluid.HexcraftFluids;
import com.masterquentus.hexcraft.item.custom.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Hexcraft.MOD_ID);


    public static final RegistryObject<Item> INFUSED_FABRIC = ITEMS.register("infused_fabric",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> BLOOD_BOTTLE = ITEMS.register("blood_bottle",
            () -> new BloodBottleItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16)));
    public static final RegistryObject<Item> LILITH_BLOOD_BOTTLE = ITEMS.register("lilith_blood_bottle",
            () -> new LilithBloodBottleItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16)));
    public static final RegistryObject<Item> LILITH_CONTRACT = ITEMS.register("lilith_contract",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> LILITH_SOUL = ITEMS.register("lilith_soul",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> MAGIC_CRYSTAL = ITEMS.register("magic_crystal",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> FAIRY_DUST = ITEMS.register("fairy_dust",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> PIXIE_DUST = ITEMS.register("pixie_dust",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> BLANK_RUNE = ITEMS.register("blank_rune",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> AIR_RUNE = ITEMS.register("air_rune",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> EARTH_RUNE = ITEMS.register("earth_rune",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> FIRE_RUNE = ITEMS.register("fire_rune",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> WATER_RUNE = ITEMS.register("water_rune",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> RED_RUNE = ITEMS.register("red_rune",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> BLACK_RUNE = ITEMS.register("black_rune",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> BLUE_RUNE = ITEMS.register("blue_rune",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> GREEN_RUNE = ITEMS.register("green_rune",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> ORANGE_RUNE = ITEMS.register("orange_rune",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> PURPLE_RUNE = ITEMS.register("purple_rune",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> WHITE_RUNE = ITEMS.register("white_rune",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> YELLOW_RUNE = ITEMS.register("yellow_rune",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> ROPE = ITEMS.register("rope",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> MOONSTONE = ITEMS.register("moonstone",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> VAMPIRIC_GEM = ITEMS.register("vampiric_gem",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> CORRUPTED_NETHER_STAR = ITEMS.register("corrupted_nether_star",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> CORRUPTED_STEEL = ITEMS.register("corrupted_steel",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> CORRUPTED_STEEL_NUGGET = ITEMS.register("corrupted_steel_nugget",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> DARK_CRYSTAL_SHARDS = ITEMS.register("dark_crystal_shards",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> DARK_STEEL = ITEMS.register("dark_steel",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> DARK_STEEL_NUGGET = ITEMS.register("dark_steel_nugget",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> RAW_BLOODY_NYKIUM = ITEMS.register("raw_bloody_nykium",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> BLOODY_NYKIUM = ITEMS.register("bloody_nykium",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> BLOODY_NYKIUM_NUGGET = ITEMS.register("bloody_nykium_nugget",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> RAW_CUROGEN = ITEMS.register("raw_curogen",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> CUROGEN = ITEMS.register("curogen",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> CUROGEN_NUGGET = ITEMS.register("curogen_nugget",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> RAW_JORMIUM = ITEMS.register("raw_jormium",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> ENHANCED_JORMIUM_INGOT = ITEMS.register("enhanced_jormium_ingot",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> JORMIUM_INGOT = ITEMS.register("jormium_ingot",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> JORMIUM_NUGGET = ITEMS.register("jormium_nugget",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> STEEL_POWDER = ITEMS.register("steel_powder",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> HELLFIRE_COAL = ITEMS.register("hellfire_coal",
            () -> new HellFireCoalItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> WHITE_OAK_ASH = ITEMS.register("white_oak_ash",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> WITCHES_SATCHEL = ITEMS.register("witches_satchel",
            () -> new WitchesSatchelItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> FLINT_AND_HELLFIRE = ITEMS.register("flint_and_hellfire", FlintHellFireItem::new);

    public static final RegistryObject<Item> VAMPIRIC_STAFF = ITEMS.register("vampiric_staff",
            () -> new VampiricStaffItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> WHITE_OAK_ASH_DAGGER = ITEMS.register("white_oak_ash_dagger",
            () -> new WhiteOakAshDaggerItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    //Spawn Eggs
    public static final RegistryObject<Item> LILITH_SPAWN_EGG = ITEMS.register("lilith_spawn_egg",
            () -> new ForgeSpawnEggItem(HexcraftEntityTypes.LILITH,0x770000, 0x735C30,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> WENDIGO_SPAWN_EGG = ITEMS.register("wendigo_spawn_egg",
            () -> new ForgeSpawnEggItem(HexcraftEntityTypes.WENDIGO,0x643B00, 0xFFFFFF,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> FAIRY_SPAWN_EGG = ITEMS.register("fairy_spawn_egg",
            () -> new ForgeSpawnEggItem(HexcraftEntityTypes.FAIRY,0x16744959, 0x16122111,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> VAMPIRE_PIGLIN_SPAWN_EGG = ITEMS.register("vampire_piglin_spawn_egg",
            () -> new ForgeSpawnEggItem(HexcraftEntityTypes.VAMPIRE_PIGLIN,0x770000, 0x000000,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    //Buckets
    public static final RegistryObject<Item> BLOOD_BUCKET = ITEMS.register("blood_bucket",
            () -> new BucketItem(HexcraftFluids.SOURCE_BLOOD,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    //Plants
    public static final RegistryObject<Item> WITCHES_LADDER_ITEM = ITEMS.register("witches_ladder_item",
            () -> new BlockItem(HexcraftBlocks.WITCHES_LADDER.get(),
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> LIVING_KELP_ITEM = ITEMS.register("living_kelp_item",
            () -> new BlockItem(HexcraftBlocks.LIVING_KELP_PLANT.get(),
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> MANDRAKE_SEEDS = ITEMS.register("mandrake_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.MANDRAKE_FLOWER.get(),
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> MANDRAKE_ROOT = ITEMS.register("mandrake_root",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",
            () -> new ItemNameBlockItem(HexcraftBlocks.GARLIC_PLANT.get(),
                    new Item.Properties().food(Foods.CARROT).tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> VERVAIN_SEEDS = ITEMS.register("vervain_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.VERVAIN_FLOWER.get(),
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> VERVAIN = ITEMS.register("vervain",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> WOLFSBANE_SEEDS = ITEMS.register("wolfsbane_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.WOLFSBANE_FLOWER.get(),
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> WOLFSBANE = ITEMS.register("wolfsbane",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> IRENIAL_SEEDS = ITEMS.register("irenial_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.IRENIAL_FLOWER.get(),
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> IRENIAL = ITEMS.register("irenial",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> MIRA_SEEDS = ITEMS.register("mira_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.MIRA_FLOWER.get(),
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> MIRA = ITEMS.register("mira",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> XERIFAE_SEEDS = ITEMS.register("xerifae_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.XERIFAE_FLOWER.get(),
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> XERIFAE = ITEMS.register("xerifae",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> SENIA_SEEDS = ITEMS.register("senia_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.SENIA_FLOWER.get(),
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> SENIA = ITEMS.register("senia",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> AERPINE_SEEDS = ITEMS.register("aerpine_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.AERPINE_FLOWER.get(),
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> AERPINE = ITEMS.register("aerpine",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> PERENNIA_SEEDS = ITEMS.register("perennia_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.PERENNIA_FLOWER.get(),
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> PERENNIA = ITEMS.register("perennia",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> BELLADONNA_SEEDS = ITEMS.register("belladonna_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.BELLADONNA_PLANT.get(),
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> BELLADONNA = ITEMS.register("belladonna",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> HELLEBORE_SEEDS = ITEMS.register("hellebore_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.HELLEBORE_PLANT.get(),
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> HELLEBORE = ITEMS.register("hellebore",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> SAGE_SEEDS = ITEMS.register("sage_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.SAGE_PLANT.get(),
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> SAGE = ITEMS.register("sage",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> WORMWOOD_SEEDS = ITEMS.register("wormwood_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.WORMWOOD_PLANT.get(),
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> WORMWOOD = ITEMS.register("wormwood",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> WATER_ARTICHOKE_SEEDS = ITEMS.register("water_artichoke_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.WATER_ARTICHOKE_PLANT.get(),
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> WATER_ARTICHOKE = ITEMS.register("water_artichoke",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> CINDER_BERRY = ITEMS.register("cinder_berry",
            () -> new ItemNameBlockItem(HexcraftBlocks.CINDER_PLANT.get(),
                    new Item.Properties().food(Foods.SWEET_BERRIES).tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> BLOOD_APPLE = ITEMS.register("blood_apple",
            () -> new BloodAppleItem(new Item.Properties().food(Foods.APPLE).tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> JUNIPER_BERRIES = ITEMS.register("juniper_berry",
            () -> new Item(new Item.Properties().food(Foods.SWEET_BERRIES).tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    //Signs
    public static final RegistryObject<Item> EBONY_SIGN = ITEMS.register("ebony_sign",
            () -> new SignItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    HexcraftBlocks.EBONY_SIGN.get(), HexcraftBlocks.EBONY_WALL_SIGN.get()));
    public static final RegistryObject<Item> BLOOD_OAK_SIGN = ITEMS.register("blood_oak_sign",
            () -> new SignItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    HexcraftBlocks.BLOOD_OAK_SIGN.get(), HexcraftBlocks.BLOOD_OAK_WALL_SIGN.get()));
    public static final RegistryObject<Item> HELL_BARK_SIGN = ITEMS.register("hell_bark_sign",
            () -> new SignItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    HexcraftBlocks.HELL_BARK_SIGN.get(), HexcraftBlocks.HELL_BARK_WALL_SIGN.get()));
    public static final RegistryObject<Item> WHITE_OAK_SIGN = ITEMS.register("white_oak_sign",
            () -> new SignItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    HexcraftBlocks.WHITE_OAK_SIGN.get(), HexcraftBlocks.WHITE_OAK_WALL_SIGN.get()));
    public static final RegistryObject<Item> ALDER_SIGN = ITEMS.register("alder_sign",
            () -> new SignItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    HexcraftBlocks.ALDER_SIGN.get(), HexcraftBlocks.ALDER_WALL_SIGN.get()));
    public static final RegistryObject<Item> WITCH_HAZEL_SIGN = ITEMS.register("witch_hazel_sign",
            () -> new SignItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    HexcraftBlocks.WITCH_HAZEL_SIGN.get(), HexcraftBlocks.WITCH_HAZEL_WALL_SIGN.get()));
    public static final RegistryObject<Item> WILLOW_SIGN = ITEMS.register("willow_sign",
            () -> new SignItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    HexcraftBlocks.WILLOW_SIGN.get(), HexcraftBlocks.WILLOW_WALL_SIGN.get()));
    public static final RegistryObject<Item> HAWTHORN_SIGN = ITEMS.register("hawthorn_sign",
            () -> new SignItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    HexcraftBlocks.HAWTHORN_SIGN.get(), HexcraftBlocks.HAWTHORN_WALL_SIGN.get()));
    public static final RegistryObject<Item> CEDAR_SIGN = ITEMS.register("cedar_sign",
            () -> new SignItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    HexcraftBlocks.CEDAR_SIGN.get(), HexcraftBlocks.CEDAR_WALL_SIGN.get()));
    public static final RegistryObject<Item> DISTORTED_SIGN = ITEMS.register("distorted_sign",
            () -> new SignItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    HexcraftBlocks.DISTORTED_SIGN.get(), HexcraftBlocks.DISTORTED_WALL_SIGN.get()));
    public static final RegistryObject<Item> ELDER_SIGN = ITEMS.register("elder_sign",
            () -> new SignItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    HexcraftBlocks.ELDER_SIGN.get(), HexcraftBlocks.ELDER_WALL_SIGN.get()));
    public static final RegistryObject<Item> JUNIPER_SIGN = ITEMS.register("juniper_sign",
            () -> new SignItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    HexcraftBlocks.JUNIPER_SIGN.get(), HexcraftBlocks.JUNIPER_WALL_SIGN.get()));
    public static final RegistryObject<Item> ROWAN_SIGN = ITEMS.register("rowan_sign",
            () -> new SignItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    HexcraftBlocks.ROWAN_SIGN.get(), HexcraftBlocks.ROWAN_WALL_SIGN.get()));
    public static final RegistryObject<Item> TWISTED_SIGN = ITEMS.register("twisted_sign",
            () -> new SignItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    HexcraftBlocks.TWISTED_SIGN.get(), HexcraftBlocks.TWISTED_WALL_SIGN.get()));
    public static final RegistryObject<Item> WITCH_WOOD_SIGN = ITEMS.register("witch_wood_sign",
            () -> new SignItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    HexcraftBlocks.WITCH_WOOD_SIGN.get(), HexcraftBlocks.WITCH_WOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> ECHO_WOOD_SIGN = ITEMS.register("echo_wood_sign",
            () -> new SignItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    HexcraftBlocks.ECHO_WOOD_SIGN.get(), HexcraftBlocks.ECHO_WOOD_WALL_SIGN.get()));

    //Poppets
    public static final RegistryObject<Item> POPPET = ITEMS.register("poppet",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> DEATH_PROTECTION_POPPET = ITEMS.register("death_protection_poppet",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> FIRE_PROTECTION_POPPET = ITEMS.register("fire_protection_poppet",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> WATER_PROTECTION_POPPET = ITEMS.register("water_protection_poppet",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));


    //Armor
    public static final RegistryObject<Item> WITCHES_HAT = ITEMS.register("witches_hat",
            () -> new WitchesArmorItem(HexcraftArmorMaterials.WITCH, EquipmentSlot.HEAD,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> WITCHES_ROBES = ITEMS.register("witches_robes",
            () -> new WitchesArmorItem(HexcraftArmorMaterials.WITCH, EquipmentSlot.CHEST,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> WITCHES_PANTS = ITEMS.register("witches_pants",
            () -> new WitchesArmorItem(HexcraftArmorMaterials.WITCH, EquipmentSlot.LEGS,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> WITCHES_BOOTS = ITEMS.register("witches_boots",
            () -> new WitchesArmorItem(HexcraftArmorMaterials.WITCH, EquipmentSlot.FEET,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new ArmorItem(HexcraftArmorMaterials.SILVER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new ArmorItem(HexcraftArmorMaterials.SILVER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new ArmorItem(HexcraftArmorMaterials.SILVER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ArmorItem(HexcraftArmorMaterials.SILVER, EquipmentSlot.FEET,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    //public static final RegistryObject<Item> GOGGLES_OF_REVEALING = ITEMS.register("goggles_of_revealing",
            //() -> new GoogglesOfRevealingItem(HexcraftArmorMaterials.GOOGLES, EquipmentSlot.HEAD,
                    //new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    //Tools
    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new SwordItem(HexcraftTiers.SILVER, 2, 3f,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(HexcraftTiers.SILVER, 1, 1f,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(HexcraftTiers.SILVER, 0, 1f,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(HexcraftTiers.SILVER, 4, 0f,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(HexcraftTiers.SILVER, 0, 0f,
                    new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    //Crates
    public static final RegistryObject<Item> CRATE_EBONY = block(HexcraftBlocks.CRATE_EBONY,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_BLOOD_OAK = block(HexcraftBlocks.CRATE_BLOOD_OAK,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_HELLBARK = block(HexcraftBlocks.CRATE_HELLBARK,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_WHITE_OAK = block(HexcraftBlocks.CRATE_WHITE_OAK,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_ALDER = block(HexcraftBlocks.CRATE_ALDER,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_WITCH_HAZEL = block(HexcraftBlocks.CRATE_WITCH_HAZEL,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_WILLOW = block(HexcraftBlocks.CRATE_WILLOW,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_HAWTHORN = block(HexcraftBlocks.CRATE_HAWTHORN,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_CEDAR = block(HexcraftBlocks.CRATE_CEDAR,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_DISTORTED = block(HexcraftBlocks.CRATE_DISTORTED,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_ELDER = block(HexcraftBlocks.CRATE_ELDER,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_JUNIPER = block(HexcraftBlocks.CRATE_JUNIPER,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_ROWAN = block(HexcraftBlocks.CRATE_ROWAN,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_TWISTED = block(HexcraftBlocks.CRATE_TWISTED,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_WITCH_WOOD = block(HexcraftBlocks.CRATE_WITCH_WOOD,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_ECHO_WOOD = block(HexcraftBlocks.CRATE_ECHO_WOOD,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_OAK = block(HexcraftBlocks.CRATE_OAK,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_SPRUCE = block(HexcraftBlocks.CRATE_SPRUCE,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_BIRCH = block(HexcraftBlocks.CRATE_BIRCH,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_JUNGLE  = block(HexcraftBlocks.CRATE_JUNGLE ,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_ACACIA = block(HexcraftBlocks.CRATE_ACACIA,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_DARK_OAK = block(HexcraftBlocks.CRATE_DARK_OAK,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_CRIMSON = block(HexcraftBlocks.CRATE_CRIMSON,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_WARPED = block(HexcraftBlocks.CRATE_WARPED,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Item> CRATE_MANGROVE = block(HexcraftBlocks.CRATE_MANGROVE,
            HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Chest
    public static final RegistryObject<Item> CHEST_ALDER = ITEMS.register("chest_alder",
            () -> new HexcraftChestBlockItem(HexcraftBlocks.CHEST_ALDER.get(), new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> CHEST_BLOOD_OAK = ITEMS.register("chest_blood_oak",
            () -> new HexcraftChestBlockItem(HexcraftBlocks.CHEST_BLOOD_OAK.get(), new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> CHEST_CEDAR = ITEMS.register("chest_cedar",
            () -> new HexcraftChestBlockItem(HexcraftBlocks.CHEST_CEDAR.get(), new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> CHEST_DISTORTED = ITEMS.register("chest_distorted",
            () -> new HexcraftChestBlockItem(HexcraftBlocks.CHEST_DISTORTED.get(), new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> CHEST_EBONY = ITEMS.register("chest_ebony",
            () -> new HexcraftChestBlockItem(HexcraftBlocks.CHEST_EBONY.get(), new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> CHEST_ECHO_WOOD = ITEMS.register("chest_echo_wood",
            () -> new HexcraftChestBlockItem(HexcraftBlocks.CHEST_ECHO_WOOD.get(), new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> CHEST_ELDER = ITEMS.register("chest_elder",
            () -> new HexcraftChestBlockItem(HexcraftBlocks.CHEST_ELDER.get(), new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> CHEST_HAWTHORN = ITEMS.register("chest_hawthorn",
            () -> new HexcraftChestBlockItem(HexcraftBlocks.CHEST_HAWTHORN.get(), new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> CHEST_HELL_BARK = ITEMS.register("chest_hell_bark",
            () -> new HexcraftChestBlockItem(HexcraftBlocks.CHEST_HELL_BARK.get(), new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> CHEST_JUNIPER = ITEMS.register("chest_juniper",
            () -> new HexcraftChestBlockItem(HexcraftBlocks.CHEST_JUNIPER.get(), new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> CHEST_ROWAN = ITEMS.register("chest_rowan",
            () -> new HexcraftChestBlockItem(HexcraftBlocks.CHEST_ROWAN.get(), new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> CHEST_TWISTED = ITEMS.register("chest_twisted",
            () -> new HexcraftChestBlockItem(HexcraftBlocks.CHEST_TWISTED.get(), new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public  static final RegistryObject<Item> CHEST_WHITE_OAK = ITEMS.register("chest_white_oak",
            () -> new HexcraftChestBlockItem(HexcraftBlocks.CHEST_WHITE_OAK.get(), new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> CHEST_WILLOW = ITEMS.register("chest_willow",
            () -> new HexcraftChestBlockItem(HexcraftBlocks.CHEST_WILLOW.get(), new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> CHEST_WITCH_HAZEL = ITEMS.register("chest_witch_hazel",
            () -> new HexcraftChestBlockItem(HexcraftBlocks.CHEST_WITCH_HAZEL.get(), new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> CHEST_WITCH_WOOD = ITEMS.register("chest_witch_wood",
            () -> new HexcraftChestBlockItem(HexcraftBlocks.CHEST_WITCH_WOOD.get(), new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));


    //Boats
    public static final RegistryObject<Item> EBONY_BOAT = ITEMS.register("ebony_boat",
            () -> new HexcraftBoatItem(HexcraftBoatEntity.Type.EBONY));
    public static final RegistryObject<Item> ALDER_BOAT = ITEMS.register("alder_boat",
            () -> new HexcraftBoatItem(HexcraftBoatEntity.Type.ALDER));

    public static final RegistryObject<Item> BLOOD_OAK_BOAT = ITEMS.register("blood_oak_boat",
            () -> new HexcraftBoatItem(HexcraftBoatEntity.Type.BLOOD_OAK));

    public static final RegistryObject<Item> CEDAR_BOAT = ITEMS.register("cedar_boat",
            () -> new HexcraftBoatItem(HexcraftBoatEntity.Type.CEDAR));

    public static final RegistryObject<Item> DISTORTED_BOAT = ITEMS.register("distorted_boat",
            () -> new HexcraftBoatItem(HexcraftBoatEntity.Type.DISTORTED));

    public static final RegistryObject<Item> ELDER_BOAT = ITEMS.register("elder_boat",
            () -> new HexcraftBoatItem(HexcraftBoatEntity.Type.ELDER));

    public static final RegistryObject<Item> HAWTHORN_BOAT = ITEMS.register("hawthorn_boat",
            () -> new HexcraftBoatItem(HexcraftBoatEntity.Type.HAWTHORN));

    public static final RegistryObject<Item> HELL_BARK_BOAT = ITEMS.register("hell_bark_boat",
            () -> new HexcraftBoatItem(HexcraftBoatEntity.Type.HELL_BARK));

    public static final RegistryObject<Item> JUNIPER_BOAT = ITEMS.register("juniper_boat",
            () -> new HexcraftBoatItem(HexcraftBoatEntity.Type.JUNIPER));

    public static final RegistryObject<Item> ROWAN_BOAT = ITEMS.register("rowan_boat",
            () -> new HexcraftBoatItem(HexcraftBoatEntity.Type.ROWAN));

    public static final RegistryObject<Item> TWISTED_BOAT = ITEMS.register("twisted_boat",
            () -> new HexcraftBoatItem(HexcraftBoatEntity.Type.TWISTED));

    public static final RegistryObject<Item> WHITE_OAK_BOAT = ITEMS.register("white_oak_boat",
            () -> new HexcraftBoatItem(HexcraftBoatEntity.Type.WHITE_OAK));

    public static final RegistryObject<Item> WILLOW_BOAT = ITEMS.register("willow_boat",
            () -> new HexcraftBoatItem(HexcraftBoatEntity.Type.WILLOW));

    public static final RegistryObject<Item> WITCH_HAZEL_BOAT = ITEMS.register("witch_hazel_boat",
            () -> new HexcraftBoatItem(HexcraftBoatEntity.Type.WITCH_HAZEL));

    public static final RegistryObject<Item> WITCH_WOOD_BOAT = ITEMS.register("witch_wood_boat",
            () -> new HexcraftBoatItem(HexcraftBoatEntity.Type.WITCH_WOOD));
    public static final RegistryObject<Item> ECHO_WOOD_BOAT = ITEMS.register("echo_wood_boat",
            () -> new HexcraftBoatItem(HexcraftBoatEntity.Type.ECHO_WOOD));

    //Brooms


    private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}