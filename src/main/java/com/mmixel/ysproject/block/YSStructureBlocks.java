package com.mmixel.ysproject.block;

import com.mmixel.ysproject.block.strucutre.YSHorizontalDirectionalBlock;
import com.mmixel.ysproject.creativemodetab.YSTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

public class YSStructureBlocks {
    public static void preregister(){}
    //方块----------------------------------------------------
    //level0墙面
    public static final RegistryObject<Block> WALL_LVL0 = BlockRegister.registerBlock("wall_lvl0",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE)), YSTab.YS_STRUCTURE);
    //level0地板
    public static final RegistryObject<Block> FLOOR_LVL0 = BlockRegister.registerBlock("floor_lvl0",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE)), YSTab.YS_STRUCTURE);
    //level0天花板
    public static final RegistryObject<Block> CEILING_LVL0 = BlockRegister.registerBlock("ceiling_lvl0",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE)), YSTab.YS_STRUCTURE);
    //level0天花板_边沿
    public static final RegistryObject<Block> CEILING_LVL0_EDGE = BlockRegister.registerBlock("ceiling_lvl0_edge",
            ()->new YSHorizontalDirectionalBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE)), YSTab.YS_STRUCTURE);
    //level0天花板_转角
    public static final RegistryObject<Block> CEILING_LVL0_CORNER = BlockRegister.registerBlock("ceiling_lvl0_corner",
            ()->new YSHorizontalDirectionalBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE)), YSTab.YS_STRUCTURE);
    //level0灯箱
    public static final RegistryObject<Block> LIGHT_LVL0 = BlockRegister.registerBlock("light_lvl0",
            ()->new Block(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS)
                    .lightLevel((blockState)->15).noOcclusion()), YSTab.YS_STRUCTURE);
    //level0灯箱
    public static final RegistryObject<Block> LIGHT_LVL0_CENTER = BlockRegister.registerBlock("light_lvl0_center",
            ()->new Block(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS)
                    .lightLevel((blockState)->15).noOcclusion()), YSTab.YS_STRUCTURE);
    //level0灯箱_边沿
    public static final RegistryObject<Block> LIGHT_LVL0_EDGE = BlockRegister.registerBlock("light_lvl0_edge",
            ()->new YSHorizontalDirectionalBlock(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS)
                    .lightLevel((blockState)->15).noOcclusion()), YSTab.YS_STRUCTURE);
    //level0灯箱_转角
    public static final RegistryObject<Block> LIGHT_LVL0_CORNER = BlockRegister.registerBlock("light_lvl0_corner",
            ()->new YSHorizontalDirectionalBlock(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS)
                    .lightLevel((blockState)->15).noOcclusion()), YSTab.YS_STRUCTURE);
}
