package com.marcs.modprueba.block;

import com.marcs.modprueba.lib.BlockIds;
import com.marcs.modprueba.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.Block;

public class ModBlocks {
    public static Block blockTest;
    public static Block blockTungstenOre;
    
    public static void init (){
        //Declarando los bloques
        blockTest = new BlockTest(BlockIds.TEST_BLOCK).setUnlocalizedName("blockTest");
        blockTungstenOre = new BlockTungstenOre(BlockIds.TUNGSTEN_ORE_BLOCK).setUnlocalizedName("blockTungstenOre");
        //Registrando en el juego
        GameRegistry.registerBlock(blockTest, "blocktest");
        GameRegistry.registerBlock(blockTungstenOre, "blocktungstenore");
        
        registerLanguage();
    
    }
    private static void registerLanguage(){
        LanguageRegistry.addName(blockTest, Strings.TESTBLOCK_NAME);
        LanguageRegistry.addName(blockTungstenOre, Strings.TUNGSTEN_ORE_BLOCK_NAME);
    }
}
