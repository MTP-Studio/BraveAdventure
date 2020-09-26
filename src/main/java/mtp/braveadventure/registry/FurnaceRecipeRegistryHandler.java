package mtp.braveadventure.registry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipeRegistryHandler {
        public static void register(){
                GameRegistry.addSmelting(ItemRegistryHandler.BRAVE_ORE,new ItemStack(ItemRegistryHandler.BRAVE_INGOT),0.5f);
        }
}
