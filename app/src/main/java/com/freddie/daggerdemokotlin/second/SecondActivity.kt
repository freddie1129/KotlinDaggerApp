package com.freddie.daggerdemokotlin.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.freddie.daggerdemokotlin.R
import com.freddie.daggerdemokotlin.app.classTag
import com.freddie.daggerdemokotlin.di.AppScopeDataHolder
import com.freddie.daggerdemokotlin.di.MyApplication
import com.freddie.daggerdemokotlin.di.mode.Repository
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {

   // @Inject lateinit var repository: Repository
   // @Inject lateinit var appScopeDataHolder: AppScopeDataHolder
    @Inject lateinit var secondViewModel: SecondViewModel



    override fun onCreate(savedInstanceState: Bundle?) {
        //(application as MyApplication).appComponent.inject(this)
        (application as MyApplication).appComponent.secondComponent().create().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
       // Log.d(classTag(),System.identityHashCode(repository).toString())
       // Log.d(classTag(), appScopeDataHolder.toString() + "@" + System.identityHashCode(appScopeDataHolder).toString())
        Log.d(classTag(), secondViewModel.toString() + "@" + System.identityHashCode(secondViewModel).toString())


    }
}
