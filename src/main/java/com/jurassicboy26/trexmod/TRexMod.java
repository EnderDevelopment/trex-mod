package com.jurassicboy26.trexmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TRexMod implements ModInitializer {
    public static final String MOD_ID = "trexmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    public static final EntityType<TRexEntity> TREX_ENTITY = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "trex"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TRexEntity::new)
                    .dimensions(EntityDimensions.fixed(7.0f, 5.0f))
                    .build()
    );
    
    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(TREX_ENTITY, TRexEntity.createTRexAttributes());
        LOGGER.info("TRex Mod initialized");
    }
}