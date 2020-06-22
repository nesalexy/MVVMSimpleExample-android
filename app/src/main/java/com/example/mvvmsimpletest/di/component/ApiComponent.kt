package com.example.mvvmsimpletest.di.component

import com.example.mvvmsimpletest.di.module.ApiModule
import com.example.mvvmsimpletest.di.scope.ApiScope
import com.example.mvvmsimpletest.repository.server.ServerCommunicator
import dagger.Component

@ApiScope
@Component(modules = [ApiModule::class])
interface ApiComponent {
    val serverCommunicator: ServerCommunicator
}