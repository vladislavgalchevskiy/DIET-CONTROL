package com.eatingdiary.zwjnevw.data.food;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/food/DinnerDao;", "", "deleteFoodById", "", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFood", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/eatingdiary/zwjnevw/data/food/Dinner;", "date", "Ljava/time/LocalDate;", "insertFood", "food", "(Lcom/eatingdiary/zwjnevw/data/food/Dinner;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface DinnerDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertFood(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.Dinner food, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM dinner WHERE id = :id")
    public abstract java.lang.Object deleteFoodById(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM dinner WHERE date = :date")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.eatingdiary.zwjnevw.data.food.Dinner>> getFood(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date);
}