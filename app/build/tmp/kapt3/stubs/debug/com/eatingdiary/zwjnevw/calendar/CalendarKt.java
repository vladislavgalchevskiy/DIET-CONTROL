package com.eatingdiary.zwjnevw.calendar;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\b\u0006H\u0003\u001a\b\u0010\u0007\u001a\u00020\u0001H\u0003\u001a6\u0010\b\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0003\u001aF\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017H\u0002\u001a\u0016\u0010\u0018\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017H\u0002\u00a8\u0006\u001a"}, d2 = {"CalendarCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "cardContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "CalendarWeekPreview", "DayContent", "state", "Lio/github/boguszpawlowski/composecalendar/day/DayState;", "Lio/github/boguszpawlowski/composecalendar/selection/DynamicSelectionState;", "onClick", "Lkotlin/Function1;", "Ljava/time/LocalDate;", "ExpandableCalendar", "expanded", "", "onDateSelected", "currentDate", "getMonthFromDate", "Ljava/time/YearMonth;", "dateList", "", "getWeekFromDate", "Lio/github/boguszpawlowski/composecalendar/week/Week;", "app_debug"})
public final class CalendarKt {
    
    @androidx.compose.runtime.Composable
    public static final void ExpandableCalendar(boolean expanded, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.time.LocalDate, kotlin.Unit> onDateSelected, @org.jetbrains.annotations.NotNull
    java.time.LocalDate currentDate, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void CalendarCard(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> cardContent) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void DayContent(io.github.boguszpawlowski.composecalendar.day.DayState<io.github.boguszpawlowski.composecalendar.selection.DynamicSelectionState> state, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super java.time.LocalDate, kotlin.Unit> onClick) {
    }
    
    private static final java.time.YearMonth getMonthFromDate(java.util.List<java.time.LocalDate> dateList) {
        return null;
    }
    
    private static final io.github.boguszpawlowski.composecalendar.week.Week getWeekFromDate(java.util.List<java.time.LocalDate> dateList) {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    private static final void CalendarWeekPreview() {
    }
}