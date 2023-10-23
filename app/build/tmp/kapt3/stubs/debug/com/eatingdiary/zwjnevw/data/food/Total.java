package com.eatingdiary.zwjnevw.data.food;

import java.lang.System;

@androidx.room.Entity(tableName = "total")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/food/Total;", "", "date", "Ljava/time/LocalDate;", "proteins", "", "fats", "carbs", "calories", "(Ljava/time/LocalDate;IIII)V", "getCalories", "()I", "getCarbs", "getDate", "()Ljava/time/LocalDate;", "getFats", "getProteins", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class Total {
    @org.jetbrains.annotations.NotNull
    @androidx.room.PrimaryKey
    private final java.time.LocalDate date = null;
    private final int proteins = 0;
    private final int fats = 0;
    private final int carbs = 0;
    private final int calories = 0;
    
    @org.jetbrains.annotations.NotNull
    public final com.eatingdiary.zwjnevw.data.food.Total copy(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date, int proteins, int fats, int carbs, int calories) {
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
    
    public Total(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date, int proteins, int fats, int carbs, int calories) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate getDate() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getProteins() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getFats() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getCarbs() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getCalories() {
        return 0;
    }
}