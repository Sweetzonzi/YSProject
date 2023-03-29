package com.mmixel.ysproject;

import com.mmixel.ysproject.block.*;
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
        //装载mod新增物品、方块和方块实体
        YSStructureBlocks.preregister();
        YSDecorationBlocks.preregister();
        YSFoodItems.preregister();
        YSPropItems.preregister();
        YSBlockEntities.preregister();
        //注册新增物品、方块和方块实体
        ItemRegister.ITEMS.register(modEventBus);
        BlockRegister.BLOCKS.register(modEventBus);
        BlockEntityRegister.BLOCK_ENTITIES.register(modEventBus);
    }
}
