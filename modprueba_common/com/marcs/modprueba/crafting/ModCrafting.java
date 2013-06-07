package com.marcs.modprueba.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.marcs.modprueba.block.ModBlocks;
import com.marcs.modprueba.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModCrafting {
    public static void init(){
        /**
         * Shaped Crafting
         */
        //9xNuggets -> 1xIngot
        GameRegistry.addRecipe(new ItemStack(ModItems.bismuthIngot), new Object[] { "sss", "sss", "sss",
            Character.valueOf('s'), ModItems.bismuthNugget});
        //4xBismuthN + 1xBrick -> 1BismuthBrick
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockBismuthBrick), new Object[] { " i ", "ibi", " i ",
            Character.valueOf('i'), ModItems.bismuthNugget,
            Character.valueOf('b'), Block.stoneBrick
            });
        //EnchantingDust
        GameRegistry.addRecipe(new ItemStack(ModItems.enchantingDust,32), new Object[] { "tdt", "xbx", "txt",
            Character.valueOf('b'), ModItems.bismuthDust,
            Character.valueOf('t'), ModItems.tungstenDust,
            Character.valueOf('d'), Item.diamond,
            Character.valueOf('x'), Item.expBottle});
        
        /**
         * Shapeless Crafting 
         */
        //1xIngot -> 9xNuggets
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bismuthNugget,9), new Object[]{
            new ItemStack(ModItems.bismuthIngot)
        });
        //Brick+Dye -> Dyed Brick
        for (int i=0;i<16;i++){
            ItemStack brickd = new ItemStack(ModBlocks.blockBrickDyed,1,i);
            ItemStack brick = new ItemStack(ModBlocks.blockBismuthBrick,1);
            ItemStack dye = new ItemStack(Item.dyePowder,1,15-i);
            
            GameRegistry.addShapelessRecipe(brickd,brick,dye);
        }
        //Bismuth Ingot -> Bismuth Dust
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bismuthDust,1), new Object[]{
            new ItemStack(ModItems.bismuthIngot)
        });
        /**
         * Smelting
         */
        //1xBismuthOre = 1xIngot
        GameRegistry.addSmelting(ModBlocks.blockBismuthOre.blockID, new ItemStack(ModItems.bismuthIngot), 0.7F);

    }
}
