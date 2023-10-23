package com.eatingdiary.zwjnevw.ui.workout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a:\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u001a*\u0010\u0010\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001aj\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u001a2\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a>\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u00a8\u0006\'"}, d2 = {"AddCategoryDialog", "", "onAddCategory", "Lkotlin/Function1;", "", "onDismiss", "Lkotlin/Function0;", "AddDeleteButton", "text", "onClick", "colors", "Landroidx/compose/material/ButtonColors;", "enabled", "", "modifier", "Landroidx/compose/ui/Modifier;", "CreateNewExerciseDialog", "onAddExercise", "Lcom/eatingdiary/zwjnevw/data/workout/Exercise;", "DialogTextField", "value", "onValueChange", "label", "caption", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "placeHolder", "shape", "Landroidx/compose/ui/graphics/Shape;", "ExerciseDialog", "selectedExercise", "StateSwitch", "state1", "Lcom/eatingdiary/zwjnevw/data/ExerciseType;", "state2", "currentState", "onStateChanged", "app_debug"})
public final class WorkoutDialogsKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.ui.ExperimentalComposeUiApi.class})
    public static final void ExerciseDialog(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.workout.Exercise selectedExercise, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.eatingdiary.zwjnevw.data.workout.Exercise, kotlin.Unit> onAddExercise, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void CreateNewExerciseDialog(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.eatingdiary.zwjnevw.data.workout.Exercise, kotlin.Unit> onAddExercise, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void AddCategoryDialog(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onAddCategory, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void DialogTextField(@org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange, @org.jetbrains.annotations.NotNull
    java.lang.String label, @org.jetbrains.annotations.NotNull
    java.lang.String caption, @org.jetbrains.annotations.NotNull
    androidx.compose.foundation.text.KeyboardOptions keyboardOptions, @org.jetbrains.annotations.NotNull
    androidx.compose.foundation.text.KeyboardActions keyboardActions, @org.jetbrains.annotations.NotNull
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.graphics.Shape shape, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void AddDeleteButton(@org.jetbrains.annotations.NotNull
    java.lang.String text, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull
    androidx.compose.material.ButtonColors colors, boolean enabled, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void StateSwitch(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.ExerciseType state1, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.ExerciseType state2, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.ExerciseType currentState, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.eatingdiary.zwjnevw.data.ExerciseType, kotlin.Unit> onStateChanged, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
}