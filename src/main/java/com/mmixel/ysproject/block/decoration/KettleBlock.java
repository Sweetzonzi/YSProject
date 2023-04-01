package com.mmixel.ysproject.block.decoration;

import com.mmixel.ysproject.block.YSBlockEntities;
import com.mmixel.ysproject.item.YSPropItems;
import com.mmixel.ysproject.item.prop.AlmondWaterItem;
import com.mmixel.ysproject.item.prop.BoiledAlmondWaterItem;
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
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import java.util.Random;

public class KettleBlock extends BaseEntityBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final VoxelShape SHAPE = Block.box(2,0,2,14,7,14);
    public static final BooleanProperty BOILING = BooleanProperty.create("boiling");//是否有正在煮沸的杏仁水
    public static final BooleanProperty BOILED = BooleanProperty.create("boiled");//是否已煮开
    public static final int BOILING_TIME = 100;//煮开所需时间（tick）
    public static final IntegerProperty BOILING_PROGRESS = IntegerProperty.create("boiling_progress",0,BOILING_TIME);//蒸煮进度

    public KettleBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(BOILING,Boolean.FALSE)
                .setValue(BOILED,Boolean.FALSE)
                .setValue(BOILING_PROGRESS,0));
    }

    @Override//互动时
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if(!pLevel.isClientSide()){
            if(pState.getValue(BOILED)) {//已有烧好的杏仁水，互动取出
                pLevel.setBlock(pPos,pState.setValue(BOILED, Boolean.FALSE),1);
                pLevel.setBlock(pPos,defaultBlockState(),1);
                popResource(pLevel,pPos,new ItemStack(YSPropItems.ALMOND_WATER_BOILED.get()));
            }
            if(!pState.getValue(BOILED)&&!pState.getValue(BOILING)) {//无内容物时手持杏仁水互动，开始蒸煮杏仁水
                ItemStack item_to_boil = pPlayer.getItemInHand(pHand);
                if (item_to_boil.getItem() instanceof AlmondWaterItem && !(item_to_boil.getItem() instanceof BoiledAlmondWaterItem)) {
                    pPlayer.sendMessage(new TextComponent("Start boiling..."), pPlayer.getUUID());
                    item_to_boil.shrink(1);
                    pLevel.setBlock(pPos,pState.setValue(BOILING, Boolean.TRUE),1);
                }
            }
            if(pState.getValue(BOILING) && pHand == InteractionHand.MAIN_HAND) {//还没烧开时互动，仅文字提示
                pPlayer.sendMessage(new TextComponent("Still Boiling!"), pPlayer.getUUID());
            }
        }
        return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
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
            pLevel.addParticle(ParticleTypes.CLOUD, dx, dy, dz, 0.0D, 0.25D, 0.0D);
        }
        if(pState.getValue(BOILED)){//已煮开，额外大量快速蒸汽
            pLevel.addParticle(ParticleTypes.CLOUD, dx, dy-0.2, dz, 0.0D, 0.25D, 0.0D);
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
        pBuilder.add(BOILING_PROGRESS);
    }

    @Override//修改碰撞箱
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }
//以下为方块实体相关--------------------------------------------
    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new KettleBlockEntity(pPos,pState);
    }

    @Override//没有这个会导致模型不渲染
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override//唤起tick方法
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        return createTickerHelper(pBlockEntityType, YSBlockEntities.KETTLE.get(), KettleBlockEntity::tick);
    }
}
