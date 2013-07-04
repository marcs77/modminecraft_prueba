package com.marcs.modprueba.block;

import com.marcs.modprueba.lib.BlockIds;
import com.marcs.modprueba.lib.Reference;
import com.marcs.modprueba.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class ModBlocks {
    public static Block blockTungstenOre;
    public static Block blockTestSlab;
    public static Block blockTestSlabDouble;
    public static Block blockBismuthOre;
    public static Block blockBismuthBrick;
    public static Block blockBrickDyed;
    public static Block blockNuke;
    
    public static void init (){
        //Declarando los bloques
        blockTungstenOre = new BlockTungstenOre(BlockIds.TUNGSTEN_ORE_BLOCK).setUnlocalizedName("blockTungstenOre");
        blockTestSlab = new BlockTestSlab(BlockIds.TEST_SLAB, false).setUnlocalizedName("blockTestSlab");
        blockTestSlabDouble = new BlockTestSlab(BlockIds.TEST_SLAB_DOUBLE, true).setUnlocalizedName("blockTestSlabDouble");
        blockBismuthOre = new BlockBismuthOre(BlockIds.BISMUTH_ORE_BLOCK).setUnlocalizedName("blockBismuthOre");
        blockBismuthBrick = new BlockBismuthBrick(BlockIds.BISMUTH_BRICK).setUnlocalizedName("blockBismuthBrick");
        //Ladrillos tintados
        blockBrickDyed = new BlockBrickDyed(BlockIds.BISMUTH_BRICK_DYED).setUnlocalizedName("blockBrickDyed");
        //Nuke
        blockNuke = new BlockNuke(BlockIds.NUKE).setUnlocalizedName("blockNuke");
        
        //Registrando en el juego
        GameRegistry.registerBlock(blockTungstenOre, Reference.MOD_ID + blockTungstenOre.getUnlocalizedName2());
        GameRegistry.registerBlock(blockTestSlab, Reference.MOD_ID + blockTestSlab.getUnlocalizedName2());
        GameRegistry.registerBlock(blockTestSlabDouble, Reference.MOD_ID + blockTestSlabDouble.getUnlocalizedName2());
        GameRegistry.registerBlock(blockBismuthOre, Reference.MOD_ID + blockBismuthOre.getUnlocalizedName2());
        GameRegistry.registerBlock(blockBismuthBrick, Reference.MOD_ID + blockBismuthBrick.getUnlocalizedName2());
        GameRegistry.registerBlock(blockBrickDyed, ItemBlockBrickDyed.class, Reference.MOD_ID + blockBrickDyed.getUnlocalizedName2());
        GameRegistry.registerBlock(blockNuke, Reference.MOD_ID + blockNuke.getUnlocalizedName2());
        
        //Harvest levels
        MinecraftForge.setBlockHarvestLevel(blockTungstenOre, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(blockBismuthOre, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(blockBismuthBrick, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(blockBrickDyed, "pickaxe", 1);
        
        registerLanguage();
    
    }
    private static void registerLanguage(){
        LanguageRegistry.addName(blockTungstenOre, Strings.TUNGSTEN_ORE_BLOCK_NAME);
        LanguageRegistry.addName(blockTestSlab, Strings.TESTBLOCK_SLAB_NAME);
        LanguageRegistry.addName(blockTestSlabDouble, Strings.TESTBLOCK_SLABDOUBLE_NAME);
        LanguageRegistry.addName(blockBismuthOre, Strings.BISMUTH_ORE_BLOCK_NAME);
        LanguageRegistry.addName(blockBismuthBrick, Strings.BISMUTHBRICK_NAME);
        LanguageRegistry.addName(blockNuke, Strings.NUKE_NAME);
        //Dyed Bricks
        for (int i=0; i<16; i++){
            ItemStack brickDyed = new ItemStack(blockBrickDyed,1,i);
            LanguageRegistry.addName(brickDyed, Strings.BISMUTHBRICK_NAME+" "+Strings.COLORS_LOC[i]);
        }
    }
}
