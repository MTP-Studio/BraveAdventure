package mtp.braveadventure.world;

import mtp.braveadventure.registry.BlockRegistryHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModWorldGen implements IWorldGenerator {
        @Override
        public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
                if (world.provider.getDimension() == 0){
                        generateOverworld(rand, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
                }
        }
        private  void generateOverworld(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
                generateOre(BlockRegistryHandler.BRAVE_ORE.getDefaultState(),world,rand,chunkX*16,chunkZ*16,1,64,rand.nextInt(8)+1,150);
        }
        private void generateOre(IBlockState ore,World world,Random rand,int x,int z,int minY,int maxY,int size,int chances){
                int deltaY = maxY - minY;
                for (int i = 0;i < chances;i++){
                        BlockPos pos = new BlockPos(x + rand.nextInt(16),minY + rand.nextInt(deltaY),z + rand.nextInt(16));
                        WorldGenerator generator = new WorldGenMinable(ore,size);
                        generator.generate(world,rand,pos);
                }
        }
}
