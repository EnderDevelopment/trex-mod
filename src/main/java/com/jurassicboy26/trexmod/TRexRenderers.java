package com.jurassicboy26.trexmod;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;

public class TRexRenderers {
    public static class TRexRenderer extends MobEntityRenderer<TRexEntity, TRexModels.TRexModel<TRexEntity>> {
        public TRexRenderer(EntityRendererFactory.Context context) {
            super(context, new TRexModels.TRexModel<>(context.getPart(TRexModels.TREX_MODEL_LAYER)), 0.7F);
        }
    }
    
    public static void registerRenderers() {
        // Register renderers for the T-Rex
    }
}