package com.marcs.modprueba.block;

import com.marcs.modprueba.lib.Reference;

import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;


public class BlockTestSlab extends BlockHalfSlab{
    public BlockTestSlab(int ID, boolean par2){
        super(ID, par2,Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
    }
    private Icon icons[];
    public void registerIcons(IconRegister reg){
        icons = new Icon[2];
        icons[0] = reg.registerIcon(Reference.MOD_ID+":"+ModBlocks.blockBismuthBrick.getUnlocalizedName2());
        icons[1] = reg.registerIcon(Reference.MOD_ID+":"+ModBlocks.blockBismuthOre.getUnlocalizedName2());
    }
    public Icon getIcon(int par1, int par2){
        switch(par1)
        {
               case 0:
                     return icons[0];
               case 1:
                     return icons[0];
               default:
                     return icons[1];
        }
    }

    @Override
    public String getFullSlabName(int i) {
        // TODO Auto-generated method stub
        return "blocktestslabdouble";
    }
}
   

