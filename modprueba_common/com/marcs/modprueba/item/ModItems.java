package com.marcs.modprueba.item;

import com.marcs.modprueba.lib.ItemIds;
import com.marcs.modprueba.lib.Strings;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class ModItems {
    public static Item pastacion;

    
    public static void init(){
        //Declarando Items
        pastacion = new ItemPastacion(ItemIds.PASTACION).setUnlocalizedName("itemPastacion");
        
        registerLanguage();

    }
    
    public static void registerLanguage(){
        LanguageRegistry.addName(pastacion, Strings.PASTACION_NAME);
       
    }
    
}
