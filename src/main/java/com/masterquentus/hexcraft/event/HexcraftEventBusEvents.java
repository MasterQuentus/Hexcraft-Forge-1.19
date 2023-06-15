package com.masterquentus.hexcraft.event;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.HexcraftEntityTypes;
import com.masterquentus.hexcraft.entity.custom.*;
import com.masterquentus.hexcraft.entity.custom.vampire.VampireEvokerEntity;
import com.masterquentus.hexcraft.entity.custom.vampire.VampireVindicatorEntity;
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
        event.put(HexcraftEntityTypes.VAMPIRE_VINDICATOR.get(), VampireVindicatorEntity.setAttributes());
        event.put(HexcraftEntityTypes.VAMPIRE_EVOKER.get(), VampireEvokerEntity.setAttributes());
        event.put(HexcraftEntityTypes.BANSHEE.get(), BansheeEntity.setAttributes());
        event.put(HexcraftEntityTypes.WEREWOLF.get(), WerewolfEntity.setAttributes());

    }
}