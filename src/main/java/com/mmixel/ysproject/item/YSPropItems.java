package com.mmixel.ysproject.item;

import com.mmixel.ysproject.creativemodetab.YSTab;
import com.mmixel.ysproject.item.prop.AlmondWaterItem;
import com.mmixel.ysproject.item.prop.BoiledAlmondWaterItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class YSPropItems {
    public static void preregister(){}
    //后室物品------------------------------------------------------------------------------------
    //杏仁水_红
    public static final RegistryObject<Item> ALMOND_WATER_RED = ItemRegister.registerItem("almond_water_red",
            ()->new AlmondWaterItem(new Item.Properties().stacksTo(1).tab(YSTab.YS_PORP)));
    //杏仁水_橙
    public static final RegistryObject<Item> ALMOND_WATER_ORANGE = ItemRegister.registerItem("almond_water_orange",
            ()->new AlmondWaterItem(new Item.Properties().stacksTo(1).tab(YSTab.YS_PORP)));
    //杏仁水_黄
    public static final RegistryObject<Item> ALMOND_WATER_YELLOW = ItemRegister.registerItem("almond_water_yellow",
            ()->new AlmondWaterItem(new Item.Properties().stacksTo(1).tab(YSTab.YS_PORP)));
    //杏仁水_绿
    public static final RegistryObject<Item> ALMOND_WATER_GREEN = ItemRegister.registerItem("almond_water_green",
            ()->new AlmondWaterItem(new Item.Properties().stacksTo(1).tab(YSTab.YS_PORP)));
    //杏仁水_紫
    public static final RegistryObject<Item> ALMOND_WATER_PURPLE = ItemRegister.registerItem("almond_water_purple",
            ()->new AlmondWaterItem(new Item.Properties().stacksTo(1).tab(YSTab.YS_PORP)));
    //杏仁水_黑
    public static final RegistryObject<Item> ALMOND_WATER_BLACK = ItemRegister.registerItem("almond_water_black",
            ()->new AlmondWaterItem(new Item.Properties().stacksTo(1).tab(YSTab.YS_PORP)));
    //杏仁水_煮开
    public static final RegistryObject<Item> ALMOND_WATER_BOILED = ItemRegister.registerItem("almond_water_boiled",
            ()->new BoiledAlmondWaterItem(new Item.Properties().stacksTo(1).tab(YSTab.YS_PORP)));
    //钱币(后室)_1块
    public static final RegistryObject<Item> MONEY_1 = ItemRegister.registerItem("money_1",
            ()->new Item(new Item.Properties().tab(YSTab.YS_PORP)));
    //钱币(后室)_10块
    public static final RegistryObject<Item> MONEY_10 = ItemRegister.registerItem("money_10",
            ()->new Item(new Item.Properties().tab(YSTab.YS_PORP)));
    //钱币(后室)_100块
    public static final RegistryObject<Item> MONEY_100 = ItemRegister.registerItem("money_100",
            ()->new Item(new Item.Properties().tab(YSTab.YS_PORP)));
    //钱币(后室)_1000块
    public static final RegistryObject<Item> MONEY_1000 = ItemRegister.registerItem("money_1000",
            ()->new Item(new Item.Properties().tab(YSTab.YS_PORP)));
    //钱币(后室)_10000块
    public static final RegistryObject<Item> MONEY_10000 = ItemRegister.registerItem("money_10000",
            ()->new Item(new Item.Properties().tab(YSTab.YS_PORP)));
    //SCP物品-------------------------------------------------------------------------------------
    //1级权限卡
    public static final RegistryObject<Item> SCP_CARD_1 = ItemRegister.registerItem("scp_card_1",
            ()->new Item(new Item.Properties().tab(YSTab.YS_PORP)));
    //2级权限卡
    public static final RegistryObject<Item> SCP_CARD_2 = ItemRegister.registerItem("scp_card_2",
            ()->new Item(new Item.Properties().tab(YSTab.YS_PORP)));
    //3级权限卡
    public static final RegistryObject<Item> SCP_CARD_3 = ItemRegister.registerItem("scp_card_3",
            ()->new Item(new Item.Properties().tab(YSTab.YS_PORP)));
    //4级权限卡
    public static final RegistryObject<Item> SCP_CARD_4 = ItemRegister.registerItem("scp_card_4",
            ()->new Item(new Item.Properties().tab(YSTab.YS_PORP)));
    //5级权限卡
    public static final RegistryObject<Item> SCP_CARD_5 = ItemRegister.registerItem("scp_card_5",
            ()->new Item(new Item.Properties().tab(YSTab.YS_PORP)));
}
