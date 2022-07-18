package com.masterquentus.hexcraft.world;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.world.inventory.Crate_BloodOakGUIMenu;
import com.masterquentus.hexcraft.world.inventory.Crate_HellbarkGUIMenu;
import com.masterquentus.hexcraft.world.inventory.Crate_WhiteOakGUIMenu;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.ArrayList;

public class HexcraftMenus {

    private static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Hexcraft.MOD_ID);

    //  public static final MenuType<EbonyCrateGUIMenu> EBONY_CRATE_GUI = register("ebony_crate_gui",
//            (id, inv, extraData) -> new EbonyCrateGUIMenu(id, inv, extraData));

    public static final RegistryObject<MenuType<Crate_BloodOakGUIMenu>> BLOOD_OAK_CRATE_GUI = REGISTRY.register("blood_oak_crate_gui",
            () -> new MenuType<>((id, inv) -> new Crate_BloodOakGUIMenu(id, inv, null)));

    public static final RegistryObject<MenuType<Crate_HellbarkGUIMenu>> HELLBARK_CRATE_GUI = REGISTRY.register("hellbark_crate_gui",
            () -> new MenuType<>((id, inv) -> new Crate_HellbarkGUIMenu(id, inv, null)));

    public static final RegistryObject<MenuType<Crate_WhiteOakGUIMenu>> WHITE_OAK_CRATE_GUI = REGISTRY.register("white_oak_crate_gui",
            () -> new MenuType<>((id, inv) -> new Crate_WhiteOakGUIMenu(id, inv, null)));


    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }

}

