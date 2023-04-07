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
            .nutrition(15).saturationMod(1f).meat().build();
    //甜甜圈
    public static final net.minecraft.world.food.FoodProperties DOUGHNUT = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(5).saturationMod(0.1f).build();
    //老干妈
    public static final net.minecraft.world.food.FoodProperties LAOGANMA = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(5).saturationMod(0.1f).build();
    //咸鱼肉
    public static final net.minecraft.world.food.FoodProperties SALTY_FISH = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(3).saturationMod(0.2f).meat().build();
    //熟咸鱼肉
    public static final net.minecraft.world.food.FoodProperties COOKED_SALTY_FISH = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(6).saturationMod(0.4f).meat().build();
    //尾巴肉
    public static final net.minecraft.world.food.FoodProperties TAIL = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(6).saturationMod(0.2f).meat().effect(()->new MobEffectInstance(MobEffects.POISON,600,0),30).build();
    //熟尾巴肉
    public static final net.minecraft.world.food.FoodProperties COOKED_TAIL = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(10).saturationMod(0.5f).meat().build();
    //生虾
    public static final net.minecraft.world.food.FoodProperties SHRIMP = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(2).saturationMod(0.1f).meat().fast().effect(()->new MobEffectInstance(MobEffects.POISON,600,0),30).build();
    //熟虾
    public static final net.minecraft.world.food.FoodProperties COOKED_SHRIMP = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(4).saturationMod(0.2f).meat().fast().build();
    //蜥蜴煎蛋
    public static final net.minecraft.world.food.FoodProperties FRIED_LIZARD_EGG = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(6).saturationMod(0.3f).build();
    //克家菜--------------------------------------------
    //一般克家菜
    public static final net.minecraft.world.food.FoodProperties CTHULHU_FOOD = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(6).saturationMod(0.3f).meat().effect(()->new MobEffectInstance(MobEffects.CONFUSION,200,0),20).build();
    //屁菇
    public static final net.minecraft.world.food.FoodProperties PG = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(6).saturationMod(0.3f).meat().effect(()->new MobEffectInstance(MobEffects.CONFUSION,200,0),100).build();
    //呐喊寿司
    public static final net.minecraft.world.food.FoodProperties FT = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(5).saturationMod(0.3f).build();
    //修格斯果冻
    public static final net.minecraft.world.food.FoodProperties XGS = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(6).saturationMod(0.3f).build();
    //深潜者仰望星空派
    public static final net.minecraft.world.food.FoodProperties SQZ = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(8).saturationMod(0.3f).build();
    //毒汤
    public static final net.minecraft.world.food.FoodProperties DT = (new net.minecraft.world.food.FoodProperties.Builder())
            .effect(()->new MobEffectInstance(MobEffects.POISON,2400,0),100).build();
    //飞天意面
    public static final net.minecraft.world.food.FoodProperties FTYM = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(5).saturationMod(0.3f).effect(()->new MobEffectInstance(MobEffects.LEVITATION,60,19),100).build();
    //果冻泡面
    public static final net.minecraft.world.food.FoodProperties GDPM = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(12).saturationMod(0.3f).build();
    //黑山羊崽肉
    public static final net.minecraft.world.food.FoodProperties HSY1 = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(14).saturationMod(0.7f).meat().effect(()->new MobEffectInstance(MobEffects.DAMAGE_BOOST,200,9),100).build();
    //黑山羊崽肉排
    public static final net.minecraft.world.food.FoodProperties HSY2 = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(20).saturationMod(1.0f).meat().effect(()->new MobEffectInstance(MobEffects.DAMAGE_BOOST,2400,4),100).build();
    //黄衣之王面具糖
    public static final net.minecraft.world.food.FoodProperties HYZW = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(2).saturationMod(0.3f).fast().build();
    //克苏鲁软糖
    public static final net.minecraft.world.food.FoodProperties KSLRT = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(2).saturationMod(0.3f).fast().build();
    //黑老头凉皮
    public static final net.minecraft.world.food.FoodProperties HLTLP = (new net.minecraft.world.food.FoodProperties.Builder())
            .nutrition(6).saturationMod(0.3f).effect(()->new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,2400,3),100).build();
}
