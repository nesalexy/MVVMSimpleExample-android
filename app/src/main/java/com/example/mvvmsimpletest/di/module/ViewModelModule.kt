package com.example.mvvmsimpletest.di.module

import android.app.Application
import com.example.App
import com.example.mvvmsimpletest.di.scope.ViewModelScope
import com.example.mvvmsimpletest.domain.AllUsersViewModel
import com.example.mvvmsimpletest.repository.AppRepository
import dagger.Module
import dagger.Provides

@Module
class ViewModelModule(app: App) {

    internal var app: Application = app

    @ViewModelScope
    @Provides
    internal fun providesAllUserViewModel(repository: AppRepository): AllUsersViewModel {
        return AllUsersViewModel(app, repository)
    }


}