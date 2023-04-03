package com.mmixel.ysproject.item;

import com.mmixel.ysproject.creativemodetab.YSTab;
import com.mmixel.ysproject.item.food.YSFoodProperties;
import com.mmixel.ysproject.registry.ItemRegistry;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class YSFoodItems {//食品列表，仅注册用，具体属性请见item/food/FoodProperties.java
    public static void preregister(){}
    //食品------------------------------------------------------------------------------------
    //烤乳鸽
    public static final RegistryObject<Item> ROAST_PIGEON = ItemRegistry.registerItem("roast_pigeon",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.ROAST_PIGEON)));
    //甜甜圈
    public static final RegistryObject<Item> DOUGHNUT_1 = ItemRegistry.registerItem("doughnut_1",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.DOUGHNUT)));
    public static final RegistryObject<Item> DOUGHNUT_2 = ItemRegistry.registerItem("doughnut_2",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.DOUGHNUT)));
    public static final RegistryObject<Item> DOUGHNUT_3 = ItemRegistry.registerItem("doughnut_3",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.DOUGHNUT)));
    //老干妈
    public static final RegistryObject<Item> LAOGANMA = ItemRegistry.registerItem("laoganma",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.LAOGANMA)));
    //咸鱼肉
    public static final RegistryObject<Item> SALTY_FISH = ItemRegistry.registerItem("salty_fish",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.SALTY_FISH)));
    //熟咸鱼肉
    public static final RegistryObject<Item> COOKED_SALTY_FISH = ItemRegistry.registerItem("cooked_salty_fish",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.COOKED_SALTY_FISH)));
    //尾巴肉
    public static final RegistryObject<Item> TAIL = ItemRegistry.registerItem("tail",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.TAIL)));
    //熟尾巴肉
    public static final RegistryObject<Item> COOKED_TAIL = ItemRegistry.registerItem("cooked_tail",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.COOKED_TAIL)));
    //生虾
    public static final RegistryObject<Item> SHRIMP = ItemRegistry.registerItem("shrimp",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.SHRIMP)));
    //熟虾
    public static final RegistryObject<Item> COOKED_SHRIMP = ItemRegistry.registerItem("cooked_shrimp",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.COOKED_SHRIMP)));
    //煎蜥蜴蛋
    public static final RegistryObject<Item> FRIED_LIZARD_EGG = ItemRegistry.registerItem("fired_lizard_egg",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.FRIED_LIZARD_EGG)));

}
