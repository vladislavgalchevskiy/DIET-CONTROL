package com.eatingdiary.zwjnevw.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a`\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007\u001a&\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007\u001a^\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*\u00a8\u0006+"}, d2 = {"AddWeightDialog", "", "onAddWeight", "Lkotlin/Function1;", "", "onDismiss", "Lkotlin/Function0;", "Dialog", "value", "onValueChange", "label", "caption", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "placeHolder", "shape", "Landroidx/compose/ui/graphics/Shape;", "modifier", "Landroidx/compose/ui/Modifier;", "setupFoodList", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "foodList", "", "Lcom/eatingdiary/zwjnevw/data/food/FoodData;", "showAddDialog", "food", "navigateToFoodPage", "mealType", "selectedDate", "Ljava/time/LocalDate;", "breakfastV", "Lcom/eatingdiary/zwjnevw/data/food/BreakfastViewModel;", "lunchV", "Lcom/eatingdiary/zwjnevw/data/food/LunchViewModel;", "dinnerV", "Lcom/eatingdiary/zwjnevw/data/food/DinnerViewModel;", "snackV", "Lcom/eatingdiary/zwjnevw/data/food/SnackViewModel;", "totalV", "Lcom/eatingdiary/zwjnevw/data/food/TotalViewModel;", "app_debug"})
public final class DialogUtilsKt {
    
    public static final void showAddDialog(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.FoodData food, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateToFoodPage, @org.jetbrains.annotations.Nullable
    java.lang.String mealType, @org.jetbrains.annotations.NotNull
    java.time.LocalDate selectedDate, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.BreakfastViewModel breakfastV, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.LunchViewModel lunchV, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.DinnerViewModel dinnerV, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.SnackViewModel snackV, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.TotalViewModel totalV) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public static final void setupFoodList(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.NotNull
    java.util.List<com.eatingdiary.zwjnevw.data.food.FoodData> foodList) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void AddWeightDialog(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onAddWeight, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Dialog(@org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange, @org.jetbrains.annotations.NotNull
    java.lang.String label, @org.jetbrains.annotations.NotNull
    java.lang.String caption, @org.jetbrains.annotations.NotNull
    androidx.compose.foundation.text.KeyboardActions keyboardActions, @org.jetbrains.annotations.NotNull
    java.lang.String placeHolder, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.graphics.Shape shape, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
}