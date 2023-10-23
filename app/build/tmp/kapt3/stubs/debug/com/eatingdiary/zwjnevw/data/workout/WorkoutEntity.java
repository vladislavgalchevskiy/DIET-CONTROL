package com.eatingdiary.zwjnevw.data.workout;

import java.lang.System;

@androidx.room.Entity(tableName = "workout_items")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\t\u0010 \u001a\u00020\tH\u00c6\u0003J\t\u0010!\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\"\u001a\u00020\rH\u00c6\u0003JE\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006("}, d2 = {"Lcom/eatingdiary/zwjnevw/data/workout/WorkoutEntity;", "", "id", "", "name", "", "exercise", "Lcom/eatingdiary/zwjnevw/data/workout/Exercise;", "category", "Lcom/eatingdiary/zwjnevw/data/workout/WorkoutCategory;", "date", "Ljava/time/LocalDate;", "completed", "", "(ILjava/lang/String;Lcom/eatingdiary/zwjnevw/data/workout/Exercise;Lcom/eatingdiary/zwjnevw/data/workout/WorkoutCategory;Ljava/time/LocalDate;Z)V", "getCategory", "()Lcom/eatingdiary/zwjnevw/data/workout/WorkoutCategory;", "getCompleted", "()Z", "setCompleted", "(Z)V", "getDate", "()Ljava/time/LocalDate;", "getExercise", "()Lcom/eatingdiary/zwjnevw/data/workout/Exercise;", "getId", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class WorkoutEntity {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final com.eatingdiary.zwjnevw.data.workout.Exercise exercise = null;
    @org.jetbrains.annotations.NotNull
    private final com.eatingdiary.zwjnevw.data.workout.WorkoutCategory category = null;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDate date = null;
    private boolean completed;
    
    @org.jetbrains.annotations.NotNull
    public final com.eatingdiary.zwjnevw.data.workout.WorkoutEntity copy(int id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.Exercise exercise, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutCategory category, @org.jetbrains.annotations.NotNull
    java.time.LocalDate date, boolean completed) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public WorkoutEntity(int id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.Exercise exercise, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutCategory category, @org.jetbrains.annotations.NotNull
    java.time.LocalDate date, boolean completed) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.eatingdiary.zwjnevw.data.workout.Exercise component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.eatingdiary.zwjnevw.data.workout.Exercise getExercise() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.eatingdiary.zwjnevw.data.workout.WorkoutCategory component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.eatingdiary.zwjnevw.data.workout.WorkoutCategory getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate getDate() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getCompleted() {
        return false;
    }
    
    public final void setCompleted(boolean p0) {
    }
}