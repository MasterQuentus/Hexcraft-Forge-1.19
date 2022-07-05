package com.masterquentus.hexcraft.block.entity;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.block.custom.HexcraftSignBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Hexcraft.MOD_ID);

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
                            HexcraftBlocks.WHITE_OAK_WALL_SIGN.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}