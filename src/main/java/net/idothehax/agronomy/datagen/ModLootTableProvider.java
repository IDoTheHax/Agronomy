package net.idothehax.agronomy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.idothehax.agronomy.block.ModBlocks;
import net.idothehax.agronomy.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.AlternativeEntry;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // Add loot tables for each potato crop type
        //addDrop(Blocks.SHORT_GRASS, createGrassLoot());
        //addLoot(ModBlocks.PENTLAND_JAVELIN_CROP, ModItems.PENTLAND_JAVELIN_SEEDS);
        //addLoot(ModBlocks.ROCKET_CROP, ModItems.ROCKET_SEEDS);
        //addLoot(ModBlocks.CASABLANCA_CROP, ModItems.CASABLANCA_SEEDS);
        //addLoot(ModBlocks.MARIS_PIPER_CROP, ModItems.MARIS_PIPER_SEEDS);
        addDrop(ModBlocks.FOREMOST_POTATOES);
        addDrop(ModBlocks.KING_EDWARD_POTATOES, ModItems.KING_EDWARD_SEED);
        //addLoot(ModBlocks.DESIREE_CROP, ModItems.DESIREE_SEEDS);
        // Add additional crops as needed

        addSeedLootTable();

        addPotatoLootTable(ModBlocks.SWIFT_POTATOES, "swift_potato");

        LootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.SWIFT_POTATOES).properties(StatePredicate.Builder.create().exactMatch(CropBlock.AGE, 2));
        addDrop(ModBlocks.SWIFT_POTATOES, cropDrops(ModBlocks.SWIFT_POTATOES, ModItems.SWIFT_SEED, ModItems.SWIFT_SEED, builder2));
    }

    private void addPotatoLootTable(Block block, String name) {
        LootTable.Builder builder = LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.SWIFT_SEED)
                                .conditionally(BlockStatePropertyLootCondition.builder(block)
                                        .properties(StatePredicate.Builder.create().exactMatch(CropBlock.AGE, 7)))
                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE)))
                        )
                )


                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(Items.POISONOUS_POTATO))
                        .with(ItemEntry.builder(ModItems.SWIFT_SEED)
                                .conditionally(BlockStatePropertyLootCondition.builder(block)
                                        .properties(StatePredicate.Builder.create().exactMatch(CropBlock.AGE, 7)))
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)))
                ));

        lootTables.put(block.getLootTableKey(), builder);
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
