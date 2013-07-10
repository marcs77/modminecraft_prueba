package com.marcs.modprueba.config;

import com.marcs.modprueba.lib.BlockIds;
import com.marcs.modprueba.lib.ItemIds;
import com.marcs.modprueba.lib.Strings;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ModConfig {
    //Properties
    public static boolean enableWorldGen;
    public static int tomahawkMobDamage;
    public static int tomahawkPlayerDamage;
    
    public static void init(FMLPreInitializationEvent event){
        /**Inicia la configuracion. El archivo config esta en ./minecraft/config/ModPrueba.cfg
         * Si no existe, este es creado.
         */
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        //Carga la config
        config.load();
        //Bloques
        BlockIds.TUNGSTEN_ORE_BLOCK = config.getBlock(Strings.TUNGSTEN_ORE_BLOCK_NAME, BlockIds.TUNGSTEN_ORE_BLOCK_D).getInt();
        BlockIds.TEST_SLAB = config.getBlock(Strings.TESTBLOCK_SLAB_NAME, BlockIds.TEST_SLAB_D).getInt();
        BlockIds.TEST_SLAB_DOUBLE = config.getBlock(Strings.TESTBLOCK_SLABDOUBLE_NAME, BlockIds.TEST_SLAB_DOUBLE_D).getInt();
        BlockIds.BISMUTH_ORE_BLOCK = config.getBlock(Strings.BISMUTH_ORE_BLOCK_NAME, BlockIds.BISMUTH_ORE_BLOCK_D).getInt();
        BlockIds.BISMUTH_BRICK = config.getBlock(Strings.BISMUTHBRICK_NAME, BlockIds.BISMUTH_BRICK_D).getInt();
        BlockIds.BISMUTH_BRICK_DYED = config.getBlock(Strings.BISMUTHBRICK_NAME+"Dyed", BlockIds.BISMUTH_BRICK_DYED_D).getInt();
        BlockIds.NUKE = config.getBlock(Strings.NUKE_NAME, BlockIds.NUKE_D).getInt();
        //Item
        ItemIds.TUNGSTEN_DUST = config.getItem(Strings.TUNGSTENDUST_NAME, ItemIds.TUNGSTEN_DUST_D).getInt();
        ItemIds.BISMUTH_INGOT = config.getItem(Strings.BISMUTHINGOT_NAME, ItemIds.BISMUTH_INGOT_D).getInt();
        ItemIds.BISMUTH_NUGGET = config.getItem(Strings.BISMUTHNUGGET_NAME, ItemIds.BISMUTH_NUGGET_D).getInt();
        ItemIds.ENCHANTING_DUST = config.getItem(Strings.ENCHANTINGDUST_NAME, ItemIds.ENCHANTING_DUST_D).getInt();
        ItemIds.BISMUTH_DUST = config.getItem(Strings.BISMUTHDUST_NAME, ItemIds.BISMUTH_DUST_D).getInt();
        ItemIds.BISMUTH_PICKAXE = config.getItem(Strings.BISMUTHPICKAXE_NAME, ItemIds.BISMUTH_PICKAXE_D).getInt();
        ItemIds.BISMUTH_AXE = config.getItem(Strings.BISMUTHAXE_NAME, ItemIds.BISMUTH_AXE_D).getInt();
        ItemIds.BISMUTH_SHOVEL = config.getItem(Strings.BISMUTHSHOVEL_NAME, ItemIds.BISMUTH_SHOVEL_D).getInt();
        ItemIds.BISMUTH_HOE = config.getItem(Strings.BISMUTHHOE_NAME, ItemIds.BISMUTH_HOE_D).getInt();
        ItemIds.BISMUTH_SWORD = config.getItem(Strings.BISMUTHSWORD_NAME, ItemIds.BISMUTH_SWORD_D).getInt();
        ItemIds.TOMAHAWK = config.getItem(Strings.TOMAHAWK_NAME, ItemIds.TOMAHAWK_D).getInt();
        
        ItemIds.BISMUTH_HELMET = config.getItem(Strings.BISMUTHHELMET_NAME, ItemIds.BISMUTH_HELMET_D).getInt();
        ItemIds.BISMUTH_PLATE = config.getItem(Strings.BISMUTHPLATE_NAME, ItemIds.BISMUTH_PLATE_D).getInt();
        ItemIds.BISMUTH_LEGS = config.getItem(Strings.BISMUTHLEGS_NAME, ItemIds.BISMUTH_LEGS_D).getInt();
        ItemIds.BISMUTH_BOOTS = config.getItem(Strings.BISMUTHBOOTS_NAME, ItemIds.BISMUTH_BOOTS_D).getInt();
        //WorldGen
        enableWorldGen = config.get(Configuration.CATEGORY_GENERAL, "enableWorldGen", true, "Activa la generacion de mundos").getBoolean(true);
        tomahawkMobDamage = config.get(Configuration.CATEGORY_GENERAL, "tomahawkMobDamage", 8, "Daño que produce un tomahawk a un mob.").getInt(8);
        tomahawkPlayerDamage = config.get(Configuration.CATEGORY_GENERAL, "tomahawkPlayerDamage", 8, "Daño que produce un tomahawk a un player.").getInt(8);
        //Guarda la config
        config.save();

    }
}
