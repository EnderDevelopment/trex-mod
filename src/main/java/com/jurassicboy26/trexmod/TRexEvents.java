package com.jurassicboy26.trexmod;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class TRexEvents {
    public static void registerEvents() {
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            // Handle server tick events for the T-Rex
        });
    }
}