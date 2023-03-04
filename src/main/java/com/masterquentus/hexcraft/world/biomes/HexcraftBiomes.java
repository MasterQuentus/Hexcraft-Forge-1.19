package com.masterquentus.hexcraft.world.biomes;

import com.masterquentus.hexcraft.Hexcraft;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HexcraftBiomes
{
    public static final DeferredRegister<Biome> BIOME_REGISTER  =
            DeferredRegister.create(ForgeRegistries.BIOMES, Hexcraft.MOD_ID);

    public static void registerBiomes()
    {
        register(ModBiomes.WHISPERING_FOREST, HexcraftOverworldBiomes::whisperingforest);
        register(ModBiomes.VAMPIRE_FOREST, HexcraftOverworldBiomes::vampireforest);
        register(ModBiomes.HELL_FUNGLE_FOREST, HexcraftOverworldBiomes::hellfungleforest);
        register(ModBiomes.ECHO_FUNGLE_FOREST, HexcraftOverworldBiomes::echofungleforest);
        register(ModBiomes.CRIMSON_DESERT, HexcraftOverworldBiomes::crimsondesert);
        register(ModBiomes.FAIRY_FOREST, HexcraftOverworldBiomes::fairyforest);
    }

    public static RegistryObject<Biome> register(ResourceKey<Biome> key, Supplier<Biome> biomeSupplier)
    {
        return BIOME_REGISTER.register(key.location().getPath(), biomeSupplier);
    }
}