package com.mmixel.ysproject.block;

import com.mmixel.ysproject.YSProject;
import com.mmixel.ysproject.item.ItemRegister;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockRegister {
    private BlockRegister(){}
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, YSProject.MOD_ID);
    //方块注册器-----------------------------
    public static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block){
        return BLOCKS.register(name,block);
    }
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> registeredBlock = BLOCKS.register(name,block);
        registerBlockItem(name,registeredBlock,tab);
        return registeredBlock;
    }
    //方块物品注册器---------------------------------------
    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,CreativeModeTab tab){
        return ItemRegister.ITEMS.register(name,()-> new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }
}
