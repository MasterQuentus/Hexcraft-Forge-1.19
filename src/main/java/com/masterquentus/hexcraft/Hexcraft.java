package com.masterquentus.hexcraft;

import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.block.entity.HexcraftWoodTypes;
import com.masterquentus.hexcraft.block.entity.HexcraftBlockEntities;
import com.masterquentus.hexcraft.block.entity.client.FairyRenderer;
import com.masterquentus.hexcraft.block.entity.client.LilithRenderer;
import com.masterquentus.hexcraft.block.entity.client.WendigoRenderer;
import com.masterquentus.hexcraft.config.HexcraftClientConfigs;
import com.masterquentus.hexcraft.config.HexcraftCommonConfigs;
import com.masterquentus.hexcraft.entity.HexcraftEntityTypes;
import com.masterquentus.hexcraft.fluid.HexcraftFluidTypes;
import com.masterquentus.hexcraft.fluid.HexcraftFluids;
import com.masterquentus.hexcraft.item.HexcraftItems;
import com.masterquentus.hexcraft.painting.HexcraftPaintings;
import com.masterquentus.hexcraft.sound.HexcraftSounds;
import com.masterquentus.hexcraft.villager.HexcraftPOIs;
import com.masterquentus.hexcraft.villager.HexcraftVillagers;
import com.masterquentus.hexcraft.world.HexcraftMenus;
import com.masterquentus.hexcraft.world.dimesnsion.HexcraftDimensions;
import com.masterquentus.hexcraft.world.feature.HexcraftConfiguredFeatures;
import com.masterquentus.hexcraft.world.feature.HexcraftPlacedFeatures;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.levelgen.Heightmap;
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

    public Hexcraft() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        HexcraftItems.register(modEventBus);
        HexcraftBlocks.register(modEventBus);
        HexcraftVillagers.register(modEventBus);
        HexcraftPaintings.register(modEventBus);

        HexcraftConfiguredFeatures.register(modEventBus);
        HexcraftPlacedFeatures.register(modEventBus);
        HexcraftFluids.register(modEventBus);
        HexcraftFluidTypes.register(modEventBus);
        HexcraftSounds.register(modEventBus);

        HexcraftBlockEntities.register(modEventBus);

        //HexcraftFluids.register(eventBus);

        HexcraftEntityTypes.register(modEventBus);
        HexcraftMenus.register(modEventBus);
        HexcraftDimensions.register();
        HexcraftPOIs.register(modEventBus);
        //eventBus.addListener(this::setup);
        //eventBus.addListener(this::clientSetup);

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


        EntityRenderers.register(HexcraftEntityTypes.LILITH.get(), LilithRenderer::new);
        EntityRenderers.register(HexcraftEntityTypes.WENDIGO.get(), WendigoRenderer::new);
        EntityRenderers.register(HexcraftEntityTypes.FAIRY.get(), FairyRenderer::new);

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.BLOODY_ROSE.getId(), HexcraftBlocks.POTTED_BLOODY_ROSE);
                ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.VAMPIRE_ORCHID.getId(), HexcraftBlocks.POTTED_VAMPIRE_ORCHID);
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

                SpawnPlacements.register(HexcraftEntityTypes.WENDIGO.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                        Monster::checkAnyLightMonsterSpawnRules);
            });
        }
    }
}
