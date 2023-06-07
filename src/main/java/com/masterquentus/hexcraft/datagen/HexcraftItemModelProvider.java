package com.masterquentus.hexcraft.datagen;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.item.HexcraftItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftItemModelProvider extends ItemModelProvider {


    public HexcraftItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Hexcraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(HexcraftItems.INFUSED_FABRIC);
        simpleItem(HexcraftItems.BOUND_LEATHER);
        simpleItem(HexcraftItems.TANNED_LEATHER);
        simpleItem(HexcraftItems.UNFIRED_CLAY_POT);
        simpleItem(HexcraftItems.CLAY_POT);
        simpleItem(HexcraftItems.BLOOD_BOTTLE);
        simpleItem(HexcraftItems.LILITH_BLOOD_BOTTLE);
        simpleItem(HexcraftItems.LILITH_CONTRACT);
        simpleItem(HexcraftItems.LILITH_SOUL);
        simpleItem(HexcraftItems.MAGIC_CRYSTAL);
        simpleItem(HexcraftItems.FAIRY_DUST);
        simpleItem(HexcraftItems.PIXIE_DUST);
        simpleItem(HexcraftItems.BLANK_RUNE);
        simpleItem(HexcraftItems.AIR_RUNE);
        simpleItem(HexcraftItems.EARTH_RUNE);
        simpleItem(HexcraftItems.FIRE_RUNE);
        simpleItem(HexcraftItems.WATER_RUNE);
        simpleItem(HexcraftItems.RED_RUNE);
        simpleItem(HexcraftItems.BLACK_RUNE);
        simpleItem(HexcraftItems.BLUE_RUNE);
        simpleItem(HexcraftItems.GREEN_RUNE);
        simpleItem(HexcraftItems.ORANGE_RUNE);
        simpleItem(HexcraftItems.PURPLE_RUNE);
        simpleItem(HexcraftItems.WHITE_RUNE);
        simpleItem(HexcraftItems.YELLOW_RUNE);
        simpleItem(HexcraftItems.ROPE);
        simpleItem(HexcraftItems.MOONSTONE);
        simpleItem(HexcraftItems.RAW_SILVER);
        simpleItem(HexcraftItems.SILVER_INGOT);
        simpleItem(HexcraftItems.SILVER_NUGGET);
        simpleItem(HexcraftItems.VAMPIRIC_GEM);
        simpleItem(HexcraftItems.CORRUPTED_NETHER_STAR);
        simpleItem(HexcraftItems.CORRUPTED_STEEL);
        simpleItem(HexcraftItems.CORRUPTED_STEEL_NUGGET);
        simpleItem(HexcraftItems.DARK_CRYSTAL_SHARDS);
        simpleItem(HexcraftItems.DARK_STEEL);
        simpleItem(HexcraftItems.DARK_STEEL_NUGGET);
        simpleItem(HexcraftItems.RAW_BLOODY_NYKIUM);
        simpleItem(HexcraftItems.BLOODY_NYKIUM);
        simpleItem(HexcraftItems.BLOODY_NYKIUM_NUGGET);
        simpleItem(HexcraftItems.RAW_CUROGEN);
        simpleItem(HexcraftItems.CUROGEN);
        simpleItem(HexcraftItems.CUROGEN_NUGGET);
        simpleItem(HexcraftItems.RAW_JORMIUM);
        simpleItem(HexcraftItems.ENHANCED_JORMIUM_INGOT);
        simpleItem(HexcraftItems.JORMIUM_INGOT);
        simpleItem(HexcraftItems.JORMIUM_NUGGET);
        simpleItem(HexcraftItems.STEEL_POWDER);
        simpleItem(HexcraftItems.STEEL_INGOT);
        simpleItem(HexcraftItems.WHITE_OAK_ASH);
        simpleItem(HexcraftItems.SALT);
        simpleItem(HexcraftItems.NECROMANTIC_STONE);
        simpleItem(HexcraftItems.ATTUNED_STONE);
        simpleItem(HexcraftItems.ATTUNED_STONE_CHARGED);
        //simpleItem(HexcraftItems.WITCHES_SATCHEL);
        simpleItem(HexcraftItems.FLINT_AND_HELLFIRE);
        simpleItem(HexcraftItems.MANDRAKE_SEEDS);
        simpleItem(HexcraftItems.MANDRAKE_ROOT);
        simpleItem(HexcraftItems.GARLIC);
        simpleItem(HexcraftItems.VERVAIN_SEEDS);
        simpleItem(HexcraftItems.VERVAIN);
        simpleItem(HexcraftItems.WOLFSBANE_SEEDS);
        simpleItem(HexcraftItems.WOLFSBANE);
        simpleItem(HexcraftItems.IRENIAL_SEEDS);
        simpleItem(HexcraftItems.IRENIAL);
        simpleItem(HexcraftItems.MIRA_SEEDS);
        simpleItem(HexcraftItems.MIRA);
        simpleItem(HexcraftItems.XERIFAE_SEEDS);
        simpleItem(HexcraftItems.XERIFAE);
        simpleItem(HexcraftItems.SENIA_SEEDS);
        simpleItem(HexcraftItems.SENIA);
        simpleItem(HexcraftItems.AERPINE_SEEDS);
        simpleItem(HexcraftItems.AERPINE);
        simpleItem(HexcraftItems.PERENNIA_SEEDS);
        simpleItem(HexcraftItems.PERENNIA);
        simpleItem(HexcraftItems.BELLADONNA_SEEDS);
        simpleItem(HexcraftItems.BELLADONNA);
        simpleItem(HexcraftItems.HELLEBORE_SEEDS);
        simpleItem(HexcraftItems.HELLEBORE);
        simpleItem(HexcraftItems.SAGE_SEEDS);
        simpleItem(HexcraftItems.SAGE);
        simpleItem(HexcraftItems.WORMWOOD_SEEDS);
        simpleItem(HexcraftItems.WORMWOOD);
        simpleItem(HexcraftItems.WATER_ARTICHOKE_SEEDS);
        simpleItem(HexcraftItems.WATER_ARTICHOKE);
        simpleItem(HexcraftItems.CINDER_BERRY);
        simpleItem(HexcraftItems.SOUL_BERRY);
        simpleItem(HexcraftItems.BLOOD_APPLE);
        simpleItem(HexcraftItems.JUNIPER_BERRIES);
        simpleItem(HexcraftItems.EBONY_SIGN);
        simpleItem(HexcraftItems.BLOOD_OAK_SIGN);
        simpleItem(HexcraftItems.HELL_BARK_SIGN);
        simpleItem(HexcraftItems.WHITE_OAK_SIGN);
        simpleItem(HexcraftItems.ALDER_SIGN);
        simpleItem(HexcraftItems.WITCH_HAZEL_SIGN);
        simpleItem(HexcraftItems.WILLOW_SIGN);
        simpleItem(HexcraftItems.HAWTHORN_SIGN);
        simpleItem(HexcraftItems.CEDAR_SIGN);
        simpleItem(HexcraftItems.DISTORTED_SIGN);
        simpleItem(HexcraftItems.ELDER_SIGN);
        simpleItem(HexcraftItems.JUNIPER_SIGN);
        simpleItem(HexcraftItems.ROWAN_SIGN);
        simpleItem(HexcraftItems.TWISTED_SIGN);
        simpleItem(HexcraftItems.WITCH_WOOD_SIGN);
        simpleItem(HexcraftItems.ECHO_WOOD_SIGN);
        simpleItem(HexcraftItems.POPPET);
        simpleItem(HexcraftItems.DEATH_PROTECTION_POPPET);
        simpleItem(HexcraftItems.FIRE_PROTECTION_POPPET);
        simpleItem(HexcraftItems.WATER_PROTECTION_POPPET);
        simpleItem(HexcraftItems.WITHER_PROTECTION_POPPET);
        simpleItem(HexcraftItems.WITCHES_HAT);
        simpleItem(HexcraftItems.WITCHES_ROBES);
        simpleItem(HexcraftItems.WITCHES_PANTS);
        simpleItem(HexcraftItems.WITCHES_BOOTS);
        //simpleItem(HexcraftItems.HUNTERS_HAT);
        //simpleItem(HexcraftItems.HUNTERS_ROBES);
        //simpleItem(HexcraftItems.HUNTERS_PANTS);
        //simpleItem(HexcraftItems.HUNTERS_BOOTS);
        simpleItem(HexcraftItems.SILVER_HELMET);
        simpleItem(HexcraftItems.SILVER_CHESTPLATE);
        simpleItem(HexcraftItems.SILVER_LEGGINGS);
        simpleItem(HexcraftItems.SILVER_BOOTS);
        simpleItem(HexcraftItems.VAMPIRIC_HELMET);
        simpleItem(HexcraftItems.VAMPIRIC_CHESTPLATE);
        simpleItem(HexcraftItems.VAMPIRIC_LEGGINGS);
        simpleItem(HexcraftItems.VAMPIRIC_BOOTS);
        handheldItem(HexcraftItems.SILVER_SWORD);
        handheldItem(HexcraftItems.SILVER_PICKAXE);
        handheldItem(HexcraftItems.SILVER_SHOVEL);
        handheldItem(HexcraftItems.SILVER_AXE);
        handheldItem(HexcraftItems.SILVER_HOE);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Hexcraft.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Hexcraft.MOD_ID, "item/" + item.getId().getPath()));

    }
}