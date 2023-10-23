package com.eatingdiary.zwjnevw.ui.statistics

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eatingdiary.zwjnevw.R
import com.eatingdiary.zwjnevw.ui.navigation.TopBarWithLabel
import com.eatingdiary.zwjnevw.ui.theme.AndroidGreen
import com.eatingdiary.zwjnevw.ui.theme.Arsenic
import com.eatingdiary.zwjnevw.ui.theme.BrightGray

@Composable
fun StatisticsPage(
    navigateBack: () -> Unit
){
    val selectedButtonName = remember {mutableStateOf(ButtonName.Weight)}

    Column {
        TopBarWithLabel(
            label = "Статистика",
            icon = R.drawable.statistics_icon,
            iconColor = Arsenic,
            navigateBack = navigateBack
        )

        Spacer(Modifier.height(20.dp))

        ButtonRow(
            selectedButtonName = selectedButtonName.value,
            onClick = {selectedButtonName.value = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
        )

        Spacer(Modifier.height(30.dp))

        when(selectedButtonName.value){
            ButtonName.Food -> FoodStatistics(modifier = Modifier.padding(horizontal = 10.dp))
            ButtonName.Weight -> WeightStatistics()
            ButtonName.Workout -> WorkoutStatistics(modifier = Modifier.padding(horizontal = 10.dp))
        }
    }
}

@Composable
fun StatisticsCard(
    modifier: Modifier = Modifier,
    label: String,
    data: String
){
    val context = LocalContext.current

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 8.dp
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 5.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = label,
                style = TextStyle(
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Arsenic
                )
            )

            Spacer(Modifier.width(5.dp))

            Spacer(modifier = Modifier.weight(1f))

            val toastLength = if(data.length > 30) Toast.LENGTH_LONG else Toast.LENGTH_SHORT

            Card(
                modifier = Modifier
                    .clickable(remember { MutableInteractionSource() },null)
                        { if(data.length > 15) Toast.makeText(context, data, toastLength).show() },
                backgroundColor = Color.White,
                shape = RoundedCornerShape(10.dp),
                elevation = 4.dp
            ) {
                Text(
                    modifier = Modifier
                        .padding(horizontal = 8.dp, vertical = 5.dp),
                    text = data,
                    style = TextStyle(
                        fontFamily = FontFamily.Default,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Arsenic
                    ),
                    overflow = TextOverflow.Ellipsis,
                    softWrap = true,
                    maxLines = 1
                )
            }
        }
    }
}

@Composable
private fun ButtonRow(
    selectedButtonName: ButtonName,
    onClick: (ButtonName) -> Unit,
    modifier: Modifier = Modifier
){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
    ) {
        StatisticsButton(
            modifier = Modifier.weight(1f),
            label = "Питание",
            onClick = { onClick(ButtonName.Food) },
            selected = ButtonName.Food == selectedButtonName
        )

        Spacer(Modifier.width(10.dp))
        
        StatisticsButton(
            modifier = Modifier.weight(1f),
            label = "Вес",
            onClick = { onClick(ButtonName.Weight) },
            selected = ButtonName.Weight == selectedButtonName
        )

        Spacer(Modifier.width(10.dp))

        StatisticsButton(
            modifier = Modifier.weight(1f),
            label = "Активности",
            onClick = { onClick(ButtonName.Workout) },
            selected = ButtonName.Workout == selectedButtonName
        )
    }
}

@Composable
private fun StatisticsButton(
    modifier: Modifier = Modifier,
    label: String,
    onClick: () -> Unit,
    selected: Boolean = false
){
    val textColor = if (selected) AndroidGreen else Arsenic
    val buttonColor = if (selected) Arsenic else BrightGray

    Button(
        modifier = modifier,
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = buttonColor,
            contentColor = textColor
        ),
        shape = RoundedCornerShape(25.dp),
        elevation = ButtonDefaults.elevation(defaultElevation = 8.dp),
        contentPadding = PaddingValues(horizontal = 0.dp, vertical = 8.dp)
    ) {
        Text(
            text = label,
            maxLines = 1,
            style = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp
            )
        )
    }
}

private enum class ButtonName{
    Weight,
    Workout,
    Food
}