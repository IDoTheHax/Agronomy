package net.idothehax.agronomy.seed;

import net.idothehax.agronomy.seed.grain.GrainTrait;
import java.util.List;

public class GrainData {
    private final String name;
    private final List<GrainTrait> traits;
    public static String family;
    public static String tribe;
    public static String genus;
    public static String species;

    public GrainData(String name, List<GrainTrait> traits, String family, String tribe, String genus, String species) {
        this.name = name;
        this.traits = traits;

        // Stuff for name classification
        this.family = family;
        this.tribe = tribe;
        this.genus = genus;
        this.species = species;
    }

    // Add getters for the fields if needed
}