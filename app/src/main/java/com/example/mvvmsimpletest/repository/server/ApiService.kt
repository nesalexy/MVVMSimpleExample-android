package com.example.mvvmsimpletest.repository.server

import com.example.mvvmsimpletest.repository.pojo.UsersResponce
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

//    {
//        "current_page": 1,
//        "max_page": 5,
//        "data": [
//        {
//            "id": 1,
//            "name": "Android",
//            "surname": "MVVM",
//            "description": "some description"
//        },
//        {
//            "id": 1,
//            "name": "Android",
//            "surname": "MVVM",
//            "description": "some description"
//        },
//        {
//            "id": 2,
//            "name": "Android",
//            "surname": "MVP",
//            "description": "some description"
//        },
//
//        {
//            "id": 3,
//            "name": "Android",
//            "surname": "MVC",
//            "description": "some description"
//        },
//        {
//            "id": 4,
//            "name": "Android",
//            "surname": "All in Activity",
//            "description": "some description"
//        }
//
//
//
//        ]
//
//    }

    @GET("/v3/7403b227-dd7a-4509-9ba1-31b706ebac14")
    fun getUsers(): Single<Response<UsersResponce>>

}