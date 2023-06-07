package com.masterquentus.hexcraft;

import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.block.entity.HexcraftBlockEntities;
import com.masterquentus.hexcraft.block.entity.HexcraftWoodTypes;
import com.masterquentus.hexcraft.client.model.HexcraftBoatModel;
import com.masterquentus.hexcraft.client.renderer.HexcraftBoatRenderer;
import com.masterquentus.hexcraft.client.renderer.HexcraftChestRenderer;
import com.masterquentus.hexcraft.config.HexcraftClientConfigs;
import com.masterquentus.hexcraft.config.HexcraftCommonConfigs;
import com.masterquentus.hexcraft.entity.HexcraftEntityTypes;
import com.masterquentus.hexcraft.entity.client.*;
import com.masterquentus.hexcraft.entity.client.vampire.VampireEvokerRenderer;
import com.masterquentus.hexcraft.entity.client.vampire.VampirePiglinRenderer;
import com.masterquentus.hexcraft.entity.client.vampire.VampireVindicatorRenderer;
import com.masterquentus.hexcraft.entity.custom.HexcraftBoatEntity;
import com.masterquentus.hexcraft.fluid.HexcraftFluidTypes;
import com.masterquentus.hexcraft.fluid.HexcraftFluids;
import com.masterquentus.hexcraft.item.HexcraftItems;
import com.masterquentus.hexcraft.item.custom.WitchesSatchelItem;
import com.masterquentus.hexcraft.loot.modifier.HexcraftLootModifiers;
import com.masterquentus.hexcraft.networking.HexcraftMessages;
import com.masterquentus.hexcraft.painting.HexcraftPaintings;
import com.masterquentus.hexcraft.sound.HexcraftSounds;
import com.masterquentus.hexcraft.villager.HexcraftPOIs;
import com.masterquentus.hexcraft.villager.HexcraftVillagers;
import com.masterquentus.hexcraft.world.HexcraftMenus;
import com.masterquentus.hexcraft.world.biomes.HexcraftBiomes;
import com.masterquentus.hexcraft.world.dimesnsion.HexcraftDimensions;
import com.masterquentus.hexcraft.world.feature.HexcraftConfiguredFeatures;
import com.masterquentus.hexcraft.world.feature.HexcraftPlacedFeatures;
import com.masterquentus.hexcraft.world.feature.HexcraftTreeFeatures;
import com.mojang.logging.LogUtils;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.FlyingMob;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

@Mod(Hexcraft.MOD_ID)
public class Hexcraft {
    public static final String MOD_ID = "hexcraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final ModelLayerLocation LAYER_CHEST = new ModelLayerLocation(new ResourceLocation(MOD_ID, "chest"),"main");
    public static final ModelLayerLocation LAYER_DOUBLE_CHEST_LEFT = new ModelLayerLocation(new ResourceLocation(MOD_ID, "double_chest_left"),"main");
    public static final ModelLayerLocation LAYER_DOUBLE_CHEST_RIGHT = new ModelLayerLocation(new ResourceLocation(MOD_ID, "double_chest_right"),"main");

    public Hexcraft() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        HexcraftItems.register(modEventBus);
        HexcraftBlocks.register(modEventBus);
        HexcraftVillagers.register(modEventBus);
        HexcraftPaintings.register(modEventBus);
        HexcraftTreeFeatures.register(modEventBus);
        HexcraftConfiguredFeatures.register(modEventBus);
        HexcraftPlacedFeatures.register(modEventBus);
        HexcraftFluids.register(modEventBus);
        HexcraftFluidTypes.register(modEventBus);
        HexcraftSounds.register(modEventBus);
        HexcraftBlockEntities.register(modEventBus);
        HexcraftEntityTypes.register(modEventBus);
        HexcraftLootModifiers.register(modEventBus);
        HexcraftMenus.register(modEventBus);
        HexcraftDimensions.register();
        HexcraftPOIs.register(modEventBus);
        HexcraftBiomes.BIOME_REGISTER.register(modEventBus);
        HexcraftBiomes.registerBiomes();

        GeckoLib.initialize();

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, HexcraftClientConfigs.SPEC, "hexcraft-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, HexcraftCommonConfigs.SPEC, "hexcraft-common.toml");

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            HexcraftVillagers.registerPOIs();
        });

        HexcraftMessages.register();

        BlockEntityRenderers.register(HexcraftBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
        WoodType.register(HexcraftWoodTypes.EBONY);
        WoodType.register(HexcraftWoodTypes.BLOOD_OAK);
        WoodType.register(HexcraftWoodTypes.HELL_BARK);
        WoodType.register(HexcraftWoodTypes.WHITE_OAK);
        WoodType.register(HexcraftWoodTypes.ALDER);
        WoodType.register(HexcraftWoodTypes.WITCH_HAZEL);
        WoodType.register(HexcraftWoodTypes.WILLOW);
        WoodType.register(HexcraftWoodTypes.HAWTHORN);
        WoodType.register(HexcraftWoodTypes.CEDAR);
        WoodType.register(HexcraftWoodTypes.DISTORTED);
        WoodType.register(HexcraftWoodTypes.ELDER);
        WoodType.register(HexcraftWoodTypes.JUNIPER);
        WoodType.register(HexcraftWoodTypes.ROWAN);
        WoodType.register(HexcraftWoodTypes.TWISTED);
        WoodType.register(HexcraftWoodTypes.WITCH_WOOD);
        WoodType.register(HexcraftWoodTypes.ECHO_WOOD);


        EntityRenderers.register(HexcraftEntityTypes.LILITH.get(), LilithRenderer::new);
        EntityRenderers.register(HexcraftEntityTypes.WENDIGO.get(), WendigoRenderer::new);
        EntityRenderers.register(HexcraftEntityTypes.FAIRY.get(), FairyRenderer::new);
        EntityRenderers.register(HexcraftEntityTypes.VAMPIRE_PIGLIN.get(), VampirePiglinRenderer::new);
        EntityRenderers.register(HexcraftEntityTypes.SIREN.get(), SirenRenderer::new);
        EntityRenderers.register(HexcraftEntityTypes.MERMAID.get(), MermaidRenderer::new);
        EntityRenderers.register(HexcraftEntityTypes.VAMPIRE_VINDICATOR.get(), VampireVindicatorRenderer::new);
        EntityRenderers.register(HexcraftEntityTypes.VAMPIRE_EVOKER.get(), VampireEvokerRenderer::new);
        EntityRenderers.register(HexcraftEntityTypes.BOAT.get(), HexcraftBoatRenderer::new);
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.BLOODY_ROSE.getId(), HexcraftBlocks.POTTED_BLOODY_ROSE);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.VAMPIRE_ORCHID.getId(), HexcraftBlocks.POTTED_VAMPIRE_ORCHID);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.BLOOD_MUSHROOM.getId(), HexcraftBlocks.POTTED_BLOOD_MUSHROOM);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.EBONY_SAPLING.getId(), HexcraftBlocks.POTTED_EBONY_SAPLING);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.BLOOD_OAK_SAPLING.getId(), HexcraftBlocks.POTTED_BLOOD_OAK_SAPLING);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.HELL_BARK_SAPLING.getId(), HexcraftBlocks.POTTED_HELL_BARK_SAPLING);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.WHITE_OAK_SAPLING.getId(), HexcraftBlocks.POTTED_WHITE_OAK_SAPLING);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.ALDER_SAPLING.getId(), HexcraftBlocks.POTTED_ALDER_SAPLING);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.WITCH_HAZEL_SAPLING.getId(), HexcraftBlocks.POTTED_WITCH_HAZEL_SAPLING);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.WILLOW_SAPLING.getId(), HexcraftBlocks.POTTED_WILLOW_SAPLING);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.HAWTHORN_SAPLING.getId(), HexcraftBlocks.POTTED_HAWTHORN_SAPLING);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.CEDAR_SAPLING.getId(), HexcraftBlocks.POTTED_CEDAR_SAPLING);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.DISTORTED_SAPLING.getId(), HexcraftBlocks.POTTED_DISTORTED_SAPLING);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.ELDER_SAPLING.getId(), HexcraftBlocks.POTTED_ELDER_SAPLING);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.JUNIPER_SAPLING.getId(), HexcraftBlocks.POTTED_JUNIPER_SAPLING);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.ROWAN_SAPLING.getId(), HexcraftBlocks.POTTED_ROWAN_SAPLING);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.TWISTED_SAPLING.getId(), HexcraftBlocks.POTTED_TWISTED_SAPLING);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.WITCH_WOOD_SAPLING.getId(), HexcraftBlocks.POTTED_WITCH_WOOD_SAPLING);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.ECHO_WOOD_SAPLING.getId(), HexcraftBlocks.POTTED_ECHO_WOOD_SAPLING);

                Sheets.addWoodType(HexcraftWoodTypes.EBONY);
                Sheets.addWoodType(HexcraftWoodTypes.BLOOD_OAK);
                Sheets.addWoodType(HexcraftWoodTypes.HELL_BARK);
                Sheets.addWoodType(HexcraftWoodTypes.WHITE_OAK);
                Sheets.addWoodType(HexcraftWoodTypes.ALDER);
                Sheets.addWoodType(HexcraftWoodTypes.WITCH_HAZEL);
                Sheets.addWoodType(HexcraftWoodTypes.WILLOW);
                Sheets.addWoodType(HexcraftWoodTypes.HAWTHORN);
                Sheets.addWoodType(HexcraftWoodTypes.CEDAR);
                Sheets.addWoodType(HexcraftWoodTypes.DISTORTED);
                Sheets.addWoodType(HexcraftWoodTypes.ELDER);
                Sheets.addWoodType(HexcraftWoodTypes.JUNIPER);
                Sheets.addWoodType(HexcraftWoodTypes.ROWAN);
                Sheets.addWoodType(HexcraftWoodTypes.TWISTED);
                Sheets.addWoodType(HexcraftWoodTypes.WITCH_WOOD);
                Sheets.addWoodType(HexcraftWoodTypes.ECHO_WOOD);

                BlockEntityRenderers.register(HexcraftBlockEntities.CHEST.get(), HexcraftChestRenderer::new);

                ItemProperties.register(HexcraftItems.WITCHES_SATCHEL.get(), new ResourceLocation(MOD_ID, "filled"),
                        (pStack, pLevel, pEntity, pSeed) -> WitchesSatchelItem.hasContent(pStack));

                SpawnPlacements.register(HexcraftEntityTypes.FAIRY.get(),
                        SpawnPlacements.Type.NO_RESTRICTIONS,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                        FlyingMob::checkMobSpawnRules);

                SpawnPlacements.register(HexcraftEntityTypes.WENDIGO.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                        Monster::checkAnyLightMonsterSpawnRules);

                SpawnPlacements.register(HexcraftEntityTypes.VAMPIRE_PIGLIN.get(),
                        SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                        Monster::checkMonsterSpawnRules);

                SpawnPlacements.register(HexcraftEntityTypes.SIREN.get(),
                        SpawnPlacements.Type.IN_WATER,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                        Monster::checkAnyLightMonsterSpawnRules);

                SpawnPlacements.register(HexcraftEntityTypes.MERMAID.get(),
                        SpawnPlacements.Type.IN_WATER,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                        WaterAnimal::checkSurfaceWaterAnimalSpawnRules);

                SpawnPlacements.register(HexcraftEntityTypes.VAMPIRE_VINDICATOR.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                        Monster::checkAnyLightMonsterSpawnRules);

                SpawnPlacements.register(HexcraftEntityTypes.VAMPIRE_EVOKER.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                        Monster::checkAnyLightMonsterSpawnRules);
            });
        }

        @SubscribeEvent
        public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
            for (HexcraftBoatEntity.Type type : HexcraftBoatEntity.Type.values()) {
                event.registerLayerDefinition(new ModelLayerLocation(new ResourceLocation(MOD_ID, type.getModelLocation()), "main"),
                        HexcraftBoatModel::createBodyLayer);
            }

            // Chest Layers
            event.registerLayerDefinition(LAYER_CHEST, HexcraftChestRenderer::createSingleBodyLayer);
            event.registerLayerDefinition(LAYER_DOUBLE_CHEST_LEFT, HexcraftChestRenderer::createDoubleBodyLeftLayer);
            event.registerLayerDefinition(LAYER_DOUBLE_CHEST_RIGHT, HexcraftChestRenderer::createDoubleBodyRightLayer);
        }

        @SubscribeEvent
        public static void textureStitchPre(TextureStitchEvent.Pre event) {
            TextureAtlas map = event.getAtlas();

            if (Sheets.CHEST_SHEET.equals(map.location()))
                HexcraftChestRenderer.MATERIALS.values().stream()
                        .flatMap(e -> e.values().stream())
                        .map(Material::texture)
                        .forEach(event::addSprite);
        }
    }
}
