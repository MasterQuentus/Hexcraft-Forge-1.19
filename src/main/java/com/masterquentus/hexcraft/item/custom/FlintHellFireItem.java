package com.masterquentus.hexcraft.item.custom;

import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.block.custom.HellFireBlock;
import com.masterquentus.hexcraft.block.custom.UnderworldPortalBlock;
import com.masterquentus.hexcraft.util.HexcraftTags;
import com.masterquentus.hexcraft.world.dimesnsion.HexcraftDimensions;
import com.mojang.logging.LogUtils;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.CandleBlock;
import net.minecraft.world.level.block.CandleCakeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.slf4j.Logger;


public class FlintHellFireItem extends Item {
    private static final Logger LOGGER = LogUtils.getLogger();

    public FlintHellFireItem() {
        super(new Properties()
                .tab(HexcraftCreativeModeTab.HEXCRAFT_TAB)
                .stacksTo(1)
                .rarity(Rarity.RARE)
                .durability(64)

        );
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (context.getPlayer() == null) return InteractionResult.FAIL;
        if (context.getLevel() == null) return InteractionResult.FAIL;
        Player player = context.getPlayer();
        Level level = context.getLevel();
        BlockPos clickedPos = context.getClickedPos();
        BlockState blockstate = level.getBlockState(clickedPos);
        if (level.getBlockState(context.getClickedPos()).is(HexcraftTags.Blocks.PORTAL_FRAME_BLOCKS)) {
            if (level.dimension() == HexcraftDimensions.UNDERWORLD_DIMENSION_KEY || level.dimension() == Level.OVERWORLD) {
                for (Direction direction : Direction.Plane.VERTICAL) {
                    BlockPos framePos = context.getClickedPos().relative(direction);
                    if (((UnderworldPortalBlock) HexcraftBlocks.UNDERWORLD_PORTAL.get()).trySpawnPortal(context.getLevel(), framePos)) {
                        level.playSound(context.getPlayer(), framePos,
                                SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1.0F, 1.0F);
                        return InteractionResult.CONSUME;
                    }
                }
            }
        }
        BlockPos relativePos = clickedPos.relative(context.getClickedFace());
        /**Might want to add override canBeplacedAt instead of using BaseFireBlock**/
        if (HellFireBlock.canBePlacedAt(level, clickedPos.above(), context.getHorizontalDirection())) {
            level.playSound(player, relativePos, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 1.0F, level.getRandom().nextFloat() * 0.4F + 0.8F);
            BlockState blockstate1 = HellFireBlock.getState(level, relativePos);
            level.setBlockAndUpdate(relativePos, blockstate1);
            level.gameEvent(player, GameEvent.BLOCK_PLACE, relativePos);
            ItemStack itemstack = context.getItemInHand();
            if (player instanceof ServerPlayer) {
                CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayer) player, relativePos, itemstack);
                itemstack.hurtAndBreak(1, player, (p_41300_) -> {
                    p_41300_.broadcastBreakEvent(context.getHand());
                });
            }
            return InteractionResult.sidedSuccess(level.isClientSide());
        } else {
            level.playSound(player, clickedPos, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 1.0F, level.getRandom().nextFloat() * 0.4F + 0.8F);
            //level.setBlock(clickedPos, blockstate.setValue(BlockStateProperties.LIT, Boolean.valueOf(true)), 11);
            level.gameEvent(player, GameEvent.BLOCK_CHANGE, clickedPos);
            if (player != null) {
                context.getItemInHand().hurtAndBreak(1, player, (p_41303_) -> {
                    p_41303_.broadcastBreakEvent(context.getHand());
                });
            }

            return InteractionResult.FAIL;
        }
    }
}
