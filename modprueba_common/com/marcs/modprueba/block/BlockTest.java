package com.marcs.modprueba.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTest extends Block{
    
    public BlockTest(int ID){
        super(ID, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
    }
    public void registerIcons (IconRegister reg){
        this.blockIcon = reg.registerIcon("modprueba:"+this.getUnlocalizedName2());
    }
}
