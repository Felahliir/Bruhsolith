package felahliir.gemchanting.blocks;


import felahliir.gemchanting.Gemchanting;
import felahliir.gemchanting.blocks.scribingtable.ScribingTable;
import felahliir.gemchanting.blocks.scribingtable.ScribingTableContainer;
import felahliir.gemchanting.blocks.scribingtable.ScribingTableTile;
import felahliir.gemchanting.lists.Blocklists;
import felahliir.gemchanting.setup.ClientProxy;
import felahliir.gemchanting.setup.IProxy;
import felahliir.gemchanting.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder("genting")

public class ModBlocks
{
	public static Gemchanting instance;
	 public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
	
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public static class RegistryEvents
{       
	@SubscribeEvent
	
	public static void registerBlock(final RegistryEvent.Register<Block> event) 
{       event.getRegistry().registerAll(
		
	         Blocklists.polished_dyonissum_block = new Block(Block.Properties.create(Material.GLASS).hardnessAndResistance(1,5).lightValue(2).sound(SoundType.GLASS).harvestTool(ToolType.PICKAXE)).setRegistryName(location("polished_dyonissum_block"))
			,Blocklists.winestone_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2).harvestLevel(2).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("winestone_ore"))
			,Blocklists.ifranite_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2).lightValue(0).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName(location("ifranite_ore"))
			,Blocklists.gallenite_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2).lightValue(0).harvestLevel(2).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("gallenite_ore"))
			,Blocklists.malachite_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2).lightValue(0).harvestLevel(2).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("malachite_ore"))
			,Blocklists.onyx_netherrack = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).lightValue(0).harvestLevel(2).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("onyx_netherrack"))
			,Blocklists.gold_netherrack = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1).lightValue(0).harvestLevel(2).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("gold_netherrack"))
			,Blocklists.winestone_block = new Block(Block.Properties.create(Material.GLASS).hardnessAndResistance(5).lightValue(0).harvestLevel(2).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("winestone_block"))
			,Blocklists.lead_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(23).lightValue(0).harvestLevel(2).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("lead_block"))
			,Blocklists.silver_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(10).lightValue(2).harvestLevel(2).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("silver_block"))
			,Blocklists.copper_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(18).lightValue(0).harvestLevel(2).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("copper_block"))
			,Blocklists.arid_land = new Block(Block.Properties.create(Material.SAND).hardnessAndResistance(18).lightValue(0).harvestLevel(2).sound(SoundType.SAND).harvestTool(ToolType.SHOVEL)).setRegistryName(location("arid_land"))
			,Blocklists.cloud = new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1).lightValue(0).harvestLevel(1).sound(SoundType.SNOW).harvestTool(ToolType.SHOVEL)).setRegistryName(location("cloud"))
			,Blocklists.candle = new CandleBlock(Block.Properties.create(Material.ORGANIC).hardnessAndResistance(0).lightValue(14).harvestLevel(0).sound(SoundType.SNOW)).setRegistryName(location("candle"))
			,ScribingTable.scribingtable = new ScribingTable(Block.Properties.create(Material.ROCK).hardnessAndResistance(0).lightValue(14).harvestLevel(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("scribingtable"))
			,Blocklists.hungrylionmetalblock = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2).harvestLevel(2).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("hungrylionmetalblock"))

		
		);
};	





}
private static ResourceLocation location(String name)
{return new ResourceLocation("genting", name);}











}