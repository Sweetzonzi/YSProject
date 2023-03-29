package com.mmixel.ysproject.block.decoration;

import com.mmixel.ysproject.block.YSBlockEntities;
import com.mojang.logging.LogUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.slf4j.Logger;

import static com.mmixel.ysproject.block.decoration.KettleBlock.*;

public class KettleBlockEntity extends BlockEntity {

    private static final int BOILING_TIME = 100;//煮开所需时间（tick）
    public static int boil_progress = 0;
    public static final Logger logger = LogUtils.getLogger();

    public KettleBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(YSBlockEntities.KETTLE.get(), pPos, pBlockState);
    }

    //蒸煮杏仁水时_内部逻辑
    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, KettleBlockEntity blockEntity) {
        if(!pLevel.isClientSide()&&pState.getValue(BOILING)){//已有杏仁水且未煮开
            boil_progress++;//蒸煮进度+1
            if(boil_progress>=BOILING_TIME){//达成蒸煮目标
                pLevel.setBlock(pPos,pState.setValue(BOILING, Boolean.FALSE).setValue(BOILED, Boolean.TRUE),3);
                boil_progress=0;//归零
            }
        }
    }
}
