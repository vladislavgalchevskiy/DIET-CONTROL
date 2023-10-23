package com.eatingdiary.zwjnevw.data.food;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0004\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/food/Meal;", "", "()V", "date", "Ljava/time/LocalDate;", "getDate", "()Ljava/time/LocalDate;", "food", "Lcom/eatingdiary/zwjnevw/data/food/FoodData;", "getFood", "()Lcom/eatingdiary/zwjnevw/data/food/FoodData;", "id", "", "getId", "()J", "Lcom/eatingdiary/zwjnevw/data/food/Breakfast;", "Lcom/eatingdiary/zwjnevw/data/food/Dinner;", "Lcom/eatingdiary/zwjnevw/data/food/Lunch;", "Lcom/eatingdiary/zwjnevw/data/food/Snack;", "app_debug"})
public abstract class Meal {
    
    private Meal() {
        super();
    }
    
    public abstract long getId();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.time.LocalDate getDate();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.eatingdiary.zwjnevw.data.food.FoodData getFood();
}