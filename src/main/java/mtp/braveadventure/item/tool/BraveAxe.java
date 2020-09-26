package mtp.braveadventure.item.tool;

import mtp.braveadventure.CreativeTab.CreativeTab;
import mtp.braveadventure.Main;
import mtp.braveadventure.registry.MaterailRegistryHandler;
import net.minecraft.item.ItemAxe;

public class BraveAxe extends ItemAxe {
        public BraveAxe(){
                super(MaterailRegistryHandler.BRAVE_TOOL_MATERAIL,10,-3f);
                this.setRegistryName("brave_axe");
                this.setUnlocalizedName(Main.MOD_ID + ".BraveAxe");
                this.setCreativeTab(CreativeTab.CREATIVE_TAB);
        }
}
