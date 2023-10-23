package com.eatingdiary.zwjnevw.ui.workout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0011\u0010!\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0011\u0010#\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010$\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u000e\u0010%\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\nR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/eatingdiary/zwjnevw/ui/workout/WorkoutViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/eatingdiary/zwjnevw/data/workout/WorkoutItemsRepository;", "(Lcom/eatingdiary/zwjnevw/data/workout/WorkoutItemsRepository;)V", "_workoutUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/eatingdiary/zwjnevw/ui/workout/WorkoutUiState;", "selectedDate", "Landroidx/compose/runtime/MutableState;", "Ljava/time/LocalDate;", "kotlin.jvm.PlatformType", "getSelectedDate", "()Landroidx/compose/runtime/MutableState;", "workoutUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getWorkoutUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "deleteItem", "", "item", "Lcom/eatingdiary/zwjnevw/data/workout/WorkoutEntity;", "(Lcom/eatingdiary/zwjnevw/data/workout/WorkoutEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAverageExercisesPerDay", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompletedItemCountOnDate", "", "date", "(Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastSeriesOfDaysWithCompletedWorkout", "", "getLastTenDatesWithCompletedExercise", "getMostPopularCategory", "", "getMostPopularExercise", "updateItem", "updateSelectedDate", "app_debug"})
public final class WorkoutViewModel extends androidx.lifecycle.ViewModel {
    private final com.eatingdiary.zwjnevw.data.workout.WorkoutItemsRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.time.LocalDate> selectedDate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.eatingdiary.zwjnevw.ui.workout.WorkoutUiState> _workoutUiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.eatingdiary.zwjnevw.ui.workout.WorkoutUiState> workoutUiState = null;
    
    public WorkoutViewModel(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutItemsRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.time.LocalDate> getSelectedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.eatingdiary.zwjnevw.ui.workout.WorkoutUiState> getWorkoutUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateItem(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutEntity item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void updateSelectedDate(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteItem(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutEntity item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCompletedItemCountOnDate(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getLastTenDatesWithCompletedExercise(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<java.time.LocalDate>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getLastSeriesOfDaysWithCompletedWorkout(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<java.time.LocalDate>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAverageExercisesPerDay(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMostPopularCategory(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMostPopularExercise(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
}