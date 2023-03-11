package com.masterquentus.hexcraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class HexcraftCreativeModeTab {
    public static final CreativeModeTab HEXCRAFT_TAB = new CreativeModeTab("hexcrafttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(HexcraftItems.INFUSED_FABRIC.get());
        }
    };
}