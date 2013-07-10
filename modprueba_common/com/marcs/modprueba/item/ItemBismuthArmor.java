package com.marcs.modprueba.item;

import com.marcs.modprueba.ModPrueba;
import com.marcs.modprueba.lib.Reference;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

@SuppressWarnings("deprecation")
public class ItemBismuthArmor extends ItemArmor implements IArmorTextureProvider{

    public ItemBismuthArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
            int par3, int par4) {
        super(par1, par2EnumArmorMaterial, par3, par4);
        this.setCreativeTab(ModPrueba.tabsMP);
        // TODO Auto-generated constructor stub
    }
    @Override
    public String getArmorTextureFile(ItemStack itemstack){
        if (itemstack.itemID == ModItems.bismuthHelmet.itemID || itemstack.itemID == ModItems.bismuthPlate.itemID ||
                itemstack.itemID == ModItems.bismuthBoots.itemID){
            return "/mods/modprueba/textures/armor/bismuthArmor_1.png";
        }
        if (itemstack.itemID == ModItems.bismuthLegs.itemID){
            return "/mods/modprueba/textures/armor/bismuthArmor_2.png";
        }
        else return "/mods/modprueba/textures/armor/bismuthArmor_2.png";
    }
    
    public void registerIcons(IconRegister reg){
        this.itemIcon = reg.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + "armor/" +this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
    
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return true;
    }

}
