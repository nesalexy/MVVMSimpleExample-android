package com.example

import android.app.Application
import com.example.mvvmsimpletest.di.component.DaggerApiComponent
import com.example.mvvmsimpletest.di.component.DaggerRepositoryComponent
import com.example.mvvmsimpletest.di.module.ApiModule
import com.example.mvvmsimpletest.di.module.RepositoryModule

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        initializeDagger()
    }

    private fun initializeDagger() {
        val apiComponent = DaggerApiComponent.builder()
            .apiModule(ApiModule())
            .build()

        val repositoryComponent = DaggerRepositoryComponent.builder()
            .apiComponent(apiComponent)
            .repositoryModule(RepositoryModule())
            .build()
    }

}