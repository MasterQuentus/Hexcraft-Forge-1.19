package com.masterquentus.hexcraft.entity.client;

import com.masterquentus.hexcraft.entity.client.gui.Crate_BloodOakGUIScreen;
import com.masterquentus.hexcraft.entity.client.gui.Crate_HellbarkGUIScreen;
import com.masterquentus.hexcraft.entity.client.gui.Crate_WhiteOakGUIScreen;
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
            //            MenuScreens.register(HexraftMenus.EBONY_CRATE_GUI, EbonyCrateGUIScreen::new);

            MenuScreens.register(HexcraftMenus.BLOOD_OAK_CRATE_GUI.get(), Crate_BloodOakGUIScreen::new);

            MenuScreens.register(HexcraftMenus.HELLBARK_CRATE_GUI.get(), Crate_HellbarkGUIScreen::new);

            MenuScreens.register(HexcraftMenus.WHITE_OAK_CRATE_GUI.get(), Crate_WhiteOakGUIScreen::new);
        });
    }
}
