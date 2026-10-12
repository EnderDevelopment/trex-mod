package com.jurassicboy26.trexmod.mixin;

import com.jurassicboy26.trexmod.TRexEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityModel.class)
public abstract class TRexModelMixin<T extends Entity> {
    @Inject(method = "setAngles", at = @At("HEAD"))
    private void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch, CallbackInfo ci) {
        if (entity instanceof TRexEntity) {
            ModelPart head = ((EntityModel<?>) this).getPart(EntityModelPartNames.HEAD);
            head.pitch = headPitch * ((float) Math.PI / 180F);
            head.yaw = headYaw * ((float) Math.PI / 180F);
        }
    }
}