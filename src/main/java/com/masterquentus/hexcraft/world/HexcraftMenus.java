package com.masterquentus.hexcraft.world;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.world.inventory.*;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftMenus {

    private static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Hexcraft.MOD_ID);

    public static final RegistryObject<MenuType<CrateEbonyGUIMenu>> EBONY_CRATE_GUI = REGISTRY.register("ebony_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateEbonyGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateBloodOakGUIMenu>> BLOOD_OAK_CRATE_GUI = REGISTRY.register("blood_oak_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateBloodOakGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateHellbarkGUIMenu>> HELLBARK_CRATE_GUI = REGISTRY.register("hellbark_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateHellbarkGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateWhiteOakGUIMenu>> WHITE_OAK_CRATE_GUI = REGISTRY.register("white_oak_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateWhiteOakGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateAlderGUIMenu>> ALDER_CRATE_GUI = REGISTRY.register("alder_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateAlderGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateWitchHazelGUIMenu>> WITCH_HAZEL_CRATE_GUI = REGISTRY.register("witch_hazel_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateWitchHazelGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateWillowGUIMenu>> WILLOW_CRATE_GUI = REGISTRY.register("willow_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateWillowGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateHawthornGUIMenu>> HAWTHORN_CRATE_GUI = REGISTRY.register("hawthorn_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateHawthornGUIMenu(id, inv, null)));
    public static final RegistryObject<MenuType<CrateCedarGUIMenu>> CEDAR_CRATE_GUI = REGISTRY.register("crate_crate_gui",
            () -> new MenuType<>((id, inv) -> new CrateCedarGUIMenu(id, inv, null)));


    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }

}

