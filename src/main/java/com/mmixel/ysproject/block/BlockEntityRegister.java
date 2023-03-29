package com.mmixel.ysproject.block;

import com.mmixel.ysproject.YSProject;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockEntityRegister {
    private BlockEntityRegister(){}
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, YSProject.MOD_ID);
    //方块实体注册器
    public static <T extends BlockEntityType<?>> RegistryObject<T> registerBlockEntity(String name, Supplier<T> blockentity){
        return BLOCK_ENTITIES.register(name,blockentity);
    }
}
