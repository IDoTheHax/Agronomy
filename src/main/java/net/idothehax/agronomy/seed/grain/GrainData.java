package net.idothehax.agronomy.seed;

import net.idothehax.agronomy.seed.grain.GrainCategory;
import net.idothehax.agronomy.seed.grain.GrainTrait;

import java.util.List;

public class SeedData {
 

    private final String name;
    private final List<GrainTrait> traits;

    public SeedData(String name, List<GrainTrait> traits, String tribe, String genus, String species) {
        this.name = name;
        this.category = category;
        this.traits = traits;

        // Stuff for name classification
        this.tribe = tribe;
        this.genus = genus
        this.species = species
    }

    // Add getters for the fields if needed
}