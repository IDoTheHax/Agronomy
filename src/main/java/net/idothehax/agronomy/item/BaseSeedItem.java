package net.idothehax.agronomy.item;

import net.idothehax.agronomy.seed.SeedData;
import net.minecraft.item.Item;

public class BaseSeedItem extends Item {
    private final SeedData seedData;

    public BaseSeedItem(Settings settings, SeedData seedData) {
        super(settings);
        this.seedData = seedData;
    }

    public SeedData getSeedData() {
        return seedData;
    }
}
