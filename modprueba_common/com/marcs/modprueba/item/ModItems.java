package com.marcs.modprueba.item;

import com.marcs.modprueba.lib.ItemIds;
import com.marcs.modprueba.lib.Strings;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class ModItems {
    public static Item tungstenDust;
    public static Item bismuthIngot;
    public static Item bismuthNugget;
    public static Item bismuthDust;
    public static Item enchantingDust;
    
    public static void init(){
        //Declarando Items
        tungstenDust = new ItemTungstenDust(ItemIds.TUNGSTEN_DUST).setUnlocalizedName("itemTungstenDust");
        bismuthIngot = new ItemBismuthIngot(ItemIds.BISMUTH_INGOT).setUnlocalizedName("itemBismuthIngot");
        bismuthNugget = new ItemBismuthNugget(ItemIds.BISMUTH_NUGGET).setUnlocalizedName("itemBismuthNugget");
        bismuthDust = new ItemBismuthDust(ItemIds.BISMUTH_DUST).setUnlocalizedName("itemBismuthDust");
        enchantingDust = new ItemEnchantingDust(ItemIds.ENCHANTING_DUST).setUnlocalizedName("itemEnchantingDust");
        registerLanguage();

    }
    
    public static void registerLanguage(){
        LanguageRegistry.addName(tungstenDust, Strings.TUNGSTENDUST_NAME);
        LanguageRegistry.addName(bismuthIngot, Strings.BISMUTHINGOT_NAME);
        LanguageRegistry.addName(bismuthNugget, Strings.BISMUTHNUGGET_NAME);
        LanguageRegistry.addName(bismuthDust, Strings.BISMUTHDUST_NAME);
        LanguageRegistry.addName(enchantingDust, Strings.ENCHANTINGDUST_NAME);
    }
    
}
