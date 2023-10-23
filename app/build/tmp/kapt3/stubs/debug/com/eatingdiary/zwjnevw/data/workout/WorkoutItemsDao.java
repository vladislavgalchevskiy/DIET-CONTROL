package com.eatingdiary.zwjnevw.data.workout;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\bH\'J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\bH\'J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bH\'J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\bH\'J\u0019\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/workout/WorkoutItemsDao;", "", "delete", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllItems", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/eatingdiary/zwjnevw/data/workout/WorkoutEntity;", "getAverageExercisesPerDay", "", "getCompletedItemCountOnDate", "date", "Ljava/time/LocalDate;", "getItem", "getItemsOnDate", "getLastSeriesOfDaysWithCompletedWorkout", "getLastTenDatesWithCompletedExercise", "getMostPopularCategory", "Lcom/eatingdiary/zwjnevw/data/workout/CategoryCount;", "getMostPopularExercise", "Lcom/eatingdiary/zwjnevw/data/workout/ExerciseCount;", "insert", "item", "(Lcom/eatingdiary/zwjnevw/data/workout/WorkoutEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public abstract interface WorkoutItemsDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 5)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutEntity item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Update
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutEntity item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM workout_items WHERE id = :id")
    public abstract java.lang.Object delete(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * from workout_items WHERE id = :id")
    public abstract kotlinx.coroutines.flow.Flow<com.eatingdiary.zwjnevw.data.workout.WorkoutEntity> getItem(int id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * from workout_items WHERE date = :date")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.eatingdiary.zwjnevw.data.workout.WorkoutEntity>> getItemsOnDate(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * from workout_items ORDER BY name DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.eatingdiary.zwjnevw.data.workout.WorkoutEntity>> getAllItems();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT COUNT(*) from workout_items WHERE date = :date AND completed = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> getCompletedItemCountOnDate(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT DISTINCT date FROM workout_items WHERE completed = 1 ORDER BY date DESC LIMIT 10")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<java.time.LocalDate>> getLastTenDatesWithCompletedExercise();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT DISTINCT date FROM workout_items WHERE completed = 1 ORDER BY date DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<java.time.LocalDate>> getLastSeriesOfDaysWithCompletedWorkout();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT AVG(exerciseCount) FROM (SELECT COUNT(*) as exerciseCount FROM workout_items WHERE completed = 1 GROUP BY date) as counts")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Float> getAverageExercisesPerDay();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT category, COUNT(*) as count FROM workout_items WHERE completed = 1 GROUP BY category ORDER BY count DESC LIMIT 1")
    public abstract kotlinx.coroutines.flow.Flow<com.eatingdiary.zwjnevw.data.workout.CategoryCount> getMostPopularCategory();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT exercise, COUNT(*) as count FROM workout_items WHERE completed = 1 GROUP BY exercise ORDER BY count DESC LIMIT 1")
    public abstract kotlinx.coroutines.flow.Flow<com.eatingdiary.zwjnevw.data.workout.ExerciseCount> getMostPopularExercise();
}