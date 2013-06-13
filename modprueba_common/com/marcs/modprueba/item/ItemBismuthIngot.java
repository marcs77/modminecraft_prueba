package com.marcs.modprueba.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

import com.marcs.modprueba.ModPrueba;
import com.marcs.modprueba.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBismuthIngot extends Item{
    public ItemBismuthIngot(int id){
        super(id);
        this.setCreativeTab(ModPrueba.tabsMP);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg){
        this.itemIcon = reg.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
