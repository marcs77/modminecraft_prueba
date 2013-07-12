package com.marcs.modprueba.crafting;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;

import com.marcs.modprueba.block.ModBlocks;
import com.marcs.modprueba.item.ModItems;
import com.marcs.modprueba.lib.Strings;

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
    public static final int lvlSword[] = {1,2,1,3,3,2,2,2};
    //Bow
    public static final Object modifierBow[] = {Block.blockGold, Item.fireballCharge,
        Block.blockRedstone, Item.diamond, Item.netherQuartz};
    public static final Enchantment enchantmentBow[] = {Enchantment.infinity, Enchantment.flame, 
        Enchantment.punch, Enchantment.power, Enchantment.unbreaking};
    public static final int lvlBow[] = {1,1,3,3,1};
    //Armor
    public static final Object modifierArmor[] = {Item.diamond, Item.bucketLava,
        Item.feather, Block.obsidian, Item.arrow, Item.fishRaw, Item.bucketWater, Block.cactus, Block.blockIron};
    public static final Enchantment enchantmentArmor[] = {Enchantment.protection, Enchantment.fireProtection, 
        Enchantment.featherFalling, Enchantment.blastProtection, Enchantment.projectileProtection, Enchantment.respiration, 
        Enchantment.aquaAffinity, Enchantment.thorns, Enchantment.unbreaking};
    public static final int lvlArmor[] = {2,2,2,2,2,2,2,2,2};
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
        GameRegistry.addRecipe(new ItemStack(ModItems.enchantingDust, 14), new Object[] { "tdt", "xbx", "txt",
            Character.valueOf('b'), ModItems.bismuthDust,
            Character.valueOf('t'), ModItems.tungstenDust,
            Character.valueOf('d'), Item.diamond,
            Character.valueOf('x'), Item.expBottle});
        //Pico de bismuto
        GameRegistry.addRecipe(new ItemStack(ModItems.bismuthPickaxe), new Object[] { "bbb", " s ", " s ",
            Character.valueOf('b'), ModItems.bismuthIngot,
            Character.valueOf('s'), Item.stick});
        //Hacha de bismuto
        GameRegistry.addRecipe(new ItemStack(ModItems.bismuthAxe), new Object[] { " bb", " sb", " s ",
            Character.valueOf('b'), ModItems.bismuthIngot,
            Character.valueOf('s'), Item.stick});
        //Pala de bismuto
        GameRegistry.addRecipe(new ItemStack(ModItems.bismuthShovel), new Object[] { " b ", " s ", " s ",
            Character.valueOf('b'), ModItems.bismuthIngot,
            Character.valueOf('s'), Item.stick});
        //Hazada de bismuto
        GameRegistry.addRecipe(new ItemStack(ModItems.bismuthHoe), new Object[] { " bb", " s ", " s ",
            Character.valueOf('b'), ModItems.bismuthIngot,
            Character.valueOf('s'), Item.stick});
        
        /** Armaduras **/
        //Bismuth
        GameRegistry.addRecipe(new ItemStack(ModItems.bismuthHelmet), new Object[] { "bsb", "b b", "   ",
            Character.valueOf('b'), ModItems.bismuthIngot,
            Character.valueOf('s'), Item.ingotIron});
        GameRegistry.addRecipe(new ItemStack(ModItems.bismuthPlate), new Object[] { "b b", "bsb", "bbb",
            Character.valueOf('b'), ModItems.bismuthIngot,
            Character.valueOf('s'), Item.ingotIron});
        GameRegistry.addRecipe(new ItemStack(ModItems.bismuthLegs), new Object[] { "bsb", "b b", "b b",
            Character.valueOf('b'), ModItems.bismuthIngot,
            Character.valueOf('s'), Item.ingotIron});
        GameRegistry.addRecipe(new ItemStack(ModItems.bismuthBoots), new Object[] { "b b", "bsb",
            Character.valueOf('b'), ModItems.bismuthIngot,
            Character.valueOf('s'), Item.ingotIron});
        
        /**Enchants**/
        //Tools //Diamond
        addEnchantableItem(Item.pickaxeDiamond, modifiers, enchantments, lvls);
        addEnchantableItem(Item.axeDiamond, modifiers, enchantments, lvls);
        addEnchantableItem(Item.shovelDiamond, modifiers, enchantments, lvls);
        addEnchantableItem(Item.hoeDiamond, modifiers, enchantments, lvls);
        //Gold
        addEnchantableItem(Item.pickaxeGold, modifiers, enchantments, lvls);
        addEnchantableItem(Item.axeGold, modifiers, enchantments, lvls);
        addEnchantableItem(Item.shovelGold, modifiers, enchantments, lvls);
        addEnchantableItem(Item.hoeGold, modifiers, enchantments, lvls);
        //Iron
        addEnchantableItem(Item.pickaxeIron, modifiers, enchantments, lvls);
        addEnchantableItem(Item.axeIron, modifiers, enchantments, lvls);
        addEnchantableItem(Item.shovelIron, modifiers, enchantments, lvls);
        addEnchantableItem(Item.hoeIron, modifiers, enchantments, lvls);
        //Bismuth
        addEnchantableItem(ModItems.bismuthPickaxe, modifiers, enchantments, lvls);
        addEnchantableItem(ModItems.bismuthAxe, modifiers, enchantments, lvls);
        addEnchantableItem(ModItems.bismuthShovel, modifiers, enchantments, lvls);
        addEnchantableItem(ModItems.bismuthHoe, modifiers, enchantments, lvls);
        //Swords
        addEnchantableItem(Item.swordDiamond, modifierSword, enchantmentSword, lvlSword);
        addEnchantableItem(Item.swordIron, modifierSword, enchantmentSword, lvlSword);
        addEnchantableItem(Item.swordGold, modifierSword, enchantmentSword, lvlSword);
        //Bows
        addEnchantableItem(Item.bow, modifierBow, enchantmentBow, lvlBow);
        
        //Armor // Diamond
        addEnchantableItem(Item.helmetDiamond, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(Item.plateDiamond, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(Item.legsDiamond, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(Item.bootsDiamond, modifierArmor, enchantmentArmor, lvlArmor);
        //Gold
        addEnchantableItem(Item.helmetGold, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(Item.plateGold, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(Item.legsGold, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(Item.bootsGold, modifierArmor, enchantmentArmor, lvlArmor);
        //Iron
        addEnchantableItem(Item.helmetIron, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(Item.plateIron, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(Item.legsIron, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(Item.bootsIron, modifierArmor, enchantmentArmor, lvlArmor);
        //Chain
        addEnchantableItem(Item.helmetChain, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(Item.plateChain, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(Item.legsChain, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(Item.bootsChain, modifierArmor, enchantmentArmor, lvlArmor);
        //Leather
        addEnchantableItem(Item.helmetLeather, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(Item.plateLeather, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(Item.legsLeather, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(Item.bootsLeather, modifierArmor, enchantmentArmor, lvlArmor);
        //Bismuth
        addEnchantableItem(ModItems.bismuthHelmet, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(ModItems.bismuthPlate, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(ModItems.bismuthLegs, modifierArmor, enchantmentArmor, lvlArmor);
        addEnchantableItem(ModItems.bismuthBoots, modifierArmor, enchantmentArmor, lvlArmor);
        
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
        
        ItemStack book = new ItemStack(Item.writableBook);
        NBTTagList pages = new NBTTagList("pages");
        pages.appendTag(new NBTTagString("1", Strings.BOOK_PAGES[0]));
        pages.appendTag(new NBTTagString("2", "udsfsdsdfsdfsdfsdfsdf"));
        book.setTagInfo("pages", pages);
        book.setTagInfo("author", new NBTTagString("author",Strings.BOOK_AUTHOR));
        book.setTagInfo("title", new NBTTagString("title",Strings.BOOK_TITLE));
        book.itemID = Item.writtenBook.itemID;
        
        GameRegistry.addShapelessRecipe(book, new Object[]{
                Item.book, new ItemStack(Item.dyePowder, 1, 12)
        });
        /**
         * Smelting
         */
        //1xBismuthOre = 1xIngot
        GameRegistry.addSmelting(ModBlocks.blockBismuthOre.blockID, new ItemStack(ModItems.bismuthIngot), 0.7F);

    }
    public static void addEnchantableItem(Item tool, Object mods[], Enchantment[] enc, int[] l){
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
