package com.jurassicboy26.trexmod;

import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;

public class TRexSpawnEggItem extends SpawnEggItem {
    public TRexSpawnEggItem(EntityType<?> type, int primaryColor, int secondaryColor, Item.Settings settings) {
        super(type, primaryColor, secondaryColor, settings);
    }
}