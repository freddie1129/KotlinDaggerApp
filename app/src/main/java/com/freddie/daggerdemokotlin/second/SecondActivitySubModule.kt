package com.freddie.daggerdemokotlin.second

import com.freddie.daggerdemokotlin.di.ActivityScope
import dagger.Module
import dagger.Provides


@Module(subcomponents = [SecondActivitySubcompoent::class])
class SecondActivitySubModule {

    @Provides
    @ActivityScope
    fun secondViewModel() = SecondViewModel()
}