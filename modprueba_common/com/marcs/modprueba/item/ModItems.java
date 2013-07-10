package com.marcs.modprueba.item;

import com.marcs.modprueba.ModPrueba;
import com.marcs.modprueba.lib.ItemIds;
import com.marcs.modprueba.lib.Strings;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

public class ModItems {
    public static Item tungstenDust;
    public static Item bismuthIngot;
    public static Item bismuthNugget;
    public static Item bismuthDust;
    public static Item enchantingDust;
    
    public static Item bismuthPickaxe;
    public static Item bismuthAxe;
    public static Item bismuthShovel;
    public static Item bismuthHoe;
    public static Item bismuthSword;
    
    public static Item tomahawk;
    
    public static Item bismuthHelmet;
    public static Item bismuthPlate;
    public static Item bismuthLegs;
    public static Item bismuthBoots;
    
    public static EnumToolMaterial BISMUTH = EnumHelper.addToolMaterial("BISMUTH", 2, 300, 8.0F, 2, 14);
    public static EnumArmorMaterial ABISMUTH = EnumHelper.addArmorMaterial("ABISMUTH", 18, new int[] { 3, 7, 6, 2}, 22);
    
    public static void init(){
        //Declarando Items
        tungstenDust = new ItemTungstenDust(ItemIds.TUNGSTEN_DUST).setUnlocalizedName("itemTungstenDust");
        bismuthIngot = new ItemBismuthIngot(ItemIds.BISMUTH_INGOT).setUnlocalizedName("itemBismuthIngot");
        bismuthNugget = new ItemBismuthNugget(ItemIds.BISMUTH_NUGGET).setUnlocalizedName("itemBismuthNugget");
        bismuthDust = new ItemBismuthDust(ItemIds.BISMUTH_DUST).setUnlocalizedName("itemBismuthDust");
        enchantingDust = new ItemEnchantingDust(ItemIds.ENCHANTING_DUST).setUnlocalizedName("itemEnchantingDust");
        bismuthPickaxe = new ItemBismuthPickaxe(ItemIds.BISMUTH_PICKAXE).setUnlocalizedName("itemBismuthPickaxe");
        bismuthAxe = new ItemBismuthAxe(ItemIds.BISMUTH_AXE).setUnlocalizedName("itemBismuthAxe");
        bismuthShovel = new ItemBismuthShovel(ItemIds.BISMUTH_SHOVEL).setUnlocalizedName("itemBismuthShovel");
        bismuthHoe = new ItemBismuthHoe(ItemIds.BISMUTH_HOE).setUnlocalizedName("itemBismuthHoe");
        bismuthSword = new ItemBismuthSword(ItemIds.BISMUTH_SWORD).setUnlocalizedName("itemBismuthSword");
        tomahawk = new ItemTomahawk(ItemIds.TOMAHAWK).setUnlocalizedName("itemTomahawk");
        
        bismuthHelmet = new ItemBismuthArmor(ItemIds.BISMUTH_HELMET, ABISMUTH, ModPrueba.proxy.addArmor("bismuthArmor"), 0).setUnlocalizedName("itemBismuthHelmet");
        bismuthPlate = new ItemBismuthArmor(ItemIds.BISMUTH_PLATE, ABISMUTH, ModPrueba.proxy.addArmor("bismuthArmor"), 1).setUnlocalizedName("itemBismuthPlate");
        bismuthLegs = new ItemBismuthArmor(ItemIds.BISMUTH_LEGS, ABISMUTH, ModPrueba.proxy.addArmor("bismuthArmor"), 2).setUnlocalizedName("itemBismuthLegs");
        bismuthBoots = new ItemBismuthArmor(ItemIds.BISMUTH_BOOTS, ABISMUTH, ModPrueba.proxy.addArmor("bismuthArmor"), 3).setUnlocalizedName("itemBismuthBoots");
        registerLanguage();

    }
    
    public static void registerLanguage(){
        LanguageRegistry.addName(tungstenDust, Strings.TUNGSTENDUST_NAME);
        LanguageRegistry.addName(bismuthIngot, Strings.BISMUTHINGOT_NAME);
        LanguageRegistry.addName(bismuthNugget, Strings.BISMUTHNUGGET_NAME);
        LanguageRegistry.addName(bismuthDust, Strings.BISMUTHDUST_NAME);
        LanguageRegistry.addName(enchantingDust, Strings.ENCHANTINGDUST_NAME);
        LanguageRegistry.addName(bismuthPickaxe, Strings.BISMUTHPICKAXE_NAME);
        LanguageRegistry.addName(bismuthAxe, Strings.BISMUTHAXE_NAME);
        LanguageRegistry.addName(bismuthShovel, Strings.BISMUTHSHOVEL_NAME);
        LanguageRegistry.addName(bismuthHoe, Strings.BISMUTHHOE_NAME);
        LanguageRegistry.addName(bismuthSword, Strings.BISMUTHSWORD_NAME);
        LanguageRegistry.addName(tomahawk, Strings.TOMAHAWK_NAME);
        LanguageRegistry.addName(bismuthHelmet, Strings.BISMUTHHELMET_NAME);
        LanguageRegistry.addName(bismuthPlate, Strings.BISMUTHPLATE_NAME);
        LanguageRegistry.addName(bismuthLegs, Strings.BISMUTHLEGS_NAME);
        LanguageRegistry.addName(bismuthBoots, Strings.BISMUTHBOOTS_NAME);
    }
    
}
