package com.masterquentus.hexcraft.entity.custom;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.entity.HexcraftEntityTypes;
import com.masterquentus.hexcraft.item.HexcraftItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class HexcraftBoatEntity extends Boat {
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE = SynchedEntityData.defineId(HexcraftBoatEntity.class, EntityDataSerializers.INT);

    public HexcraftBoatEntity(EntityType<? extends Boat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public HexcraftBoatEntity(Level levelIn, double x, double y, double z) {
        this(HexcraftEntityTypes.BOAT.get(), levelIn);
        this.setPos(x, y, z);
        this.setDeltaMovement(Vec3.ZERO);
        this.xOld = x;
        this.yOld = y;
        this.zOld = z;
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE, 0);
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putString("Type", this.getWoodType());
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        this.setWoodType(tag.getString("Type"));
    }

    public String getWoodType() {
        return this.getHexcraftBoatType().name;
    }

    public void setWoodType(String wood) {
        this.entityData.set(DATA_ID_TYPE, Type.byName(wood).ordinal());
    }

    public Type getHexcraftBoatType() {
        return Type.byId(this.entityData.get(DATA_ID_TYPE));
    }

    @Override
    public ItemStack getPickedResult(HitResult target) {
        return new ItemStack(this.getHexcraftBoatType().getItem());
    }

    @Override
    protected int getMaxPassengers() {
        return 1;
    }

    @Override
    public Item getDropItem() {
        return switch (this.getWoodType()) {
            case "alder" -> HexcraftItems.ALDER_BOAT.get();
            case "blood_oak" -> HexcraftItems.BLOOD_OAK_BOAT.get();
            case "cedar" -> HexcraftItems.CEDAR_BOAT.get();
            case "distorted" -> HexcraftItems.DISTORTED_BOAT.get();
            case "elder" -> HexcraftItems.ELDER_BOAT.get();
            case "hawthorn" -> HexcraftItems.HAWTHORN_BOAT.get();
            case "hell_bark" -> HexcraftItems.HELL_BARK_BOAT.get();
            case "juniper" -> HexcraftItems.JUNIPER_BOAT.get();
            case "rowan" -> HexcraftItems.ROWAN_BOAT.get();
            case "twisted" -> HexcraftItems.TWISTED_BOAT.get();
            case "white_oak" -> HexcraftItems.WHITE_OAK_BOAT.get();
            case "willow" -> HexcraftItems.WILLOW_BOAT.get();
            case "witch_hazel" -> HexcraftItems.WITCH_HAZEL_BOAT.get();
            case "witch_wood" -> HexcraftItems.WITCH_WOOD_BOAT.get();
            default -> Items.OAK_BOAT;
        };
    }

    public enum Type {
        ALDER(HexcraftBlocks.ALDER_PLANKS.get(), "alder"),
        BLOOD_OAK(HexcraftBlocks.BLOOD_OAK_PLANKS.get(), "blood_oak"),
        CEDAR(HexcraftBlocks.CEDAR_PLANKS.get(), "cedar"),
        DISTORTED(HexcraftBlocks.DISTORTED_PLANKS.get(), "distorted"),
        ELDER(HexcraftBlocks.ELDER_PLANKS.get(), "elder"),
        HAWTHORN(HexcraftBlocks.HAWTHORN_PLANKS.get(), "hawthorn"),
        HELL_BARK(HexcraftBlocks.HELL_BARK_PLANKS.get(), "hell_bark"),
        JUNIPER(HexcraftBlocks.JUNIPER_PLANKS.get(), "juniper"),
        ROWAN(HexcraftBlocks.ROWAN_PLANKS.get(), "rowan"),
        TWISTED(HexcraftBlocks.TWISTED_PLANKS.get(), "twisted"),
        WHITE_OAK(HexcraftBlocks.WHITE_OAK_PLANKS.get(), "white_oak"),
        WILLOW(HexcraftBlocks.WILLOW_PLANKS.get(), "willow"),
        WITCH_HAZEL(HexcraftBlocks.WITCH_HAZEL_PLANKS.get(), "witch_hazel"),
        WITCH_WOOD(HexcraftBlocks.WITCH_WOOD_PLANKS.get(), "witch_wood");

        private final String name;
        private final Block planks;

        Type(Block pPlanks, String pName) {
            this.name = pName;
            this.planks = pPlanks;
        }

        public String getName() {
            return this.name;
        }

        public String getModelLocation() {
            return "boat/" + this.name;
        }

        public ResourceLocation getTexture() {
            return new ResourceLocation("textures/entity/boats/" + this.name + ".png");
        }

        public Item getItem() {
            return ForgeRegistries.ITEMS.getValue(new ResourceLocation(Hexcraft.MOD_ID, this.name + "_boat"));
        }

        public Block getPlanks() {
            return this.planks;
        }

        public String toString() {
            return this.name;
        }

        // Gets type by enum ordinal
        public static Type byId(int pId) {
            Type[] boatType = values();
            if (pId < 0 || pId >= boatType.length) {
                pId = 0;
            }

            return boatType[pId];
        }

        public static Type byName(String pName) {
            Type[] boatType = values();

            for (Type type : boatType) {
                if (type.getName().equals(pName)) {
                    return type;
                }
            }

            return boatType[0];
        }
    }

}
