package com.example.mvvmsimpletest.repository.server

import com.example.mvvmsimpletest.repository.pojo.UsersResponce
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {



    @GET("/v3/7403b227-dd7a-4509-9ba1-31b706ebac14")
    fun getUsers(): Single<UsersResponce>

}