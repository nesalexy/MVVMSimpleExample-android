package com.example.mvvmsimpletest.repository

import com.example.mvvmsimpletest.repository.pojo.User
import com.example.mvvmsimpletest.repository.pojo.UsersResponce
import com.example.mvvmsimpletest.repository.server.ServerCommunicator
import com.google.gson.annotations.Since
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Response
import java.util.*

class AppRepository(private val serverCommunicator: ServerCommunicator) {

    fun getAllUsers(): Single<Response<UsersResponce>>? {
        return serverCommunicator.getAllUsers()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

}