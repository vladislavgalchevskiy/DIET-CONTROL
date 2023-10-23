package com.eatingdiary.zwjnevw.data.weight;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bH\'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\'J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\'J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0019\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/weight/WeightDao;", "", "deleteWeightById", "", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllWeight", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/eatingdiary/zwjnevw/data/weight/WeightEntry;", "getLastTenDates", "Lcom/eatingdiary/zwjnevw/data/weight/DateTimeWrapper;", "getLastWeight", "", "getWeightByDate", "", "date", "Ljava/time/LocalDate;", "time", "Ljava/time/LocalTime;", "getWeights", "insertWeight", "weightEntry", "(Lcom/eatingdiary/zwjnevw/data/weight/WeightEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface WeightDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertWeight(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.weight.WeightEntry weightEntry, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM weight_entries WHERE id = :id")
    public abstract java.lang.Object deleteWeightById(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * from weight_entries ORDER BY id DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.eatingdiary.zwjnevw.data.weight.WeightEntry>> getAllWeight();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM weight_entries WHERE date = :date")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.eatingdiary.zwjnevw.data.weight.WeightEntry>> getWeights(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT DISTINCT date, time FROM weight_entries ORDER BY date DESC, time DESC LIMIT 10")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.eatingdiary.zwjnevw.data.weight.DateTimeWrapper>> getLastTenDates();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT weight from weight_entries WHERE date = :date AND time = :time")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Double> getWeightByDate(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull
    java.time.LocalTime time);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT CAST(weight AS TEXT) AS weightString FROM weight_entries ORDER BY date DESC, time DESC LIMIT 1")
    public abstract kotlinx.coroutines.flow.Flow<java.lang.String> getLastWeight();
}