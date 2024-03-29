package com.masterquentus.hexcraft.fluid;

import net.minecraft.world.level.material.FlowingFluid;
import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.item.HexcraftItems;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, Hexcraft.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_BLOOD = FLUIDS.register("blood_fluid",
            () -> new ForgeFlowingFluid.Source(HexcraftFluids.BLOOD_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> BLOOD_FLOWING = FLUIDS.register("blood_flowing",
            () -> new ForgeFlowingFluid.Flowing(HexcraftFluids.BLOOD_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SOURCE_SOUL_WATER = FLUIDS.register("soul_water_fluid",
            () -> new ForgeFlowingFluid.Source(HexcraftFluids.SOUL_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SOUL_WATER_FLOWING = FLUIDS.register("soul_water_flowing",
            () -> new ForgeFlowingFluid.Flowing(HexcraftFluids.SOUL_WATER_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties BLOOD_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            HexcraftFluidTypes.BLOOD_FLUID_TYPE, SOURCE_BLOOD, BLOOD_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(HexcraftBlocks.BLOOD_BLOCK)
            .bucket(HexcraftItems.BLOOD_BUCKET);
    public static final ForgeFlowingFluid.Properties SOUL_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            HexcraftFluidTypes.SOUL_WATER_FLUID_TYPE, SOURCE_SOUL_WATER, SOUL_WATER_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(HexcraftBlocks.SOUL_WATER__BLOCK)
            .bucket(HexcraftItems.SOUL_WATER_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}