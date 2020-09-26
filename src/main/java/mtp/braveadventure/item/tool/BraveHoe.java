package mtp.braveadventure.item.tool;

import mtp.braveadventure.CreativeTab.CreativeTab;
import mtp.braveadventure.Main;
import mtp.braveadventure.registry.MaterailRegistryHandler;
import net.minecraft.item.ItemHoe;

public class BraveHoe extends ItemHoe {
        public BraveHoe(){
                super(MaterailRegistryHandler.BRAVE_TOOL_MATERAIL);
                this.setRegistryName("brave_hoe");
                this.setUnlocalizedName(Main.MOD_ID + ".BraveHoe");
                this.setCreativeTab(CreativeTab.CREATIVE_TAB);

        }
}
