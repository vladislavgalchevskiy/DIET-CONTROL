package com.eatingdiary.zwjnevw.ui.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a \u0010\f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007\u001aK\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001b\u0010\u001c\u001a0\u0010\u001d\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"BottomBar", "", "currentDate", "Ljava/time/LocalDate;", "barState", "", "onDateSelected", "Lkotlin/Function1;", "navController", "Landroidx/navigation/NavController;", "currentScreen", "Lcom/eatingdiary/zwjnevw/data/Screen;", "SearchView", "state", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/text/input/TextFieldValue;", "modifier", "Landroidx/compose/ui/Modifier;", "TopBarWithLabel", "label", "", "icon", "", "iconColor", "Landroidx/compose/ui/graphics/Color;", "navigateBack", "Lkotlin/Function0;", "TopBarWithLabel-XO-JAsU", "(Ljava/lang/String;IJLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;)V", "WorkoutEditTopBar", "app_debug"})
public final class AppBarsKt {
    
    @androidx.compose.runtime.Composable
    public static final void BottomBar(@org.jetbrains.annotations.NotNull
    java.time.LocalDate currentDate, boolean barState, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.time.LocalDate, kotlin.Unit> onDateSelected, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.Screen currentScreen) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void WorkoutEditTopBar(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> state, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateBack, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.ui.ExperimentalComposeUiApi.class})
    public static final void SearchView(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> state, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
}