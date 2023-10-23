package com.eatingdiary.zwjnevw.data.weight;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/eatingdiary/zwjnevw/data/weight/WeightViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/eatingdiary/zwjnevw/data/weight/WeightRepository;", "(Lcom/eatingdiary/zwjnevw/data/weight/WeightRepository;)V", "_weightUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/eatingdiary/zwjnevw/data/weight/WeightUiState;", "selectedDate", "Landroidx/compose/runtime/MutableState;", "Ljava/time/LocalDate;", "kotlin.jvm.PlatformType", "weightUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getWeightUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "deleteWeight", "", "item", "Lcom/eatingdiary/zwjnevw/data/weight/WeightEntry;", "(Lcom/eatingdiary/zwjnevw/data/weight/WeightEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLast", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastTenDates", "", "Lcom/eatingdiary/zwjnevw/data/weight/DateTimeWrapper;", "getWeightByDate", "", "date", "time", "Ljava/time/LocalTime;", "(Ljava/time/LocalDate;Ljava/time/LocalTime;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertWeight", "app_debug"})
public final class WeightViewModel extends androidx.lifecycle.ViewModel {
    private final com.eatingdiary.zwjnevw.data.weight.WeightRepository repository = null;
    private final androidx.compose.runtime.MutableState<java.time.LocalDate> selectedDate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.eatingdiary.zwjnevw.data.weight.WeightUiState> _weightUiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.eatingdiary.zwjnevw.data.weight.WeightUiState> weightUiState = null;
    
    public WeightViewModel(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.weight.WeightRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.eatingdiary.zwjnevw.data.weight.WeightUiState> getWeightUiState() {
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
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getLastTenDates(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.eatingdiary.zwjnevw.data.weight.DateTimeWrapper>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getWeightByDate(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull
    java.time.LocalTime time, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Double> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getLast(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
}