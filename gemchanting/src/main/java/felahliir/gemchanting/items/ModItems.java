package felahliir.gemchanting.items;


import felahliir.gemchanting.blocks.scribingtable.ScribingTable;
//import felahliir.gemchanting.blocks.ScribingTable;
import felahliir.gemchanting.items.coppertools.CopperAxe;
import felahliir.gemchanting.items.coppertools.CopperHoe;
import felahliir.gemchanting.items.coppertools.CopperPick;
import felahliir.gemchanting.items.coppertools.CopperShovel;
import felahliir.gemchanting.items.coppertools.CopperSword;
import felahliir.gemchanting.items.leadtools.LeadAxe;
import felahliir.gemchanting.items.leadtools.LeadHoe;
import felahliir.gemchanting.items.leadtools.LeadPick;
import felahliir.gemchanting.items.leadtools.LeadShovel;
import felahliir.gemchanting.items.leadtools.LeadSword;
import felahliir.gemchanting.lists.Blocklists;
import felahliir.gemchanting.lists.Itemlists;
import felahliir.gemchanting.lists.ToolMaterialLists;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;




@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder("genting")

public class ModItems
{
	
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public static class RegistryEvents
{       
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) 
{       event.getRegistry().registerAll
		(
				
	     Itemlists.dyonissum = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("dyonissum"))
		,Itemlists.polished_dyonissum = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("polished_dyonissum"))
		,Itemlists.chaurite= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("chaurite"))
		,Itemlists.hadet= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("hadet"))	
		,Itemlists.posedite= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("posedite"))		
		,Itemlists.ifranite= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("ifranite"))		
		,Itemlists.malachite= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("malachite"))
		,Itemlists.crystal_obsidian= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("crystal_obsidian"))
		,Itemlists.star_glass= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("star_glass"))		
		,Itemlists.desert_eye= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("desert_eye"))		
		,Itemlists.onyx= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("onyx"))		
		,Itemlists.vase= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("vase"))		
		,Itemlists.bottled_fire= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("bottled_fire"))		
		,Itemlists.bottled_river= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("bottled_river"))		
		,Itemlists.bottled_dune= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("bottled_dune"))
		,Itemlists.bottled_fog= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("bottled_fog"))
		,Itemlists.polished_dyonissum_block = new BlockItem(Blocklists.polished_dyonissum_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("polished_dyonissum_block")
		,Itemlists.winestone_block = new BlockItem(Blocklists.winestone_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("winestone_block")
		,Itemlists.gold_netherrack = new BlockItem(Blocklists.gold_netherrack, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("gold_netherrack")
		,Itemlists.onyx_netherrack = new BlockItem(Blocklists.onyx_netherrack, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("onyx_netherrack")
		,Itemlists.ifranite_ore = new BlockItem(Blocklists.ifranite_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("ifranite_ore")
		,Itemlists.malachite_ore = new BlockItem(Blocklists.malachite_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("malachite_ore")
		,Itemlists.winestone_ore = new BlockItem(Blocklists.winestone_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("winestone_ore")
		,Itemlists.gallenite_ore = new BlockItem(Blocklists.gallenite_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("gallenite_ore")
		,Itemlists.silver_nugget= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("silver_nugget"))		
		,Itemlists.silver_ingot= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("silver_ingot"))		
		,Itemlists.copper_ingot= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("copper_ingot"))		
		,Itemlists.copper_nugget= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("copper_nugget"))		
		,Itemlists.copper_block = new BlockItem(Blocklists.copper_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("copper_block")
		,Itemlists.silver_block = new BlockItem(Blocklists.silver_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("silver_block")
		,Itemlists.lead_block = new BlockItem(Blocklists.lead_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("lead_block")
		,Itemlists.lead_ingot= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("lead_ingot"))		
		,Itemlists.candle = new BlockItem(Blocklists.candle, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("candle")
		,Itemlists.cloud= new BlockItem(Blocklists.cloud, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("cloud")
		,Itemlists.arid_land = new BlockItem(Blocklists.arid_land, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("arid_land")
		,Itemlists.lard= new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("lard"))		
		,Itemlists.leadax= new LeadAxe(ToolMaterialLists.lead, -1.0f ,0.1f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(location("leadax"))
		,Itemlists.leadshovel= new LeadShovel(ToolMaterialLists.lead, -1.0f ,0.1f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(location("leadshovel"))
		,Itemlists.leadsword= new LeadSword(ToolMaterialLists.lead,  4 ,-3.5f, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName(location("leadsword"))
		,Itemlists.leadhoe= new LeadHoe(ToolMaterialLists.lead, -1.0f ,-3.5f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(location("leadhoe"))
		,Itemlists.leadpick= new LeadPick(ToolMaterialLists.lead,  -1 ,-3.5f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(location("leadpick"))
		,Itemlists.copperpick= new CopperPick(ToolMaterialLists.copper,  -1 ,-3.5f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(location("copperpick"))
		,Itemlists.coppersword= new CopperSword(ToolMaterialLists.copper,  -1 ,-2f, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName(location("coppersword"))
		,Itemlists.coppershovel= new CopperShovel(ToolMaterialLists.copper,  -1 ,-2f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(location("coppershovel"))
		,Itemlists.copperhoe= new CopperHoe(ToolMaterialLists.copper,  -1 ,-1f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(location("copperhoe"))
		,Itemlists.copperaxe= new CopperAxe(ToolMaterialLists.copper,  -1 ,-1.5f, new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(location("copperaxe"))
		,Itemlists.scribingtable = new BlockItem(ScribingTable.scribingtable, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("scribingtable")
		,Itemlists.hungrylionmetalblock = new BlockItem(Blocklists.hungrylionmetalblock, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("hungrylionmetalblock")

				
				
				
				
				);
}

	private static ResourceLocation location(String name)
	{return new ResourceLocation("genting", name);}

}}