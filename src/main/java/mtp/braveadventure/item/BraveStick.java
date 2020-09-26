package mtp.braveadventure.item;

import mtp.braveadventure.CreativeTab.CreativeTab;
import mtp.braveadventure.Main;
import net.minecraft.item.Item;

public class BraveStick extends Item {
        public BraveStick(){
                this.setRegistryName("brave_stick");
                this.setUnlocalizedName(Main.MOD_ID + ".BraveStick");
                this.setMaxStackSize(64);
                this.setCreativeTab(CreativeTab.CREATIVE_TAB);
        }
}
