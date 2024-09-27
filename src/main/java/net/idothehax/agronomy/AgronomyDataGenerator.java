package net.idothehax.agronomy;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.idothehax.agronomy.datagen.ModBlockTagProvider;
import net.idothehax.agronomy.datagen.ModModelProvider;
import net.idothehax.agronomy.datagen.ModLootTableProvider;

public class AgronomyDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModLootTableProvider::new);
        pack.addProvider(ModBlockTagProvider::new);

    }
}