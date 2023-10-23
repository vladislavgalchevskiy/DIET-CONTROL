package com.eatingdiary.zwjnevw.data.food;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00120\rH\'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\rH\'J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0019\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0017H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ9\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/eatingdiary/zwjnevw/data/food/TotalDao;", "", "delNutrients", "", "date", "Ljava/time/LocalDate;", "delProteins", "", "delFats", "delCarbs", "delCalories", "(Ljava/time/LocalDate;IIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAverageCalories", "Lkotlinx/coroutines/flow/Flow;", "getCalories", "getCarbs", "getFats", "getLastTenDates", "", "getPop", "Lcom/eatingdiary/zwjnevw/data/food/FoodCount;", "getProteins", "getTotal", "Lcom/eatingdiary/zwjnevw/data/food/Total;", "insertTotal", "total", "(Lcom/eatingdiary/zwjnevw/data/food/Total;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upOrInNutrients", "item", "updateNutrients", "addProteins", "addFats", "addCarbs", "addCalories", "app_debug"})
public abstract interface TotalDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertTotal(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.Total total, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM total WHERE date = :date")
    public abstract com.eatingdiary.zwjnevw.data.food.Total getTotal(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT DISTINCT date FROM total WHERE calories > 0 ORDER BY date DESC LIMIT 10")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<java.time.LocalDate>> getLastTenDates();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT AVG(calories) FROM total")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> getAverageCalories();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT proteins FROM total WHERE date = :date")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> getProteins(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT fats FROM total WHERE date = :date")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> getFats(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT carbs FROM total WHERE date = :date")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> getCarbs(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT calories FROM total WHERE date = :date")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> getCalories(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "UPDATE total SET proteins = proteins + :addProteins, fats = fats + :addFats, carbs = carbs + :addCarbs, calories = calories + :addCalories WHERE date = :date")
    public abstract java.lang.Object updateNutrients(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date, int addProteins, int addFats, int addCarbs, int addCalories, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "UPDATE total SET proteins = proteins - :delProteins, fats = fats - :delFats, carbs = carbs - :delCarbs, calories = calories - :delCalories WHERE date = :date")
    public abstract java.lang.Object delNutrients(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date, int delProteins, int delFats, int delCarbs, int delCalories, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Transaction
    public abstract java.lang.Object upOrInNutrients(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.Total item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT food, COUNT(food) AS count FROM (SELECT foodLunch AS food FROM lunch UNION ALL SELECT foodBreakfast AS food FROM breakfast UNION ALL SELECT foodDinner AS food FROM dinner UNION ALL SELECT foodSnack AS food FROM snack ) AS food GROUP BY food ORDER BY food ASC, count DESC LIMIT 1")
    public abstract kotlinx.coroutines.flow.Flow<com.eatingdiary.zwjnevw.data.food.FoodCount> getPop();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable
        @androidx.room.Transaction
        public static java.lang.Object upOrInNutrients(@org.jetbrains.annotations.NotNull
        com.eatingdiary.zwjnevw.data.food.TotalDao $this, @org.jetbrains.annotations.NotNull
        com.eatingdiary.zwjnevw.data.food.Total item, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
            return null;
        }
    }
}