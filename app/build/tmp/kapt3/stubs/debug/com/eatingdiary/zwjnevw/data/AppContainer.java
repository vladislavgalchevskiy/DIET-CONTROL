package com.eatingdiary.zwjnevw.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/AppContainer;", "", "foodRepository", "Lcom/eatingdiary/zwjnevw/data/food/FoodRepository;", "getFoodRepository", "()Lcom/eatingdiary/zwjnevw/data/food/FoodRepository;", "totalRepository", "Lcom/eatingdiary/zwjnevw/data/food/TotalRepository;", "getTotalRepository", "()Lcom/eatingdiary/zwjnevw/data/food/TotalRepository;", "weightRepository", "Lcom/eatingdiary/zwjnevw/data/weight/WeightRepository;", "getWeightRepository", "()Lcom/eatingdiary/zwjnevw/data/weight/WeightRepository;", "workoutCategoryRepository", "Lcom/eatingdiary/zwjnevw/data/workout/WorkoutCategoryRepository;", "getWorkoutCategoryRepository", "()Lcom/eatingdiary/zwjnevw/data/workout/WorkoutCategoryRepository;", "workoutItemsRepository", "Lcom/eatingdiary/zwjnevw/data/workout/WorkoutItemsRepository;", "getWorkoutItemsRepository", "()Lcom/eatingdiary/zwjnevw/data/workout/WorkoutItemsRepository;", "app_debug"})
public abstract interface AppContainer {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.eatingdiary.zwjnevw.data.workout.WorkoutItemsRepository getWorkoutItemsRepository();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.eatingdiary.zwjnevw.data.workout.WorkoutCategoryRepository getWorkoutCategoryRepository();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.eatingdiary.zwjnevw.data.weight.WeightRepository getWeightRepository();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.eatingdiary.zwjnevw.data.food.FoodRepository getFoodRepository();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.eatingdiary.zwjnevw.data.food.TotalRepository getTotalRepository();
}