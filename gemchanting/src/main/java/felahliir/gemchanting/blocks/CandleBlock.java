package felahliir.gemchanting.blocks;

import felahliir.gemchanting.lists.Blocklists;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;



public class CandleBlock extends Block
{
	
private final VoxelShape shape;




public CandleBlock(Properties properties) {
		super(properties);
		
		this.shape = Block.makeCuboidShape(6, 0, 6, 10, 16, 10);		
	}


public static void registerBlock(IForgeRegistry<Block> registry, Block setRegistryName) {
		
}


@Override
public  VoxelShape getRenderShape(BlockState state, IBlockReader worldIn, BlockPos pos)
{ 
	return this.shape;
}
@Override
public VoxelShape getShape(BlockState state, IBlockReader source, BlockPos pos, ISelectionContext ctx)
{ 
	return this.shape;
}



private static ResourceLocation location(String name)
{return new ResourceLocation("genting", name);}




}
