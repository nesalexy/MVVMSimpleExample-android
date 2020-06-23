package com.example.mvvmsimpletest.di.component

import com.example.mvvmsimpletest.di.module.ViewModelModule
import com.example.mvvmsimpletest.di.scope.ViewModelScope
import com.example.mvvmsimpletest.presentation.activities.MainActivity
import dagger.Component

@ViewModelScope
@Component(modules = [ViewModelModule::class], dependencies = [RepositoryComponent::class])
interface ViewModelComponent {
    fun inject(activity: MainActivity)
}