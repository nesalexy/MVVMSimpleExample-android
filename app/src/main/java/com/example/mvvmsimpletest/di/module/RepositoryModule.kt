package com.example.mvvmsimpletest.di.module

import com.example.mvvmsimpletest.di.scope.RepositoryScope
import com.example.mvvmsimpletest.repository.AppRepository
import com.example.mvvmsimpletest.repository.server.ServerCommunicator
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @RepositoryScope
    @Provides
    internal fun providesRepository(communicator: ServerCommunicator): AppRepository {
        return AppRepository(communicator)
    }

}