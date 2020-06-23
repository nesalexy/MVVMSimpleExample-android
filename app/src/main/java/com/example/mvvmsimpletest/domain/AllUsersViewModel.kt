package com.example.mvvmsimpletest.domain

import android.annotation.SuppressLint
import android.app.Application
import androidx.lifecycle.LiveData
import com.example.mvvmsimpletest.repository.AppRepository
import com.example.mvvmsimpletest.repository.pojo.UsersResponce
import com.kalashnyk.denys.kotlinsample.presentation.widget.SingleLiveEvent
import retrofit2.Response

class AllUsersViewModel(application: Application, private val mRepository: AppRepository) : BaseViewModel(application) {
    private val liveDataItems = SingleLiveEvent<Response<UsersResponce>>()

    @SuppressLint("CheckResult")
    fun getAllItems() {
        mRepository.getAllUsers()?.subscribe { list -> liveDataItems.value = list }
    }

    fun getLiveDataItems(): LiveData<Response<UsersResponce>> {
        return liveDataItems
    }
}

