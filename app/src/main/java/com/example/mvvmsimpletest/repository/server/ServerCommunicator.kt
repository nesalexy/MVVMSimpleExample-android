package com.example.mvvmsimpletest.repository.server

import android.util.Log
import com.example.mvvmsimpletest.repository.pojo.UsersResponce
import io.reactivex.ObservableTransformer
import io.reactivex.Single
import io.reactivex.SingleTransformer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit
import retrofit2.Response

class ServerCommunicator(private val mService: ApiService) {

    companion object {
        private val DEFAULT_TIMEOUT = 10
        private val DEFAULT_RETRY_ATTEMPTS = 4L
    }

    fun getAllUsers(): Single<Response<UsersResponce>> {
        return mService.getUsers()
            .compose(singleTransformer())
            .doOnError { t: Throwable -> Log.e("ServerCommunicator", t.message) }
    }

    private fun <T> singleTransformer(): SingleTransformer<T, T> = SingleTransformer {
        it.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .timeout(DEFAULT_TIMEOUT.toLong(), TimeUnit.SECONDS)
            .retry(DEFAULT_RETRY_ATTEMPTS)
    }

    private fun <T> observableTransformer(): ObservableTransformer<T, T> = ObservableTransformer {
        it.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .timeout(DEFAULT_TIMEOUT.toLong(), TimeUnit.SECONDS)
            .retry(DEFAULT_RETRY_ATTEMPTS)
    }
}
