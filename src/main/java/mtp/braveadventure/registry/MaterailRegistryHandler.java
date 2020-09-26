package mtp.braveadventure.registry;

import mtp.braveadventure.Main;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class MaterailRegistryHandler {
        public static final Item.ToolMaterial BRAVE_TOOL_MATERAIL = EnumHelper.addToolMaterial("BRAVE_TOOL",2,400,7f,4f,14);
        public static final ItemArmor.ArmorMaterial BRAVE_ARMOR_MATERAIL = EnumHelper.addArmorMaterial("BRAVE_ARMOR", Main.MOD_ID + ".brave",30,new int[]{3,6,7,3},10, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0);
}
