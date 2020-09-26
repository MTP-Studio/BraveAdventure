package mtp.braveadventure.registry;

import mtp.braveadventure.block.BraveBlock;
import mtp.braveadventure.block.BraveOre;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class BlockRegistryHandler {
        public static final BraveOre BRAVE_ORE = new BraveOre();
        public static final BraveBlock BRAVE_BLOCK = new BraveBlock();

        @SubscribeEvent
        public  static void onRegistry(RegistryEvent.Register<Block> event){
                IForgeRegistry<Block> registry = event.getRegistry();
                registry.register(BRAVE_ORE);
                registry.register(BRAVE_BLOCK);
        }
}
