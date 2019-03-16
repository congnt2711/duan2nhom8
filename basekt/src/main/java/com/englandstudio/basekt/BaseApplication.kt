package com.englandstudio.basekt

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import android.content.Context

@SuppressLint("StaticFieldLeak")
class BaseApplication : Application() {
    companion object {
        lateinit var context: Context
        lateinit var activity: Activity
    }

    override fun onCreate() {
        super.onCreate()
        context = this
    }
}