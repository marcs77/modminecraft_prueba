package com.marcs.modprueba.block;

import com.marcs.modprueba.lib.Strings;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;


public class ItemBlockBrickDyed extends ItemBlock {

    public ItemBlockBrickDyed(int id) {
        super(id);
        setHasSubtypes(true);
    }
    public String getUnlocalizedName(ItemStack is){
        return getUnlocalizedName()+"."+Strings.COLORS[is.getItemDamage()];
    }
    public int getMetadata(int par1)
    {
        return par1;
    }
}
    
    
