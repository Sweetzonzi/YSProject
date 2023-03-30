package com.mmixel.ysproject.item.prop;

import com.mmixel.ysproject.YSProject;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LockerBlockItemModel extends AnimatedGeoModel<LockerBlockItem> {
    @Override
    public ResourceLocation getModelLocation(LockerBlockItem object) {
        return new ResourceLocation(YSProject.MOD_ID,"geo/locker.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(LockerBlockItem object) {
        return new ResourceLocation(YSProject.MOD_ID,"textures/block/decoration/locker.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(LockerBlockItem animatable) {
        return new ResourceLocation(YSProject.MOD_ID,"animations/locker.animation.json");
    }
}
