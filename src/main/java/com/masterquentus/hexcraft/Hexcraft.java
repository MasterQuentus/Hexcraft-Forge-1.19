package com.masterquentus.hexcraft;

import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.block.entity.HexcraftWoodTypes;
import com.masterquentus.hexcraft.block.entity.HexcraftBlockEntities;
import com.masterquentus.hexcraft.block.entity.client.FairyRenderer;
import com.masterquentus.hexcraft.block.entity.client.LilithRenderer;
import com.masterquentus.hexcraft.block.entity.client.WendigoRenderer;
import com.masterquentus.hexcraft.entity.HexcraftEntityTypes;
import com.masterquentus.hexcraft.item.HexcraftItems;
import com.masterquentus.hexcraft.painting.HexcraftPaintings;
import com.masterquentus.hexcraft.sound.HexcraftSounds;
import com.masterquentus.hexcraft.villager.HexcraftVillagers;
import com.masterquentus.hexcraft.world.HexcraftMenus;
import com.masterquentus.hexcraft.world.feature.HexcraftConfiguredFeatures;
import com.masterquentus.hexcraft.world.feature.HexcraftPlacedFeatures;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
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
import net.minecraftforge.fml.common.Mod;
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
        HexcraftSounds.register(modEventBus);

        HexcraftBlockEntities.register(modEventBus);

        //HexcraftFluids.register(eventBus);

        HexcraftEntityTypes.register(modEventBus);
        HexcraftMenus.register(modEventBus);

        //UnderworldDimension.register();

        //HexcraftPOIs.register(eventBus);

        //HexcraftBiomeModifiers.register(eventBus);
        //HexcraftPlacedFeatures.register(eventBus);

        //eventBus.addListener(this::setup);
        //eventBus.addListener(this::clientSetup);

        GeckoLib.initialize();
        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            HexcraftVillagers.registerPOIs();
        });
        //Put In Json Files Once Removed

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.EBONY_TRAPDOOR.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOOD_OAK_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOOD_OAK_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WHITE_OAK_DOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.ALDER_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.ALDER_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WITCH_HAZEL_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WITCH_HAZEL_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.DISTORTED_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.DISTORTED_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.ELDER_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.JUNIPER_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.JUNIPER_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.TWISTED_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.TWISTED_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WILLOW_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WILLOW_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.HAWTHORN_DOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.CEDAR_DOOR.get(), RenderType.cutout());

        //ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.EBONY_SAPLING.get(), RenderType.cutout());
        //ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOOD_OAK_SAPLING.get(), RenderType.cutout());
        //ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.HELL_BARK_SAPLING.get(), RenderType.cutout());
        //ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WHITE_OAK_SAPLING.get(), RenderType.cutout());
        //ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.ALDER_SAPLING.get(), RenderType.cutout());
        //ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WITCH_HAZEL_SAPLING.get(), RenderType.cutout());
        //ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WILLOW_SAPLING.get(), RenderType.cutout());
        //ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.HAWTHORN_SAPLING.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.EBONY_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOOD_OAK_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.HELL_BARK_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WHITE_OAK_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.ALDER_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WITCH_HAZEL_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WILLOW_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.HAWTHORN_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.CEDAR_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.DISTORTED_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.ELDER_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.JUNIPER_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.ROWAN_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.TWISTED_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WITCH_WOOD_LEAVES.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.EBONY_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOOD_OAK_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.HELL_BARK_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WHITE_OAK_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.ALDER_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WITCH_HAZEL_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WILLOW_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.HAWTHORN_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.CEDAR_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.DISTORTED_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.ELDER_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.JUNIPER_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.ROWAN_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.TWISTED_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WITCH_WOOD_LEAVES_PILE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOODY_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.POTTED_BLOODY_ROSE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WITCHES_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WITCHES_LADDER_PLANT.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.LIVING_KELP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.LIVING_KELP_PLANT.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.MANDRAKE_FLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.GARLIC_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.VERVAIN_FLOWER.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.CINDER_PLANT.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WILD_BRAMBLE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.HELLFIRE_CAMP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.FAIRY_LANTERN.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.AMETHYST_CHIMES.get(), RenderType.translucent());

        //ItemBlockRenderTypes.setRenderLayer(HexcraftFluids.BLOOD_BLOCK.get(), RenderType.translucent());
        //ItemBlockRenderTypes.setRenderLayer(HexcraftFluids.BLOOD_FLUID.get(), RenderType.translucent());
        //ItemBlockRenderTypes.setRenderLayer(HexcraftFluids.BLOOD_FLOWING.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.CRIMSON_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.CRIMSON_GLASS_PANE.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.CRIMSON_ICE.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.MAGIC_CRYSTAL_CLUSTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.SMALL_MAGIC_CRYSTAL_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.MEDIUM_MAGIC_CRYSTAL_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.LARGE_MAGIC_CRYSTAL_BUD.get(), RenderType.cutout());

        //ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.UNDERWORLD_PORTAL.get(), RenderType.translucent());


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
