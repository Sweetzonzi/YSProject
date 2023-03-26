package com.mmixel.ysproject.item.prop;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class AlmondWaterItem extends Item {

    private static final int DRINK_DURATION = 16;
    private static final int POISON_CHANCE = 30;
    private static final int POISON_DURATION = 600;

    public AlmondWaterItem(Properties pProperties) {
        super(pProperties);
    }

    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving) {
        if (!pLevel.isClientSide) {
            pEntityLiving.removeAllEffects();//清除所有效果
            if(100*Math.random()<=POISON_CHANCE) {//未煮过的杏仁水饮用后概率中毒
                pEntityLiving.addEffect(new MobEffectInstance(MobEffects.POISON, POISON_DURATION, 0), pEntityLiving);
            }
            }

        if (pEntityLiving instanceof ServerPlayer) {
            ServerPlayer serverplayer = (ServerPlayer)pEntityLiving;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, pStack);
            serverplayer.awardStat(Stats.ITEM_USED.get(this));
        }

        if (pEntityLiving instanceof Player && !((Player)pEntityLiving).getAbilities().instabuild) {
            pStack.shrink(1);
        }
        //饮用后直接消失
        return pStack.isEmpty() ? new ItemStack(Items.AIR) : pStack;
    }
    
    public int getUseDuration(ItemStack pStack) {
        return DRINK_DURATION;
    }

    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.DRINK;
    }

    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        return ItemUtils.startUsingInstantly(pLevel, pPlayer, pHand);
    }
}
