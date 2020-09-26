package mtp.braveadventure.item.tool;

import mtp.braveadventure.CreativeTab.CreativeTab;
import mtp.braveadventure.Main;
import mtp.braveadventure.registry.MaterailRegistryHandler;
import net.minecraft.item.ItemPickaxe;

public class BravePickaxe extends ItemPickaxe {
        public BravePickaxe(){
                super(MaterailRegistryHandler.BRAVE_TOOL_MATERAIL);
                this.setRegistryName("brave_pickaxe");
                this.setUnlocalizedName(Main.MOD_ID + ".BravePickaxe");
                this.setCreativeTab(CreativeTab.CREATIVE_TAB);
        }
}
