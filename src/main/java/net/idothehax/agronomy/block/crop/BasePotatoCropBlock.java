//package net.idothehax.agronomy.block.crop;
//
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockState;
//import net.minecraft.block.CropBlock;
//import net.minecraft.state.property.Properties;
//import net.minecraft.util.shape.VoxelShape;
//
//public class BasePotatoCropBlock extends CropBlock {
//    private final ItemLike seeds;
//    private final VoxelShape[] shapeByAge;
//
//    private static final VoxelShape[] SWIFT_SHAPE_BY_AGE = new VoxelShape[]{
//            Block.box.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
//            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D),
//            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D),
//            // Add more shapes for different ages
//    };
//
//
//    public BasePotatoCropBlock(ItemLike seeds, VoxelShape[] shapeByAge, Properties properties) {
//        super(properties);
//        this.seeds = seeds;
//        this.shapeByAge = shapeByAge;
//    }
//
//    @Override
//    protected ItemLike getBaseSeedId() {
//        return seeds;
//    }
//
//    @Override
//    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
//        return shapeByAge[state.getValue(this.getAgeProperty())];
//    }
//
//    @Override
//    public BlockState getPlant(BlockGetter level, BlockPos pos) {
//        return this.defaultBlockState();
//    }
//}