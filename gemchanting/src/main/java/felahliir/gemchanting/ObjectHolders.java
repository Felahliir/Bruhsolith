package felahliir.gemchanting;

import felahliir.gemchanting.blocks.scribingtable.ScribingTableContainer;
import felahliir.gemchanting.blocks.scribingtable.ScribingTableTile;
import net.minecraft.block.Block;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ObjectHolders {
	
	@ObjectHolder("genting:winestone_ore")
	public static final Block winestone_ore = null;

	@ObjectHolder("genting:malachite_ore")
	public static final Block malachite_ore = null;

	@ObjectHolder("genting:gallenite_ore")
	public static final Block gallenite_ore = null;

	@ObjectHolder("genting:gold_netherrack")
	public static final Block gold_netherrack = null;

	@ObjectHolder("genting:onyx_netherrack")
	public static final Block onyx_netherrack = null;

	@ObjectHolder("genting:cloud")
	public static final Block cloud = null;

	@ObjectHolder("genting:ifranite_ore")
	public static final Block ifranite_ore = null;






	//the devil itself
	@ObjectHolder("genting:candle")
	public static final Block candle = null;

	@ObjectHolder("genting:scribingtable")
	public static TileEntityType<ScribingTableTile> SCRIBINGTABLETILE;

	@ObjectHolder("genting:scribingtable")
	public static final Block SCRIBINGTABLE = null;

	@ObjectHolder("genting:scribingtable")
	public static ContainerType<ScribingTableContainer> SCRIBINGTABLECONTAINER;




	//generation on surface
	@ObjectHolder("genting:arid_land")
	public static final Block arid_land = null;




}
