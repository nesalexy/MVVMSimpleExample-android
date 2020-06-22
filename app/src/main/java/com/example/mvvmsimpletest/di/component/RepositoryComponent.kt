package com.example.mvvmsimpletest.di.component

import com.example.mvvmsimpletest.di.module.RepositoryModule
import com.example.mvvmsimpletest.di.scope.RepositoryScope
import com.example.mvvmsimpletest.repository.AppRepository
import dagger.Component

@RepositoryScope
@Component(modules = [RepositoryModule::class], dependencies = [ApiComponent::class])
interface RepositoryComponent {
    val repository: AppRepository
}