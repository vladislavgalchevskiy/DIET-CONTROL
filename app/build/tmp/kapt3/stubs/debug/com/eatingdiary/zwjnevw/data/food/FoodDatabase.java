package com.eatingdiary.zwjnevw.data.food;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.eatingdiary.zwjnevw.data.DateConverter.class, com.eatingdiary.zwjnevw.data.FoodTypeConverters.class})
@androidx.room.Database(entities = {com.eatingdiary.zwjnevw.data.food.Breakfast.class, com.eatingdiary.zwjnevw.data.food.Lunch.class, com.eatingdiary.zwjnevw.data.food.Dinner.class, com.eatingdiary.zwjnevw.data.food.Snack.class, com.eatingdiary.zwjnevw.data.food.Total.class}, version = 2)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\u000e"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/food/FoodDatabase;", "Landroidx/room/RoomDatabase;", "()V", "breakfastDao", "Lcom/eatingdiary/zwjnevw/data/food/BreakfastDao;", "dinnerDao", "Lcom/eatingdiary/zwjnevw/data/food/DinnerDao;", "lunchDao", "Lcom/eatingdiary/zwjnevw/data/food/LunchDao;", "snackDao", "Lcom/eatingdiary/zwjnevw/data/food/SnackDao;", "totalDao", "Lcom/eatingdiary/zwjnevw/data/food/TotalDao;", "Companion", "app_debug"})
public abstract class FoodDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.eatingdiary.zwjnevw.data.food.FoodDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.eatingdiary.zwjnevw.data.food.FoodDatabase instance;
    
    public FoodDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.eatingdiary.zwjnevw.data.food.BreakfastDao breakfastDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.eatingdiary.zwjnevw.data.food.LunchDao lunchDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.eatingdiary.zwjnevw.data.food.DinnerDao dinnerDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.eatingdiary.zwjnevw.data.food.SnackDao snackDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.eatingdiary.zwjnevw.data.food.TotalDao totalDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/food/FoodDatabase$Companion;", "", "()V", "instance", "Lcom/eatingdiary/zwjnevw/data/food/FoodDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.eatingdiary.zwjnevw.data.food.FoodDatabase getDatabase(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}