package com.masterquentus.hexcraft.sound;

import com.masterquentus.hexcraft.Hexcraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Hexcraft.MOD_ID);


    public static final RegistryObject<SoundEvent> WENDIGO_HURT = registerSoundEvent("wendigo_hurt");
    public static final RegistryObject<SoundEvent> WENDIGO_AMBIENT = registerSoundEvent("wendigo_ambient");
    public static final RegistryObject<SoundEvent> WENDIGO_DEATH = registerSoundEvent("wendigo_death");


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Hexcraft.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}