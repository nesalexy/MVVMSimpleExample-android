package com.example.mvvmsimpletest.repository.server

import com.example.mvvmsimpletest.repository.pojo.UsersResponce
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/v3/ac267e84-0b89-41fc-9c1b-f629f437e195")
    fun getUsers(): Single<Response<UsersResponce>>

}