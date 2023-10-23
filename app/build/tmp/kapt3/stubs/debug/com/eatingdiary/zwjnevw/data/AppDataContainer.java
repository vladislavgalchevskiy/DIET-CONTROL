package com.eatingdiary.zwjnevw.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001f"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/AppDataContainer;", "Lcom/eatingdiary/zwjnevw/data/AppContainer;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "foodRepository", "Lcom/eatingdiary/zwjnevw/data/food/FoodRepository;", "getFoodRepository", "()Lcom/eatingdiary/zwjnevw/data/food/FoodRepository;", "foodRepository$delegate", "Lkotlin/Lazy;", "totalRepository", "Lcom/eatingdiary/zwjnevw/data/food/TotalRepository;", "getTotalRepository", "()Lcom/eatingdiary/zwjnevw/data/food/TotalRepository;", "totalRepository$delegate", "weightRepository", "Lcom/eatingdiary/zwjnevw/data/weight/WeightRepository;", "getWeightRepository", "()Lcom/eatingdiary/zwjnevw/data/weight/WeightRepository;", "weightRepository$delegate", "workoutCategoryRepository", "Lcom/eatingdiary/zwjnevw/data/workout/WorkoutCategoryRepository;", "getWorkoutCategoryRepository", "()Lcom/eatingdiary/zwjnevw/data/workout/WorkoutCategoryRepository;", "workoutCategoryRepository$delegate", "workoutItemsRepository", "Lcom/eatingdiary/zwjnevw/data/workout/WorkoutItemsRepository;", "getWorkoutItemsRepository", "()Lcom/eatingdiary/zwjnevw/data/workout/WorkoutItemsRepository;", "workoutItemsRepository$delegate", "app_debug"})
public final class AppDataContainer implements com.eatingdiary.zwjnevw.data.AppContainer {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy workoutItemsRepository$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy workoutCategoryRepository$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy weightRepository$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy foodRepository$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy totalRepository$delegate = null;
    
    public AppDataContainer(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.eatingdiary.zwjnevw.data.workout.WorkoutItemsRepository getWorkoutItemsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.eatingdiary.zwjnevw.data.workout.WorkoutCategoryRepository getWorkoutCategoryRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.eatingdiary.zwjnevw.data.weight.WeightRepository getWeightRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.eatingdiary.zwjnevw.data.food.FoodRepository getFoodRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.eatingdiary.zwjnevw.data.food.TotalRepository getTotalRepository() {
        return null;
    }
}