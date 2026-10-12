package com.jurassicboy26.trexmod;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;

public class TRexNetwork {
    public static void registerNetwork() {
        ServerPlayNetworking.registerGlobalReceiver(new Identifier(TRexMod.MOD_ID, "trex_data"), (server, player, handler, buf, responseSender) -> {
            // Handle network communication for the T-Rex
        });
    }
}