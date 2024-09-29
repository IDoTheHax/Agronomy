package net.idothehax.agronomy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.idothehax.agronomy.block.ModBlocks;
import net.idothehax.agronomy.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.state.property.Properties;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // First Earlies
        blockStateModelGenerator.registerCrop(ModBlocks.SWIFT_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.PENTLAND_JAVELIN_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.ROCKET_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.CASABLANCA_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.ARRAN_PILOT_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.DUKE_OF_YORK_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.RED_DUKE_OF_YORK_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.EPICURE_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.FOREMOST_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.HOME_GUARD_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.LADY_CHRISTL_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.ORLA_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.PREMIERE_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.PURITAN_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.ULSTER_PRINCE_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.JERSEY_ROYAL_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.MARFONA_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);

        // Second Earlies
        blockStateModelGenerator.registerCrop(ModBlocks.MARIS_PEER_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.CHARLOTTE_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.NICOLA_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.ANYA_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.BONNIE_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.BRITISH_QUEEN_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.CATRIONA_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.DUNLUCE_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.ESTIMA_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.KESTREL_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.NADINE_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.RATTE_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.WILJA_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);

        // Maincrop
        blockStateModelGenerator.registerCrop(ModBlocks.KING_EDWARD_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.MARIS_PIPER_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.PICASSO_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.DESIREE_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.PINK_FIR_APPLE_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.SARPO_MIRA_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.MAJESTIC_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.RECORD_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.ROMANO_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.ROOSTER_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.SANTE_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.SAXON_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.VALOR_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);

        blockStateModelGenerator.registerCrop(ModBlocks.ELBA_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.KENNEBEC_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.RED_GOLD_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.MASQUERADE_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.PURPLE_MAJESTY_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.RUSSIAN_BANANA_FINGERLING_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.RED_NORLAND_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.KIFLI_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.LADY_BALFOUR_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.VIVALDI_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.ACCORD_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.CARA_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.MAYAN_GOLD_POTATOES, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);
    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Early Varieties
        itemModelGenerator.register(ModItems.SWEET_POTATO, Models.GENERATED);
        /*itemModelGenerator.register(ModItems.SWIFT_SEED, Models.GENERATED);
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
        itemModelGenerator.register(ModItems.MAYAN_GOLD_SEED, Models.GENERATED);*/
    }
}