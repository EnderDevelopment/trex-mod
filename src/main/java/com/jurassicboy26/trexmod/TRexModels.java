package com.jurassicboy26.trexmod;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.Entity;

public class TRexModels {
    public static class TRexModel<T extends Entity> extends EntityModel<T> {
        private final ModelPart body;
        private final ModelPart head;
        private final ModelPart leftLeg;
        private final ModelPart rightLeg;
        
        public TRexModel(ModelPart root) {
            this.body = root.getChild("body");
            this.head = root.getChild("head");
            this.leftLeg = root.getChild("left_leg");
            this.rightLeg = root.getChild("right_leg");
        }
        
        @Override
        public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
            // Set angles for the T-Rex model parts
        }
        
        @Override
        public void render(net.minecraft.client.util.math.MatrixStack matrices, net.minecraft.client.render.VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
            // Render the T-Rex model
        }
    }
    
    public static void registerModels() {
        // Register models for the T-Rex
    }
}