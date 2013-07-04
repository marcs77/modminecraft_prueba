package com.marcs.modprueba.entity;

import com.marcs.modprueba.config.ModConfig;
import com.marcs.modprueba.item.ModItems;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityTomahawk extends EntityThrowable{

    public EntityTomahawk(World par1World) {
        super(par1World);
    }

    public EntityTomahawk(World par1World, EntityLiving par2EntityLiving) {
        super(par1World, par2EntityLiving);
    }

    public EntityTomahawk(World par1World, double par2, double par4, double par6) {
        super(par1World, par2, par4, par6);
    }

    /**
    * Called when this EntityThrowable hits a block or entity.
    */
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
        if (par1MovingObjectPosition.entityHit != null) {
            byte b0 = (byte) ModConfig.tomahawkMobDamage;
            
            if (par1MovingObjectPosition.entityHit instanceof EntityPlayer){
                b0 = (byte) ModConfig.tomahawkPlayerDamage;
            }
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), b0);
        }
        if (!this.worldObj.isRemote) {
            this.setDead();
        }
        this.worldObj.spawnEntityInWorld(new EntityItem(this.worldObj, this.posX, this.posY+1, this.posZ, new ItemStack(ModItems.tomahawk)));
    }


}
