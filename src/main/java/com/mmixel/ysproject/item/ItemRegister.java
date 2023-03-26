package com.mmixel.ysproject.item;

import com.mmixel.ysproject.YSProject;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemRegister {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, YSProject.MOD_ID);
    //物品注册器-----------------------------
    public static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item){
        return ITEMS.register(name,item);
    }
}
