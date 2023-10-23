package com.eatingdiary.zwjnevw.ui.workout.exercise;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\u0006\u0010\u001e\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0019\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0019\u0010$\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u000e\u0010%\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0014J\b\u0010&\u001a\u00020\u0018H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/eatingdiary/zwjnevw/ui/workout/exercise/WorkoutExerciseViewModel;", "Landroidx/lifecycle/ViewModel;", "workoutRepository", "Lcom/eatingdiary/zwjnevw/data/workout/WorkoutItemsRepository;", "categoryRepository", "Lcom/eatingdiary/zwjnevw/data/workout/WorkoutCategoryRepository;", "(Lcom/eatingdiary/zwjnevw/data/workout/WorkoutItemsRepository;Lcom/eatingdiary/zwjnevw/data/workout/WorkoutCategoryRepository;)V", "_exercisesUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/eatingdiary/zwjnevw/ui/workout/exercise/WorkoutExerciseUiState;", "_selectedCategory", "Lcom/eatingdiary/zwjnevw/data/workout/WorkoutCategory;", "exerciseUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getExerciseUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "selectedCategory", "getSelectedCategory", "selectedId", "Landroidx/compose/runtime/MutableState;", "", "getSelectedId", "()Landroidx/compose/runtime/MutableState;", "deleteItem", "", "exercise", "Lcom/eatingdiary/zwjnevw/data/workout/Exercise;", "(Lcom/eatingdiary/zwjnevw/data/workout/Exercise;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExerciseByCategoryId", "", "categoryId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertWorkoutEntity", "item", "Lcom/eatingdiary/zwjnevw/data/workout/WorkoutEntity;", "(Lcom/eatingdiary/zwjnevw/data/workout/WorkoutEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateExercise", "updateSelectedCategory", "updateUi", "Companion", "app_debug"})
public final class WorkoutExerciseViewModel extends androidx.lifecycle.ViewModel {
    private final com.eatingdiary.zwjnevw.data.workout.WorkoutItemsRepository workoutRepository = null;
    private final com.eatingdiary.zwjnevw.data.workout.WorkoutCategoryRepository categoryRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Integer> selectedId = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.eatingdiary.zwjnevw.data.workout.WorkoutCategory> _selectedCategory = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.eatingdiary.zwjnevw.data.workout.WorkoutCategory> selectedCategory = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.eatingdiary.zwjnevw.ui.workout.exercise.WorkoutExerciseUiState> _exercisesUiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.eatingdiary.zwjnevw.ui.workout.exercise.WorkoutExerciseUiState> exerciseUiState = null;
    @org.jetbrains.annotations.NotNull
    public static final com.eatingdiary.zwjnevw.ui.workout.exercise.WorkoutExerciseViewModel.Companion Companion = null;
    private static final long TIMEOUT_MILLIS = 5000L;
    
    public WorkoutExerciseViewModel(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutItemsRepository workoutRepository, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutCategoryRepository categoryRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Integer> getSelectedId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.eatingdiary.zwjnevw.data.workout.WorkoutCategory> getSelectedCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.eatingdiary.zwjnevw.ui.workout.exercise.WorkoutExerciseUiState> getExerciseUiState() {
        return null;
    }
    
    public final void updateSelectedCategory(int categoryId) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateExercise(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.Exercise exercise, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void updateUi() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteItem(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.Exercise exercise, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getExerciseByCategoryId(int categoryId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.eatingdiary.zwjnevw.data.workout.Exercise>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertWorkoutEntity(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.WorkoutEntity item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/eatingdiary/zwjnevw/ui/workout/exercise/WorkoutExerciseViewModel$Companion;", "", "()V", "TIMEOUT_MILLIS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}