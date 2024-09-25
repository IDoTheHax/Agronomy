package net.idothehax.agronomy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.idothehax.agronomy.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.AlternativeEntry;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // Add loot tables for each potato crop type
        addDrop(Blocks.SHORT_GRASS, createGrassLoot());
        //addLoot(ModBlocks.PENTLAND_JAVELIN_CROP, ModItems.PENTLAND_JAVELIN_SEEDS);
        //addLoot(ModBlocks.ROCKET_CROP, ModItems.ROCKET_SEEDS);
        //addLoot(ModBlocks.CASABLANCA_CROP, ModItems.CASABLANCA_SEEDS);
        //addLoot(ModBlocks.MARIS_PIPER_CROP, ModItems.MARIS_PIPER_SEEDS);
        //addLoot(ModBlocks.KING_EDWARD_CROP, ModItems.KING_EDWARD_SEEDS);
        //addLoot(ModBlocks.DESIREE_CROP, ModItems.DESIREE_SEEDS);
        // Add additional crops as needed
    }

    private LootTable.Builder createGrassLoot() {
        // Create the loot pool for grass blocks
        LootPool.Builder poolBuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1)) // Set the number of rolls using a LootNumberProvider
                .add(ItemEntry.builder(Items.GRASS)
                        .conditionally(MatchToolLootCondition.builder(Items.SHEARS))) // Drop grass when using shears
                .add(ItemEntry.builder(ModItems.SWIFT_SEEDS)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0, 2)))
                        .apply(ApplyBonusLootFunction.oreDrops(net.minecraft.world.item.enchantment.Enchantments.BLOCK_FORTUNE))); // Add Swift Seeds

        return LootTable.builder().add(poolBuilder); // Use add instead of addPool
    }
}
