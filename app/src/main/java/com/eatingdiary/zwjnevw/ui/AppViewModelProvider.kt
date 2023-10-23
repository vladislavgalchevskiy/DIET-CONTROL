package com.eatingdiary.zwjnevw.ui

import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.eatingdiary.zwjnevw.TrackItApplication
import com.eatingdiary.zwjnevw.data.food.BreakfastViewModel
import com.eatingdiary.zwjnevw.data.food.DinnerViewModel
import com.eatingdiary.zwjnevw.data.food.LunchViewModel
import com.eatingdiary.zwjnevw.data.food.SnackViewModel
import com.eatingdiary.zwjnevw.data.food.TotalViewModel
import com.eatingdiary.zwjnevw.data.weight.WeightViewModel
import com.eatingdiary.zwjnevw.ui.workout.WorkoutViewModel
import com.eatingdiary.zwjnevw.ui.workout.category.WorkoutCategoryViewModel
import com.eatingdiary.zwjnevw.ui.workout.exercise.WorkoutExerciseViewModel

object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            WorkoutViewModel(trackItApplication().container.workoutItemsRepository)
        }

        initializer {
            WorkoutCategoryViewModel(trackItApplication().container.workoutCategoryRepository)
        }

        initializer {
            WorkoutExerciseViewModel(
                trackItApplication().container.workoutItemsRepository,
                trackItApplication().container.workoutCategoryRepository
            )
        }

        initializer {
            WeightViewModel(trackItApplication().container.weightRepository)
        }

        initializer {
            BreakfastViewModel(trackItApplication().container.foodRepository)
        }

        initializer {
            LunchViewModel(trackItApplication().container.foodRepository)
        }

        initializer {
            DinnerViewModel(trackItApplication().container.foodRepository)
        }

        initializer {
            SnackViewModel(trackItApplication().container.foodRepository)
        }

        initializer {
            TotalViewModel(trackItApplication().container.totalRepository)
        }
    }
}

fun CreationExtras.trackItApplication(): TrackItApplication =
    (this[AndroidViewModelFactory.APPLICATION_KEY] as TrackItApplication)