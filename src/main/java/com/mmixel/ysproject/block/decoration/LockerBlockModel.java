package com.mmixel.ysproject.block.decoration;

import com.mmixel.ysproject.YSProject;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LockerBlockModel extends AnimatedGeoModel<LockerBlockEntity> {
    @Override
    public ResourceLocation getModelLocation(LockerBlockEntity object) {
        return new ResourceLocation(YSProject.MOD_ID,"geo/locker.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(LockerBlockEntity object) {
        return new ResourceLocation(YSProject.MOD_ID,"textures/block/decoration/locker.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(LockerBlockEntity animatable) {
        return new ResourceLocation(YSProject.MOD_ID,"animations/locker.animation.json");
    }
}
