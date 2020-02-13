package felahliir.gemchanting.blocks.scribingtable;

import static felahliir.gemchanting.ObjectHolders.SCRIBINGTABLETILE;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class ScribingTableTile extends TileEntity implements INamedContainerProvider, ITickableTileEntity {
	private LazyOptional<IItemHandler> handler = LazyOptional.of(this::createHandler);

	public ScribingTableTile() {
		super(SCRIBINGTABLETILE);

	}

	@Nullable
	@Override
	public Container createMenu(int i, PlayerInventory inv, PlayerEntity player) {
		return new ScribingTableContainer(i, pos, inv, world, player);
	}

	@Override
	public ITextComponent getDisplayName() {
		return new StringTextComponent(getType().getRegistryName().getPath());

	}

	@Override
	public void read(CompoundNBT tag) {
		CompoundNBT invTag = tag.getCompound("inv");
		handler.ifPresent(h -> ((INBTSerializable<CompoundNBT>) h).deserializeNBT(invTag));
		super.read(tag);
	}

	@Override
	public CompoundNBT write(CompoundNBT tag) {
		handler.ifPresent(h -> {
			CompoundNBT compound = ((INBTSerializable<CompoundNBT>) h).serializeNBT();
			tag.put("inv", compound);
		});
		return super.write(tag);
	}

	private IItemHandler createHandler() {
		{
			return new ItemStackHandler(1);
		}
	}

	@Nonnull
	@Override
	public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
		if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
			return handler.cast();
		}
		return super.getCapability(cap, side);
	}

	@Override
	public void tick() {
	}

}
