package com.example.mvvmsimpletest.presentation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.example.mvvmsimpletest.R
import com.example.mvvmsimpletest.di.component.ViewModelComponent
import com.example.mvvmsimpletest.domain.AllUsersViewModel
import com.example.mvvmsimpletest.repository.pojo.UsersResponce
import com.kalashnyk.denys.kotlinsample.presentation.base.BaseActivity
import retrofit2.Response
import javax.inject.Inject

class MainActivity : BaseActivity() {

    var viewModel: AllUsersViewModel? = null
        @Inject set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel?.getAllItems()
        viewModel?.getLiveDataItems()?.observe(this, Observer { it?.let { initData(it) } } )
    }

    override fun injectDependency(component: ViewModelComponent) {
        component.inject(this)
    }

    fun initData(userData: Response<UsersResponce>) {
        Log.e("MainActivity", userData.body().toString());
    }


}