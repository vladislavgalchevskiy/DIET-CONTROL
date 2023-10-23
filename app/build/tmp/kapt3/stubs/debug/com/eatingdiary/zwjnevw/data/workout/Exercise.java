package com.eatingdiary.zwjnevw.data.workout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u0004X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/eatingdiary/zwjnevw/data/workout/Exercise;", "", "()V", "id", "", "getId", "()J", "setId", "(J)V", "name", "", "getName", "()Ljava/lang/String;", "Lcom/eatingdiary/zwjnevw/data/workout/CardioExercise;", "Lcom/eatingdiary/zwjnevw/data/workout/StrengthExercise;", "app_debug"})
public abstract class Exercise {
    
    private Exercise() {
        super();
    }
    
    public abstract long getId();
    
    public abstract void setId(long p0);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getName();
}