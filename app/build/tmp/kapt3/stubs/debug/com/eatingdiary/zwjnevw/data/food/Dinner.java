package com.eatingdiary.zwjnevw.data.food;

import java.lang.System;

@androidx.room.Entity(tableName = "dinner")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/food/Dinner;", "Lcom/eatingdiary/zwjnevw/data/food/Meal;", "id", "", "date", "Ljava/time/LocalDate;", "foodDinner", "Lcom/eatingdiary/zwjnevw/data/food/FoodData;", "(JLjava/time/LocalDate;Lcom/eatingdiary/zwjnevw/data/food/FoodData;)V", "getDate", "()Ljava/time/LocalDate;", "food", "getFood", "()Lcom/eatingdiary/zwjnevw/data/food/FoodData;", "getFoodDinner", "getId", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
public final class Dinner extends com.eatingdiary.zwjnevw.data.food.Meal {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDate date = null;
    @org.jetbrains.annotations.NotNull
    private final com.eatingdiary.zwjnevw.data.food.FoodData foodDinner = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.eatingdiary.zwjnevw.data.food.Dinner copy(long id, @org.jetbrains.annotations.NotNull
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.FoodData foodDinner) {
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
    
    public Dinner(long id, @org.jetbrains.annotations.NotNull
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.FoodData foodDinner) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @java.lang.Override
    public long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.time.LocalDate getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.eatingdiary.zwjnevw.data.food.FoodData component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.eatingdiary.zwjnevw.data.food.FoodData getFoodDinner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.eatingdiary.zwjnevw.data.food.FoodData getFood() {
        return null;
    }
}