package com.mmixel.ysproject.block.decoration;

import com.mmixel.ysproject.block.YSBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

import static com.mmixel.ysproject.block.decoration.ClosetBlock.IS_OPENED;

public class ClosetBlockEntity extends BlockEntity implements IAnimatable {

    private AnimationFactory factory = GeckoLibUtil.createFactory(this);

    public ClosetBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(YSBlockEntities.CLOSET.get(), pPos, pBlockState);
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<>
                (this, "door_controller", 0, this::predicate));
    }

    private <E extends BlockEntity & IAnimatable> PlayState predicate(AnimationEvent<E> event){
        if(event.getAnimatable().getBlockState().getValue(IS_OPENED)){
            event.getController().transitionLengthTicks = 5;
            event.getController().setAnimation(new AnimationBuilder()
                .addAnimation("animation.closet.open", ILoopType.EDefaultLoopTypes.LOOP));
        }
        else{
            event.getController().transitionLengthTicks = 40;
            event.getController().setAnimation(new AnimationBuilder()
                    .addAnimation("animation.closet.idle", ILoopType.EDefaultLoopTypes.LOOP));
        }
        return PlayState.CONTINUE;
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
}
