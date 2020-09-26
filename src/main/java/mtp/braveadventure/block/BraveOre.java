package mtp.braveadventure.block;

import mtp.braveadventure.CreativeTab.CreativeTab;
import mtp.braveadventure.Main;
import mtp.braveadventure.registry.ItemRegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BraveOre extends Block {
        public BraveOre() {
                super(Material.ROCK);
                this.setRegistryName("brave_ore");
                this.setUnlocalizedName(Main.MOD_ID + ".BraveOre");
                this.setHarvestLevel("pickaxe",1);
                this.setHardness(4);
                this.setCreativeTab(CreativeTab.CREATIVE_TAB);
        }
        @Override
        public Item getItemDropped(IBlockState state, Random rand,int fortune){
               return ItemRegistryHandler.BRAVE_ORE;
        }
}
