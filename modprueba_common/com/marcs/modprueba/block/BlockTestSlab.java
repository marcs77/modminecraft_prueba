package com.marcs.modprueba.block;

import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class BlockTestSlab extends BlockHalfSlab{
    public BlockTestSlab(int ID, boolean par2){
        super(ID, par2,Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
    }

    @Override
    public String getFullSlabName(int i) {
        // TODO Auto-generated method stub
        return "blocktestslabdouble";
    }
}
   

