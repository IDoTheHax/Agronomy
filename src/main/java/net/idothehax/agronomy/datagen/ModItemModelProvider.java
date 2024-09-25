package net.idothehax.agronomy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.idothehax.agronomy.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModItemModelProvider extends FabricModelProvider {
    public ModItemModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Early Varieties
        itemModelGenerator.register(ModItems.SWIFT_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.PENTLAND_JAVELIN_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROCKET_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.CASABLANCA_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARRAN_PILOT_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUKE_OF_YORK_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_DUKE_OF_YORK_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.EPICURE_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOREMOST_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOME_GUARD_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.LADY_CHRISTL_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORLA_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.PREMIERE_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURITAN_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.ULSTER_PRINCE_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.JERSEY_ROYAL_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.MARFONA_SEED, Models.GENERATED);

        // Second Earlies
        itemModelGenerator.register(ModItems.MARIS_PEER_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHARLOTTE_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.NICOLA_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANYA_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.BONNIE_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRITISH_QUEEN_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.CATRIONA_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUNLUCE_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.ESTIMA_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.KESTREL_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.NADINE_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.RATTE_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.WILJA_SEED, Models.GENERATED);

        // Maincrop
        itemModelGenerator.register(ModItems.KING_EDWARD_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.MARIS_PIPER_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICASSO_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.DESIREE_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_FIR_APPLE_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.SARPO_MIRA_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARA_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAJESTIC_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.RECORD_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROMANO_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROOSTER_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.SANTE_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAXON_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.VALOR_SEED, Models.GENERATED);

        // Specialty Varieties
        itemModelGenerator.register(ModItems.ELBA_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.KENNEBEC_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_GOLD_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.MASQUERADE_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_MAJESTY_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUSSIAN_BANANA_FINGERLING_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_NORLAND_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.KIFLI_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.LADY_BALFOUR_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.VIVALDI_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.ACCORD_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.CONGO_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAYAN_GOLD_SEED, Models.GENERATED);
    }
}