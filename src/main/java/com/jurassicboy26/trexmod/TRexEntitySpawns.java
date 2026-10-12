package com.jurassicboy26.trexmod;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.BiomeKeys;

public class TRexEntitySpawns {
    public static void registerSpawns() {
        BiomeModifications.addSpawn(
                BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                SpawnGroup.CREATURE,
                TRexMod.TREX_ENTITY,
                10,
                1,
                3
        );
    }
}