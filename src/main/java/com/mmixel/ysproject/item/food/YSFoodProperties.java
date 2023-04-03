package com.mmixel.ysproject.item.food;

import com.mmixel.ysproject.creativemodetab.YSTab;
import com.mmixel.ysproject.registry.ItemRegistry;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class YSFoodProperties {
    //食品属性------------------------------------------------------------------------------------
    //烤乳鸽
    public static final net.minecraft.world.food.FoodProperties ROAST_PIGEON = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(15).saturationMod(1f).build();
    //甜甜圈
    public static final net.minecraft.world.food.FoodProperties DOUGHNUT = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(5).saturationMod(0.1f).build();
    //老干妈
    public static final net.minecraft.world.food.FoodProperties LAOGANMA = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(5).saturationMod(0.1f).build();
    //咸鱼肉
    public static final net.minecraft.world.food.FoodProperties SALTY_FISH = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(3).saturationMod(0.2f).build();
    //熟咸鱼肉
    public static final net.minecraft.world.food.FoodProperties COOKED_SALTY_FISH = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(6).saturationMod(0.4f).build();
    //尾巴肉
    public static final net.minecraft.world.food.FoodProperties TAIL = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(6).saturationMod(0.2f).effect(()->new MobEffectInstance(MobEffects.POISON,600,0),30).build();
    //熟尾巴肉
    public static final net.minecraft.world.food.FoodProperties COOKED_TAIL = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(10).saturationMod(0.5f).build();
    //生虾
    public static final net.minecraft.world.food.FoodProperties SHRIMP = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(2).saturationMod(0.1f).fast().effect(()->new MobEffectInstance(MobEffects.POISON,600,0),30).build();
    //熟虾
    public static final net.minecraft.world.food.FoodProperties COOKED_SHRIMP = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(4).saturationMod(0.2f).fast().build();

}
