package com.masterquentus.hexcraft.entity.custom;

import com.masterquentus.hexcraft.sound.HexcraftSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

public class MermaidEntity extends WaterAnimal implements GeoEntity {
    private AnimatableInstanceCache factory = new SingletonAnimatableInstanceCache(this);

    public MermaidEntity(EntityType<? extends WaterAnimal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static AttributeSupplier setAttributes() {
        return Monster.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 10.0D)
                .add(Attributes.ATTACK_DAMAGE, 3.0D)
                .add(Attributes.MOVEMENT_SPEED, 1.2F).build();
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(0, new TryFindWaterGoal(this));
        this.goalSelector.addGoal(4, new RandomSwimmingGoal(this, 1.0D, 10));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(6, new MeleeAttackGoal(this, (double)1.2F, true));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, WaterAnimal.class, true));
        this.targetSelector.addGoal(6, (new HurtByTargetGoal(this)).setAlertOthers());
    }

    private PlayState predicate(AnimationState animationState) {
        if(animationState.isMoving()) {
            animationState.getController().setAnimation(RawAnimation.begin().then("animation.mermaid.walk", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;

        }

        animationState.getController().setAnimation(RawAnimation.begin().then("animation.mermaid.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }


    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController(this, "controller",
                0, this::predicate));

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return factory;
    }
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.AMETHYST_BLOCK_BREAK, 0.15F, 1.0F);
    }

    protected SoundEvent getAmbientSound() {
        return HexcraftSounds.WENDIGO_AMBIENT.get();
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return HexcraftSounds.WENDIGO_HURT.get();
    }

    protected SoundEvent getDeathSound() {
        return HexcraftSounds.WENDIGO_DEATH.get();
    }

    protected float getSoundVolume() {
        return 0.2F;
    }
}