package com.eatingdiary.zwjnevw.data.food;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u000eH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/food/BreakfastViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/eatingdiary/zwjnevw/data/food/MealViewModel;", "Lcom/eatingdiary/zwjnevw/data/food/BreakfastUiState;", "repository", "Lcom/eatingdiary/zwjnevw/data/food/FoodRepository;", "(Lcom/eatingdiary/zwjnevw/data/food/FoodRepository;)V", "_breakfastUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "mealUiState", "getMealUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "selectedDate", "Landroidx/compose/runtime/MutableState;", "Ljava/time/LocalDate;", "kotlin.jvm.PlatformType", "getSelectedDate", "()Landroidx/compose/runtime/MutableState;", "deleteFood", "", "item", "Lcom/eatingdiary/zwjnevw/data/food/Breakfast;", "(Lcom/eatingdiary/zwjnevw/data/food/Breakfast;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFood", "updateSelectedDate", "date", "app_debug"})
public final class BreakfastViewModel extends androidx.lifecycle.ViewModel implements com.eatingdiary.zwjnevw.data.food.MealViewModel<com.eatingdiary.zwjnevw.data.food.BreakfastUiState> {
    private final com.eatingdiary.zwjnevw.data.food.FoodRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.time.LocalDate> selectedDate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.eatingdiary.zwjnevw.data.food.BreakfastUiState> _breakfastUiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.eatingdiary.zwjnevw.data.food.BreakfastUiState> mealUiState = null;
    
    public BreakfastViewModel(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.FoodRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.compose.runtime.MutableState<java.time.LocalDate> getSelectedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.MutableStateFlow<com.eatingdiary.zwjnevw.data.food.BreakfastUiState> getMealUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertFood(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.Breakfast item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteFood(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.Breakfast item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @java.lang.Override
    public void updateSelectedDate(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date) {
    }
}