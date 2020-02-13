package felahliir.gemchanting.setup;

import felahliir.gemchanting.ObjectHolders;
import felahliir.gemchanting.blocks.scribingtable.ScribingTableScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {
	@Override
	public void init() {
		ScreenManager.registerFactory(ObjectHolders.SCRIBINGTABLECONTAINER, (container, inv, title) -> {
		return new ScribingTableScreen(container, inv, title);
	});
		}

	@Override
	public World getClientWorld() {
		return Minecraft.getInstance().world;
	}

	@Override
	public PlayerEntity getClientPlayer() {
		return Minecraft.getInstance().player;
	}

}
