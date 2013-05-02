package com.marcs.modprueba.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTest extends Block{
    
    public BlockTest(int ID){
        super(ID, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}
