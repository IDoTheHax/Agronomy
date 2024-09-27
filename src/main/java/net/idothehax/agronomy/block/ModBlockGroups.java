package net.idothehax.agronomy.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.idothehax.agronomy.Agronomy;
import net.idothehax.agronomy.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModBlockGroups {
    public static final ItemGroup POTATOS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Agronomy.MOD_ID, "block_potatos"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.KING_EDWARD_POTATOES))
                    .displayName(Text.translatable("itemgroup.agronomy.block_potatos"))
                    .entries((displayContext, entries) -> {

                    }).build());



    public static void registerBlockGroups() {
        Agronomy.LOGGER.info("Registering Block Groups for " + Agronomy.MOD_ID);
    }
}