package com.masterquentus.hexcraft.item;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.entity.HexcraftEntityTypes;
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
    public static final RegistryObject<Item> ROPE = ITEMS.register("rope",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> WITCHES_SATCHEL = ITEMS.register("witches_satchel",
            () -> new WitchesSatchelItem(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> FLINT_AND_HELLFIRE = ITEMS.register("flint_and_hellfire",
            () -> new FlintHellFireItem(new Item.Properties().durability(64).tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));


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

    //Poppets
    public static final RegistryObject<Item> POPPET = ITEMS.register("poppet",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> DEATH_PROTECTION_POPPET = ITEMS.register("death_protection_poppet",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> FIRE_PROTECTION_POPPET = ITEMS.register("fire_protection_poppet",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));
    public static final RegistryObject<Item> WATER_PROTECTION_POPPET = ITEMS.register("water_protection_poppet",
            () -> new Item(new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

    //public static final RegistryObject<Item> BLOOD_BUCKET = ITEMS.register("blood_bucket",
    //() -> new BucketItem(HexcraftFluids.BLOOD_FLUID,
    //new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB).stacksTo(1)));



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

    //public static final RegistryObject<Item> GOGGLES_OF_REVEALING = ITEMS.register("goggles_of_revealing",
            //() -> new GoogglesOfRevealingItem(HexcraftArmorMaterials.GOOGLES, EquipmentSlot.HEAD,
                    //new Item.Properties().tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)));

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


    //Brooms
    //public static final RegistryObject<Item> EBONY_BROOM = ITEMS.register("ebony_broom",
    //() -> new BroomItem(new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB)));

    //public static final RegistryObject<Item> BLOOD_OAK_BROOM = ITEMS.register("blood_oak_broom",
    //() -> new BroomItem(new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB)));

    private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}