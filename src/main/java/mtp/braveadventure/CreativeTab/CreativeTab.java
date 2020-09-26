package mtp.braveadventure.CreativeTab;

import mtp.braveadventure.registry.ItemRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs {
        public static final CreativeTab CREATIVE_TAB = new CreativeTab();
        @Override
        public ItemStack getTabIconItem(){
                return new ItemStack(ItemRegistryHandler.BRAVE_ORE);
        }
        public CreativeTab(){
                super("CreativeTab");
        }
}
