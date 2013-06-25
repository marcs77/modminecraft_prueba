package com.marcs.modprueba.worldgen;

import java.util.Random;

import com.marcs.modprueba.block.ModBlocks;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorPrueba implements IWorldGenerator{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        
        switch(world.provider.dimensionId){
            case 1:{
                //Nether
                generateNether(world, random, chunkX*16, chunkZ*16);
            }
            case 0:{
                //Overworld
                generateSurface(world, random, chunkX*16, chunkZ*16);
            }
            case -1:{
              //The End
                generateEnd(world, random, chunkX*16, chunkZ*16);
            }
            default:{
                generateSurface(world, random, chunkX*16, chunkZ*16);
            }
        }
    }

    private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
        // TODO Auto-generated method stub
        
    }

    private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
        // TODO Auto-generated method stub
        for (int i=0; i<5; i++){
            int xCoord = chunkX+random.nextInt(16);
            int yCoord = random.nextInt(20);
            int zCoord = chunkZ+random.nextInt(16);
            
            (new WorldGenMinable(ModBlocks.blockTungstenOre.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
        }
        for (int i=0; i<8; i++){
            int xCoord = chunkX+random.nextInt(16);
            int yCoord = random.nextInt(40);
            int zCoord = chunkZ+random.nextInt(16);
            
            (new WorldGenMinable(ModBlocks.blockBismuthOre.blockID, 9)).generate(world, random, xCoord, yCoord, zCoord);
        }
    }

    private void generateNether(World world, Random random, int chunkX,
            int chunkZ) {
        // TODO Auto-generated method stub
        
    }

}
