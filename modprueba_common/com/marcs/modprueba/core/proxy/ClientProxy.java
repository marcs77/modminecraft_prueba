package com.marcs.modprueba.core.proxy;

import com.marcs.modprueba.client.renderer.RenderNukePrimed;
import com.marcs.modprueba.entity.EntityNukePrimed;
import com.marcs.modprueba.entity.EntityTomahawk;
import com.marcs.modprueba.item.ModItems;

import cpw.mods.fml.client.registry.RenderingRegistry;

import net.minecraft.client.renderer.entity.RenderSnowball;

public class ClientProxy extends CommonProxy{
    
    @Override
    public void registerRenders(){
        RenderingRegistry.registerEntityRenderingHandler(
                EntityTomahawk.class, new RenderSnowball(ModItems.tomahawk));
        
        RenderingRegistry.registerEntityRenderingHandler(
                EntityNukePrimed.class, new RenderNukePrimed());
    }
}
