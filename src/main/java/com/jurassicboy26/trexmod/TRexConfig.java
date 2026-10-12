package com.jurassicboy26.trexmod;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "trexmod")
public class TRexConfig implements ConfigData {
    public boolean spawnWithEgg = true;
    public int spawnRate = 10;
    public boolean biomeVariations = true;
}