package com.marcs.modprueba.crafting;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.marcs.modprueba.block.ModBlocks;
import com.marcs.modprueba.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModCrafting {
    //Tools
    public static final Object modifiers[] = {Block.blockGold, Block.blockRedstone,
        Item.diamond, Item.emerald, Block.cloth};
    public static final Enchantment enchantments[] = {Enchantment.fortune, Enchantment.efficiency, 
        Enchantment.unbreaking, Enchantment.fortune, Enchantment.silkTouch};
    public static final int lvls[] = {1,2,2,3,1};
    //Swords
    public static final Object modifierSword[] = {Block.blockGold, Item.diamond,
        Item.flintAndSteel, Block.blockRedstone, Item.emerald, Item.spiderEye, Item.bone, Item.netherQuartz};
    public static final Enchantment enchantmentSword[] = {Enchantment.looting, Enchantment.sharpness, 
        Enchantment.fireAspect, Enchantment.knockback, Enchantment.looting, Enchantment.baneOfArthropods, Enchantment.smite, Enchantment.unbreaking};
    public static final int lvlSword[] = {1,2,1,3,3,2,2};
    //Bow
    public static final Object modifierBow[] = {Block.blockGold, Item.fireballCharge,
        Block.blockRedstone, Item.diamond, Item.netherQuartz};
    public static final Enchantment enchantmentBow[] = {Enchantment.infinity, Enchantment.flame, 
        Enchantment.punch, Enchantment.power, Enchantment.unbreaking};
    public static final int lvlBow[] = {1,1,3,3,1};
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
        //Tools
        addEnchantableTool(Item.pickaxeDiamond, modifiers, enchantments, lvls);
        addEnchantableTool(Item.axeDiamond, modifiers, enchantments, lvls);
        addEnchantableTool(Item.shovelDiamond, modifiers, enchantments, lvls);
        addEnchantableTool(Item.hoeDiamond, modifiers, enchantments, lvls);
        addEnchantableTool(Item.pickaxeGold, modifiers, enchantments, lvls);
        addEnchantableTool(Item.axeGold, modifiers, enchantments, lvls);
        addEnchantableTool(Item.shovelGold, modifiers, enchantments, lvls);
        addEnchantableTool(Item.hoeGold, modifiers, enchantments, lvls);
        addEnchantableTool(Item.pickaxeIron, modifiers, enchantments, lvls);
        addEnchantableTool(Item.axeIron, modifiers, enchantments, lvls);
        addEnchantableTool(Item.shovelIron, modifiers, enchantments, lvls);
        addEnchantableTool(Item.hoeIron, modifiers, enchantments, lvls);
        //Swords
        addEnchantableTool(Item.swordDiamond, modifierSword, enchantmentSword, lvlSword);
        addEnchantableTool(Item.swordIron, modifierSword, enchantmentSword, lvlSword);
        addEnchantableTool(Item.swordGold, modifierSword, enchantmentSword, lvlSword);
        //Bows
        addEnchantableTool(Item.swordGold, modifierBow, enchantmentBow, lvlBow);
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
    public static void addEnchantableTool(Item tool, Object mods[], Enchantment[] enc, int[] l){
        for (int i = 0; i<mods.length; i++){
            ItemStack toolEnc = new ItemStack(tool,1,0);
            Enchantment e = enc[i];
            int lv = l[i];
            ItemStack tl =  toolEnc;
            toolEnc.addEnchantment(e, lv);
            GameRegistry.addRecipe(toolEnc, new Object[]{
                    "dmd","dtd","ddd",
                    Character.valueOf('d'), ModItems.enchantingDust,
                    Character.valueOf('t'), tl,
                    Character.valueOf('m'), mods[i]
                    });
        }
    }
}
