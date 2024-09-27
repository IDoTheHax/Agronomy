package net.idothehax.agronomy.block.crop;

import net.idothehax.agronomy.block.PotatoVariantConfig;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class PotatoCropBlock extends CropBlock {
    private final PotatoVariantConfig config;

    public PotatoCropBlock(AbstractBlock.Settings settings, PotatoVariantConfig config) {
        super(settings);
        this.config = config;
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return config.getSeedsItem();
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return config.getAgeToShape()[this.getAge(state)];
    }
}
