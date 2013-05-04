package com.marcs.modprueba.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockTungstenOre extends Block{
    
    public BlockTungstenOre(int id){
        super(id, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setResistance(3.0F);
        this.setHardness(5.0F);
    }
    
    public void registerIcons (IconRegister reg){
        this.blockIcon = reg.registerIcon("modprueba:"+this.getUnlocalizedName2());
    }
    
    public int idDropped(int par1, Random rand, int par2){
        return Item.coal.itemID;
    }
    
    public int quantityDropped (Random rand){
        return rand.nextInt(3)+3;
    }
}
