package com.eatingdiary.zwjnevw.data.food;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J9\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00150\u0010J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0007\u001a\u00020\bJ\u0019\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/food/TotalRepository;", "", "totalDao", "Lcom/eatingdiary/zwjnevw/data/food/TotalDao;", "(Lcom/eatingdiary/zwjnevw/data/food/TotalDao;)V", "delNutrients", "", "date", "Ljava/time/LocalDate;", "delProteins", "", "delFats", "delCarbs", "delCalories", "(Ljava/time/LocalDate;IIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAverageCalories", "Lkotlinx/coroutines/flow/Flow;", "getCalories", "getCarbs", "getFats", "getLastTenDates", "", "getPopularFood", "Lcom/eatingdiary/zwjnevw/data/food/FoodCount;", "getProteins", "upOrInNutrients", "item", "Lcom/eatingdiary/zwjnevw/data/food/Total;", "(Lcom/eatingdiary/zwjnevw/data/food/Total;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TotalRepository {
    private final com.eatingdiary.zwjnevw.data.food.TotalDao totalDao = null;
    
    public TotalRepository(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.TotalDao totalDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<java.time.LocalDate>> getLastTenDates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getAverageCalories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.eatingdiary.zwjnevw.data.food.FoodCount> getPopularFood() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getProteins(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getFats(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getCarbs(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getCalories(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object upOrInNutrients(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.Total item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object delNutrients(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date, int delProteins, int delFats, int delCarbs, int delCalories, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}