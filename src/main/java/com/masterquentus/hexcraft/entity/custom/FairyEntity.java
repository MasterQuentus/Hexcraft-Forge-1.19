package com.masterquentus.hexcraft.entity.custom;

import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.entity.ai.FairyMoveControl;
import com.masterquentus.hexcraft.sound.HexcraftSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.FlyingMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

import java.util.EnumSet;

public class FairyEntity extends FlyingMob implements GeoEntity {
    private AnimatableInstanceCache factory = new SingletonAnimatableInstanceCache(this);
    private BlockPos lanternPos;

    public FairyEntity(EntityType<? extends FlyingMob> entityType, Level level) {

        super(entityType, level);
        this.moveControl = new FairyMoveControl(this);
    }

    public static AttributeSupplier setAttributes() {
        return Monster.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 5.0D)
                .add(Attributes.ATTACK_DAMAGE, 0.5f)
                .add(Attributes.ATTACK_SPEED, 3.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.7f).build();
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FairyMoveToLanternGoal(this));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(5, new fairyMoveAroundGoal(this));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
    }

    private PlayState predicate(AnimationState animationState) {
        if(animationState.isMoving()) {
            animationState.getController().setAnimation(RawAnimation.begin().then("animation.fairy.fly", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;

        }

        animationState.getController().setAnimation(RawAnimation.begin().then("animation.fairy.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController(this, "controller",
                0, this::predicate));

    }
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.AMETHYST_BLOCK_STEP, 0.15F, 1.0F);
    }
    protected SoundEvent getAmbientSound() {
        return HexcraftSounds.FAIRY_AMBIENT.get();
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.BAT_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.AMETHYST_CLUSTER_BREAK;
    }

    protected float getSoundVolume() {
        return 0.2F;
    }


    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return factory;
    }

    public BlockPos getLanternPos() {
        return this.lanternPos;
    }

    public void setLanternPos(BlockPos lanternPos) {
        this.lanternPos = lanternPos;
    }

    static class FairyMoveAroundGoal extends MoveControl {
        protected final FairyEntity fairy;
        public final double speedModifier;
        private int floatDuration;

        public FairyMoveAroundGoal(FairyEntity pFairy, double d) {
            super(pFairy);
            this.fairy = pFairy;
            this.speedModifier = d;
        }

        public void tick() {
            if (this.operation == MoveControl.Operation.MOVE_TO) {
                if (this.floatDuration-- <= 0) {
                    this.floatDuration += this.fairy.getRandom().nextInt(5) + 2;
                    Vec3 vec3 = new Vec3(this.wantedX - this.fairy.getX(), this.wantedY - this.fairy.getY(), this.wantedZ - this.fairy.getZ());
                    double d0 = vec3.length();
                    vec3 = vec3.normalize();
                    if (this.canReach(vec3, Mth.ceil(d0))) {
                        this.fairy.setDeltaMovement(this.fairy.getDeltaMovement().add(vec3.scale(0.1D)));
                    } else {
                        this.operation = MoveControl.Operation.WAIT;
                    }
                }

            }
        }

        private boolean canReach(Vec3 pPos, int pLength) {
            AABB aabb = this.fairy.getBoundingBox();

            for (int i = 1; i < pLength; ++i) {
                aabb = aabb.move(pPos);
                if (!this.fairy.level.noCollision(this.fairy, aabb)) {
                    return false;
                }
            }

            return true;
        }
    }

    static class fairyMoveAroundGoal extends Goal {
        private final FairyEntity fairyEntity;

        public fairyMoveAroundGoal(FairyEntity pFairy) {
            this.fairyEntity = pFairy;
            this.setFlags(EnumSet.of(Goal.Flag.MOVE));
        }

        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */
        public boolean canUse() {
            MoveControl movecontrol = this.fairyEntity.getMoveControl();
            if (!movecontrol.hasWanted()) {
                return true;
            } else {
                double d0 = movecontrol.getWantedX() - this.fairyEntity.getX();
                double d1 = movecontrol.getWantedY() - this.fairyEntity.getY();
                double d2 = movecontrol.getWantedZ() - this.fairyEntity.getZ();
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                return d3 < 1.0D || d3 > 3600.0D;
            }
        }

        /**
         * Returns whether an in-progress EntityAIBase should continue executing
         */
        public boolean canContinueToUse() {
            return false;
        }

        /**
         * Execute a one shot task or start executing a continuous task
         */
        public void start() {
            RandomSource randomsource = this.fairyEntity.getRandom();
            double d0 = this.fairyEntity.getX() + (double)((randomsource.nextFloat() * 2.0F - 1.0F) * 16.0F);
            double d1 = this.fairyEntity.getY() + (double)((randomsource.nextFloat() * 2.0F - 1.0F) * 16.0F);
            double d2 = this.fairyEntity.getZ() + (double)((randomsource.nextFloat() * 2.0F - 1.0F) * 16.0F);

            this.fairyEntity.getMoveControl().setWantedPosition(d0, d1, d2, 1.0D);
        }
    }

    static class FairyMoveToLanternGoal extends Goal {
        private final FairyEntity fairyEntity;

        public FairyMoveToLanternGoal(FairyEntity pFairy) {
            this.fairyEntity = pFairy;
            this.setFlags(EnumSet.of(Goal.Flag.MOVE));
        }

        @Override
        public void start() {
            boolean lanternExists = this.fairyEntity.level.getBlockState(fairyEntity.lanternPos).getBlock()
                    .equals(HexcraftBlocks.FAIRY_LANTERN.get());

            if (lanternExists && fairyEntity.distanceToSqr(fairyEntity.lanternPos.getX() + 0.5,
                    fairyEntity.lanternPos.getY() + 0.5, fairyEntity.lanternPos.getZ() + 0.5) > 2.0) {
                this.fairyEntity.getMoveControl().setWantedPosition(fairyEntity.lanternPos.getX() + 0.5,
                        fairyEntity.lanternPos.getY()  + 0.5, fairyEntity.lanternPos.getZ()  + 0.5, 1.0D);
            } else {
                this.fairyEntity.lanternPos = null;
            }
        }

        public boolean canUse() {
            return this.fairyEntity.lanternPos != null;
        }

        public boolean canContinueToUse() {
            return false;
        }
    }
}