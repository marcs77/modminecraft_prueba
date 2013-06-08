package com.marcs.modprueba.crafting;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.marcs.modprueba.block.ModBlocks;
import com.marcs.modprueba.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModCrafting {
    public static final Object modifiers[] = {Block.blockGold, Block.blockRedstone,
        Item.diamond, Item.emerald, Block.cloth};
    public static final Enchantment enchantments[] = {Enchantment.fortune, Enchantment.efficiency, 
        Enchantment.unbreaking, Enchantment.fortune, Enchantment.silkTouch};
    public static final int lvls[] = {1,2,2,3,1};
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
        //Enchants
        //Diamond
        addEnchantableTool(Item.pickaxeDiamond);
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
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bismuthDust,8), new Object[]{
            new ItemStack(ModItems.bismuthIngot), new ItemStack(ModItems.bismuthIngot),
            new ItemStack(ModItems.bismuthIngot),new ItemStack(ModItems.bismuthIngot),
            new ItemStack(ModItems.bismuthIngot),new ItemStack(ModItems.bismuthIngot),
            new ItemStack(ModItems.bismuthIngot),new ItemStack(ModItems.bismuthIngot), new ItemStack(Item.flint)
        });
        /**
         * Smelting
         */
        //1xBismuthOre = 1xIngot
        GameRegistry.addSmelting(ModBlocks.blockBismuthOre.blockID, new ItemStack(ModItems.bismuthIngot), 0.7F);

    }
    public static void addEnchantableTool(Item tool){
        for (int i = 0; i<5; i++){
            ItemStack toolEnc = new ItemStack(tool,1,0);
            Enchantment e = enchantments[i];
            int lv = lvls[i];
            ItemStack tl =  toolEnc;
            toolEnc.addEnchantment(e, lv);
            GameRegistry.addRecipe(toolEnc, new Object[]{
                    "dmd","dtd","ddd",
                    Character.valueOf('d'), ModItems.enchantingDust,
                    Character.valueOf('t'), tl,
                    Character.valueOf('m'), modifiers[i]
                    });
        }
    }
}
