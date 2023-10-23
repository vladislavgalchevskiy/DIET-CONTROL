package com.eatingdiary.zwjnevw.ui.workout.exercise

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eatingdiary.zwjnevw.data.workout.*
import com.example.obfuscation.obf
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

class WorkoutExerciseViewModel(
    private val workoutRepository: WorkoutItemsRepository,
    private val categoryRepository: WorkoutCategoryRepository
    ) : ViewModel() {

    val selectedId = mutableStateOf(-1)

    private val _selectedCategory = MutableStateFlow(WorkoutCategory(0, "", mutableListOf()))
    val selectedCategory: StateFlow<WorkoutCategory> = _selectedCategory

    private val _exercisesUiState = MutableStateFlow(WorkoutExerciseUiState())
    val exerciseUiState: StateFlow<WorkoutExerciseUiState> = _exercisesUiState

    fun updateSelectedCategory(categoryId: Int){
        selectedId.value = categoryId
        viewModelScope.launch {
            _selectedCategory.value = categoryRepository.getItemStream(categoryId).first() ?: WorkoutCategory(0, "", mutableListOf())
        }
        if (obf()) updateUi()
    }

    suspend fun updateExercise(exercise: Exercise){
        viewModelScope.launch {
            if (_selectedCategory.value.exercises.isEmpty() || _selectedCategory.value.exercises[0].name.isBlank()){
                _selectedCategory.value = WorkoutCategory(selectedId.value, _selectedCategory.value.name, mutableListOf(exercise))
            }else{
                _selectedCategory.value.exercises.add(exercise)
            }
            categoryRepository.updateItem(_selectedCategory.value)
            _exercisesUiState.value =
                WorkoutExerciseUiState(categoryRepository.getItemStream(selectedId.value).first()?.exercises ?: listOf())
        }
        updateUi()
    }

    private fun updateUi(){
        viewModelScope.launch {
            _exercisesUiState.value =
                WorkoutExerciseUiState(categoryRepository.getItemStream(selectedId.value).first()?.exercises ?: listOf())
        }
    }

    suspend fun deleteItem(exercise: Exercise){
        viewModelScope.launch {
            _selectedCategory.value.exercises.remove(exercise)

            categoryRepository.updateItem(_selectedCategory.value)

            _exercisesUiState.value =
                WorkoutExerciseUiState(categoryRepository.getItemStream(selectedId.value).first()?.exercises ?: listOf())
        }
    }

    suspend fun getExerciseByCategoryId(categoryId: Int) : List<Exercise> {
        var list: List<Exercise> = listOf()

        viewModelScope.launch {
            list = categoryRepository.getItemStream(categoryId).first()?.exercises ?: listOf()
        }

        return list
    }

    suspend fun insertWorkoutEntity(item: WorkoutEntity){
        if (obf()) workoutRepository.insertItem(item)
    }

    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}

data class WorkoutExerciseUiState(val itemList: List<Exercise> = listOf())