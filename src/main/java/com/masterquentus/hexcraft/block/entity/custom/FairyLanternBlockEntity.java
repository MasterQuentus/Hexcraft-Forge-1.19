package com.masterquentus.hexcraft.block.entity.custom;

import com.masterquentus.hexcraft.block.entity.HexcraftBlockEntities;
import com.masterquentus.hexcraft.entity.custom.FairyEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class FairyLanternBlockEntity extends BlockEntity {

    public FairyLanternBlockEntity(BlockPos pos, BlockState state) {
        super(HexcraftBlockEntities.FAIRY_LANTERN.get(), pos, state);
    }

    public static <T extends BlockEntity> void tick(Level level, BlockPos pos, BlockState state, T be) {
        List<FairyEntity> fairies = level.getEntitiesOfClass(FairyEntity.class,
                (new AABB(pos)).inflate(32.0));

        BlockPos centeredPos = pos.offset(0.5, 0.5, 0.5);

        for (FairyEntity fairy : fairies) {
            if (fairy.getLanternPos() == null || fairy.distanceToSqr(centeredPos.getX(),centeredPos.getY(),centeredPos.getZ())
                    > fairy.distanceToSqr(fairy.getLanternPos().getX(),fairy.getLanternPos().getY(),fairy.getLanternPos().getZ())) {
                fairy.setLanternPos(pos.offset(0.5, 0.5, 0.5));
            }
        }
    }
}