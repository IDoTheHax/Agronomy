package net.idothehax.agronomy;

import net.fabricmc.api.ModInitializer;
import net.idothehax.agronomy.block.ModBlockGroups;
import net.idothehax.agronomy.block.ModBlocks;
import net.idothehax.agronomy.item.ModCreativeGroups;
import net.idothehax.agronomy.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Agronomy implements ModInitializer {
    public static final String MOD_ID = "agronomy";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Agronomy");
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModCreativeGroups.registerCreativeGroups();
        ModBlockGroups.registerBlockGroups();
    }
}
