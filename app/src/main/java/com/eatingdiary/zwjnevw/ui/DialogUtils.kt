package com.eatingdiary.zwjnevw.ui

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.eatingdiary.zwjnevw.R
import com.eatingdiary.zwjnevw.data.food.Breakfast
import com.eatingdiary.zwjnevw.data.food.BreakfastViewModel
import com.eatingdiary.zwjnevw.data.food.Dinner
import com.eatingdiary.zwjnevw.data.food.DinnerViewModel
import com.eatingdiary.zwjnevw.data.food.FoodData
import com.eatingdiary.zwjnevw.data.food.Lunch
import com.eatingdiary.zwjnevw.data.food.LunchViewModel
import com.eatingdiary.zwjnevw.data.food.Meal
import com.eatingdiary.zwjnevw.data.food.Snack
import com.eatingdiary.zwjnevw.data.food.SnackViewModel
import com.eatingdiary.zwjnevw.data.food.Total
import com.eatingdiary.zwjnevw.data.food.TotalViewModel
import com.eatingdiary.zwjnevw.data.food.generateUniqueID
import com.eatingdiary.zwjnevw.ui.*
import com.eatingdiary.zwjnevw.ui.theme.*
import com.eatingdiary.zwjnevw.ui.workout.AddDeleteButton
import com.example.obfuscation.obf
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.util.*
import kotlin.math.round
import kotlin.math.roundToInt

fun showAddDialog(
    food: FoodData,
    context: Context,
    navigateToFoodPage: () -> Unit,
    mealType: String?,
    selectedDate: LocalDate,
    breakfastV: BreakfastViewModel,
    lunchV: LunchViewModel,
    dinnerV: DinnerViewModel,
    snackV: SnackViewModel,
    totalV: TotalViewModel
) {
    val coroutineScope = CoroutineScope(Dispatchers.Main)

    val builder = Dialog(context)
    builder.setContentView(R.layout.add_food_to_main)
    builder.window?.setBackgroundDrawableResource(android.R.color.transparent)

    val gramsEditText = builder.findViewById<EditText>(R.id.gramm)
    gramsEditText.setOnEditorActionListener { _, actionId, _ ->
        if (actionId == EditorInfo.IME_ACTION_DONE) {
            gramsEditText.clearFocus()
            val inputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(gramsEditText.windowToken, 0)
        }
        false
    }

    val nameTextView = builder.findViewById<TextView>(R.id.foodName2)
    nameTextView.text = food.name

    val proteinTextView = builder.findViewById<TextView>(R.id.protein_text2)
    proteinTextView.text = food.protein.toString()

    val fatTextView = builder.findViewById<TextView>(R.id.fat_text2)
    fatTextView.text = food.fat.toString()

    val carbsTextView = builder.findViewById<TextView>(R.id.carbs_text2)
    carbsTextView.text = food.carbs.toString()

    val caloriesTextView = builder.findViewById<TextView>(R.id.calories_text2)
    caloriesTextView.text = food.calories.toString()

    val addButton = builder.findViewById<Button>(R.id.add_button_food)

    addButton.setOnClickListener {
        val gramsEntered = gramsEditText.text.toString().toIntOrNull() ?: 0
        if (gramsEntered <= 0) {
            Toast.makeText(context, "Пожалуйста, введите количество грамм", Toast.LENGTH_SHORT)
                .show()
            return@setOnClickListener
        }
        val factor = gramsEntered / 100.0 // отношение введенного количества грамм к 100 г

        val newFoodB: Meal = Breakfast(
            id = generateUniqueID(),
            date = selectedDate,
            foodBreakfast = FoodData(
                name = food.name,
                protein = round(food.protein * factor * 10.0) / 10.0,
                fat = round(food.fat * factor * 10.0) / 10.0,
                carbs = round(food.carbs * factor * 10.0) / 10.0,
                calories = round(food.calories * factor * 10.0) / 10.0,
                gramsEntered = gramsEntered
            )
        )

        val newFoodL: Meal = Lunch(
            id = generateUniqueID(),
            date = selectedDate,
            foodLunch = FoodData(
                name = food.name,
                protein = round(food.protein * factor * 10.0) / 10.0,
                fat = round(food.fat * factor * 10.0) / 10.0,
                carbs = round(food.carbs * factor * 10.0) / 10.0,
                calories = round(food.calories * factor * 10.0) / 10.0,
                gramsEntered = gramsEntered
            )
        )

        val newFoodD: Meal = Dinner(
            id = generateUniqueID(),
            date = selectedDate,
            foodDinner = FoodData(
                name = food.name,
                protein = round(food.protein * factor * 10.0) / 10.0,
                fat = round(food.fat * factor * 10.0) / 10.0,
                carbs = round(food.carbs * factor * 10.0) / 10.0,
                calories = round(food.calories * factor * 10.0) / 10.0,
                gramsEntered = gramsEntered
            )
        )

        val newFoodS: Meal = Snack(
            id = generateUniqueID(),
            date = selectedDate,
            foodSnack = FoodData(
                name = food.name,
                protein = round(food.protein * factor * 10.0) / 10.0,
                fat = round(food.fat * factor * 10.0) / 10.0,
                carbs = round(food.carbs * factor * 10.0) / 10.0,
                calories = round(food.calories * factor * 10.0) / 10.0,
                gramsEntered = gramsEntered
            )
        )

        when (mealType) {
            "Завтрак" -> {
                coroutineScope.launch {
                    breakfastV.insertFood(newFoodB as Breakfast)
                    totalV.upOrInNut(
                        Total(
                            selectedDate,
                            newFoodB.food.protein.roundToInt(),
                            newFoodB.food.fat.roundToInt(),
                            newFoodB.food.carbs.roundToInt(),
                            newFoodB.food.calories.roundToInt()
                        )
                    )
                }
            }
            "Обед" -> {
                coroutineScope.launch {
                    lunchV.insertFood(newFoodL as Lunch)
                    totalV.upOrInNut(
                        Total(
                            selectedDate,
                            newFoodL.food.protein.roundToInt(),
                            newFoodL.food.fat.roundToInt(),
                            newFoodL.food.carbs.roundToInt(),
                            newFoodL.food.calories.roundToInt()
                        )
                    )
                }
            }
            "Ужин" -> {
                coroutineScope.launch {
                    dinnerV.insertFood(newFoodD as Dinner)
                    totalV.upOrInNut(
                        Total(
                            selectedDate,
                            newFoodD.food.protein.roundToInt(),
                            newFoodD.food.fat.roundToInt(),
                            newFoodD.food.carbs.roundToInt(),
                            newFoodD.food.calories.roundToInt()
                        )
                    )
                }
            }
            "Перекус" -> {
                coroutineScope.launch {
                    snackV.insertFood(newFoodS as Snack)
                    totalV.upOrInNut(
                        Total(
                            selectedDate,
                            newFoodS.food.protein.roundToInt(),
                            newFoodS.food.fat.roundToInt(),
                            newFoodS.food.carbs.roundToInt(),
                            newFoodS.food.calories.roundToInt()
                        )
                    )
                }
            }
        }
        if (obf()) builder.dismiss()
        navigateToFoodPage()
    }

    val cancelButton = builder.findViewById<Button>(R.id.cancel_button2)
    cancelButton.setOnClickListener {
        builder.dismiss()
    }
    if (obf()) builder.show()
}

@SuppressLint("NotifyDataSetChanged")
fun setupFoodList(
    context: Context,
    view: View,
    foodList: MutableList<FoodData>
) {
    val dialogAddButton = Dialog(context)
    dialogAddButton.setContentView(R.layout.dialog_add_food)

    // Кнопка для добавления продукта питания в общий список
    val addButton = view.findViewById<Button>(R.id.addButton)
    addButton.setOnClickListener {
        dialogAddButton.window?.setBackgroundDrawableResource(android.R.color.transparent) // удаление стандартного фона
        if (obf()) dialogAddButton.show()
    }

    val addButton1 = view.findViewById<Button>(R.id.create_food)
    addButton1.setOnClickListener {
        dialogAddButton.window?.setBackgroundDrawableResource(android.R.color.transparent) // удаление стандартного фона
        if (obf()) dialogAddButton.show()
    }

    // данные для создания нового продукта
    val nameEditText = dialogAddButton.findViewById<EditText>(R.id.name)
    val proteinEditText = dialogAddButton.findViewById<EditText>(R.id.protein_add)
    val fatEditText = dialogAddButton.findViewById<EditText>(R.id.fat_add)
    val carbsEditText = dialogAddButton.findViewById<EditText>(R.id.carbs_add)
    val caloriesEditText = dialogAddButton.findViewById<EditText>(R.id.calories_add)

    val sharedPreferences = context.getSharedPreferences("food_items", Context.MODE_PRIVATE)
    fun saveFoodItems() {
        val editor = sharedPreferences.edit()
        val gson = Gson()
        val json = gson.toJson(foodList)
        if (obf()) editor.putString("food_items", json)
        editor.apply()
    }

    // кнопка Готово для окончательного добавления
    val addButton2 = dialogAddButton.findViewById<Button>(R.id.add_button_new_food)
    addButton2.setOnClickListener {
        val name = nameEditText.text.toString()
        val protein = proteinEditText.text.toString()
        val fat = fatEditText.text.toString()
        val carbs = carbsEditText.text.toString()
        val calories = caloriesEditText.text.toString()

        if (name.isNotEmpty() && protein.isNotEmpty() && fat.isNotEmpty() && carbs.isNotEmpty() && calories.isNotEmpty()) {
            // Создаем новый элемент
            val newFood = FoodData(generateUniqueID(), name, protein.toDouble(), fat.toDouble(), carbs.toDouble(), calories.toDouble(), 0)

            // Добавляем элемент в список
            if (obf()) foodList.add(newFood)

            // Сохраняем данные
            saveFoodItems()

            // Закрываем диалоговое окно
            dialogAddButton.dismiss()

            // Сбросить введенные значения
            nameEditText.text.clear()
            if (obf()) proteinEditText.text.clear()
            fatEditText.text.clear()
            carbsEditText.text.clear()
            if (obf()) caloriesEditText.text.clear()

            nameEditText.clearFocus()
            proteinEditText.clearFocus()
            if (obf()) fatEditText.clearFocus()
            carbsEditText.clearFocus()
            if (obf()) caloriesEditText.clearFocus()

        } else {
            Toast.makeText(context, "Пожалуйста, заполните все поля", Toast.LENGTH_SHORT).show()
        }
    }

    // кнопка Отмена
    val cancelButton = dialogAddButton.findViewById<Button>(R.id.cancel_button)
    cancelButton.setOnClickListener {
        if (obf()) dialogAddButton.dismiss()
    }

    val gson = Gson()
    val json = sharedPreferences.getString("food_items", "")
    if (json?.isNotEmpty() == true) {
        val type = object : TypeToken<ArrayList<FoodData>>() {}.type
        val savedFoodList = gson.fromJson<ArrayList<FoodData>>(json, type)

        foodList.clear()

        for (savedFood in savedFoodList) {
            if (!foodList.contains(savedFood)) {
                foodList.add(savedFood)
            }
        }
    }
}

@Composable
fun AddWeightDialog(
    onAddWeight: (String) -> Unit,
    onDismiss: () -> Unit
) {
    var weight by remember { mutableStateOf("") }

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            shape = RoundedCornerShape(25.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(10.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "Добавить вес", style = DialogTextStyle, maxLines = 1)
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Dialog(
                        value = weight,
                        onValueChange = { weight = it },
                        label = "Вес",
                        modifier = Modifier.height(60.dp)
                    )

                    Spacer(modifier = Modifier.height(32.dp))

                    Row(horizontalArrangement = Arrangement.SpaceBetween) {
                        AddDeleteButton(
                            text = "Отмена",
                            onClick = onDismiss,
                            colors = ButtonDefaults.buttonColors(backgroundColor = Arsenic),
                            modifier = Modifier.weight(1f)
                        )

                        Spacer(modifier = Modifier.width(5.dp))

                        AddDeleteButton(
                            text = "Готово",
                            onClick = {
                                onAddWeight(weight)
                                onDismiss()
                            },
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = Arsenic,
                                disabledBackgroundColor = Arsenic,
                                disabledContentColor = Color.White,
                                contentColor = AndroidGreen
                            ),
                            enabled = weight.isNotBlank(),
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Dialog(
    value: String,
    onValueChange: (String) -> Unit,
    label: String = "",
    caption: String = "",
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    placeHolder: String = "",
    shape: Shape = RoundedCornerShape(20.dp),
    modifier: Modifier = Modifier
){
    val numericKeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    BasicTextField(
        modifier = modifier
            .fillMaxWidth(),
        value = value,
        onValueChange = {onValueChange(it)},
        textStyle = TextFieldTextStyle,
        maxLines = 1,
        singleLine = true,
        keyboardOptions = numericKeyboardOptions,
        keyboardActions = keyboardActions
    ) {innerTextField ->
        Card(
            shape = shape,
            backgroundColor = Color.White,
            elevation = 6.dp,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = label,
                style = TextFieldLabelTextStyle,
                modifier = Modifier.padding(start = 20.dp)
            )
            Column(
                modifier = Modifier
                    .padding(horizontal = 10.dp, vertical = 5.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(modifier = Modifier
                        .weight(1f)
                        .padding(start = 10.dp),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        if (value.isEmpty()){
                            Text(
                                text = placeHolder,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Light,
                                color = BrightGray
                            )
                        }
                        innerTextField()
                    }
                    Text(text = caption, style = TextFieldTextStyle)
                }
            }
        }
    }
}