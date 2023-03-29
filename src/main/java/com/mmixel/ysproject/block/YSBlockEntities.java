package com.mmixel.ysproject.block;

import com.mmixel.ysproject.block.decoration.KettleBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.RegistryObject;

public class YSBlockEntities {
    public static void preregister(){}
    //方块实体-----------------------------------------------------
    //烧水壶
    public static final RegistryObject<BlockEntityType<KettleBlockEntity>> KETTLE = BlockEntityRegister.registerBlockEntity("kettle",
            ()-> BlockEntityType.Builder.of(KettleBlockEntity::new,YSDecorationBlocks.KETTLE.get()).build(null));
}
