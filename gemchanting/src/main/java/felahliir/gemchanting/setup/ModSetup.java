package felahliir.gemchanting.setup;

import felahliir.gemchanting.ObjectHolders;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
	public ItemGroup itemGroup = new ItemGroup("genting") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ObjectHolders.winestone_ore);
		}
	};

	public void init() {

	}

}
