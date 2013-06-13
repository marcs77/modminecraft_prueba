package com.marcs.modprueba.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import com.marcs.modprueba.ModPrueba;
import com.marcs.modprueba.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBrickDyed extends Block{
    public BlockBrickDyed(int id){
        super(id, Material.rock);
        this.setCreativeTab(ModPrueba.tabsMP);
        this.setResistance(10.0F);
        this.setHardness(6.0F);
    }
    @SideOnly(Side.CLIENT)
    private Icon icons[];
    @SideOnly(Side.CLIENT)
    public void registerIcons (IconRegister reg){
        icons = new Icon[16];
        for (int i=0; i<16; i++){
            icons[i] = reg.registerIcon(Reference.MOD_ID+":"+"dyedbricks/"+this.getUnlocalizedName2()+i);
        }
    }
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2){
        return icons[par2];
    }
    @SuppressWarnings("unchecked")
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs tab, @SuppressWarnings("rawtypes") List subItems) {
        for (int ix = 0; ix < 16; ix++) {
            subItems.add(new ItemStack(par1, 1, ix));
        }
    }
}
