package com.eatingdiary.zwjnevw.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/FoodTypeConverters;", "", "()V", "gson", "Lcom/google/gson/Gson;", "fromFoodData", "", "foodData", "Lcom/eatingdiary/zwjnevw/data/food/FoodData;", "toFoodData", "json", "app_debug"})
public final class FoodTypeConverters {
    private final com.google.gson.Gson gson = null;
    
    public FoodTypeConverters() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.lang.String fromFoodData(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.food.FoodData foodData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final com.eatingdiary.zwjnevw.data.food.FoodData toFoodData(@org.jetbrains.annotations.NotNull
    java.lang.String json) {
        return null;
    }
}