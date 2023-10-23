package com.eatingdiary.zwjnevw.ui.welcome;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003\u001a>\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0003\u001a\u001c\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\b\u0010\u0011\u001a\u00020\u0001H\u0003\u001a\u001a\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\rH\u0003\u001a\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0002\u001a(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002\u001a\u0018\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016H\u0002\u00a8\u0006!"}, d2 = {"TopBarCircle", "", "modifier", "Landroidx/compose/ui/Modifier;", "highlighted", "", "WelcomeButton", "onClick", "Lkotlin/Function0;", "toastText", "", "enabled", "page", "Lcom/eatingdiary/zwjnevw/ui/welcome/WelcomePage;", "WelcomeScreen", "weightViewModel", "Lcom/eatingdiary/zwjnevw/data/weight/WeightViewModel;", "WelcomeScreenPreview", "WelcomeTopBar", "currentPage", "getNextPage", "getProfileData", "Lcom/eatingdiary/zwjnevw/ui/welcome/WelcomeData;", "gender", "Lcom/eatingdiary/zwjnevw/ui/welcome/Gender;", "ageTextFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "heightTextFieldValue", "weightTextFieldValue", "navigateToMainActivity", "context", "Landroid/content/Context;", "profileData", "app_debug"})
public final class WelcomeScreenKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.ui.ExperimentalComposeUiApi.class})
    public static final void WelcomeScreen(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    com.eatingdiary.zwjnevw.data.weight.WeightViewModel weightViewModel) {
    }
    
    private static final com.eatingdiary.zwjnevw.ui.welcome.WelcomeData getProfileData(com.eatingdiary.zwjnevw.ui.welcome.Gender gender, androidx.compose.ui.text.input.TextFieldValue ageTextFieldValue, androidx.compose.ui.text.input.TextFieldValue heightTextFieldValue, androidx.compose.ui.text.input.TextFieldValue weightTextFieldValue) {
        return null;
    }
    
    private static final com.eatingdiary.zwjnevw.ui.welcome.WelcomePage getNextPage(com.eatingdiary.zwjnevw.ui.welcome.WelcomePage currentPage) {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    private static final void WelcomeButton(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> onClick, java.lang.String toastText, boolean enabled, com.eatingdiary.zwjnevw.ui.welcome.WelcomePage page) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void WelcomeTopBar(androidx.compose.ui.Modifier modifier, com.eatingdiary.zwjnevw.ui.welcome.WelcomePage currentPage) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void TopBarCircle(androidx.compose.ui.Modifier modifier, boolean highlighted) {
    }
    
    private static final void navigateToMainActivity(android.content.Context context, com.eatingdiary.zwjnevw.ui.welcome.WelcomeData profileData) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview(showSystemUi = true, showBackground = true)
    private static final void WelcomeScreenPreview() {
    }
}