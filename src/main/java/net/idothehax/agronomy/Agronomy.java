package net.idothehax.agronomy;

import net.fabricmc.api.ModInitializer;

import java.util.logging.Logger;

public class Agronomy implements ModInitializer {
    public static final String MOD_ID = "agronomy";
    public static Logger LOGGER;

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Agronomy");
    }
}
