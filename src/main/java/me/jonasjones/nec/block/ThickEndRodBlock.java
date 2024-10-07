package me.jonasjones.nec.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.EndRodBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ThickEndRodBlock extends EndRodBlock {
    public ThickEndRodBlock(Settings settings) {
        super(settings);
    }

    protected static final VoxelShape Y_SHAPE = Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
    protected static final VoxelShape Z_SHAPE = Block.createCuboidShape(5.0, 5.0, 0.0, 11.0, 11.0, 16.0);
    protected static final VoxelShape X_SHAPE = Block.createCuboidShape(0.0, 5.0, 5.0, 16.0, 11.0, 11.0);

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (((Direction)state.get(FACING)).getAxis()) {
            case X:
            default:
                return X_SHAPE;
            case Z:
                return Z_SHAPE;
            case Y:
                return Y_SHAPE;
        }
    }
}
