package felahliir.gemchanting;

import felahliir.gemchanting.blocks.scribingtable.ScribingTableScreen;
import felahliir.gemchanting.setup.ClientProxy;
import felahliir.gemchanting.setup.IProxy;
import felahliir.gemchanting.setup.ModSetup;
import felahliir.gemchanting.setup.ServerProxy;
//import felahliir.gemchanting.blocks.ScribingTableTile;
import felahliir.gemchanting.world.OreGeneration;
import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("genting")
public class Gemchanting {
	public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
	public static Gemchanting instance;
	public static final String modid = "genting";
	public static ModSetup setup = new ModSetup();

	public Gemchanting() {
		{
			instance = this;
			FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
			MinecraftForge.EVENT_BUS.register(this);
		}
	}

	private void setup(final FMLCommonSetupEvent event) {
		OreGeneration.setupOreGeneration();
		setup.init();
		proxy.init();

	}

}
