package com.mmixel.ysproject.block;

import com.mmixel.ysproject.block.decoration.ClosetBlock;
import com.mmixel.ysproject.block.decoration.KettleBlock;
import com.mmixel.ysproject.block.decoration.LockerBlock;
import com.mmixel.ysproject.creativemodetab.YSTab;
import com.mmixel.ysproject.item.ItemRegister;
import com.mmixel.ysproject.item.decoration.ClosetBlockItem;
import com.mmixel.ysproject.item.decoration.LockerBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

public class YSDecorationBlocks {
    public static void preregister(){}
    //方块----------------------------------------------------
    //烧水壶,具体实现见block/decoration/KettleBlock.java
    public static final RegistryObject<Block> KETTLE = BlockRegister.registerBlock("kettle",
            ()->new KettleBlock(BlockBehaviour.Properties.of(Material.METAL).noCollission().sound(SoundType.COPPER)), YSTab.YS_DECORATION);
    //储物柜
    public static final RegistryObject<Block> LOCKER = BlockRegister.registerBlockWithoutBlockItem("locker",
            ()->new LockerBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().sound(SoundType.COPPER)));
    //储物柜物品
    public static final RegistryObject<Item> LOCKER_ITEM = ItemRegister.registerItem("locker_item",
            ()->new LockerBlockItem(LOCKER.get(), new Item.Properties().tab(YSTab.YS_DECORATION)));
    //衣柜_可藏人
    public static final RegistryObject<Block> CLOSET = BlockRegister.registerBlockWithoutBlockItem("closet",
            ()->new ClosetBlock(BlockBehaviour.Properties.of(Material.METAL).noCollission().sound(SoundType.COPPER)));
    //衣柜_可藏人_物品
    public static final RegistryObject<Item> CLOSET_ITEM = ItemRegister.registerItem("closet_item",
            ()->new ClosetBlockItem(CLOSET.get(), new Item.Properties().tab(YSTab.YS_DECORATION)));
}
