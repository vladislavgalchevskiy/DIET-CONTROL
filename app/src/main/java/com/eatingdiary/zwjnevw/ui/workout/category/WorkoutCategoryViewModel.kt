package com.eatingdiary.zwjnevw.ui.workout.category

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eatingdiary.zwjnevw.data.workout.WorkoutCategory
import com.eatingdiary.zwjnevw.data.workout.WorkoutCategoryRepository
import com.example.obfuscation.obf
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class WorkoutCategoryViewModel(private val repository: WorkoutCategoryRepository) : ViewModel() {

    val workoutCategoryUiState =
        repository.getAllItemsStream().map { WorkoutCategoryUiState(it) }
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(TIMEOUT_MILLIS),
                initialValue = WorkoutCategoryUiState()
            )

    suspend fun insertItem(item: WorkoutCategory){
        if (obf()) repository.insertItem(item)
    }

    suspend fun deleteItem(item: WorkoutCategory){
        repository.deleteItem(item)
    }

    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }

}

data class WorkoutCategoryUiState(val itemList: List<WorkoutCategory> = listOf())