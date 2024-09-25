package net.idothehax.agronomy.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.idothehax.agronomy.Agronomy;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup POTATOS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Agronomy.MOD_ID, "potatos"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ACCORD_SEED))
                    .displayName(Text.translatable("itemgroup.agronomy.potatos"))
                    .entries((displayContext, entries) -> {
                        // Add all potato seeds here
                        entries.add(ModItems.SWIFT_SEED);
                        entries.add(ModItems.PENTLAND_JAVELIN_SEED);
                        entries.add(ModItems.ROCKET_SEED);
                        entries.add(ModItems.CASABLANCA_SEED);
                        entries.add(ModItems.ARRAN_PILOT_SEED);
                        entries.add(ModItems.DUKE_OF_YORK_SEED);
                        entries.add(ModItems.RED_DUKE_OF_YORK_SEED);
                        entries.add(ModItems.EPICURE_SEED);
                        entries.add(ModItems.FOREMOST_SEED);
                        entries.add(ModItems.HOME_GUARD_SEED);
                        entries.add(ModItems.LADY_CHRISTL_SEED);
                        entries.add(ModItems.ORLA_SEED);
                        entries.add(ModItems.PREMIERE_SEED);
                        entries.add(ModItems.PURITAN_SEED);

                        entries.add(ModItems.MARIS_PEER_SEED);
                        entries.add(ModItems.CHARLOTTE_SEED);
                        entries.add(ModItems.NICOLA_SEED);
                        entries.add(ModItems.ANYA_SEED);
                        entries.add(ModItems.BONNIE_SEED);
                        entries.add(ModItems.BRITISH_QUEEN_SEED);
                        entries.add(ModItems.CATRIONA_SEED);
                        entries.add(ModItems.DUNLUCE_SEED);
                        entries.add(ModItems.ESTIMA_SEED);
                        entries.add(ModItems.KESTREL_SEED);
                        entries.add(ModItems.NADINE_SEED);
                        entries.add(ModItems.RATTE_SEED);
                        entries.add(ModItems.WILJA_SEED);

                        entries.add(ModItems.KING_EDWARD_SEED);
                        entries.add(ModItems.MARIS_PIPER_SEED);
                        entries.add(ModItems.PICASSO_SEED);
                        entries.add(ModItems.DESIREE_SEED);
                        entries.add(ModItems.PINK_FIR_APPLE_SEED);
                        entries.add(ModItems.SARPO_MIRA_SEED);
                        entries.add(ModItems.CARA_SEED);
                        entries.add(ModItems.MAJESTIC_SEED);
                        entries.add(ModItems.RECORD_SEED);
                        entries.add(ModItems.ROMANO_SEED);
                        entries.add(ModItems.ROOSTER_SEED);
                        entries.add(ModItems.SANTE_SEED);
                        entries.add(ModItems.SAXON_SEED);
                        entries.add(ModItems.VALOR_SEED);

                        entries.add(ModItems.ELBA_SEED);
                        entries.add(ModItems.KENNEBEC_SEED);
                        entries.add(ModItems.RED_GOLD_SEED);
                        entries.add(ModItems.MASQUERADE_SEED);
                        entries.add(ModItems.PURPLE_MAJESTY_SEED);
                        entries.add(ModItems.RUSSIAN_BANANA_FINGERLING_SEED);
                        entries.add(ModItems.RED_NORLAND_SEED);
                        entries.add(ModItems.KIFLI_SEED);
                        entries.add(ModItems.LADY_BALFOUR_SEED);
                        entries.add(ModItems.VIVALDI_SEED);
                        entries.add(ModItems.ACCORD_SEED);
                        entries.add(ModItems.CONGO_SEED);
                        entries.add(ModItems.MAYAN_GOLD_SEED);

                        entries.add(ModItems.ULSTER_PRINCE_SEED);
                        entries.add(ModItems.JERSEY_ROYAL_SEED);
                        entries.add(ModItems.MARFONA_SEED);
                    }).build());



    public static void registerItemGroups() {
        Agronomy.LOGGER.info("Registering Item Groups for " + Agronomy.MOD_ID);
    }
}