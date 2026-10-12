package com.jurassicboy26.trexmod;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.world.World;

public class TRexFood {
    public static class EatGoal extends Goal {
        private final TRexEntity trex;
        private final World world;
        private int eatTimer;
        
        public EatGoal(TRexEntity trex) {
            this.trex = trex;
            this.world = trex.getWorld();
            this.eatTimer = 0;
        }
        
        @Override
        public boolean canStart() {
            return this.eatTimer <= 0;
        }
        
        @Override
        public void start() {
            this.eatTimer = 25 * 60 * 20; // 25 minutes in ticks
            // Logic to make the T-Rex eat
        }
        
        @Override
        public void tick() {
            this.eatTimer--;
        }
    }
    
    public static class DrinkGoal extends Goal {
        private final TRexEntity trex;
        private final World world;
        private int drinkTimer;
        
        public DrinkGoal(TRexEntity trex) {
            this.trex = trex;
            this.world = trex.getWorld();
            this.drinkTimer = 0;
        }
        
        @Override
        public boolean canStart() {
            return this.drinkTimer <= 0;
        }
        
        @Override
        public void start() {
            this.drinkTimer = 20 * 60 * 20; // 20 minutes in ticks
            // Logic to make the T-Rex drink
        }
        
        @Override
        public void tick() {
            this.drinkTimer--;
        }
    }
}