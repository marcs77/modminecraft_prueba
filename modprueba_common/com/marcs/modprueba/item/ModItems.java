package com.marcs.modprueba.item;

import com.marcs.modprueba.lib.ItemIds;
import com.marcs.modprueba.lib.Strings;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class ModItems {

    public static Item tutorialItem;
    public static Item tungstenDust;
    
    public static void init(){
        tutorialItem = new ItemTest(ItemIds.TEST_ITEM).setUnlocalizedName("itemTest");
        tungstenDust = new ItemTungstenDust(ItemIds.TUNGSTEN_DUST).setUnlocalizedName("itemTungstenDust");
        registerLanguage();
    }
    
    public static void registerLanguage(){
        LanguageRegistry.addName(tutorialItem, Strings.TESTITEM_NAME);
        LanguageRegistry.addName(tungstenDust, Strings.TUNGSTENDUST_NAME);
    }
}
