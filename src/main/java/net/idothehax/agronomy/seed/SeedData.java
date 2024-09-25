package net.idothehax.agronomy.seed;

import net.idothehax.agronomy.seed.potato.PotatoCategory;
import net.idothehax.agronomy.seed.potato.PotatoTrait;

import java.util.List;

public class SeedData {
    private final String name;
    private final PotatoCategory category;
    private final List<PotatoTrait> traits;

    public SeedData(String name, PotatoCategory category, List<PotatoTrait> traits) {
        this.name = name;
        this.category = category;
        this.traits = traits;
    }

    // Add getters for the fields if needed
}