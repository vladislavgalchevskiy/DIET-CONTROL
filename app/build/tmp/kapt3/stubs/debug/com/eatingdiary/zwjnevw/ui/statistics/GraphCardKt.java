package com.eatingdiary.zwjnevw.ui.statistics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a]\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00052/\u0010\t\u001a+\u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005\u0012\u0004\u0012\u00020\u00010\n\u00a2\u0006\u0002\b\u000bH\u0007\u001a,\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005H\u0007\u001a6\u0010\r\u001a\u00020\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u001a*\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a*\u0010\u0014\u001a\u00020\u00112\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u00a8\u0006\u0015"}, d2 = {"GraphCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "data", "", "Lkotlin/Pair;", "", "", "graph", "Lkotlin/Function2;", "Landroidx/compose/runtime/Composable;", "LineGraph", "WeightLineGraph", "weightViewModel", "Lcom/eatingdiary/zwjnevw/data/weight/WeightViewModel;", "prepareLineGraphData", "Lcom/github/mikephil/charting/data/LineData;", "context", "Landroid/content/Context;", "prepareWeightGraphData", "app_debug"})
public final class GraphCardKt {
    
    @androidx.compose.runtime.Composable
    public static final void GraphCard(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.util.List<kotlin.Pair<java.lang.Float, java.lang.String>> data, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier, ? super java.util.List<kotlin.Pair<java.lang.Float, java.lang.String>>, kotlin.Unit> graph) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void LineGraph(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.util.List<kotlin.Pair<java.lang.Float, java.lang.String>> data) {
    }
    
    private static final com.github.mikephil.charting.data.LineData prepareLineGraphData(java.util.List<kotlin.Pair<java.lang.Float, java.lang.String>> data, android.content.Context context) {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    public static final void WeightLineGraph(@org.jetbrains.annotations.NotNull
    java.util.List<kotlin.Pair<java.lang.Float, java.lang.String>> data, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.weight.WeightViewModel weightViewModel) {
    }
    
    private static final com.github.mikephil.charting.data.LineData prepareWeightGraphData(java.util.List<kotlin.Pair<java.lang.Float, java.lang.String>> data, android.content.Context context) {
        return null;
    }
}