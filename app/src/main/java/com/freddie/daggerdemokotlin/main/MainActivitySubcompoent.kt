package com.freddie.daggerdemokotlin.main

import com.freddie.daggerdemokotlin.di.ActivityScope
import com.freddie.daggerdemokotlin.second.SecondActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface MainActivitySubcompoent {

    @Subcomponent.Factory
    interface Factory {
        fun create() : MainActivitySubcompoent
    }

    fun inject(activity : MainActivity)

}