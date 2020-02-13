package felahliir.gemchanting.blocks.scribingtable;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class ScribingTable extends HorizontalBlock {
	public static Block scribingtable;

	private static final VoxelShape WBACK = Block.makeCuboidShape(-6, 12, 0, 22, 17, 4);
	private static final VoxelShape WBASE = Block.makeCuboidShape(-6, 0, 0, 22, 12, 16);

	private static final VoxelShape SBACK = Block.makeCuboidShape(-6, 12, 12, 22, 17, 16);
	private static final VoxelShape SBASE = Block.makeCuboidShape(0, 0, -6, 16, 12, 22);

	private static final VoxelShape NBACK = Block.makeCuboidShape(0, 12, -6, 4, 17, 22);
	private static final VoxelShape NBASE = Block.makeCuboidShape(0, 0, -6, 16, 12, 22);

	private static final VoxelShape EBACK = Block.makeCuboidShape(18, 12, -6, 22, 17, 22);
	private static final VoxelShape EBASE = Block.makeCuboidShape(0, 0, -6, 16, 12, 22);

	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

	public final VoxelShape SSHAPE = VoxelShapes.or(SBASE, SBACK);
	public final VoxelShape WSHAPE = VoxelShapes.or(WBASE, WBACK);
	public final VoxelShape ESHAPE = VoxelShapes.or(EBASE, EBACK);
	public final VoxelShape NSHAPE = VoxelShapes.or(NBASE, NBACK);

	public ScribingTable(Properties properties) {
		super(properties);
	}

	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(HORIZONTAL_FACING);

	}

	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing().getOpposite());
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		Direction direction = state.get(FACING);
		return direction.getAxis() == Direction.Axis.X ? NSHAPE : WSHAPE;
	}

	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}

	@Nullable
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return new ScribingTableTile();
	}

	public static Direction getFacingFromEntity(BlockPos clickedBlock, LivingEntity entity) {
		return Direction.getFacingFromVector((float) (entity.posX - clickedBlock.getX()),
				(float) (entity.posY - clickedBlock.getY()), (float) (entity.posZ - clickedBlock.getZ()));
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.with(FACING, rot.rotate(state.get(FACING)));
	}

	@Override
	public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player,
			Hand boneproboscis, BlockRayTraceResult lasers) {
		if (!world.isRemote) {
			TileEntity tileEntity = world.getTileEntity(pos);
			if (tileEntity instanceof INamedContainerProvider) {

				NetworkHooks.openGui((ServerPlayerEntity) player, (INamedContainerProvider) tileEntity,
						tileEntity.getPos());
			}
		}
		return super.onBlockActivated(state, world, pos, player, boneproboscis, lasers);
	}

}
