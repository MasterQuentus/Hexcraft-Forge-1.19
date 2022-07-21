package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.entity.client.gui.*;
import com.masterquentus.hexcraft.world.HexcraftMenus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HexcraftScreens {
    @SubscribeEvent
    public static void clientLoad(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(HexcraftMenus.EBONY_CRATE_GUI.get(), CrateEbonyGUIScreen::new);

            MenuScreens.register(HexcraftMenus.BLOOD_OAK_CRATE_GUI.get(), CrateBloodOakGUIScreen::new);

            MenuScreens.register(HexcraftMenus.HELLBARK_CRATE_GUI.get(), CrateHellbarkGUIScreen::new);

            MenuScreens.register(HexcraftMenus.WHITE_OAK_CRATE_GUI.get(), CrateWhiteOakGUIScreen::new);

            MenuScreens.register(HexcraftMenus.ALDER_CRATE_GUI.get(), CrateAlderGUIScreen::new);

            MenuScreens.register(HexcraftMenus.WITCH_HAZEL_CRATE_GUI.get(), CrateWitchHazelGUIScreen::new);

            MenuScreens.register(HexcraftMenus.WILLOW_CRATE_GUI.get(), CrateWillowGUIScreen::new);
        });
    }
}
