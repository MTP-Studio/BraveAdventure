package mtp.braveadventure.registry;

import mtp.braveadventure.item.BraveIngot;
import mtp.braveadventure.item.BraveStick;
import mtp.braveadventure.item.armor.BraveArmor;
import mtp.braveadventure.item.tool.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class ItemRegistryHandler {
        public static final BraveIngot BRAVE_INGOT = new BraveIngot();
        public static final BraveStick BRAVE_STICK = new BraveStick();

        public static final ItemBlock BRAVE_ORE = withRegistryName(new ItemBlock(BlockRegistryHandler.BRAVE_ORE));
        public static final ItemBlock BRAVE_BLOCK = withRegistryName(new ItemBlock(BlockRegistryHandler.BRAVE_BLOCK));

        public static final BraveShovel BRAVE_SHOVEL = new BraveShovel();
        public static final BraveHoe BRAVE_HOE = new BraveHoe();
        public static final BraveAxe BRAVE_AXE = new BraveAxe();
        public static final BravePickaxe BRAVE_PICKAXE = new BravePickaxe();
        public static final BraveSword BRAVE_SWORD = new BraveSword();

        public static final BraveArmor BRAVE_BOOTS = new BraveArmor(EntityEquipmentSlot.FEET);
        public static final BraveArmor BRAVE_LEGGINGS = new BraveArmor(EntityEquipmentSlot.LEGS);
        public static final BraveArmor BRAVE_CHESTPLATE = new BraveArmor(EntityEquipmentSlot.CHEST);
        public static final BraveArmor BRAVE_HELMET = new BraveArmor(EntityEquipmentSlot.HEAD);

        @SubscribeEvent
        public static void onRegistry(RegistryEvent.Register<Item> event){
                IForgeRegistry<Item> registry = event.getRegistry();
                registry.register(BRAVE_ORE);
                registry.register(BRAVE_INGOT);
                registry.register(BRAVE_BLOCK);
                registry.register(BRAVE_STICK);
                registry.register(BRAVE_SHOVEL);
                registry.register(BRAVE_HOE);
                registry.register(BRAVE_AXE);
                registry.register(BRAVE_PICKAXE);
                registry.register(BRAVE_SWORD);
                registry.register(BRAVE_BOOTS);
                registry.register(BRAVE_LEGGINGS);
                registry.register(BRAVE_CHESTPLATE);
                registry.register(BRAVE_HELMET);
        }
        @SideOnly(Side.CLIENT)
        @SubscribeEvent
        public static void onModelRegistry(ModelRegistryEvent event){
                registryModel(BRAVE_ORE);
                registryModel(BRAVE_INGOT);
                registryModel(BRAVE_BLOCK);
                registryModel(BRAVE_STICK);
                registryModel(BRAVE_SHOVEL);
                registryModel(BRAVE_HOE);
                registryModel(BRAVE_AXE);
                registryModel(BRAVE_PICKAXE);
                registryModel(BRAVE_SWORD);
                registryModel(BRAVE_BOOTS);
                registryModel(BRAVE_LEGGINGS);
                registryModel(BRAVE_CHESTPLATE);
                registryModel(BRAVE_HELMET);
        }


        @SideOnly(Side.CLIENT)
        private static void registryModel(Item item){
                ModelResourceLocation modelResourceLocation = new ModelResourceLocation(item.getRegistryName(),"inventory");
                ModelLoader.setCustomModelResourceLocation(item,0,modelResourceLocation);
        }
        private static ItemBlock withRegistryName(ItemBlock item){
                item.setRegistryName(item.getBlock().getRegistryName());
                return item;
        }
}
