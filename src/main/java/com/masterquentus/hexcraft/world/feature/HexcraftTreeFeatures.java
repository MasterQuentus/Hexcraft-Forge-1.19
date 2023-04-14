package com.masterquentus.hexcraft.world.feature;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.world.feature.treedecorator.WillowVineLeaveDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftTreeFeatures {

    public static final DeferredRegister<TreeDecoratorType<?>> TREE_DECORATOR_TYPE =
            DeferredRegister.create(ForgeRegistries.TREE_DECORATOR_TYPES, Hexcraft.MOD_ID);

    public static final RegistryObject<TreeDecoratorType<?>> WILLOW_VINE_LEAVE_DECORATOR =
            TREE_DECORATOR_TYPE.register("willow_vine_leave_decorator", () ->
                    new TreeDecoratorType<>(WillowVineLeaveDecorator.CODEC));

    public static void register(IEventBus eventBus) {
        TREE_DECORATOR_TYPE.register(eventBus);
    }
}
