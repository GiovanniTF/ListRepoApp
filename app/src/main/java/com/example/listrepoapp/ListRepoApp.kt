package com.example.listrepoapp

import android.app.Application
import com.example.listrepoapp.api.apiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ListRepoApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@ListRepoApp)
            modules(apiModule)
        }
    }
}