package com.jurassicboy26.trexmod.mixin;

import com.jurassicboy26.trexmod.TRexEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.mob.MobEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MobEntityRenderer.class)
public abstract class TRexRendererMixin<T extends MobEntity, M extends EntityModel<T>> {
    @Inject(method = "<init>", at = @At("RETURN"))
    private void init(EntityRendererFactory.Context ctx, EntityModel<T> model, float shadowRadius, CallbackInfo ci) {
        if (this instanceof MobEntityRenderer && ((MobEntityRenderer<?, ?>) this).getModel() instanceof TRexEntity) {
            // Custom rendering logic for T-Rex
        }
    }
}