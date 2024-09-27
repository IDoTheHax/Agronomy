package net.idothehax.agronomy.seed.grain;

public class GrainTrait {
    private final String name;
    private final String scientificName;
    private final SeedCategory category;
    private final String family;
    private final NutritionalProfile nutritionalProfile;
    private final CulinaryUse culinaryUse;
    private final GrowthCharacteristics growthCharacteristics;

    public GrainTrait(String name, String scientificName, SeedCategory category, String family,
                      NutritionalProfile nutritionalProfile, CulinaryUse culinaryUse,
                      GrowthCharacteristics growthCharacteristics) {
        this.name = name;
        this.scientificName = scientificName;
        this.category = category;
        this.family = family;
        this.nutritionalProfile = nutritionalProfile;
        this.culinaryUse = culinaryUse;
        this.growthCharacteristics = growthCharacteristics;
    }

    // Getters for all fields

    public enum SeedCategory {
        CEREAL, PSEUDOCEREAL, LEGUME, NUT, OTHER
    }

    public static class NutritionalProfile {
        private final int calories;
        private final double protein;
        private final double fat;
        private final double carbohydrates;

        public NutritionalProfile(int calories, double protein, double fat, double carbohydrates) {
            this.calories = calories;
            this.protein = protein;
            this.fat = fat;
            this.carbohydrates = carbohydrates;
        }

        // Getters for all fields
    }

    public static class CulinaryUse {
        private final boolean requiresCooking;
        private final String commonPreparationMethods;
        private final String flavorProfile;

        public CulinaryUse(boolean requiresCooking, String commonPreparationMethods, String flavorProfile) {
            this.requiresCooking = requiresCooking;
            this.commonPreparationMethods = commonPreparationMethods;
            this.flavorProfile = flavorProfile;
        }

        // Getters for all fields
    }

    public static class GrowthCharacteristics {
        private final int growthSpeed;
        private final int yield;
        private final int diseaseResistance;
        private final String climatePreference;

        public GrowthCharacteristics(int growthSpeed, int yield, int diseaseResistance, String climatePreference) {
            this.growthSpeed = growthSpeed;
            this.yield = yield;
            this.diseaseResistance = diseaseResistance;
            this.climatePreference = climatePreference;
        }

        // Getters for all fields
    }
}