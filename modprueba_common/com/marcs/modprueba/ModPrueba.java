package com.marcs.modprueba;

import net.minecraft.creativetab.CreativeTabs;

import com.marcs.modprueba.block.ModBlocks;
import com.marcs.modprueba.config.ModConfig;
import com.marcs.modprueba.core.proxy.ClientProxy;
import com.marcs.modprueba.crafting.ModCrafting;
import com.marcs.modprueba.creativetabs.CreativeTabModPrueba;
import com.marcs.modprueba.item.ModItems;
import com.marcs.modprueba.lib.Reference;
import com.marcs.modprueba.worldgen.WorldGeneratorPrueba;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME,version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class ModPrueba {
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static ClientProxy proxy; 
    
    public static CreativeTabs tabsMP = new CreativeTabModPrueba(CreativeTabs.getNextID(), Reference.MOD_ID);
    @PreInit
    public void preInit(FMLPreInitializationEvent event){
        //Configuracion
        ModConfig.init(event);
        
        //Contenido del MOD
        ModBlocks.init();
        ModItems.init();
        ModCrafting.init();
    }
    
    @Init
    public void init(FMLInitializationEvent event){
        proxy.registerRenders();
        //Registra el WorldGen si está activado en la configuración
        if(ModConfig.enableWorldGen) GameRegistry.registerWorldGenerator(new WorldGeneratorPrueba());
        //Nombre de las Creative Tabs
        LanguageRegistry.instance().addStringLocalization("itemGroup."+Reference.MOD_ID, "en_US", "Mod Prueba");
        LanguageRegistry.instance().addStringLocalization("itemGroup."+Reference.MOD_ID, "es_ES", "Mod de Prueba");
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event){
        
    }
}
