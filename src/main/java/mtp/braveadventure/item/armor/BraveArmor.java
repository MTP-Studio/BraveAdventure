package mtp.braveadventure.item.armor;

import mtp.braveadventure.CreativeTab.CreativeTab;
import mtp.braveadventure.Main;
import mtp.braveadventure.registry.MaterailRegistryHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class BraveArmor extends ItemArmor {
        public BraveArmor(EntityEquipmentSlot equipmentSlotIn){
                super(MaterailRegistryHandler.BRAVE_ARMOR_MATERAIL,0,equipmentSlotIn);
                this.setUnlocalizedName(Main.MOD_ID + ".BraveArmor." + equipmentSlotIn.getName());
                this.setRegistryName("brave_armor_" + equipmentSlotIn.getName());
                this.setCreativeTab(CreativeTab.CREATIVE_TAB);
        }
}
