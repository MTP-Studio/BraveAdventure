package mtp.braveadventure.block;

import mtp.braveadventure.CreativeTab.CreativeTab;
import mtp.braveadventure.Main;
import mtp.braveadventure.registry.ItemRegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BraveBlock extends Block {
        public BraveBlock(){
                super(Material.IRON);
                this.setRegistryName("brave_block");
                this.setUnlocalizedName(Main.MOD_ID + ".BraveBlock");
                this.setCreativeTab(CreativeTab.CREATIVE_TAB);
                this.setHarvestLevel("pickaxe",1);
                this.setHardness(4.5f);
        }
        @Override
        public Item getItemDropped(IBlockState state, Random rand, int fortune){
                return ItemRegistryHandler.BRAVE_BLOCK;
        }
}
