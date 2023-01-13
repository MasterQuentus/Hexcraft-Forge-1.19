package com.masterquentus.hexcraft.entity.custom;

import com.masterquentus.hexcraft.entity.ai.FairyMoveControl;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.FlyingMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class FairyEntity extends FlyingMob implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);

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
        this.goalSelector.addGoal(5, new FairyMoveAroundGoal(this, 1d));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 8.0F));

        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.fairy.fly", true));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.fairy.idle", true));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));

    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    static class FairyMoveAroundGoal extends Goal {
        protected final FairyEntity fairy;
        public final double speedModifier;

        public FairyMoveAroundGoal(FairyEntity pathfinderMob, double d) {
            this.fairy = pathfinderMob;
            this.speedModifier = d;
        }

        protected void playStepSound(BlockPos pos, BlockState blockIn) {
            this.playSound(SoundEvents.BUNDLE_INSERT, 0.15F, 1.0F);
        }

        private void playSound(SoundEvent bundleInsert, float v, float v1) {
        }

        protected SoundEvent getAmbientSound() {
            return SoundEvents.AMBIENT_BASALT_DELTAS_MOOD;
        }

        protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
            return SoundEvents.ANCIENT_DEBRIS_FALL;
        }

        protected SoundEvent getDeathSound() {
            return SoundEvents.RABBIT_DEATH;
        }

        protected float getSoundVolume() {
            return 0.2F;
        }

        @Override
        public boolean canUse() {
            return true;
        }

        @Override
        public void tick() {
            super.tick();
        }
    }
}
