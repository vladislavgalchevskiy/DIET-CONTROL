package com.eatingdiary.zwjnevw.data

import android.content.Context
import com.eatingdiary.zwjnevw.data.weight.WeightDatabase
import com.eatingdiary.zwjnevw.data.weight.WeightRepository
import com.eatingdiary.zwjnevw.data.food.*
import com.eatingdiary.zwjnevw.data.workout.WorkoutCategoryDatabase
import com.eatingdiary.zwjnevw.data.workout.WorkoutCategoryRepository
import com.eatingdiary.zwjnevw.data.workout.WorkoutDatabase
import com.eatingdiary.zwjnevw.data.workout.WorkoutItemsRepository

interface AppContainer {
    val workoutItemsRepository: WorkoutItemsRepository
    val workoutCategoryRepository: WorkoutCategoryRepository
    val weightRepository: WeightRepository
    val foodRepository: FoodRepository
    val totalRepository: TotalRepository
}

class AppDataContainer(private val context: Context) : AppContainer {
    override val workoutItemsRepository: WorkoutItemsRepository by lazy {
        WorkoutItemsRepository(WorkoutDatabase.getDatabase(context).itemDao())
    }

    override val workoutCategoryRepository: WorkoutCategoryRepository by lazy {
        WorkoutCategoryRepository(WorkoutCategoryDatabase.getDatabase(context).itemDao())
    }

    override val weightRepository: WeightRepository by lazy {
        WeightRepository(WeightDatabase.getDatabase(context).weightDao())
    }

    override val foodRepository: FoodRepository by lazy {
        FoodRepository(
            FoodDatabase.getDatabase(context).breakfastDao(),
            FoodDatabase.getDatabase(context).lunchDao(),
            FoodDatabase.getDatabase(context).dinnerDao(),
            FoodDatabase.getDatabase(context).snackDao()
        )
    }

    override val totalRepository: TotalRepository by lazy {
        TotalRepository(FoodDatabase.getDatabase(context).totalDao())
    }
}