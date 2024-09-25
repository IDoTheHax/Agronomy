package net.idothehax.agronomy.seed.potato;

public class PotatoTrait {
    private final String name;
    private final int growthSpeed;
    private final int yield;
    private final int diseaseResistance;
    private final String flavorProfile;

    public PotatoTrait(String name, int growthSpeed, int yield, int diseaseResistance, String flavorProfile) {
        this.name = name;
        this.growthSpeed = growthSpeed;
        this.yield = yield;
        this.diseaseResistance = diseaseResistance;
        this.flavorProfile = flavorProfile;
    }

    public String getName() {
        return name;
    }

    public int getGrowthSpeed() {
        return growthSpeed;
    }

    public int getYield() {
        return yield;
    }

    public int getDiseaseResistance() {
        return diseaseResistance;
    }

    public String getFlavorProfile() {
        return flavorProfile;
    }
}
