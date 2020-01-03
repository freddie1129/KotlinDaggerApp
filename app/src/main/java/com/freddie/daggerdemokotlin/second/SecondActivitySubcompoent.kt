package com.freddie.daggerdemokotlin.second

import com.freddie.daggerdemokotlin.di.ActivityScope
import com.freddie.daggerdemokotlin.main.MainActivitySubcompoent
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface SecondActivitySubcompoent {

    @Subcomponent.Factory
    interface Factory {
        fun create() : SecondActivitySubcompoent
    }

    fun inject(activity : SecondActivity)

}