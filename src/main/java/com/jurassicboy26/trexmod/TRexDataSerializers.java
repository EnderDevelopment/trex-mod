package com.jurassicboy26.trexmod;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.codec.PacketCodec;

public class TRexDataSerializers {
    public static final PacketCodec<PacketByteBuf, TRexData> TREX_DATA_CODEC = PacketCodec.of(
            (buf, data) -> {
                // Serialize T-Rex data to buffer
            },
            (buf) -> {
                // Deserialize T-Rex data from buffer
                return new TRexData();
            }
    );
}