package com.jkhan.androidprep

import android.app.Application
import com.facebook.stetho.Stetho
import com.jkhan.androidprep.di.DaggerApplicationComponent

// appComponent lives in the Application class to share its lifecycle
class Myapplication: Application() {
    // Reference to the application graph that is used across the whole app
    val appComponent = DaggerApplicationComponent.create()

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
    }
}