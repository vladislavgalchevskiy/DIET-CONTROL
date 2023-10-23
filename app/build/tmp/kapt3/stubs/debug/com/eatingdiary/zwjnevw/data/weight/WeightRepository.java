package com.eatingdiary.zwjnevw.data.weight;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\f0\u000bJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bJ\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000b2\u0006\u0010\u0013\u001a\u00020\u0014J\u0019\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/weight/WeightRepository;", "", "weightDao", "Lcom/eatingdiary/zwjnevw/data/weight/WeightDao;", "(Lcom/eatingdiary/zwjnevw/data/weight/WeightDao;)V", "deleteWeight", "", "item", "Lcom/eatingdiary/zwjnevw/data/weight/WeightEntry;", "(Lcom/eatingdiary/zwjnevw/data/weight/WeightEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllWeight", "Lkotlinx/coroutines/flow/Flow;", "", "getLastTenDates", "Lcom/eatingdiary/zwjnevw/data/weight/DateTimeWrapper;", "getLastWeight", "", "getWeightByDate", "", "date", "Ljava/time/LocalDate;", "time", "Ljava/time/LocalTime;", "getWeights", "insertWeight", "app_debug"})
public final class WeightRepository {
    private final com.eatingdiary.zwjnevw.data.weight.WeightDao weightDao = null;
    
    public WeightRepository(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.weight.WeightDao weightDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.eatingdiary.zwjnevw.data.weight.WeightEntry>> getAllWeight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertWeight(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.weight.WeightEntry item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteWeight(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.weight.WeightEntry item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.eatingdiary.zwjnevw.data.weight.WeightEntry>> getWeights(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.eatingdiary.zwjnevw.data.weight.DateTimeWrapper>> getLastTenDates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Double> getWeightByDate(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull
    java.time.LocalTime time) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getLastWeight() {
        return null;
    }
}