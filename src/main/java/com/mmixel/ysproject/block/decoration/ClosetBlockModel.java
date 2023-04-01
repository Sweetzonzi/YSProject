package com.mmixel.ysproject.block.decoration;

import com.mmixel.ysproject.YSProject;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ClosetBlockModel extends AnimatedGeoModel<ClosetBlockEntity> {
    @Override
    public ResourceLocation getModelLocation(ClosetBlockEntity object) {
        return new ResourceLocation(YSProject.MOD_ID,"geo/closet.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ClosetBlockEntity object) {
        return new ResourceLocation(YSProject.MOD_ID,"textures/block/decoration/closet.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ClosetBlockEntity animatable) {
        return new ResourceLocation(YSProject.MOD_ID,"animations/closet.animation.json");
    }
}
