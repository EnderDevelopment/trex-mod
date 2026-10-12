package com.jurassicboy26.trexmod;

import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.GoalSelector;

public class TRexEntityGoals {
    public static void registerGoals(GoalSelector goalSelector) {
        goalSelector.add(0, new TRexFood.EatGoal((TRexEntity) goalSelector.getMob()));
        goalSelector.add(1, new TRexFood.DrinkGoal((TRexEntity) goalSelector.getMob()));
    }
}