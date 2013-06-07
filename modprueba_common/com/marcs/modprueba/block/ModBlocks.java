package com.marcs.modprueba.block;

import com.marcs.modprueba.lib.BlockIds;
import com.marcs.modprueba.lib.Reference;
import com.marcs.modprueba.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ModBlocks {
    //public static Block blockTungstenOre;

    
    public static void init (){
        //Declarando los bloques
        //blockTungstenOre = new BlockTungstenOre(BlockIds.TUNGSTEN_ORE_BLOCK).setUnlocalizedName("blockTungstenOre");
        
        //Registrando en el juego
        //GameRegistry.registerBlock(blockTungstenOre, Reference.MOD_ID + blockTungstenOre.getUnlocalizedName2());
        
        registerLanguage();
    
    }
    private static void registerLanguage(){
        //LanguageRegistry.addName(blockTungstenOre, Strings.TUNGSTEN_ORE_BLOCK_NAME);
    }
}
