package com.athaya.marsphotos

import android.app.Application
import com.athaya.marsphotos.data.AppContainer
import com.athaya.marsphotos.data.DefaultAppContainer

class MarsPhotoApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}