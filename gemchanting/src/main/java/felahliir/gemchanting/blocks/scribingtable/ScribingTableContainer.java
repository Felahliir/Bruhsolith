package felahliir.gemchanting.blocks.scribingtable;

import static felahliir.gemchanting.ObjectHolders.SCRIBINGTABLECONTAINER;

import felahliir.gemchanting.ObjectHolders;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;

public class ScribingTableContainer extends Container {

	private TileEntity tileEntity;
	private PlayerEntity player;
	private IItemHandler inv;

	public ScribingTableContainer(int windowID, BlockPos pos, PlayerInventory inv, World world, PlayerEntity player) {
		super(SCRIBINGTABLECONTAINER, windowID);
		tileEntity = world.getTileEntity(pos);
		tileEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(h -> {
			addSlot(new SlotItemHandler(h, 0, 64, 24));

		});

		this.player = player;
		this.inv = new InvWrapper(inv);

		layoutPlayerInventorySlot(10, 70);

	}

	public ScribingTableContainer(int i, PlayerInventory player, PlayerEntity play) {
		super(SCRIBINGTABLECONTAINER, i);
	}

	@Override
	public boolean canInteractWith(PlayerEntity player) {
		return true;
	}

	public void addSlot(IItemHandler handler, int index, int x, int y) {
		addSlot(new SlotItemHandler(handler, index, x, y));
	}

	private int addSlotRange(IItemHandler handler, int index, int x, int y, int amount, int dx) {
		for (int i = 0; i < amount; i++) {
			addSlot(handler, index, x, y);
			x += dx;
			index++;
		}
		return index;
	}

	private int addSlotBox(IItemHandler handler, int index, int x, int y, int horAmount, int dx, int verAmount,
			int dy) {

		for (int j = 0; j < verAmount; j++) {
			index = addSlotRange(handler, index, x, y, horAmount, dx);
			y += dy;
		}
		return index;

	}

	private void layoutPlayerInventorySlot(int leftCol, int topRow)
	// inv
	{
		addSlotBox(inv, 9, leftCol, topRow, 9, 18, 9, 18);

		topRow += 58;
		addSlotRange(inv, 0, leftCol, topRow, 9, 18);

	}

}
