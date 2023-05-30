package com.masterquentus.hexcraft.event;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.HexcraftEntityTypes;
import com.masterquentus.hexcraft.entity.custom.*;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Hexcraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class HexcraftEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(HexcraftEntityTypes.LILITH.get(), LilithEntity.setAttributes());
        event.put(HexcraftEntityTypes.WENDIGO.get(), WendigoEntity.setAttributes());
        event.put(HexcraftEntityTypes.FAIRY.get(), WendigoEntity.setAttributes());
        event.put(HexcraftEntityTypes.VAMPIRE_PIGLIN.get(), VampirePiglinEntity.setAttributes());
        event.put(HexcraftEntityTypes.SIREN.get(), SirenEntity.setAttributes());
        event.put(HexcraftEntityTypes.MERMAID.get(), MermaidEntity.setAttributes());

    }
}