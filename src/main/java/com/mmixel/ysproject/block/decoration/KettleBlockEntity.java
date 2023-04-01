package com.mmixel.ysproject.block.decoration;

import com.mmixel.ysproject.block.YSBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import static com.mmixel.ysproject.block.decoration.KettleBlock.*;

public class KettleBlockEntity extends BlockEntity {

    public KettleBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(YSBlockEntities.KETTLE.get(), pPos, pBlockState);
    }
    //蒸煮杏仁水时_内部逻辑
    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, KettleBlockEntity blockEntity) {
        if(!pLevel.isClientSide()&&pState.getValue(BOILING)){//已有杏仁水且未煮开
            int progress = pState.getValue(BOILING_PROGRESS)+1;//蒸煮进度+1
            if(progress>=BOILING_TIME){//达成蒸煮目标
                pLevel.setBlock(pPos,pState
                        .setValue(BOILING, Boolean.FALSE)
                        .setValue(BOILED, Boolean.TRUE)
                        .setValue(BOILING_PROGRESS,0),3);
            }
            else{
                pLevel.setBlock(pPos,pState.setValue(BOILING_PROGRESS,progress),3);//将进度储存在方块中
            }
        }
    }
}
