//package com.masterquentus.hexcraft.block.entity.broom;
//
//import net.minecraft.core.BlockPos;
//import net.minecraft.nbt.CompoundTag;
//import net.minecraft.network.protocol.Packet;
//import net.minecraft.world.entity.Entity;
//import net.minecraft.world.entity.EntityDimensions;
//import net.minecraft.world.entity.EntityType;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.state.BlockState;
//
//public class EbonyBroomEntity extends Entity {
//
//    public EbonyBroomEntity(EntityType<?> type, Level pLevel) {
//        super(type, pLevel);
//    }
//
//    @Override
//    public void tick(){
//
//    }
//
//    @Override
//    protected void readAdditionalSaveData(CompoundTag pCompound) {
//
//    }
//
//    @Override
//    protected void addAdditionalSaveData(CompoundTag pCompound) {
//
//    }
//
//    @Override
//    public boolean startRiding(Entity entity){
//        if (entity instanceof Player){
//            return super.startRiding(entity);
//        }
//        return false;
//    }
//
//    @Override
//    public boolean canCollideWith(Entity pEntity) {
//        return true;
//    }
//
//    @Override
//    public boolean isColliding(BlockPos pPos, BlockState pState) {
//        return true;
//    }
//
//    @Override
//    protected void defineSynchedData() {
//
//    }
//
//    @Override
//    public boolean isInvisible() {
//        return false;
//    }
//
//    @Override
//    public Packet<?> getAddEntityPacket() {
//        return null;
//    }
//}
//
