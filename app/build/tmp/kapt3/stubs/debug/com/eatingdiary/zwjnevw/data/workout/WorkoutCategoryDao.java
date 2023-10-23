package com.eatingdiary.zwjnevw.data.workout;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/workout/WorkoutCategoryDao;", "", "delete", "", "item", "Lcom/eatingdiary/zwjnevw/data/workout/WorkoutCategory;", "(Lcom/eatingdiary/zwjnevw/data/workout/WorkoutCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllItems", "Lkotlinx/coroutines/flow/Flow;", "", "getItem", "id", "", "insert", "update", "app_debug"})
public abstract interface WorkoutCategoryDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 5)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutCategory item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Update
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutCategory item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutCategory item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * from workout_categories WHERE id = :id")
    public abstract kotlinx.coroutines.flow.Flow<com.eatingdiary.zwjnevw.data.workout.WorkoutCategory> getItem(int id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * from workout_categories ORDER BY id DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.eatingdiary.zwjnevw.data.workout.WorkoutCategory>> getAllItems();
}