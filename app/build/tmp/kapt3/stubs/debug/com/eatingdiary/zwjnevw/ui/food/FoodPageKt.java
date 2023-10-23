package com.eatingdiary.zwjnevw.ui.food;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a \u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007\u001a4\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003\u001aX\u0010\u0012\u001a\u00020\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0007\u001a^\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010%\u001a\u00020&2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00010(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010(2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a8\u0006+"}, d2 = {"Background", "", "dismissState", "Landroidx/compose/material/DismissState;", "updateFraction", "Lkotlin/Function1;", "", "FoodCard", "food", "Lcom/eatingdiary/zwjnevw/data/food/Meal;", "modifier", "Landroidx/compose/ui/Modifier;", "index", "", "FoodCardList", "foods", "", "onDelete", "FoodPage", "navigateToFoodScreen", "", "selectedDate", "Ljava/time/LocalDate;", "breakfastV", "Lcom/eatingdiary/zwjnevw/data/food/BreakfastViewModel;", "lunchV", "Lcom/eatingdiary/zwjnevw/data/food/LunchViewModel;", "dinnerV", "Lcom/eatingdiary/zwjnevw/data/food/DinnerViewModel;", "snackV", "Lcom/eatingdiary/zwjnevw/data/food/SnackViewModel;", "totalV", "Lcom/eatingdiary/zwjnevw/data/food/TotalViewModel;", "MealPanel", "mealType", "mealIcon", "", "isExpanded", "", "onPanelClicked", "Lkotlin/Function0;", "onAddButtonClick", "onDismiss", "app_debug"})
public final class FoodPageKt {
    
    @androidx.compose.runtime.Composable
    public static final void FoodPage(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> navigateToFoodScreen, @org.jetbrains.annotations.NotNull
    java.time.LocalDate selectedDate, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.BreakfastViewModel breakfastV, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.LunchViewModel lunchV, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.DinnerViewModel dinnerV, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.SnackViewModel snackV, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.TotalViewModel totalV) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void MealPanel(@org.jetbrains.annotations.NotNull
    java.lang.String mealType, int mealIcon, @org.jetbrains.annotations.NotNull
    java.util.List<? extends com.eatingdiary.zwjnevw.data.food.Meal> foods, boolean isExpanded, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onPanelClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onAddButtonClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.eatingdiary.zwjnevw.data.food.Meal, kotlin.Unit> onDismiss) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class, androidx.compose.foundation.ExperimentalFoundationApi.class})
    private static final void FoodCardList(java.util.List<? extends com.eatingdiary.zwjnevw.data.food.Meal> foods, kotlin.jvm.functions.Function1<? super com.eatingdiary.zwjnevw.data.food.Meal, kotlin.Unit> onDelete, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void FoodCard(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.Meal food, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, long index) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
    @androidx.compose.runtime.Composable
    public static final void Background(@org.jetbrains.annotations.NotNull
    androidx.compose.material.DismissState dismissState, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> updateFraction) {
    }
}