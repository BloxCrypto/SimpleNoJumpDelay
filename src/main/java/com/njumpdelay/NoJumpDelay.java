package com.njumpdelay;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoJumpDelay implements ModInitializer {
    public static final String MOD_ID = "nojumpdelay";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("No Jump Delay loaded — jump whenever you want!");
    }
}