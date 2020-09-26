package mtp.braveadventure.item;

import mtp.braveadventure.CreativeTab.CreativeTab;
import mtp.braveadventure.Main;
import net.minecraft.item.Item;

public class BraveIngot extends Item {
        public BraveIngot(){
                this.setUnlocalizedName(Main.MOD_ID + ".BraveIngot");
                this.setRegistryName("brave_ingot");
                this.setMaxStackSize(64);
                this.setCreativeTab(CreativeTab.CREATIVE_TAB);
        }
}
