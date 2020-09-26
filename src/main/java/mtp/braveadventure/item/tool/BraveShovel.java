package mtp.braveadventure.item.tool;

import mtp.braveadventure.CreativeTab.CreativeTab;
import mtp.braveadventure.Main;
import mtp.braveadventure.registry.MaterailRegistryHandler;
import net.minecraft.item.ItemSpade;

public class BraveShovel extends ItemSpade {
        public BraveShovel(){
                super(MaterailRegistryHandler.BRAVE_TOOL_MATERAIL);
                this.setRegistryName("brave_shovel");
                this.setUnlocalizedName(Main.MOD_ID + ".BraveShovel");
                this.setCreativeTab(CreativeTab.CREATIVE_TAB);
        }
}
