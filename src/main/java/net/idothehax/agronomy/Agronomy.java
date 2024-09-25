package net.idothehax.agronomy;

import net.fabricmc.api.ModInitializer;
import net.idothehax.agronomy.item.ModItemGroups;
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
        ModItemGroups.registerItemGroups();
    }
}
