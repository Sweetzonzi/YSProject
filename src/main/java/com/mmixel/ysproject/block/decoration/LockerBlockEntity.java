package com.mmixel.ysproject.block.decoration;

import com.mmixel.ysproject.block.YSBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
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

import static com.mmixel.ysproject.block.decoration.LockerBlock.IS_OPENED;

public class LockerBlockEntity extends ChestBlockEntity implements IAnimatable {

    private AnimationFactory factory = GeckoLibUtil.createFactory(this);

    public LockerBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(YSBlockEntities.LOCKER.get(), pPos, pBlockState);
    }

    @Override
    public Component getDisplayName() {
        return new TextComponent("Locker");
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
                .addAnimation("animation.locker.open", ILoopType.EDefaultLoopTypes.LOOP));
        }
        else{
            event.getController().transitionLengthTicks = 40;
            event.getController().setAnimation(new AnimationBuilder()
                    .addAnimation("animation.locker.idle", ILoopType.EDefaultLoopTypes.LOOP));
        }
        return PlayState.CONTINUE;
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    public void startOpen(Player pPlayer) {
        playSound(pPlayer, this.getBlockPos(), SoundEvents.CHEST_OPEN);
        pPlayer.getLevel().setBlock(this.getBlockPos(),this.getBlockState().setValue(IS_OPENED,Boolean.TRUE),3);
    }
    @Override
    public void stopOpen(Player pPlayer) {
        playSound(pPlayer, this.getBlockPos(), SoundEvents.CHEST_CLOSE);
        pPlayer.getLevel().setBlock(this.getBlockPos(),this.getBlockState().setValue(IS_OPENED,Boolean.FALSE),3);
    }

    static void playSound(Player player, BlockPos pPos, SoundEvent pSound) {
            double d0 = (double)pPos.getX() + 0.5D;
            double d1 = (double)pPos.getY() + 0.5D;
            double d2 = (double)pPos.getZ() + 0.5D;
            player.getLevel().playSound(player, d0, d1, d2, pSound, SoundSource.BLOCKS, 0.5F, 1.5F);
    }
}
