package com.eatingdiary.zwjnevw.ui.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007\u001a\u001e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t\u001a \u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000bH\u0002\u001a\u0016\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u000b\u001a\u001e\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t\u001a\u0016\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u000b\u001a\u001e\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b\u00a8\u0006#"}, d2 = {"ProfilePage", "", "date", "Ljava/time/LocalDate;", "time", "Ljava/time/LocalTime;", "navigateToStats", "Lkotlin/Function0;", "genderT", "", "ageT", "", "heightT", "loadFromSharedPreferences", "context", "Landroid/content/Context;", "key", "defaultValue", "saveGenderPreference", "sharedPreferences", "Landroid/content/SharedPreferences;", "index", "saveSelectedRadioButtonId", "sharedPreferencesGender", "checkedId", "saveToSharedPreferences", "value", "setRadioButtonState", "group", "Landroid/widget/RadioGroup;", "setTextColorForSelectedRadioButton", "view", "Landroid/view/View;", "selectedId", "color", "app_debug"})
public final class ProfilePageKt {
    
    @androidx.compose.runtime.Composable
    @android.annotation.SuppressLint(value = {"InflateParams", "SuspiciousIndentation"})
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
    public static final void ProfilePage(@org.jetbrains.annotations.NotNull
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull
    java.time.LocalTime time, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateToStats, @org.jetbrains.annotations.Nullable
    java.lang.String genderT, int ageT, int heightT) {
    }
    
    public static final void saveToSharedPreferences(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String loadFromSharedPreferences(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.lang.String defaultValue) {
        return null;
    }
    
    private static final void saveGenderPreference(android.content.SharedPreferences sharedPreferences, java.lang.String key, int index) {
    }
    
    public static final void setRadioButtonState(@org.jetbrains.annotations.NotNull
    android.widget.RadioGroup group, int index) {
    }
    
    public static final void saveSelectedRadioButtonId(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferencesGender, int checkedId) {
    }
    
    public static final void setTextColorForSelectedRadioButton(@org.jetbrains.annotations.NotNull
    android.view.View view, int selectedId, int color) {
    }
}