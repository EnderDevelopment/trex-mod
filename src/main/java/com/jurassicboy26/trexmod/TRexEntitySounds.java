package com.jurassicboy26.trexmod;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class TRexEntitySounds {
    public static final SoundEvent TREX_ROAR = SoundEvent.of(new Identifier(TRexMod.MOD_ID, "trex_roar"));
    public static final SoundEvent TREX_GROWL = SoundEvent.of(new Identifier(TRexMod.MOD_ID, "trex_growl"));
    
    public static void registerSounds() {
        // Register sounds for the T-Rex entity
    }
}