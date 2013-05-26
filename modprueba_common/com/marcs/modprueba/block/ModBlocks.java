package com.marcs.modprueba.block;

import com.marcs.modprueba.lib.BlockIds;
import com.marcs.modprueba.lib.Reference;
import com.marcs.modprueba.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.Block;

public class ModBlocks {
    public static Block blockTest;
    public static Block blockTungstenOre;
    public static Block blockTestSlab;
    public static Block blockTestSlabDouble;
    
    public static void init (){
        //Declarando los bloques
        blockTest = new BlockTest(BlockIds.TEST_BLOCK).setUnlocalizedName("blockTest");
        blockTungstenOre = new BlockTungstenOre(BlockIds.TUNGSTEN_ORE_BLOCK).setUnlocalizedName("blockTungstenOre");
        blockTestSlab = new BlockTestSlab(BlockIds.TEST_SLAB, false).setUnlocalizedName("blockTestSlab");
        blockTestSlabDouble = new BlockTestSlab(BlockIds.TEST_SLAB_DOUBLE, true).setUnlocalizedName("blockTestSlabDouble");
        //Registrando en el juego
        GameRegistry.registerBlock(blockTest, Reference.MOD_ID + blockTest.getUnlocalizedName2());
        GameRegistry.registerBlock(blockTungstenOre, Reference.MOD_ID + blockTungstenOre.getUnlocalizedName2());
        GameRegistry.registerBlock(blockTestSlab, Reference.MOD_ID + blockTestSlab.getUnlocalizedName2());
        GameRegistry.registerBlock(blockTestSlabDouble, Reference.MOD_ID + blockTestSlabDouble.getUnlocalizedName2());
        
        registerLanguage();
    
    }
    private static void registerLanguage(){
        LanguageRegistry.addName(blockTest, Strings.TESTBLOCK_NAME);
        LanguageRegistry.addName(blockTungstenOre, Strings.TUNGSTEN_ORE_BLOCK_NAME);
        LanguageRegistry.addName(blockTestSlab, Strings.TESTBLOCK_SLAB_NAME);
        LanguageRegistry.addName(blockTestSlabDouble, Strings.TESTBLOCK_SLABDOUBLE_NAME);
    }
}
