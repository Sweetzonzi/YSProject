package com.mmixel.ysproject.block;

import com.mmixel.ysproject.block.decoration.KettleBlock;
import com.mmixel.ysproject.creativemodetab.YSTab;
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
}
