package net.idothehax.agronomy.item;

import net.idothehax.agronomy.Agronomy;
import net.idothehax.agronomy.block.ModBlocks;
import net.idothehax.agronomy.seed.potato.ModPotatoVariants;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // First Earlies
    public static final Item SWIFT_SEED = new BaseSeedItem(ModBlocks.SWIFT_POTATOES, new Item.Settings(), ModPotatoVariants.SWIFT);
    public static final Item PENTLAND_JAVELIN_SEED = new BaseSeedItem(ModBlocks.PENTLAND_JAVELIN_POTATOES, new Item.Settings(), ModPotatoVariants.PENTLAND_JAVELIN);
    public static final Item ROCKET_SEED = new BaseSeedItem(ModBlocks.ROCKET_POTATOES,new Item.Settings(), ModPotatoVariants.ROCKET);
    public static final Item CASABLANCA_SEED = new BaseSeedItem(ModBlocks.CASABLANCA_POTATOES,new Item.Settings(), ModPotatoVariants.CASABLANCA);
    public static final Item ARRAN_PILOT_SEED = new BaseSeedItem(ModBlocks.ARRAN_PILOT_POTATOES,new Item.Settings(), ModPotatoVariants.ARRAN_PILOT);
    public static final Item DUKE_OF_YORK_SEED = new BaseSeedItem(ModBlocks.DUKE_OF_YORK_POTATOES,new Item.Settings(), ModPotatoVariants.DUKE_OF_YORK);
    public static final Item RED_DUKE_OF_YORK_SEED = new BaseSeedItem(ModBlocks.RED_DUKE_OF_YORK_POTATOES,new Item.Settings(), ModPotatoVariants.RED_DUKE_OF_YORK);
    public static final Item EPICURE_SEED = new BaseSeedItem(ModBlocks.FOREMOST_POTATOES,new Item.Settings(), ModPotatoVariants.EPICURE);
    public static final Item FOREMOST_SEED = new BaseSeedItem(ModBlocks.FOREMOST_POTATOES, new Item.Settings(), ModPotatoVariants.FOREMOST);
    public static final Item HOME_GUARD_SEED = new BaseSeedItem(ModBlocks.HOME_GUARD_POTATOES, new Item.Settings(), ModPotatoVariants.HOME_GUARD);
    public static final Item LADY_CHRISTL_SEED = new BaseSeedItem(ModBlocks.LADY_CHRISTL_POTATOES, new Item.Settings(), ModPotatoVariants.LADY_CHRISTL);
    public static final Item ORLA_SEED = new BaseSeedItem(ModBlocks.ORLA_POTATOES, new Item.Settings(), ModPotatoVariants.ORLA);
    public static final Item PREMIERE_SEED = new BaseSeedItem(ModBlocks.PREMIERE_POTATOES, new Item.Settings(), ModPotatoVariants.PREMIERE);
    public static final Item PURITAN_SEED = new BaseSeedItem(ModBlocks.PURITAN_POTATOES, new Item.Settings(), ModPotatoVariants.PURITAN);
    public static final Item ULSTER_PRINCE_SEED = new BaseSeedItem(ModBlocks.ULSTER_PRINCE_POTATOES, new Item.Settings(), ModPotatoVariants.ULSTER_PRINCE);
    public static final Item JERSEY_ROYAL_SEED = new BaseSeedItem(ModBlocks.JERSEY_ROYAL_POTATOES, new Item.Settings(), ModPotatoVariants.JERSEY_ROYAL);
    public static final Item MARFONA_SEED = new BaseSeedItem(ModBlocks.MARFONA_POTATOES, new Item.Settings(), ModPotatoVariants.MARFONA);

    // Second Earlies
    public static final Item MARIS_PEER_SEED = new BaseSeedItem(ModBlocks.MARIS_PEER_POTATOES, new Item.Settings(), ModPotatoVariants.MARIS_PEER);
    public static final Item CHARLOTTE_SEED = new BaseSeedItem(ModBlocks.CHARLOTTE_POTATOES, new Item.Settings(), ModPotatoVariants.CHARLOTTE);
    public static final Item NICOLA_SEED = new BaseSeedItem(ModBlocks.NICOLA_POTATOES, new Item.Settings(), ModPotatoVariants.NICOLA);
    public static final Item ANYA_SEED = new BaseSeedItem(ModBlocks.ANYA_POTATOES, new Item.Settings(), ModPotatoVariants.ANYA);
    public static final Item BONNIE_SEED = new BaseSeedItem(ModBlocks.BONNIE_POTATOES, new Item.Settings(), ModPotatoVariants.BONNIE);
    public static final Item BRITISH_QUEEN_SEED = new BaseSeedItem(ModBlocks.BRITISH_QUEEN_POTATOES, new Item.Settings(), ModPotatoVariants.BRITISH_QUEEN);
    public static final Item CATRIONA_SEED = new BaseSeedItem(ModBlocks.CATRIONA_POTATOES, new Item.Settings(), ModPotatoVariants.CATRIONA);
    public static final Item DUNLUCE_SEED = new BaseSeedItem(ModBlocks.DUNLUCE_POTATOES, new Item.Settings(), ModPotatoVariants.DUNLUCE);
    public static final Item ESTIMA_SEED = new BaseSeedItem(ModBlocks.ESTIMA_POTATOES, new Item.Settings(), ModPotatoVariants.ESTIMA);
    public static final Item KESTREL_SEED = new BaseSeedItem(ModBlocks.KESTREL_POTATOES, new Item.Settings(), ModPotatoVariants.KESTREL);
    public static final Item NADINE_SEED = new BaseSeedItem(ModBlocks.NADINE_POTATOES, new Item.Settings(), ModPotatoVariants.NADINE);
    public static final Item RATTE_SEED = new BaseSeedItem(ModBlocks.RATTE_POTATOES, new Item.Settings(), ModPotatoVariants.RATTE);
    public static final Item WILJA_SEED = new BaseSeedItem(ModBlocks.WILJA_POTATOES, new Item.Settings(), ModPotatoVariants.WILJA);

    // Maincrop
    public static final Item KING_EDWARD_SEED = new BaseSeedItem(ModBlocks.KING_EDWARD_POTATOES, new Item.Settings(), ModPotatoVariants.KING_EDWARD);
    public static final Item MARIS_PIPER_SEED = new BaseSeedItem(ModBlocks.MARIS_PIPER_POTATOES, new Item.Settings(), ModPotatoVariants.MARIS_PIPER);
    public static final Item PICASSO_SEED = new BaseSeedItem(ModBlocks.PICASSO_POTATOES, new Item.Settings(), ModPotatoVariants.PICASSO);
    public static final Item DESIREE_SEED = new BaseSeedItem(ModBlocks.DESIREE_POTATOES, new Item.Settings(), ModPotatoVariants.DESIREE);
    public static final Item PINK_FIR_APPLE_SEED = new BaseSeedItem(ModBlocks.PINK_FIR_APPLE_POTATOES, new Item.Settings(), ModPotatoVariants.PINK_FIR_APPLE);
    public static final Item SARPO_MIRA_SEED = new BaseSeedItem(ModBlocks.SARPO_MIRA_POTATOES, new Item.Settings(), ModPotatoVariants.SARPO_MIRA);
    public static final Item CARA_SEED = new BaseSeedItem(ModBlocks.CARA_POTATOES, new Item.Settings(), ModPotatoVariants.CARA);
    public static final Item MAJESTIC_SEED = new BaseSeedItem(ModBlocks.MAJESTIC_POTATOES, new Item.Settings(), ModPotatoVariants.MAJESTIC);
    public static final Item RECORD_SEED = new BaseSeedItem(ModBlocks.RECORD_POTATOES, new Item.Settings(), ModPotatoVariants.RECORD);
    public static final Item ROMANO_SEED = new BaseSeedItem(ModBlocks.ROMANO_POTATOES, new Item.Settings(), ModPotatoVariants.ROMANO);
    public static final Item ROOSTER_SEED = new BaseSeedItem(ModBlocks.ROOSTER_POTATOES, new Item.Settings(), ModPotatoVariants.ROOSTER);
    public static final Item SANTE_SEED = new BaseSeedItem(ModBlocks.SANTE_POTATOES, new Item.Settings(), ModPotatoVariants.SANTE);
    public static final Item SAXON_SEED = new BaseSeedItem(ModBlocks.SAXON_POTATOES, new Item.Settings(), ModPotatoVariants.SAXON);
    public static final Item VALOR_SEED = new BaseSeedItem(ModBlocks.VALOR_POTATOES, new Item.Settings(), ModPotatoVariants.VALOR);


    // Specialty Varieties
    public static final Item ELBA_SEED = new BaseSeedItem(ModBlocks.ELBA_POTATOES, new Item.Settings(), ModPotatoVariants.ELBA);
    public static final Item KENNEBEC_SEED = new BaseSeedItem(ModBlocks.KENNEBEC_POTATOES, new Item.Settings(), ModPotatoVariants.KENNEBEC);
    public static final Item RED_GOLD_SEED = new BaseSeedItem(ModBlocks.RED_GOLD_POTATOES, new Item.Settings(), ModPotatoVariants.RED_GOLD);
    public static final Item MASQUERADE_SEED = new BaseSeedItem(ModBlocks.MASQUERADE_POTATOES, new Item.Settings(), ModPotatoVariants.MASQUERADE);
    public static final Item PURPLE_MAJESTY_SEED = new BaseSeedItem(ModBlocks.PURPLE_MAJESTY_POTATOES, new Item.Settings(), ModPotatoVariants.PURPLE_MAJESTY);
    public static final Item RUSSIAN_BANANA_FINGERLING_SEED = new BaseSeedItem(ModBlocks.RUSSIAN_BANANA_FINGERLING_POTATOES, new Item.Settings(), ModPotatoVariants.RUSSIAN_BANANA_FINGERLING);
    public static final Item RED_NORLAND_SEED = new BaseSeedItem(ModBlocks.RED_NORLAND_POTATOES, new Item.Settings(), ModPotatoVariants.RED_NORLAND);
    public static final Item KIFLI_SEED = new BaseSeedItem(ModBlocks.KIFLI_POTATOES, new Item.Settings(), ModPotatoVariants.KIFLI);
    public static final Item LADY_BALFOUR_SEED = new BaseSeedItem(ModBlocks.LADY_BALFOUR_POTATOES, new Item.Settings(), ModPotatoVariants.LADY_BALFOUR);
    public static final Item VIVALDI_SEED = new BaseSeedItem(ModBlocks.VIVALDI_POTATOES, new Item.Settings(), ModPotatoVariants.VIVALDI);
    public static final Item ACCORD_SEED = new BaseSeedItem(ModBlocks.ACCORD_POTATOES, new Item.Settings(), ModPotatoVariants.ACCORD);
    public static final Item CONGO_SEED = new BaseSeedItem(ModBlocks.CONGO_POTATOES, new Item.Settings(), ModPotatoVariants.CONGO);
    public static final Item MAYAN_GOLD_SEED = new BaseSeedItem(ModBlocks.MAYAN_GOLD_POTATOES, new Item.Settings(), ModPotatoVariants.MAYAN_GOLD);

    public static void registerItems() {
        // Register First Earlies
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "swift_seed"), SWIFT_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "pentland_javelin_seed"), PENTLAND_JAVELIN_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "rocket_seed"), ROCKET_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "casablanca_seed"), CASABLANCA_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "arran_pilot_seed"), ARRAN_PILOT_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "duke_of_york_seed"), DUKE_OF_YORK_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "red_duke_of_york_seed"), RED_DUKE_OF_YORK_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "epicure_seed"), EPICURE_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "foremost_seed"), FOREMOST_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "home_guard_seed"), HOME_GUARD_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "lady_christl_seed"), LADY_CHRISTL_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "orla_seed"), ORLA_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "premiere_seed"), PREMIERE_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "puritan_seed"), PURITAN_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "ulster_prince_seed"), ULSTER_PRINCE_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "jersey_royal_seed"), JERSEY_ROYAL_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "marfona_seed"), MARFONA_SEED);

        // Register Second Earlies
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "maris_peer_seed"), MARIS_PEER_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "charlotte_seed"), CHARLOTTE_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "nicola_seed"), NICOLA_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "anya_seed"), ANYA_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "bonnie_seed"), BONNIE_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "british_queen_seed"), BRITISH_QUEEN_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "catriona_seed"), CATRIONA_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "dunluce_seed"), DUNLUCE_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "estima_seed"), ESTIMA_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "kestrel_seed"), KESTREL_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "nadine_seed"), NADINE_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "ratte_seed"), RATTE_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "wilja_seed"), WILJA_SEED);

        // Register Maincrop
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "king_edward_seed"), KING_EDWARD_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "maris_piper_seed"), MARIS_PIPER_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "picasso_seed"), PICASSO_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "desiree_seed"), DESIREE_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "pink_fir_apple_seed"), PINK_FIR_APPLE_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "sarpo_mira_seed"), SARPO_MIRA_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "cara_seed"), CARA_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "majestic_seed"), MAJESTIC_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "record_seed"), RECORD_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "romano_seed"), ROMANO_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "rooster_seed"), ROOSTER_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "sante_seed"), SANTE_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "saxon_seed"), SAXON_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "valor_seed"), VALOR_SEED);

        // Register Specialty Varieties
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "elba_seed"), ELBA_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "kennebec_seed"), KENNEBEC_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "red_gold_seed"), RED_GOLD_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "masquerade_seed"), MASQUERADE_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "purple_majesty_seed"), PURPLE_MAJESTY_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "russian_banana_fingerling_seed"), RUSSIAN_BANANA_FINGERLING_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "red_norland_seed"), RED_NORLAND_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "kifli_seed"), KIFLI_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "lady_balfour_seed"), LADY_BALFOUR_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "vivaldi_seed"), VIVALDI_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "accord_seed"), ACCORD_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "congo_seed"), CONGO_SEED);
        Registry.register(Registries.ITEM, Identifier.of(Agronomy.MOD_ID, "mayan_gold_seed"), MAYAN_GOLD_SEED);
    }
}