package com.eatingdiary.zwjnevw.data.food;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH&R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/food/MealViewModel;", "T", "", "mealUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getMealUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "selectedDate", "Landroidx/compose/runtime/MutableState;", "Ljava/time/LocalDate;", "getSelectedDate", "()Landroidx/compose/runtime/MutableState;", "updateSelectedDate", "", "date", "app_debug"})
public abstract interface MealViewModel<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.compose.runtime.MutableState<java.time.LocalDate> getSelectedDate();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.MutableStateFlow<T> getMealUiState();
    
    public abstract void updateSelectedDate(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date);
}