package com.example.mvvmsimpletest.repository.pojo

import com.google.gson.annotations.SerializedName

data class UsersResponce(
    val current_page: Int,
    val max_page: Int,
    val users: List<User>
)


