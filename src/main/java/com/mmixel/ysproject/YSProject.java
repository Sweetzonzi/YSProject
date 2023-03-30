package com.mmixel.ysproject;

import com.mmixel.ysproject.block.*;
import com.mmixel.ysproject.listener.ClientListener;
import com.mmixel.ysproject.item.ItemRegister;
import com.mmixel.ysproject.item.YSFoodItems;
import com.mmixel.ysproject.item.YSPropItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib3.GeckoLib;

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

        modEventBus.addListener(ClientListener::registerRenderers);//注册geckolib方块渲染？

        //初始化GeckoLib
        GeckoLib.initialize();

        //不知道有什么用
        MinecraftForge.EVENT_BUS.register(this);
    }
}
