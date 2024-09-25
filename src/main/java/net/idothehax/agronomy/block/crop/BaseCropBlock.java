package net.idothehax.agronomy.block.crop;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.world.World;

public class BaseCropBlock extends CropBlock {
    public BaseCropBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected int getGrowthAmount(World world) {
        return super.getGrowthAmount(world); // Modify this for custom growth logic
    }
}
