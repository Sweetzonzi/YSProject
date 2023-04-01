package com.mmixel.ysproject.item.decoration;

import com.mmixel.ysproject.YSProject;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ClosetBlockItemModel extends AnimatedGeoModel<ClosetBlockItem> {
    @Override
    public ResourceLocation getModelLocation(ClosetBlockItem object) {
        return new ResourceLocation(YSProject.MOD_ID,"geo/closet.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ClosetBlockItem object) {
        return new ResourceLocation(YSProject.MOD_ID,"textures/block/decoration/closet.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ClosetBlockItem animatable) {
        return new ResourceLocation(YSProject.MOD_ID,"animations/closet.animation.json");
    }
}
