package com.marcs.modprueba.block;

import com.marcs.modprueba.lib.BlockIds;
import com.marcs.modprueba.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.Block;

public class ModBlocks {
    public static Block blockTest;
    
    public static void init (){
        //Declarando los bloques
        blockTest = new BlockTest(BlockIds.TESTBLOCK).setUnlocalizedName("tileBlockTest");
        //Registrando en el juego
        GameRegistry.registerBlock(blockTest, "blocktest");
        
        registerLanguage();
    
    }
    private static void registerLanguage(){
        LanguageRegistry.addName(blockTest, Strings.TESTBLOCK_NAME);
    }
}
