package mtp.braveadventure;

import mtp.braveadventure.registry.FurnaceRecipeRegistryHandler;
import mtp.braveadventure.world.ModWorldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = Main.MOD_ID,name = Main.NAME,version = Main.VERSION,acceptedMinecraftVersions = Main.ACCEPT_MINECRAFT_VERSION)
public class Main {
        public static final String MOD_ID = "braveadventure";
        public static final String VERSION = "1.0.0";
        public static final String NAME = "BraveAdventure";
        public static final String ACCEPT_MINECRAFT_VERSION = "1.12.2";
        private static Logger logger;

        @EventHandler
        public void PreInit(FMLPreInitializationEvent event){
                logger = event.getModLog();
                logger.warn("==========It's PreInit==========");
                GameRegistry.registerWorldGenerator(new ModWorldGen(),3);
        }
        @EventHandler
        public void Init(FMLInitializationEvent event){
                logger.warn("==========It's Init==========");
                FurnaceRecipeRegistryHandler.register();
        }
        @EventHandler
        public void PostInit(FMLPostInitializationEvent event){
                logger.warn("==========It's PostInit==========");
        }
}
