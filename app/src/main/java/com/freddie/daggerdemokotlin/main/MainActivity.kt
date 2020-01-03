package com.freddie.daggerdemokotlin.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.freddie.daggerdemokotlin.R
import com.freddie.daggerdemokotlin.app.classTag
import com.freddie.daggerdemokotlin.di.AppScopeDataHolder
import com.freddie.daggerdemokotlin.di.MyApplication
import com.freddie.daggerdemokotlin.di.mode.Repository
import com.freddie.daggerdemokotlin.second.SecondActivity
import com.freddie.daggerdemokotlin.second.SecondViewModel
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var repository: Repository
    @Inject lateinit var mainViewModel: MainViewModel
   // @Inject lateinit var secondViewModel: SecondViewModel



    @Inject lateinit var appScopeDataHolder: AppScopeDataHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        //(application as MyApplication).appComponent.inject(this)
        (application as MyApplication).appComponent.mainComponent().create().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(classTag(),System.identityHashCode(repository).toString())
        text.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }
        Log.d(classTag(), mainViewModel.toString() + "@" + System.identityHashCode(mainViewModel).toString())
     //   Log.d(classTag(), secondViewModel.toString() + "@" + System.identityHashCode(secondViewModel).toString())

        Log.d(classTag(), appScopeDataHolder.toString() + "@" + System.identityHashCode(appScopeDataHolder).toString())

    }
}
