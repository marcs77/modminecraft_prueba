package com.marcs.modprueba.block;

import com.marcs.modprueba.ModPrueba;
import com.marcs.modprueba.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockPortableBench extends Block{

    public BlockPortableBench(int par1) {
        super(par1, Material.circuits);
        this.setCreativeTab(ModPrueba.tabsMP);
        this.setHardness(0.0F);
        this.setResistance(1.0F);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
        // TODO Auto-generated constructor stub
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    private Icon icons[];
    public void registerIcons(IconRegister reg){
        icons = new Icon[3];
        icons[0] = reg.registerIcon(Reference.MOD_ID+":"+this.getUnlocalizedName2()+0);
        icons[1] = reg.registerIcon(Reference.MOD_ID+":"+this.getUnlocalizedName2()+1);
        icons[2] = reg.registerIcon(Reference.MOD_ID+":"+this.getUnlocalizedName2()+2);
    }
    
    public Icon getIcon(int par1, int par2){
        switch(par1)
        {
               case 0:
                     return icons[1];
               case 1:
                     return icons[0];
               default:
                     return icons[2];
        }
    }
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        
         return false;
    }

}
