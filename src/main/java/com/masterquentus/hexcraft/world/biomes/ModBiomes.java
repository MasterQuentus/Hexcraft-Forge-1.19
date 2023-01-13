package com.masterquentus.hexcraft.world.biomes;

import com.masterquentus.hexcraft.Hexcraft;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class ModBiomes
{
    public static final ResourceKey<Biome> WHISPERING_FOREST = register("whispering_forest");
    public static final ResourceKey<Biome> VAMPIRE_FOREST = register("vampire_forest");
    public static final ResourceKey<Biome> HELL_FUNGLE_FOREST = register("hell_fungle_forest");
    public static final ResourceKey<Biome> ECHO_FUNGLE_FOREST = register("echo_fungle_forest");
    public static final ResourceKey<Biome> CRIMSON_DESERT = register("crimson_desert");

    private static ResourceKey<Biome> register(String name)
    {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(Hexcraft.MOD_ID, name));
    }
}
