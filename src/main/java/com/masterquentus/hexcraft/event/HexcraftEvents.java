package com.masterquentus.hexcraft.event;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.item.HexcraftItems;
import com.masterquentus.hexcraft.villager.HexcraftVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = Hexcraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class HexcraftEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(HexcraftItems.GARLIC.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    stack, 10, 8, 0.02F));
        }

        if (event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(HexcraftItems.VERVAIN_SEEDS.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    stack, 10, 8, 0.02F));
        }

        if (event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(HexcraftItems.VERVAIN_SEEDS.get(), 2);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    stack, 10, 8, 0.02F));
        }

        if (event.getType() == HexcraftVillagers.WITCH_PROFESSION.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(HexcraftItems.MAGIC_CRYSTAL.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    stack, 10, 8, 0.02F));
        }

        if (event.getType() == HexcraftVillagers.VAMPIRE_EXPERT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(HexcraftItems.GARLIC.get(), 6);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    stack, 10, 8, 0.02F));
        }
    }
    @SubscribeEvent
    public static void giveBloodBottleItem(PlayerInteractEvent.RightClickBlock event) {
        if (!event.getLevel().getBlockState(event.getPos()).is(HexcraftBlocks.BLOOD_BLOCK.get())) {
            return;
        }
        ItemStack itemInHand = event.getEntity().getItemInHand(event.getHand());
        if (itemInHand.is(Items.GLASS_BOTTLE)) {
            ItemStack bloodBottle = new ItemStack(HexcraftItems.BLOOD_BOTTLE.get(), 1);
            event.getLevel().addFreshEntity(bloodBottle.getEntityRepresentation());
            itemInHand.shrink(1);
            event.setCanceled(true);
            return;
        }
    }
}