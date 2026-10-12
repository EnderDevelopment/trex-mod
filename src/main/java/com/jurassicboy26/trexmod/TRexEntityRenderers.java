package com.jurassicboy26.trexmod;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;

public class TRexEntityRenderers {
    public static class TRexRenderer extends MobEntityRenderer<TRexEntity, TRexEntityModels.TRexModel<TRexEntity>> {
        public TRexRenderer(EntityRendererFactory.Context context) {
            super(context, new TRexEntityModels.TRexModel<>(context.getPart(TRexEntityModels.TREX_MODEL_LAYER)), 0.7F);
        }
    }
    
    public static void registerRenderers() {
        // Register renderers for the T-Rex entity
    }
}