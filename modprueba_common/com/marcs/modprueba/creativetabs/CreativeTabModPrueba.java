package com.marcs.modprueba.creativetabs;

import com.marcs.modprueba.item.ModItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabModPrueba extends CreativeTabs{

    public CreativeTabModPrueba(int par1, String par2Str) {
        super(par1, par2Str);
        // TODO Auto-generated constructor stub
    }
    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
        return ModItems.enchantingDust.itemID;
    }

}
