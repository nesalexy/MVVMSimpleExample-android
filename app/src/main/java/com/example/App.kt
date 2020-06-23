package com.example

import android.app.Application
import com.example.mvvmsimpletest.di.component.DaggerApiComponent
import com.example.mvvmsimpletest.di.component.DaggerRepositoryComponent
import com.example.mvvmsimpletest.di.component.DaggerViewModelComponent
import com.example.mvvmsimpletest.di.component.ViewModelComponent
import com.example.mvvmsimpletest.di.module.ApiModule
import com.example.mvvmsimpletest.di.module.RepositoryModule
import com.example.mvvmsimpletest.di.module.ViewModelModule

class App: Application() {

    private var viewModelComponent: ViewModelComponent? = null

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

        viewModelComponent = DaggerViewModelComponent.builder()
            .repositoryComponent(repositoryComponent)
            .viewModelModule(ViewModelModule(this))
            .build()
    }

    fun getViewModelComponent(): ViewModelComponent {
        return this!!.viewModelComponent!!
    }

}