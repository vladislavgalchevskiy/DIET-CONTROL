package com.eatingdiary.zwjnevw.ui.workout.category;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/eatingdiary/zwjnevw/ui/workout/category/WorkoutCategoryViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/eatingdiary/zwjnevw/data/workout/WorkoutCategoryRepository;", "(Lcom/eatingdiary/zwjnevw/data/workout/WorkoutCategoryRepository;)V", "workoutCategoryUiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/eatingdiary/zwjnevw/ui/workout/category/WorkoutCategoryUiState;", "getWorkoutCategoryUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "deleteItem", "", "item", "Lcom/eatingdiary/zwjnevw/data/workout/WorkoutCategory;", "(Lcom/eatingdiary/zwjnevw/data/workout/WorkoutCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertItem", "Companion", "app_debug"})
public final class WorkoutCategoryViewModel extends androidx.lifecycle.ViewModel {
    private final com.eatingdiary.zwjnevw.data.workout.WorkoutCategoryRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.eatingdiary.zwjnevw.ui.workout.category.WorkoutCategoryUiState> workoutCategoryUiState = null;
    @org.jetbrains.annotations.NotNull
    public static final com.eatingdiary.zwjnevw.ui.workout.category.WorkoutCategoryViewModel.Companion Companion = null;
    private static final long TIMEOUT_MILLIS = 5000L;
    
    public WorkoutCategoryViewModel(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutCategoryRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.eatingdiary.zwjnevw.ui.workout.category.WorkoutCategoryUiState> getWorkoutCategoryUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertItem(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutCategory item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteItem(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutCategory item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/eatingdiary/zwjnevw/ui/workout/category/WorkoutCategoryViewModel$Companion;", "", "()V", "TIMEOUT_MILLIS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}