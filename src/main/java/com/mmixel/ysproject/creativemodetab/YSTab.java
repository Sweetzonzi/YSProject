package com.mmixel.ysproject.creativemodetab;

import com.mmixel.ysproject.block.YSDecorationBlocks;
import com.mmixel.ysproject.block.YSStructureBlocks;
import com.mmixel.ysproject.item.YSFoodItems;
import com.mmixel.ysproject.item.YSPropItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class YSTab {
    public static final CreativeModeTab YS_STRUCTURE = new CreativeModeTab("ys_structure") {
        @Override
        public ItemStack makeIcon() {return new ItemStack(YSStructureBlocks.WALL_LVL0.get()); }
    };
    public static final CreativeModeTab YS_DECORATION = new CreativeModeTab("ys_decoration") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(YSDecorationBlocks.KETTLE.get());
        }
    };
    public static final CreativeModeTab YS_FOOD = new CreativeModeTab("ys_food") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(YSFoodItems.ROAST_PIGEON.get());
        }
    };
    public static final CreativeModeTab YS_PORP = new CreativeModeTab("ys_prop") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(YSPropItems.ALMOND_WATER_RED.get());
        }
    };
}
