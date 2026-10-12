package com.jurassicboy26.trexmod;

import net.fabricmc.api.ModInitializer;

public class TRexMain implements ModInitializer {
    @Override
    public void onInitialize() {
        TRexMod.LOGGER.info("Initializing TRex Mod");
        TRexBiomeVariations.registerBiomeVariations();
        TRexAnimations.registerAnimations();
        TRexSounds.registerSounds();
        TRexTextures.registerTextures();
        TRexModels.registerModels();
        TRexRenderers.registerRenderers();
        TRexEvents.registerEvents();
        TRexCommands.registerCommands();
        TRexNetwork.registerNetwork();
    }
}