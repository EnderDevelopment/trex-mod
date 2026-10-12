package com.jurassicboy26.trexmod;

import net.fabricmc.api.ClientModInitializer;

public class TRexClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TRexMod.LOGGER.info("Initializing TRex Mod Client");
        TRexRenderers.registerRenderers();
    }
}