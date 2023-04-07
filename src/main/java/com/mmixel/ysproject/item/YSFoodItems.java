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
    public static final RegistryObject<Item> FRIED_LIZARD_EGG = ItemRegistry.registerItem("fried_lizard_egg",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.FRIED_LIZARD_EGG)));
    //克家菜--------------------------------------------
    //一般客家菜：肉，鱼，虫
    public static final RegistryObject<Item> CTHULHU_MEAT = ItemRegistry.registerItem("cthulhu_meat",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.CTHULHU_FOOD)));
    public static final RegistryObject<Item> CTHULHU_FISH = ItemRegistry.registerItem("cthulhu_fish",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.CTHULHU_FOOD)));
    public static final RegistryObject<Item> CTHULHU_INSECT = ItemRegistry.registerItem("cthulhu_insect",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.CTHULHU_FOOD)));
    //屁菇
    public static final RegistryObject<Item> PG = ItemRegistry.registerItem("pg",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.PG)));
    //呐喊寿司
    public static final RegistryObject<Item> FT = ItemRegistry.registerItem("ft",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.FT)));
    //修格斯果冻
    public static final RegistryObject<Item> XGS = ItemRegistry.registerItem("xgs",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.XGS)));
    //深潜者仰望星空派
    public static final RegistryObject<Item> SQZ = ItemRegistry.registerItem("sqz",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.SQZ)));
    //毒汤
    public static final RegistryObject<Item> DT = ItemRegistry.registerItem("dt",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.DT)));
    //飞天意面
    public static final RegistryObject<Item> FTYM = ItemRegistry.registerItem("ftym",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.FTYM)));
    //果冻泡面
    public static final RegistryObject<Item> GDPM = ItemRegistry.registerItem("gdpm",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.GDPM)));
    //黑山羊崽种肉
    public static final RegistryObject<Item> HSY1 = ItemRegistry.registerItem("hsy1",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.HSY1)));
    //黑山羊崽肉排
    public static final RegistryObject<Item> HSY2 = ItemRegistry.registerItem("hsy2",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.HSY2)));
    //黄衣之王面具糖
    public static final RegistryObject<Item> HYZW = ItemRegistry.registerItem("hyzw",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.HYZW)));
    //克苏鲁软糖
    public static final RegistryObject<Item> KSLRT = ItemRegistry.registerItem("kslrt",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.KSLRT)));
    //空盆 不能吃
    public static final RegistryObject<Item> KP = ItemRegistry.registerItem("kp",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD)));
    //黑老头凉皮
    public static final RegistryObject<Item> HLTLP = ItemRegistry.registerItem("hltlp",
            ()->new Item(new Item.Properties().tab(YSTab.YS_FOOD).food(YSFoodProperties.HLTLP)));
}
