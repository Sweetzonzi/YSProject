package com.mmixel.ysproject.item.decoration;

import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.IItemRenderProperties;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

import java.util.function.Consumer;

public class ClosetBlockItem extends BlockItem implements IAnimatable {

    public AnimationFactory factory = GeckoLibUtil.createFactory(this);

    public ClosetBlockItem(Block pBlock, Properties pProperties) {
        super(pBlock, pProperties);
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event){
        return PlayState.CONTINUE;
    }

    @Override
    public void initializeClient(Consumer<IItemRenderProperties> consumer) {
        super.initializeClient(consumer);
        consumer.accept(new IItemRenderProperties() {
            private final BlockEntityWithoutLevelRenderer renderer = new ClosetBlockItemRenderer();

            @Override
            public BlockEntityWithoutLevelRenderer getItemStackRenderer(){
                return renderer;
            }
        });
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<>
                (this,"controller",0,this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
}
