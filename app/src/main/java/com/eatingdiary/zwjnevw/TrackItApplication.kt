package com.eatingdiary.zwjnevw

import android.app.Application
import com.eatingdiary.zwjnevw.data.AppContainer
import com.eatingdiary.zwjnevw.data.AppDataContainer
import com.example.obfuscation.obf

class TrackItApplication: Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        if (obf()) super.onCreate()
        container = AppDataContainer(this)
    }
}