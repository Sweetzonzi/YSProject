package com.mmixel.ysproject.block.decoration;

import com.mmixel.ysproject.item.YSPropItems;
import com.mmixel.ysproject.item.prop.AlmondWaterItem;
import com.mojang.logging.LogUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.slf4j.Logger;

import java.util.Random;

public class KettleBlock extends Block {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final VoxelShape SHAPE = Block.box(2,0,2,14,7,14);
    public static final BooleanProperty BOILING = BooleanProperty.create("boiling");//是否有正在煮沸的杏仁水
    public static final BooleanProperty BOILED = BooleanProperty.create("boiled");//是否已煮开
    private static final int BOILING_TIME = 1;//煮开所需时间（tick）

    private int boil_progress;//当前蒸煮进度

    public static final Logger logger = LogUtils.getLogger();
    public KettleBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(BOILING,Boolean.FALSE).setValue(BOILED,Boolean.FALSE));
        boil_progress = 0;
    }

    @Override//互动时
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if(!pLevel.isClientSide()){
            if(pState.getValue(BOILED)) {//已有烧好的杏仁水，互动取出
                //pLevel.setBlock(pPos,pState.setValue(BOILED, Boolean.FALSE),3);
                pLevel.setBlock(pPos,defaultBlockState(),1);
                popResource(pLevel,pPos,new ItemStack(YSPropItems.ALMOND_WATER_BOILED.get()));
                boil_progress=0;
            }
            if(!pState.getValue(BOILED)&&!pState.getValue(BOILING)) {//无内容物时手持杏仁水互动，开始蒸煮杏仁水
                ItemStack item_to_boil = pPlayer.getItemInHand(pHand);
                if (item_to_boil.getItem() instanceof AlmondWaterItem) {
                    pPlayer.sendMessage(new TextComponent("Start boiling..."), pPlayer.getUUID());
                    item_to_boil.shrink(1);
                    boil_progress=0;
                    pLevel.setBlock(pPos,pState.setValue(BOILING, Boolean.TRUE),1);
                }
            }
            if(pState.getValue(BOILING)) {//还没烧开时互动，仅文字提示
                pPlayer.sendMessage(new TextComponent("Still Boiling!"), pPlayer.getUUID());
            }
        }
        return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
    }

    @Override//蒸煮杏仁水时_内部逻辑
    public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, Random pRandom) {
        logger.info("ticking");
        if(!pLevel.isClientSide()&&pState.getValue(BOILING)){//已有杏仁水且未煮开
            boil_progress++;//蒸煮进度+1
            if(boil_progress>=BOILING_TIME){//达成蒸煮目标
                pLevel.setBlock(pPos,pState.setValue(BOILING, Boolean.FALSE),3);
                pLevel.setBlock(pPos,pState.setValue(BOILED, Boolean.TRUE),1);
                boil_progress=0;//归零
            }
        }
    }

    @Override//蒸煮杏仁水时_粒子效果
    public void animateTick(BlockState pState, Level pLevel, BlockPos pPos, Random pRandom) {
        double dx = (double)pPos.getX() + 0.5D;
        double dy = (double)pPos.getY() + 0.7D;
        double dz = (double)pPos.getZ() + 0.5D;
        if(pState.getValue(BOILING)){//正在蒸煮，缓慢蒸汽
            pLevel.addParticle(ParticleTypes.CLOUD, dx, dy, dz, 0.0D, 0.02D, 0.0D);
        }
        if(pState.getValue(BOILED)){//已煮开，大量快速蒸汽
            pLevel.addParticle(ParticleTypes.CLOUD, dx, dy, dz, 0.0D, 0.5D, 0.0D);
        }
    }

    @Override//放置时根据玩家面朝方向反方向决定面向
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING,pContext.getHorizontalDirection().getOpposite());
    }

    @Override//注册方块属性：面向
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
        pBuilder.add(BOILED);
        pBuilder.add(BOILING);
    }

    @Override//修改碰撞箱
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

}
