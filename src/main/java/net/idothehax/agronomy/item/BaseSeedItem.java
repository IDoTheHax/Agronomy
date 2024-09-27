package net.idothehax.agronomy.item;

import net.idothehax.agronomy.seed.SeedData;
import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;

public class BaseSeedItem extends AliasedBlockItem {
    private final SeedData seedData;

    public BaseSeedItem(Block block, Item.Settings settings, SeedData seedData) {
        super(block, settings);
        this.seedData = seedData;
    }

    public SeedData getSeedData() {
        return seedData;
    }
}
