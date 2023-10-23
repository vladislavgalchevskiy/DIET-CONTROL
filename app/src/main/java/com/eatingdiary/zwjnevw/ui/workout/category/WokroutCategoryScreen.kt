package com.eatingdiary.zwjnevw.ui.workout.category

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.eatingdiary.zwjnevw.R
import com.eatingdiary.zwjnevw.data.workout.Exercise
import com.eatingdiary.zwjnevw.data.workout.WorkoutCategory
import com.eatingdiary.zwjnevw.data.workout.WorkoutEntity
import com.eatingdiary.zwjnevw.ui.AppViewModelProvider
import com.eatingdiary.zwjnevw.ui.navigation.WorkoutEditTopBar
import com.eatingdiary.zwjnevw.ui.theme.AndroidGreen
import com.eatingdiary.zwjnevw.ui.theme.Arsenic
import com.eatingdiary.zwjnevw.ui.theme.BrightGray
import com.eatingdiary.zwjnevw.ui.workout.AddCategoryDialog
import com.eatingdiary.zwjnevw.ui.workout.ExerciseDialog
import com.eatingdiary.zwjnevw.ui.workout.SwipeBackground
import com.eatingdiary.zwjnevw.ui.workout.exercise.WorkoutExerciseViewModel
import com.eatingdiary.zwjnevw.ui.workout.getHighlightedText
import com.example.obfuscation.obf
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.util.*

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun WorkoutCategoryScreen(
    modifier: Modifier = Modifier,
    onCategorySelect: (Int, String) -> Unit,
    navigateBack: () -> Unit,
    navigateToWorkoutPage: () -> Unit,
    selectedDate: LocalDate = LocalDate.now(),
    viewModel: WorkoutCategoryViewModel = viewModel(factory = AppViewModelProvider.Factory),
    exerciseViewModel: WorkoutExerciseViewModel = viewModel(factory = AppViewModelProvider.Factory)
){
    val uiState by viewModel.workoutCategoryUiState.collectAsState()

    val coroutineScope = rememberCoroutineScope()
    val dialogState = remember { mutableStateOf(false) }
    val searchTextState = remember { mutableStateOf(TextFieldValue("")) }

    val selectedExercise = remember { mutableStateOf<Exercise?>(null) }
    val selectedCategory = remember { mutableStateOf<WorkoutCategory?>(null) }

    val addDialogState = remember { mutableStateOf(false) }

    Box{
        Column {
            WorkoutEditTopBar(searchTextState, navigateBack = navigateBack)

            Card(
                onClick = { dialogState.value = true },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp, vertical = 10.dp)
                    .height(70.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = 8.dp,
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "Создать категорию",
                        modifier = Modifier.weight(1f),
                        style = TextStyle(
                            fontFamily = FontFamily.Default,
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            color = Arsenic
                        )
                    )

                    Icon(
                        Icons.Rounded.Add, contentDescription = "Создать категорию",
                        tint = Arsenic, modifier = Modifier.size(40.dp)
                    )
                }
            }

            WorkoutCategoryBody(
                itemList = uiState.itemList,
                onCategorySelect,
                {category, exercise ->
                    addDialogState.value = true
                    selectedCategory.value = category
                    selectedExercise.value = exercise
                },
                searchTextState,
                onDelete = {
                    coroutineScope.launch {
                        if (obf()) viewModel.deleteItem(it)
                    }
                },
                modifier = modifier.padding(top = 8.dp)
            )

            if (dialogState.value) {
                AddCategoryDialog(
                    onAddCategory = { name ->
                        coroutineScope.launch {
                            if (obf()) viewModel.insertItem(WorkoutCategory(0, name, mutableListOf()))
                        }
                        dialogState.value = false
                    },
                    onDismiss = { dialogState.value = false }
                )
            }
        }
    }

    if (addDialogState.value){
        ExerciseDialog(
            selectedExercise = selectedExercise.value!!,
            onAddExercise = { exercise ->
                coroutineScope.launch {
                    if (obf()) exerciseViewModel.insertWorkoutEntity(
                        WorkoutEntity(
                            0,
                            exercise.name,
                            exercise,
                            selectedCategory.value!!,
                            selectedDate,
                            false
                        )
                    )
                }
                navigateToWorkoutPage()
            },
            onDismiss = { addDialogState.value = false }
        )
    }
}

@Composable
private fun WorkoutCategoryBody(
    itemList: List<WorkoutCategory>, onClick: (Int, String) -> Unit,
    onExerciseClick: (WorkoutCategory, Exercise) -> Unit,
    searchedTextState: MutableState<TextFieldValue>,
    onDelete: (WorkoutCategory) -> Unit,
    modifier: Modifier = Modifier
){
    WorkoutCategoryList(itemList = itemList, onClick, onExerciseClick, searchedTextState, onDelete, modifier = modifier)
}

@OptIn(ExperimentalMaterialApi::class, ExperimentalFoundationApi::class)
@Composable
private fun WorkoutCategoryList(
    itemList: List<WorkoutCategory>, onClick: (Int, String) -> Unit,
    onExerciseClick: (WorkoutCategory, Exercise) -> Unit,
    searchedTextState: MutableState<TextFieldValue>,
    onDelete: (WorkoutCategory) -> Unit,
    modifier: Modifier = Modifier
){
    var filteredItems: List<WorkoutCategory>

    LazyColumn(modifier = modifier, verticalArrangement = Arrangement.spacedBy(18.dp)){
        val searchedText = searchedTextState.value.text.lowercase(Locale.getDefault())
        filteredItems = itemList.filter { item ->
            item.name.lowercase(Locale.getDefault()).contains(searchedText) ||
                    item.exercises.any { exercise ->
                        exercise.name.lowercase(Locale.getDefault()).contains(searchedText)
                    }
        }

        item {
            Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Spacer(modifier.height(25.dp))
                Text(text = "Категории", style = MaterialTheme.typography.h4)
                Spacer(modifier.height(25.dp))
            }
        }

        items(filteredItems, key = { item -> item.id }, itemContent = {item ->
            val dismissThreshold = 0.25f
            val currentFraction = remember { mutableStateOf(0f) }

            var willDismissDirection: DismissDirection? by remember {
                mutableStateOf(null)
            }
            val dismissState = rememberDismissState(
                confirmStateChange = {
                    when(it){
                        DismissValue.DismissedToStart -> {
                            if (currentFraction.value >= dismissThreshold && currentFraction.value < 1.0f) {
                                onDelete(item)
                            }
                            currentFraction.value >= dismissThreshold && currentFraction.value < 1.0f
                        }
                        else -> false
                    }
                }
            )

            willDismissDirection = when(dismissState.targetValue){
                DismissValue.Default -> null
                else ->DismissDirection.EndToStart
            }

            if (searchedText.isBlank()){
                SwipeToDismiss(
                    state = dismissState,
                    directions = setOf(DismissDirection.EndToStart),
                    dismissThresholds = {
                        FractionalThreshold(dismissThreshold)
                    },
                    modifier = Modifier
                        .animateItemPlacement(),
                    background = {
                        SwipeBackground(dismissState = dismissState) { currentFraction.value = it }
                    },
                    dismissContent = {
                        WorkoutCategoryItem(item = item, onClick, onExerciseClick, searchedText)
                    }
                )
            }
            else {
                WorkoutCategoryItem(item = item, onClick, onExerciseClick, searchedText)
            }

        })

        item(){
            Spacer(modifier.height(100.dp))
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun WorkoutCategoryItem(
    item: WorkoutCategory, onClick: (Int, String) -> Unit,
    onExerciseClick: (WorkoutCategory, Exercise) -> Unit,
    searchedText: String = "",
    modifier: Modifier = Modifier
){
    val filteredExercises = mutableListOf<Exercise>()
    if (searchedText.isNotBlank()){
        item.exercises.forEach{exercise ->
            if (exercise.name.lowercase(Locale.getDefault())
                    .contains(searchedText.lowercase(Locale.getDefault()))){
                if (obf()) filteredExercises.add(exercise)
            }
        }
    }

    Column(
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .background(BrightGray, RoundedCornerShape(20.dp))
    ) {
        Card(
            onClick = {onClick(item.id, "")},
            modifier = modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            elevation = 2.dp
        ) {
            Row(
                modifier = Modifier.padding(start = 20.dp, top = 8.dp, bottom = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painterResource(id = item.icon), contentDescription = null,
                    tint = Arsenic, modifier = Modifier
                        .size(40.dp)
                        .requiredSize(40.dp)
                )

                Spacer(Modifier.width(10.dp))

                val highlightedText = getHighlightedText(item.name, searchedText)
                Text(text = highlightedText, modifier = Modifier.weight(1f),
                    style = TextStyle(
                        fontFamily = FontFamily.Default,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Arsenic
                    )
                )

                Icon(
                    Icons.Rounded.KeyboardArrowRight,
                    contentDescription = null,
                    tint = AndroidGreen,
                    modifier = Modifier
                        .size(45.dp)
                )
            }
        }

        val maxIndex = filteredExercises.size - 1
        filteredExercises.forEachIndexed {index, exercise ->
            Box(
                modifier = Modifier
                    .clickable { onExerciseClick(item, exercise) }
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp, vertical = 10.dp)
            ) {
                Text(text = getHighlightedText(text = exercise.name, searchedText = searchedText))
            }

            if (index != maxIndex){
                Icon(
                    modifier = Modifier.fillMaxWidth(),
                    painter = painterResource(id = R.drawable.exercise_line),
                    contentDescription = null
                )
            }
        }

//        if (hasSearchedExercises){
//            Card(
//                modifier = Modifier.clickable { onClick(item.id, searchedText) }
//            ) {
//                Row(Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 10.dp)) {
//                    Text(text = "Искать в упражнениях", color = AndroidGreen)
//                }
//            }
//        }
    }
}