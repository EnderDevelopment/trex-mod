package com.jurassicboy26.trexmod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public class TRexItemGroup {
    public static final ItemGroup TREX_MOD = ItemGroup.create(
            ItemGroup.Row.TOP,
            0,
            "trexmod"
    ).displayName(Text.translatable("itemGroup.trexmod.trexmod")).icon(() -> new ItemStack(TRexMod.TREX_SPAWN_EGG)).build();
}