package com.marcs.modprueba.item;

import java.util.List;

import com.marcs.modprueba.ModPrueba;
import com.marcs.modprueba.lib.Reference;
import com.marcs.modprueba.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemEnchantingDust extends Item{

    public ItemEnchantingDust(int id) {
        super(id);
        setCreativeTab(ModPrueba.tabsMP);
    }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg){
        this.itemIcon = reg.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(Strings.ENCHANTINGDUST_INFO[0]);
        par3List.add(Strings.ENCHANTINGDUST_INFO[1]);
        par3List.add(Strings.ENCHANTINGDUST_INFO[2]);
    }
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack){
        return true;
    }
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack){
        return EnumRarity.rare;
    }
}
