package com.marcs.modprueba.item;

import com.marcs.modprueba.ModPrueba;
import com.marcs.modprueba.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemHoe;

public class ItemBismuthHoe extends ItemHoe{

    public ItemBismuthHoe(int par1) {
        super(par1, ModItems.BISMUTH);
        setCreativeTab(ModPrueba.tabsMP);
        // TODO Auto-generated constructor stub
        
    }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg){
        this.itemIcon = reg.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + "tools/" +this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

}
