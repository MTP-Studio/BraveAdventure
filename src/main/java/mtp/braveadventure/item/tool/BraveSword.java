package mtp.braveadventure.item.tool;

import mtp.braveadventure.CreativeTab.CreativeTab;
import mtp.braveadventure.Main;
import mtp.braveadventure.registry.MaterailRegistryHandler;
import net.minecraft.item.ItemSword;

public class BraveSword extends ItemSword {
        public BraveSword(){
                super(MaterailRegistryHandler.BRAVE_TOOL_MATERAIL);
                this.setRegistryName("brave_sword");
                this.setUnlocalizedName(Main.MOD_ID + ".BraveSword");
                this.setCreativeTab(CreativeTab.CREATIVE_TAB);
        }
}
