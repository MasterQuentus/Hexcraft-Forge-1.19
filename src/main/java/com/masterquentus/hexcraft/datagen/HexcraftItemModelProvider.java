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
        simpleItem(HexcraftItems.BLOOD_BOTTLE);
        simpleItem(HexcraftItems.LILITH_BLOOD_BOTTLE);
        simpleItem(HexcraftItems.LILITH_CONTRACT);
        simpleItem(HexcraftItems.LILITH_SOUL);
        simpleItem(HexcraftItems.MAGIC_CRYSTAL);
        simpleItem(HexcraftItems.FAIRY_DUST);
        simpleItem(HexcraftItems.PIXIE_DUST);
        simpleItem(HexcraftItems.ROPE);
        simpleItem(HexcraftItems.MOONSTONE);
        simpleItem(HexcraftItems.RAW_SILVER);
        simpleItem(HexcraftItems.SILVER_INGOT);
        simpleItem(HexcraftItems.SILVER_NUGGET);
        simpleItem(HexcraftItems.VAMPIRIC_GEM);
        simpleItem(HexcraftItems.WITCHES_SATCHEL);
        simpleItem(HexcraftItems.FLINT_AND_HELLFIRE);
        simpleItem(HexcraftItems.MANDRAKE_SEEDS);
        simpleItem(HexcraftItems.MANDRAKE_ROOT);
        simpleItem(HexcraftItems.GARLIC);
        simpleItem(HexcraftItems.VERVAIN_SEEDS);
        simpleItem(HexcraftItems.VERVAIN);
        simpleItem(HexcraftItems.CINDER_BERRY);
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
        simpleItem(HexcraftItems.WITCHES_HAT);
        simpleItem(HexcraftItems.WITCHES_ROBES);
        simpleItem(HexcraftItems.WITCHES_PANTS);
        simpleItem(HexcraftItems.WITCHES_BOOTS);
        simpleItem(HexcraftItems.SILVER_HELMET);
        simpleItem(HexcraftItems.SILVER_CHESTPLATE);
        simpleItem(HexcraftItems.SILVER_LEGGINGS);
        simpleItem(HexcraftItems.SILVER_BOOTS);
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
