package net.idothehax.agronomy.block;

import net.minecraft.util.shape.VoxelShape;
import net.minecraft.item.ItemConvertible;

public class PotatoVariantConfig {
    private final VoxelShape[] ageToShape;
    private final ItemConvertible seedsItem;

    public PotatoVariantConfig(VoxelShape[] ageToShape, ItemConvertible seedsItem) {
        this.ageToShape = ageToShape;
        this.seedsItem = seedsItem;
    }

    public VoxelShape[] getAgeToShape() {
        return ageToShape;
    }

    public ItemConvertible getSeedsItem() {
        return seedsItem;
    }
}
