package com.masterquentus.hexcraft.entity;

import com.masterquentus.hexcraft.Hexcraft;
import com.masterquentus.hexcraft.entity.custom.*;
import com.masterquentus.hexcraft.entity.custom.projectile.VampiricStaffProjectileEntity;
import com.masterquentus.hexcraft.entity.custom.vampire.VampireEvokerEntity;
import com.masterquentus.hexcraft.entity.custom.vampire.VampireVindicatorEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Hexcraft.MOD_ID);

    public static final RegistryObject<EntityType<LilithEntity>> LILITH =
            ENTITY_TYPES.register("lilith",
                    () -> EntityType.Builder.of(LilithEntity::new, MobCategory.MONSTER)
                            .sized(0.8F, 1.7F)
                            .build(new ResourceLocation(Hexcraft.MOD_ID, "lilith").toString()));

    public static final RegistryObject<EntityType<WendigoEntity>> WENDIGO =
            ENTITY_TYPES.register("wendigo",
                    () -> EntityType.Builder.of(WendigoEntity::new, MobCategory.MONSTER)
                            .sized(0.8F, 2.0F)
                            .build(new ResourceLocation(Hexcraft.MOD_ID, "wendigo").toString()));

    public static final RegistryObject<EntityType<FairyEntity>> FAIRY =
            ENTITY_TYPES.register("fairy",
                    () -> EntityType.Builder.of(FairyEntity::new, MobCategory.CREATURE)
                            .sized(0.8F, 0.80F)
                            .build(new ResourceLocation(Hexcraft.MOD_ID, "fairy").toString()));
    public static final RegistryObject<EntityType<VampirePiglinEntity>> VAMPIRE_PIGLIN =
            ENTITY_TYPES.register("vampire_piglin",
                    () -> EntityType.Builder.of(VampirePiglinEntity::new, MobCategory.MONSTER)
                            .sized(0.8F, 1.7F)
                            .build(new ResourceLocation(Hexcraft.MOD_ID, "vampire_piglin").toString()));
    public static final RegistryObject<EntityType<SirenEntity>> SIREN =
            ENTITY_TYPES.register("siren",
                    () -> EntityType.Builder.of(SirenEntity::new, MobCategory.MONSTER)
                            .sized(0.9F, 0.6F)
                            .build(new ResourceLocation(Hexcraft.MOD_ID, "siren").toString()));
    public static final RegistryObject<EntityType<MermaidEntity>> MERMAID =
            ENTITY_TYPES.register("mermaid",
                    () -> EntityType.Builder.of(MermaidEntity::new, MobCategory.WATER_CREATURE)
                            .sized(0.9F, 0.6F)
                            .build(new ResourceLocation(Hexcraft.MOD_ID, "mermaid").toString()));
    public static final RegistryObject<EntityType<VampireVindicatorEntity>> VAMPIRE_VINDICATOR =
            ENTITY_TYPES.register("vampire_vindicator",
                    () -> EntityType.Builder.of(VampireVindicatorEntity::new, MobCategory.MONSTER)
                            .sized(0.8F, 1.7F)
                            .build(new ResourceLocation(Hexcraft.MOD_ID, "vampire_vindicator").toString()));
    public static final RegistryObject<EntityType<VampireEvokerEntity>> VAMPIRE_EVOKER =
            ENTITY_TYPES.register("vampire_evoker",
                    () -> EntityType.Builder.of(VampireEvokerEntity::new, MobCategory.MONSTER)
                            .sized(0.8F, 1.7F)
                            .build(new ResourceLocation(Hexcraft.MOD_ID, "vampire_evoker").toString()));
    public static final RegistryObject<EntityType<BansheeEntity>> BANSHEE =
            ENTITY_TYPES.register("banshee",
                    () -> EntityType.Builder.of(BansheeEntity::new, MobCategory.MONSTER)
                            .sized(0.8F, 1.7F)
                            .build(new ResourceLocation(Hexcraft.MOD_ID, "banshee").toString()));
    public static final RegistryObject<EntityType<WerewolfEntity>> WEREWOLF =
            ENTITY_TYPES.register("werewolf",
                    () -> EntityType.Builder.of(WerewolfEntity::new, MobCategory.MONSTER)
                            .sized(0.8F, 1.7F)
                            .build(new ResourceLocation(Hexcraft.MOD_ID, "werewolf").toString()));
    public static final RegistryObject<EntityType<HexcraftBoatEntity>> BOAT =
            ENTITY_TYPES.register("boat",
                    () -> EntityType.Builder.<HexcraftBoatEntity>of(HexcraftBoatEntity::new, MobCategory.MISC)
                            .sized(1.375F, 0.625F)
                            .build(new ResourceLocation(Hexcraft.MOD_ID,"boat").toString()));
    public static final RegistryObject<EntityType<VampiricStaffProjectileEntity>> VAMPIRIC_STAFF_PROJECTILE =
            ENTITY_TYPES.register("vampiric_staff_projectile",
                    () -> EntityType.Builder.<VampiricStaffProjectileEntity>of(VampiricStaffProjectileEntity::new, MobCategory.AMBIENT)
                            .sized(0.25f, 0.25f)
                            .build(new ResourceLocation(Hexcraft.MOD_ID, "vampiric_staff_projectile").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}