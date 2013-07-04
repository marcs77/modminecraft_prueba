package com.marcs.modprueba.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import com.marcs.modprueba.ModPrueba;
import com.marcs.modprueba.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBismuthBrick extends Block{
    public BlockBismuthBrick(int id){
        super(id, Material.rock);
        this.setCreativeTab(ModPrueba.tabsMP);
        this.setResistance(10.0F);
        this.setHardness(6.0F);
    }
    @SideOnly(Side.CLIENT)
    public void registerIcons (IconRegister reg){
        this.blockIcon = reg.registerIcon(Reference.MOD_ID.toLowerCase()+":"+this.getUnlocalizedName2());
    }
}

