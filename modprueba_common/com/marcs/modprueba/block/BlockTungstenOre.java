package com.marcs.modprueba.block;

import java.util.Random;

import com.marcs.modprueba.item.ModItems;
import com.marcs.modprueba.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;


public class BlockTungstenOre extends Block{
    
    public BlockTungstenOre(int id){
        super(id, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setResistance(3.0F);
        this.setHardness(5.0F);
    }
    
    public void registerIcons (IconRegister reg){
        this.blockIcon = reg.registerIcon(Reference.MOD_ID+":"+this.getUnlocalizedName2());
    }
    
    public int idDropped(int par1, Random rand, int par2){
        return ModItems.tungstenDust.itemID;
    }
    
    public int quantityDropped (Random rand){
        return rand.nextInt(3)+3;
    }
}
