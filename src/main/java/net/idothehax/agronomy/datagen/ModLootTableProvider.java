package net.idothehax.agronomy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.idothehax.agronomy.block.ModBlocks;
import net.idothehax.agronomy.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.block.PotatoesBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // First Earlies
        LootCondition.Builder builderSwift = BlockStatePropertyLootCondition.builder(ModBlocks.SWIFT_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.SWIFT_POTATOES, this.applyExplosionDecay(ModBlocks.SWIFT_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.SWIFT_SEED)))
                .pool(LootPool.builder().conditionally(builderSwift).with(ItemEntry.builder(ModItems.SWIFT_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderSwift).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderPentlandJavelin = BlockStatePropertyLootCondition.builder(ModBlocks.PENTLAND_JAVELIN_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.PENTLAND_JAVELIN_POTATOES, this.applyExplosionDecay(ModBlocks.PENTLAND_JAVELIN_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.PENTLAND_JAVELIN_SEED)))
                .pool(LootPool.builder().conditionally(builderPentlandJavelin).with(ItemEntry.builder(ModItems.PENTLAND_JAVELIN_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderPentlandJavelin).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderRocket = BlockStatePropertyLootCondition.builder(ModBlocks.ROCKET_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.ROCKET_POTATOES, this.applyExplosionDecay(ModBlocks.ROCKET_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.ROCKET_SEED)))
                .pool(LootPool.builder().conditionally(builderRocket).with(ItemEntry.builder(ModItems.ROCKET_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderRocket).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderCasablanca = BlockStatePropertyLootCondition.builder(ModBlocks.CASABLANCA_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.CASABLANCA_POTATOES, this.applyExplosionDecay(ModBlocks.CASABLANCA_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.CASABLANCA_SEED)))
                .pool(LootPool.builder().conditionally(builderCasablanca).with(ItemEntry.builder(ModItems.CASABLANCA_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderCasablanca).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderArran = BlockStatePropertyLootCondition.builder(ModBlocks.ARRAN_PILOT_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.ARRAN_PILOT_POTATOES, this.applyExplosionDecay(ModBlocks.ARRAN_PILOT_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.ARRAN_PILOT_SEED)))
                .pool(LootPool.builder().conditionally(builderArran).with(ItemEntry.builder(ModItems.ARRAN_PILOT_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderArran).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderDuke = BlockStatePropertyLootCondition.builder(ModBlocks.DUKE_OF_YORK_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.DUKE_OF_YORK_POTATOES, this.applyExplosionDecay(ModBlocks.DUKE_OF_YORK_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.DUKE_OF_YORK_SEED)))
                .pool(LootPool.builder().conditionally(builderDuke).with(ItemEntry.builder(ModItems.DUKE_OF_YORK_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderDuke).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderRedDuke = BlockStatePropertyLootCondition.builder(ModBlocks.RED_DUKE_OF_YORK_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.RED_DUKE_OF_YORK_POTATOES, this.applyExplosionDecay(ModBlocks.DUKE_OF_YORK_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.RED_DUKE_OF_YORK_SEED)))
                .pool(LootPool.builder().conditionally(builderRedDuke).with(ItemEntry.builder(ModItems.RED_DUKE_OF_YORK_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderRedDuke).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderEpicure = BlockStatePropertyLootCondition.builder(ModBlocks.EPICURE_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.EPICURE_POTATOES, this.applyExplosionDecay(ModBlocks.EPICURE_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.EPICURE_SEED)))
                .pool(LootPool.builder().conditionally(builderEpicure).with(ItemEntry.builder(ModItems.EPICURE_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderEpicure).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderForemost = BlockStatePropertyLootCondition.builder(ModBlocks.FOREMOST_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.FOREMOST_POTATOES, this.applyExplosionDecay(ModBlocks.FOREMOST_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.FOREMOST_SEED)))
                .pool(LootPool.builder().conditionally(builderForemost).with(ItemEntry.builder(ModItems.FOREMOST_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderForemost).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderHomeGuard = BlockStatePropertyLootCondition.builder(ModBlocks.HOME_GUARD_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.HOME_GUARD_POTATOES, this.applyExplosionDecay(ModBlocks.HOME_GUARD_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.HOME_GUARD_SEED)))
                .pool(LootPool.builder().conditionally(builderHomeGuard).with(ItemEntry.builder(ModItems.HOME_GUARD_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderHomeGuard).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderLadyChristl = BlockStatePropertyLootCondition.builder(ModBlocks.LADY_CHRISTL_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.LADY_CHRISTL_POTATOES, this.applyExplosionDecay(ModBlocks.LADY_CHRISTL_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.LADY_CHRISTL_SEED)))
                .pool(LootPool.builder().conditionally(builderLadyChristl).with(ItemEntry.builder(ModItems.LADY_CHRISTL_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderLadyChristl).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderOrla = BlockStatePropertyLootCondition.builder(ModBlocks.ORLA_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.ORLA_POTATOES, this.applyExplosionDecay(ModBlocks.ORLA_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.ORLA_SEED)))
                .pool(LootPool.builder().conditionally(builderOrla).with(ItemEntry.builder(ModItems.ORLA_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderOrla).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderPremiere = BlockStatePropertyLootCondition.builder(ModBlocks.PREMIERE_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.PREMIERE_POTATOES, this.applyExplosionDecay(ModBlocks.PREMIERE_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.PREMIERE_SEED)))
                .pool(LootPool.builder().conditionally(builderPremiere).with(ItemEntry.builder(ModItems.PREMIERE_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderPremiere).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderPuritan = BlockStatePropertyLootCondition.builder(ModBlocks.PURITAN_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.PURITAN_POTATOES, this.applyExplosionDecay(ModBlocks.PURITAN_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.PURITAN_SEED)))
                .pool(LootPool.builder().conditionally(builderPuritan).with(ItemEntry.builder(ModItems.PURITAN_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderPuritan).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderUlser = BlockStatePropertyLootCondition.builder(ModBlocks.ULSTER_PRINCE_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.ULSTER_PRINCE_POTATOES, this.applyExplosionDecay(ModBlocks.ULSTER_PRINCE_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.ULSTER_PRINCE_SEED)))
                .pool(LootPool.builder().conditionally(builderUlser).with(ItemEntry.builder(ModItems.ULSTER_PRINCE_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderUlser).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderJersey = BlockStatePropertyLootCondition.builder(ModBlocks.JERSEY_ROYAL_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.JERSEY_ROYAL_POTATOES, this.applyExplosionDecay(ModBlocks.JERSEY_ROYAL_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.JERSEY_ROYAL_SEED)))
                .pool(LootPool.builder().conditionally(builderJersey).with(ItemEntry.builder(ModItems.JERSEY_ROYAL_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderJersey).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderMarfona = BlockStatePropertyLootCondition.builder(ModBlocks.MARFONA_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.MARFONA_POTATOES, this.applyExplosionDecay(ModBlocks.MARFONA_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.MARFONA_SEED)))
                .pool(LootPool.builder().conditionally(builderMarfona).with(ItemEntry.builder(ModItems.MARFONA_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderMarfona).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        // Second Earlies
        LootCondition.Builder builderMarisPeer = BlockStatePropertyLootCondition.builder(ModBlocks.MARIS_PEER_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.MARIS_PEER_POTATOES, this.applyExplosionDecay(ModBlocks.MARIS_PEER_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.MARIS_PEER_SEED)))
                .pool(LootPool.builder().conditionally(builderMarisPeer).with(ItemEntry.builder(ModItems.MARIS_PEER_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderMarisPeer).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderCharlotte = BlockStatePropertyLootCondition.builder(ModBlocks.CHARLOTTE_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.CHARLOTTE_POTATOES, this.applyExplosionDecay(ModBlocks.CHARLOTTE_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.CHARLOTTE_SEED)))
                .pool(LootPool.builder().conditionally(builderCharlotte).with(ItemEntry.builder(ModItems.CHARLOTTE_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderCharlotte).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderNicola = BlockStatePropertyLootCondition.builder(ModBlocks.NICOLA_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.NICOLA_POTATOES, this.applyExplosionDecay(ModBlocks.NICOLA_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.NICOLA_SEED)))
                .pool(LootPool.builder().conditionally(builderNicola).with(ItemEntry.builder(ModItems.NICOLA_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderNicola).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderAnya = BlockStatePropertyLootCondition.builder(ModBlocks.ANYA_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.ANYA_POTATOES, this.applyExplosionDecay(ModBlocks.ANYA_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.ANYA_SEED)))
                .pool(LootPool.builder().conditionally(builderAnya).with(ItemEntry.builder(ModItems.ANYA_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderAnya).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderBonnie = BlockStatePropertyLootCondition.builder(ModBlocks.BONNIE_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.BONNIE_POTATOES, this.applyExplosionDecay(ModBlocks.BONNIE_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.BONNIE_SEED)))
                .pool(LootPool.builder().conditionally(builderBonnie).with(ItemEntry.builder(ModItems.BONNIE_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderBonnie).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderBritishQueen = BlockStatePropertyLootCondition.builder(ModBlocks.BRITISH_QUEEN_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.BRITISH_QUEEN_POTATOES, this.applyExplosionDecay(ModBlocks.BRITISH_QUEEN_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.BRITISH_QUEEN_SEED)))
                .pool(LootPool.builder().conditionally(builderBritishQueen).with(ItemEntry.builder(ModItems.BRITISH_QUEEN_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderBritishQueen).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderCatriona = BlockStatePropertyLootCondition.builder(ModBlocks.CATRIONA_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.CATRIONA_POTATOES, this.applyExplosionDecay(ModBlocks.CATRIONA_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.CATRIONA_SEED)))
                .pool(LootPool.builder().conditionally(builderCatriona).with(ItemEntry.builder(ModItems.CATRIONA_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderCatriona).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderDunluce = BlockStatePropertyLootCondition.builder(ModBlocks.DUNLUCE_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.DUNLUCE_POTATOES, this.applyExplosionDecay(ModBlocks.DUNLUCE_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.DUNLUCE_SEED)))
                .pool(LootPool.builder().conditionally(builderDunluce).with(ItemEntry.builder(ModItems.DUNLUCE_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderDunluce).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderEstima = BlockStatePropertyLootCondition.builder(ModBlocks.ESTIMA_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.ESTIMA_POTATOES, this.applyExplosionDecay(ModBlocks.ESTIMA_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.ESTIMA_SEED)))
                .pool(LootPool.builder().conditionally(builderEstima).with(ItemEntry.builder(ModItems.ESTIMA_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderEstima).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderKestrel = BlockStatePropertyLootCondition.builder(ModBlocks.KESTREL_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.KESTREL_POTATOES, this.applyExplosionDecay(ModBlocks.KESTREL_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.KESTREL_SEED)))
                .pool(LootPool.builder().conditionally(builderKestrel).with(ItemEntry.builder(ModItems.KESTREL_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderKestrel).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderNadine = BlockStatePropertyLootCondition.builder(ModBlocks.NADINE_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.NADINE_POTATOES, this.applyExplosionDecay(ModBlocks.NADINE_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.NADINE_SEED)))
                .pool(LootPool.builder().conditionally(builderNadine).with(ItemEntry.builder(ModItems.NADINE_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderNadine).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderRatte = BlockStatePropertyLootCondition.builder(ModBlocks.RATTE_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.RATTE_POTATOES, this.applyExplosionDecay(ModBlocks.RATTE_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.RATTE_SEED)))
                .pool(LootPool.builder().conditionally(builderRatte).with(ItemEntry.builder(ModItems.RATTE_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderRatte).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderWilja = BlockStatePropertyLootCondition.builder(ModBlocks.WILJA_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.WILJA_POTATOES, this.applyExplosionDecay(ModBlocks.WILJA_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.WILJA_SEED)))
                .pool(LootPool.builder().conditionally(builderWilja).with(ItemEntry.builder(ModItems.WILJA_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderWilja).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        // Maincrop
        LootCondition.Builder builderKingEdward = BlockStatePropertyLootCondition.builder(ModBlocks.KING_EDWARD_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.KING_EDWARD_POTATOES, this.applyExplosionDecay(ModBlocks.KING_EDWARD_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.KING_EDWARD_SEED)))
                .pool(LootPool.builder().conditionally(builderKingEdward).with(ItemEntry.builder(ModItems.KING_EDWARD_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderKingEdward).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderMarisPiper = BlockStatePropertyLootCondition.builder(ModBlocks.MARIS_PIPER_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.MARIS_PIPER_POTATOES, this.applyExplosionDecay(ModBlocks.MARIS_PIPER_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.MARIS_PIPER_SEED)))
                .pool(LootPool.builder().conditionally(builderMarisPiper).with(ItemEntry.builder(ModItems.MARIS_PIPER_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderMarisPiper).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderpicasso = BlockStatePropertyLootCondition.builder(ModBlocks.PICASSO_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.PICASSO_POTATOES, this.applyExplosionDecay(ModBlocks.PICASSO_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.PICASSO_SEED)))
                .pool(LootPool.builder().conditionally(builderpicasso).with(ItemEntry.builder(ModItems.PICASSO_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderpicasso).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));


        LootCondition.Builder builderDesiree = BlockStatePropertyLootCondition.builder(ModBlocks.DESIREE_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.DESIREE_POTATOES, this.applyExplosionDecay(ModBlocks.DESIREE_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.DESIREE_SEED)))
                .pool(LootPool.builder().conditionally(builderDesiree).with(ItemEntry.builder(ModItems.DESIREE_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderDesiree).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderPinkFirApple = BlockStatePropertyLootCondition.builder(ModBlocks.PINK_FIR_APPLE_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.PINK_FIR_APPLE_POTATOES, this.applyExplosionDecay(ModBlocks.PINK_FIR_APPLE_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.PINK_FIR_APPLE_SEED)))
                .pool(LootPool.builder().conditionally(builderPinkFirApple).with(ItemEntry.builder(ModItems.PINK_FIR_APPLE_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderPinkFirApple).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderSarpoMira = BlockStatePropertyLootCondition.builder(ModBlocks.SARPO_MIRA_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.SARPO_MIRA_POTATOES, this.applyExplosionDecay(ModBlocks.SARPO_MIRA_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.SARPO_MIRA_SEED)))
                .pool(LootPool.builder().conditionally(builderSarpoMira).with(ItemEntry.builder(ModItems.SARPO_MIRA_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderSarpoMira).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderCara = BlockStatePropertyLootCondition.builder(ModBlocks.CARA_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.CARA_POTATOES, this.applyExplosionDecay(ModBlocks.CARA_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.CARA_SEED)))
                .pool(LootPool.builder().conditionally(builderCara).with(ItemEntry.builder(ModItems.CARA_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderCara).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderMajestic = BlockStatePropertyLootCondition.builder(ModBlocks.MAJESTIC_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.MAJESTIC_POTATOES, this.applyExplosionDecay(ModBlocks.MAJESTIC_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.MAJESTIC_SEED)))
                .pool(LootPool.builder().conditionally(builderMajestic).with(ItemEntry.builder(ModItems.MAJESTIC_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderMajestic).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderRecord = BlockStatePropertyLootCondition.builder(ModBlocks.RECORD_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.RECORD_POTATOES, this.applyExplosionDecay(ModBlocks.RECORD_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.RECORD_SEED)))
                .pool(LootPool.builder().conditionally(builderRecord).with(ItemEntry.builder(ModItems.RECORD_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderRecord).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderRomano = BlockStatePropertyLootCondition.builder(ModBlocks.ROMANO_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.ROMANO_POTATOES, this.applyExplosionDecay(ModBlocks.ROMANO_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.ROMANO_SEED)))
                .pool(LootPool.builder().conditionally(builderRomano).with(ItemEntry.builder(ModItems.ROMANO_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderRomano).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderRooster = BlockStatePropertyLootCondition.builder(ModBlocks.ROOSTER_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.ROOSTER_POTATOES, this.applyExplosionDecay(ModBlocks.ROOSTER_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.ROOSTER_SEED)))
                .pool(LootPool.builder().conditionally(builderRooster).with(ItemEntry.builder(ModItems.ROOSTER_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderRooster).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderSante = BlockStatePropertyLootCondition.builder(ModBlocks.SANTE_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.SANTE_POTATOES, this.applyExplosionDecay(ModBlocks.SANTE_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.SANTE_SEED)))
                .pool(LootPool.builder().conditionally(builderSante).with(ItemEntry.builder(ModItems.SANTE_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderSante).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderSaxon = BlockStatePropertyLootCondition.builder(ModBlocks.SAXON_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.SAXON_POTATOES, this.applyExplosionDecay(ModBlocks.SAXON_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.SAXON_SEED)))
                .pool(LootPool.builder().conditionally(builderSaxon).with(ItemEntry.builder(ModItems.SAXON_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderSaxon).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderValor = BlockStatePropertyLootCondition.builder(ModBlocks.VALOR_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.VALOR_POTATOES, this.applyExplosionDecay(ModBlocks.VALOR_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.VALOR_SEED)))
                .pool(LootPool.builder().conditionally(builderValor).with(ItemEntry.builder(ModItems.VALOR_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderValor).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        // Speciality Varieties
        LootCondition.Builder builderElba = BlockStatePropertyLootCondition.builder(ModBlocks.ELBA_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.ELBA_POTATOES, this.applyExplosionDecay(ModBlocks.ELBA_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.ELBA_SEED)))
                .pool(LootPool.builder().conditionally(builderElba).with(ItemEntry.builder(ModItems.ELBA_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderElba).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderKennebec = BlockStatePropertyLootCondition.builder(ModBlocks.KENNEBEC_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.KENNEBEC_POTATOES, this.applyExplosionDecay(ModBlocks.KENNEBEC_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.KENNEBEC_SEED)))
                .pool(LootPool.builder().conditionally(builderKennebec).with(ItemEntry.builder(ModItems.KENNEBEC_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderKennebec).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderRedGold = BlockStatePropertyLootCondition.builder(ModBlocks.RED_GOLD_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.RED_GOLD_POTATOES, this.applyExplosionDecay(ModBlocks.RED_GOLD_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.RED_GOLD_SEED)))
                .pool(LootPool.builder().conditionally(builderRedGold).with(ItemEntry.builder(ModItems.RED_GOLD_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderRedGold).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderMasquerade = BlockStatePropertyLootCondition.builder(ModBlocks.MASQUERADE_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.MASQUERADE_POTATOES, this.applyExplosionDecay(ModBlocks.MASQUERADE_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.MASQUERADE_SEED)))
                .pool(LootPool.builder().conditionally(builderMasquerade).with(ItemEntry.builder(ModItems.MASQUERADE_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderMasquerade).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderPurpleMajesty = BlockStatePropertyLootCondition.builder(ModBlocks.PURPLE_MAJESTY_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.PURPLE_MAJESTY_POTATOES, this.applyExplosionDecay(ModBlocks.PURPLE_MAJESTY_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.PURPLE_MAJESTY_SEED)))
                .pool(LootPool.builder().conditionally(builderPurpleMajesty).with(ItemEntry.builder(ModItems.PURPLE_MAJESTY_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderPurpleMajesty).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderRussianBananaFingerling = BlockStatePropertyLootCondition.builder(ModBlocks.RUSSIAN_BANANA_FINGERLING_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.RUSSIAN_BANANA_FINGERLING_POTATOES, this.applyExplosionDecay(ModBlocks.RUSSIAN_BANANA_FINGERLING_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.RUSSIAN_BANANA_FINGERLING_SEED)))
                .pool(LootPool.builder().conditionally(builderRussianBananaFingerling).with(ItemEntry.builder(ModItems.RUSSIAN_BANANA_FINGERLING_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderRussianBananaFingerling).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderRedNorland = BlockStatePropertyLootCondition.builder(ModBlocks.RED_NORLAND_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.RED_NORLAND_POTATOES, this.applyExplosionDecay(ModBlocks.RED_NORLAND_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.RED_NORLAND_SEED)))
                .pool(LootPool.builder().conditionally(builderRedNorland).with(ItemEntry.builder(ModItems.RED_NORLAND_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderRedNorland).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderKifli = BlockStatePropertyLootCondition.builder(ModBlocks.KIFLI_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.KIFLI_POTATOES, this.applyExplosionDecay(ModBlocks.KIFLI_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.KIFLI_SEED)))
                .pool(LootPool.builder().conditionally(builderKifli).with(ItemEntry.builder(ModItems.KIFLI_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderKifli).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderLadyBalfour = BlockStatePropertyLootCondition.builder(ModBlocks.LADY_BALFOUR_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.LADY_BALFOUR_POTATOES, this.applyExplosionDecay(ModBlocks.LADY_BALFOUR_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.LADY_BALFOUR_SEED)))
                .pool(LootPool.builder().conditionally(builderLadyBalfour).with(ItemEntry.builder(ModItems.LADY_BALFOUR_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderLadyBalfour).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderVivaldi = BlockStatePropertyLootCondition.builder(ModBlocks.VIVALDI_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.VIVALDI_POTATOES, this.applyExplosionDecay(ModBlocks.VIVALDI_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.VIVALDI_SEED)))
                .pool(LootPool.builder().conditionally(builderVivaldi).with(ItemEntry.builder(ModItems.VIVALDI_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderVivaldi).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderAccord = BlockStatePropertyLootCondition.builder(ModBlocks.ACCORD_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.ACCORD_POTATOES, this.applyExplosionDecay(ModBlocks.ACCORD_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.ACCORD_SEED)))
                .pool(LootPool.builder().conditionally(builderAccord).with(ItemEntry.builder(ModItems.ACCORD_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderAccord).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderCongo = BlockStatePropertyLootCondition.builder(ModBlocks.CONGO_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.CONGO_POTATOES, this.applyExplosionDecay(ModBlocks.CONGO_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.CONGO_SEED)))
                .pool(LootPool.builder().conditionally(builderCongo).with(ItemEntry.builder(ModItems.CONGO_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderCongo).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

        LootCondition.Builder builderMayanGold = BlockStatePropertyLootCondition.builder(ModBlocks.MAYAN_GOLD_POTATOES)
                .properties(StatePredicate.Builder.create().exactMatch(PotatoesBlock.AGE, 7));
        this.addDrop(ModBlocks.MAYAN_GOLD_POTATOES, this.applyExplosionDecay(ModBlocks.MAYAN_GOLD_POTATOES, LootTable.builder()
                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.MAYAN_GOLD_SEED)))
                .pool(LootPool.builder().conditionally(builderMayanGold).with(ItemEntry.builder(ModItems.MAYAN_GOLD_SEED)
                        .apply(ApplyBonusLootFunction.binomialWithBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))
                .pool(LootPool.builder().conditionally(builderMayanGold).with(ItemEntry.builder(Items.POISONOUS_POTATO)
                        .conditionally(RandomChanceLootCondition.builder(0.02F))))));

    }


    private void addSeedLootTable() {
        // Modify the Minecraft dirt loot table
        this.addDrop(Blocks.SHORT_GRASS, LootTable.builder()
            .pool(LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .with(ItemEntry.builder(Items.WHEAT_SEEDS))
                .with(ItemEntry.builder(ModItems.SWIFT_SEED)
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)))) // Drop 1-2 diamonds
            )
        );
    }
}
