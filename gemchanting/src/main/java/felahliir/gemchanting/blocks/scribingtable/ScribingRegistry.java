package felahliir.gemchanting.blocks.scribingtable;

import felahliir.gemchanting.Gemchanting;
import felahliir.gemchanting.ObjectHolders;
import felahliir.gemchanting.setup.ClientProxy;
import felahliir.gemchanting.setup.IProxy;
import felahliir.gemchanting.setup.ServerProxy;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;

@Mod("genting")
public class ScribingRegistry {


	
	
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public static class RegistryEvents
{   
	
	@SubscribeEvent
	public static void onTileEntityRegistry(final RegistryEvent.Register<TileEntityType<?>> event) {
	    event.getRegistry().register(TileEntityType.Builder.create(ScribingTableTile::new, ObjectHolders.SCRIBINGTABLE).build(null).setRegistryName("scribingtable"));
	}
	@SubscribeEvent

	public static void onContainerRegistry(final RegistryEvent.Register<ContainerType<?>> event) { 
		
		event.getRegistry().register(IForgeContainerType.create((windowID, inv, data) -> {
			BlockPos pos = data.readBlockPos();
			return new ScribingTableContainer( windowID, pos,inv,Gemchanting.proxy.getClientWorld(),   Gemchanting.proxy.getClientPlayer());
        }).setRegistryName("scribingtable"));
	
	
	
	
}
}}
