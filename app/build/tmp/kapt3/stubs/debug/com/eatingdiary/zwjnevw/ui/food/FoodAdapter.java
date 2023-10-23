package com.eatingdiary.zwjnevw.ui.food;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001d\u001eB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016J\u001e\u0010\u001c\u001a\u00020\u00152\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/eatingdiary/zwjnevw/ui/food/FoodAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/eatingdiary/zwjnevw/ui/food/FoodAdapter$FoodViewHolder;", "foodList", "", "Lcom/eatingdiary/zwjnevw/data/food/FoodData;", "context", "Landroid/content/Context;", "onFoodItemClickListener", "Lcom/eatingdiary/zwjnevw/ui/food/FoodAdapter$OnFoodItemClickListener;", "(Ljava/util/List;Landroid/content/Context;Lcom/eatingdiary/zwjnevw/ui/food/FoodAdapter$OnFoodItemClickListener;)V", "getContext", "()Landroid/content/Context;", "filteredList", "getOnFoodItemClickListener", "()Lcom/eatingdiary/zwjnevw/ui/food/FoodAdapter$OnFoodItemClickListener;", "searchQuery", "", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setFilteredList", "FoodViewHolder", "OnFoodItemClickListener", "app_debug"})
public final class FoodAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.eatingdiary.zwjnevw.ui.food.FoodAdapter.FoodViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final com.eatingdiary.zwjnevw.ui.food.FoodAdapter.OnFoodItemClickListener onFoodItemClickListener = null;
    private java.util.List<com.eatingdiary.zwjnevw.data.food.FoodData> filteredList;
    private java.lang.String searchQuery = "";
    
    public FoodAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.eatingdiary.zwjnevw.data.food.FoodData> foodList, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.ui.food.FoodAdapter.OnFoodItemClickListener onFoodItemClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.eatingdiary.zwjnevw.ui.food.FoodAdapter.OnFoodItemClickListener getOnFoodItemClickListener() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setFilteredList(@org.jetbrains.annotations.NotNull
    java.util.List<com.eatingdiary.zwjnevw.data.food.FoodData> filteredList, @org.jetbrains.annotations.NotNull
    java.lang.String searchQuery) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.eatingdiary.zwjnevw.ui.food.FoodAdapter.FoodViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.ui.food.FoodAdapter.FoodViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/eatingdiary/zwjnevw/ui/food/FoodAdapter$OnFoodItemClickListener;", "", "onFoodItemClick", "", "food", "Lcom/eatingdiary/zwjnevw/data/food/FoodData;", "app_debug"})
    public static abstract interface OnFoodItemClickListener {
        
        public abstract void onFoodItemClick(@org.jetbrains.annotations.NotNull
        com.eatingdiary.zwjnevw.data.food.FoodData food);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/eatingdiary/zwjnevw/ui/food/FoodAdapter$FoodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/eatingdiary/zwjnevw/ui/food/FoodAdapter;Landroid/view/View;)V", "calories", "Landroid/widget/TextView;", "carbs", "fat", "nameFood", "protein", "bind", "", "food", "Lcom/eatingdiary/zwjnevw/data/food/FoodData;", "app_debug"})
    public final class FoodViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView nameFood = null;
        private final android.widget.TextView protein = null;
        private final android.widget.TextView fat = null;
        private final android.widget.TextView carbs = null;
        private final android.widget.TextView calories = null;
        
        public FoodViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.eatingdiary.zwjnevw.data.food.FoodData food) {
        }
    }
}