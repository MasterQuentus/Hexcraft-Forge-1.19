package com.masterquentus.hexcraft;

import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.block.entity.HexcraftWoodTypes;
import com.masterquentus.hexcraft.block.entity.HexcraftBlockEntities;
import com.masterquentus.hexcraft.block.entity.client.LilithRenderer;
import com.masterquentus.hexcraft.block.entity.client.WendigoRenderer;
import com.masterquentus.hexcraft.entity.HexcraftEntityTypes;
import com.masterquentus.hexcraft.item.HexcraftItems;
import com.masterquentus.hexcraft.sound.HexcraftSounds;
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

        HexcraftSounds.register(modEventBus);

        HexcraftBlockEntities.register(modEventBus);

        //HexcraftFluids.register(eventBus);

        HexcraftEntityTypes.register(modEventBus);

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

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.EBONY_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.EBONY_TRAPDOOR.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOOD_OAK_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOOD_OAK_TRAPDOOR.get(), RenderType.cutout());

        //ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.EBONY_SAPLING.get(), RenderType.cutout());
        //ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOOD_OAK_SAPLING.get(), RenderType.cutout());
        //ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.HELL_BARK_SAPLING.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.EBONY_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOOD_OAK_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.HELL_BARK_LEAVES.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.EBONY_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOOD_OAK_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.HELL_BARK_LEAVES_PILE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOODY_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.POTTED_BLOODY_ROSE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WITCHES_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WITCHES_LADDER_PLANT.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.LIVING_KELP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.LIVING_KELP_PLANT.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.MANDRAKE_FLOWER.get(), RenderType.cutout());

        //ItemBlockRenderTypes.setRenderLayer(HexcraftFluids.BLOOD_BLOCK.get(), RenderType.translucent());
        //ItemBlockRenderTypes.setRenderLayer(HexcraftFluids.BLOOD_FLUID.get(), RenderType.translucent());
        //ItemBlockRenderTypes.setRenderLayer(HexcraftFluids.BLOOD_FLOWING.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.CRIMSON_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.CRIMSON_GLASS_PANE.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.EBONY_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOOD_OAK_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.HELL_BARK_LEAVES_PILE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.MAGIC_CRYSTAL_CLUSTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.SMALL_MAGIC_CRYSTAL_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.MEDIUM_MAGIC_CRYSTAL_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.LARGE_MAGIC_CRYSTAL_BUD.get(), RenderType.cutout());

        //ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.UNDERWORLD_PORTAL.get(), RenderType.translucent());


        BlockEntityRenderers.register(HexcraftBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
        WoodType.register(HexcraftWoodTypes.EBONY);
        WoodType.register(HexcraftWoodTypes.BLOOD_OAK);
        WoodType.register(HexcraftWoodTypes.HELL_BARK);

        EntityRenderers.register(HexcraftEntityTypes.LILITH.get(), LilithRenderer::new);
        EntityRenderers.register(HexcraftEntityTypes.WENDIGO.get(), WendigoRenderer::new);

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

                SpawnPlacements.register(HexcraftEntityTypes.WENDIGO.get(),
                        SpawnPlacements.Type.ON_GROUND,
                        Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                        Monster::checkAnyLightMonsterSpawnRules);
            });
        }
    }
}
