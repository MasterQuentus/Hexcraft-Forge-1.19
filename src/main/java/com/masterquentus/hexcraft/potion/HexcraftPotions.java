package com.masterquentus.hexcraft.potion;

import com.masterquentus.hexcraft.Hexcraft;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, Hexcraft.MOD_ID);


    public static final RegistryObject<Potion> VERVAIN_POTION = POTIONS.register("vervain_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.POISON, 200, 0)));

    public static void register(IEventBus eventBus){
        POTIONS.register(eventBus);
    }
}
