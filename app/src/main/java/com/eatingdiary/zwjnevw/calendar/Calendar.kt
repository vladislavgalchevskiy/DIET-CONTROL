package com.eatingdiary.zwjnevw.calendar

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eatingdiary.zwjnevw.R
import com.eatingdiary.zwjnevw.ui.theme.AndroidGreen
import com.eatingdiary.zwjnevw.ui.theme.Arsenic
import com.eatingdiary.zwjnevw.ui.theme.BrightGray
import com.eatingdiary.zwjnevw.ui.theme.CalendarDayTextStyle
import com.eatingdiary.zwjnevw.ui.theme.TrackItTheme
import com.example.obfuscation.obf
import io.github.boguszpawlowski.composecalendar.SelectableCalendar
import io.github.boguszpawlowski.composecalendar.SelectableWeekCalendar
import io.github.boguszpawlowski.composecalendar.day.DayState
import io.github.boguszpawlowski.composecalendar.rememberSelectableCalendarState
import io.github.boguszpawlowski.composecalendar.rememberSelectableWeekCalendarState
import io.github.boguszpawlowski.composecalendar.selection.DynamicSelectionState
import io.github.boguszpawlowski.composecalendar.selection.SelectionMode
import io.github.boguszpawlowski.composecalendar.week.Week
import java.time.LocalDate
import java.time.YearMonth

@Composable
fun ExpandableCalendar(
    expanded: Boolean,
    onClick: () -> Unit,
    onDateSelected: (LocalDate) -> Unit,
    currentDate: LocalDate = LocalDate.now(),
    modifier: Modifier = Modifier
){
    val selectionState = remember {
        DynamicSelectionState(selection = listOf(currentDate), selectionMode = SelectionMode.Single)
    }

    Surface(
        color = Arsenic,
        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
    ) {
        Surface(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessMedium
                    )
                ),
            shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
        ) {
            Box(modifier = Modifier
                .background(Arsenic)
                .fillMaxWidth()
                .height(50.dp))
            if (!expanded){
                val calendarState = rememberSelectableWeekCalendarState(
                    selectionState = selectionState,
                    initialWeek = getWeekFromDate(selectionState.selection)
                )

                CalendarCard(modifier.clickable { onClick() },
                    cardContent = {
                        SelectableWeekCalendar(modifier = Modifier
                                .background(Color.Transparent),
                            calendarState = calendarState,
                            dayContent = {DayContent(state = it)},
                            weekHeader = {
                                Surface(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp, bottomStart = 0.dp, bottomEnd = 0.dp),
                                    color = Arsenic
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .height(14.dp)
                                            .background(Color.Transparent),
                                        contentAlignment = Alignment.Center
                                    ){
                                        Icon(
                                            painterResource(id = R.drawable.expand_icon), contentDescription = null,
                                            tint = Color.White,
                                            modifier = Modifier.width(41.dp)
                                        )
                                    }
                                }
                            }
                        )
                    }
                )

                if (calendarState.selectionState.selection.isNotEmpty()){
                    if (obf()) onDateSelected(calendarState.selectionState.selection[0])
                } else {
                    onDateSelected(LocalDate.now())
                    if (obf()) calendarState.selectionState.onDateSelected(LocalDate.now())
                }
            }
            else {
                val calendarState = rememberSelectableCalendarState(
                    selectionState = selectionState,
                    initialMonth = getMonthFromDate(selectionState.selection)
                )

                CalendarCard(
                    modifier
                        .clickable { onClick() },
                    cardContent = {
                        SelectableCalendar(modifier = Modifier
                                .background(Color.Transparent),
                            calendarState = calendarState,
                            dayContent = {DayContent(state = it)},
                            monthHeader = { MonthHeader(monthState = it) }
                        )
                    }
                )

                if (calendarState.selectionState.selection.isNotEmpty()){
                    if (obf())onDateSelected(calendarState.selectionState.selection[0])
                } else{
                    onDateSelected(LocalDate.now())
                    if (obf()) calendarState.selectionState.onDateSelected(LocalDate.now())
                }
            }
        }
    }
}

@Composable
private fun CalendarCard(
    modifier: Modifier = Modifier,
    cardContent: @Composable () -> Unit
    ){
    Card(
        modifier = modifier.background(Color.Transparent),
        elevation = 0.dp,
        backgroundColor = MaterialTheme.colors.primaryVariant,
        shape = RoundedCornerShape(0.dp)
    ) {
        cardContent()
    }
}

@Composable
private fun DayContent(
    state: DayState<DynamicSelectionState>,
    modifier: Modifier = Modifier,
    onClick: (LocalDate) -> Unit = {},
){
    val date = state.date
    val selectionState = state.selectionState

    val isSelected = selectionState.isDateSelected(date)

    val boxColor =
        if (isSelected && state.isCurrentDay) BrightGray
        else if (isSelected) AndroidGreen
        else Arsenic

    val textColor = if (state.isCurrentDay) AndroidGreen
        else if (isSelected) Arsenic
        else Color.White

    Box(
        modifier = modifier
            .aspectRatio(1f),
        contentAlignment = Alignment.Center,
    ) {
        Surface(
            shape = CircleShape,
            color = boxColor,
            modifier = Modifier
                .padding(2.dp)
                .size(34.dp)
                .clickable(remember { MutableInteractionSource() }, null) {
                    onClick(date)
                    selectionState.onDateSelected(date)
                }
        ) {
            Box(
                modifier = Modifier.fillMaxSize(1f)
                    .size(34.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = date.dayOfMonth.toString(),
                    Modifier
                        .alpha(if (state.isFromCurrentMonth || isSelected) 1.0f else 0.6f)
                        .offset(x = if ((date.dayOfMonth == 1 || date.dayOfMonth > 9) && date.dayOfMonth !in 20..31) (-1).dp else 0.dp, y = 0.dp),
                    color = textColor,
                    style = CalendarDayTextStyle
                )
            }
        }
    }
}

private fun getMonthFromDate(dateList: List<LocalDate>): YearMonth {
    if (dateList.isNotEmpty()){
        val date = dateList[0]
        return YearMonth.from(date)

    }
    return YearMonth.now()
}

private fun getWeekFromDate(dateList: List<LocalDate>): Week {
    if (dateList.isNotEmpty()){
        val date = dateList[0]
        val monday = date.minusDays((date.dayOfWeek.value - 1).toLong())
        val weekList = List<LocalDate> (7) { monday.plusDays(it.toLong()) }

        return Week(weekList)
    }
    return Week.now()
}

@Preview(showBackground = true)
@Composable
private fun CalendarWeekPreview(){
    TrackItTheme {
        ExpandableCalendar(expanded = false, onClick = { /*TODO*/ }, onDateSelected = {})
    }
}