package com.mmixel.ysproject.block;

import com.mmixel.ysproject.block.decoration.ClosetBlockEntity;
import com.mmixel.ysproject.block.decoration.KettleBlockEntity;
import com.mmixel.ysproject.block.decoration.LockerBlockEntity;
import com.mmixel.ysproject.registry.BlockEntityRegistry;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.RegistryObject;

public class YSBlockEntities {
    public static void preregister(){}
    //方块实体-----------------------------------------------------
    //烧水壶
    public static final RegistryObject<BlockEntityType<KettleBlockEntity>> KETTLE = BlockEntityRegistry.registerBlockEntity("kettle",
            ()-> BlockEntityType.Builder.of(KettleBlockEntity::new,YSDecorationBlocks.KETTLE.get()).build(null));
    //储物柜
    public static final RegistryObject<BlockEntityType<LockerBlockEntity>> LOCKER = BlockEntityRegistry.registerBlockEntity("locker",
            ()-> BlockEntityType.Builder.of(LockerBlockEntity::new,YSDecorationBlocks.LOCKER.get()).build(null));
    //躲藏用衣柜
    public static final RegistryObject<BlockEntityType<ClosetBlockEntity>> CLOSET = BlockEntityRegistry.registerBlockEntity("closet",
            ()-> BlockEntityType.Builder.of(ClosetBlockEntity::new,YSDecorationBlocks.CLOSET.get()).build(null));
}
