package com.mmixel.ysproject;

import com.mmixel.ysproject.block.BlockRegister;
import com.mmixel.ysproject.block.YSDecorationBlocks;
import com.mmixel.ysproject.block.YSStructureBlocks;
import com.mmixel.ysproject.item.ItemRegister;
import com.mmixel.ysproject.item.YSFoodItems;
import com.mmixel.ysproject.item.YSPropItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(YSProject.MOD_ID)
public class YSProject {
    public final static String MOD_ID = "ysproject";
    public YSProject(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        //装载mod新增物品和方块
        YSStructureBlocks.preregister();
        YSDecorationBlocks.preregister();
        YSFoodItems.preregister();
        YSPropItems.preregister();
        //注册新增物品和方块
        ItemRegister.ITEMS.register(modEventBus);
        BlockRegister.BLOCKS.register(modEventBus);
    }
}
