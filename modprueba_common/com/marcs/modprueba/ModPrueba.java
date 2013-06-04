package com.marcs.modprueba;

import com.marcs.modprueba.block.ModBlocks;
import com.marcs.modprueba.core.proxy.ClientProxy;
import com.marcs.modprueba.crafting.ModCrafting;
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

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME,version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class ModPrueba {
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static ClientProxy proxy; 
    @PreInit
    public void preInit(FMLPreInitializationEvent event){
        ModBlocks.init();
        ModItems.init();
        ModCrafting.init();
    }
    
    @Init
    public void init(FMLInitializationEvent event){
        proxy.registerRenders();
        GameRegistry.registerWorldGenerator(new WorldGeneratorPrueba());
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event){
        
    }
}
