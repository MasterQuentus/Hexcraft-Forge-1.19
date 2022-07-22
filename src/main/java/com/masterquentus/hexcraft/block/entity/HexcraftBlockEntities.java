package com.masterquentus.hexcraft.block.entity;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.block.custom.HexcraftSignBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Hexcraft.MOD_ID);

    public static final RegistryObject<BlockEntityType<HexcraftSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("sign_block_entity", () ->
                    BlockEntityType.Builder.of(HexcraftSignBlockEntity::new,
                            HexcraftBlocks.EBONY_WALL_SIGN.get(),
                            HexcraftBlocks.EBONY_SIGN.get(),
                            HexcraftBlocks.BLOOD_OAK_WALL_SIGN.get(),
                            HexcraftBlocks.BLOOD_OAK_SIGN.get(),
                            HexcraftBlocks.HELL_BARK_SIGN.get(),
                            HexcraftBlocks.HELL_BARK_WALL_SIGN.get(),
                            HexcraftBlocks.WHITE_OAK_SIGN.get(),
                            HexcraftBlocks.WHITE_OAK_WALL_SIGN.get(),
                            HexcraftBlocks.ALDER_WALL_SIGN.get(),
                            HexcraftBlocks.ALDER_SIGN.get(),
                            HexcraftBlocks.WITCH_HAZEL_WALL_SIGN.get(),
                            HexcraftBlocks.WITCH_HAZEL_SIGN.get(),
                            HexcraftBlocks.WILLOW_WALL_SIGN.get(),
                            HexcraftBlocks.WILLOW_SIGN.get(),
                            HexcraftBlocks.HAWTHORN_WALL_SIGN.get(),
                            HexcraftBlocks.HAWTHORN_SIGN.get(),
                            HexcraftBlocks.CEDAR_WALL_SIGN.get(),
                            HexcraftBlocks.CEDAR_SIGN.get()).build(null));

    //Crates
    public static final RegistryObject<BlockEntityType<?>> CRATE_EBONY = register("crate_ebony", HexcraftBlocks.CRATE_EBONY,
            CrateEbonyBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_BLOOD_OAK = register("crate_blood_oak", HexcraftBlocks.CRATE_BLOOD_OAK,
            CrateBloodOakBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_HELLBARK = register("crate_hellbark", HexcraftBlocks.CRATE_HELLBARK,
            CrateHellbarkBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_WHITE_OAK = register("crate_white_oak", HexcraftBlocks.CRATE_WHITE_OAK,
            CrateWhiteOakBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_ALDER = register("crate_alder", HexcraftBlocks.CRATE_ALDER,
            CrateAlderBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_WITCH_HAZEL = register("crate_witch_hazel", HexcraftBlocks.CRATE_WITCH_HAZEL,
            CrateWitchHazelBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_WILLOW = register("crate_willow", HexcraftBlocks.CRATE_WILLOW,
            CrateWillowBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_HAWTHORN = register("crate_hawthorn", HexcraftBlocks.CRATE_HAWTHORN,
            CrateHawthornBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE_CEDAR = register("crate_cedar", HexcraftBlocks.CRATE_CEDAR,
            CrateCedarBlockEntity::new);


    //Boats

    private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
                                                               BlockEntityType.BlockEntitySupplier<?> supplier) {
        return BLOCK_ENTITIES.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
    }


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}