package com.eatingdiary.zwjnevw.data.workout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2\u0006\u0010\u0014\u001a\u00020\u0010J\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f0\u000bJ\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f0\u000bJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000bJ\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000bJ\u0019\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/workout/WorkoutItemsRepository;", "", "itemDao", "Lcom/eatingdiary/zwjnevw/data/workout/WorkoutItemsDao;", "(Lcom/eatingdiary/zwjnevw/data/workout/WorkoutItemsDao;)V", "deleteItem", "", "item", "Lcom/eatingdiary/zwjnevw/data/workout/WorkoutEntity;", "(Lcom/eatingdiary/zwjnevw/data/workout/WorkoutEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllItemsStream", "Lkotlinx/coroutines/flow/Flow;", "", "getAverageExercisesPerDay", "", "getCompletedItemCountOnDate", "", "date", "Ljava/time/LocalDate;", "getItemStream", "id", "getItemsOnDate", "getLastSeriesOfDaysWithCompletedWorkout", "getLastTenDatesWithCompletedExercise", "getMostPopularCategory", "Lcom/eatingdiary/zwjnevw/data/workout/CategoryCount;", "getMostPopularExercise", "Lcom/eatingdiary/zwjnevw/data/workout/ExerciseCount;", "insertItem", "updateItem", "app_debug"})
public final class WorkoutItemsRepository {
    private final com.eatingdiary.zwjnevw.data.workout.WorkoutItemsDao itemDao = null;
    
    public WorkoutItemsRepository(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutItemsDao itemDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.eatingdiary.zwjnevw.data.workout.WorkoutEntity>> getAllItemsStream() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.eatingdiary.zwjnevw.data.workout.WorkoutEntity> getItemStream(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertItem(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutEntity item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteItem(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutEntity item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateItem(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutEntity item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.eatingdiary.zwjnevw.data.workout.WorkoutEntity>> getItemsOnDate(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getCompletedItemCountOnDate(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<java.time.LocalDate>> getLastTenDatesWithCompletedExercise() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<java.time.LocalDate>> getLastSeriesOfDaysWithCompletedWorkout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Float> getAverageExercisesPerDay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.eatingdiary.zwjnevw.data.workout.CategoryCount> getMostPopularCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.eatingdiary.zwjnevw.data.workout.ExerciseCount> getMostPopularExercise() {
        return null;
    }
}