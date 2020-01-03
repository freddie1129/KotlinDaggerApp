package com.freddie.daggerdemokotlin.di

import com.freddie.daggerdemokotlin.main.MainActivity
import com.freddie.daggerdemokotlin.main.MainActivitySubModule
import com.freddie.daggerdemokotlin.main.MainActivitySubcompoent
import com.freddie.daggerdemokotlin.second.SecondActivity
import com.freddie.daggerdemokotlin.second.SecondActivitySubModule
import com.freddie.daggerdemokotlin.second.SecondActivitySubcompoent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class,MainActivitySubModule::class,SecondActivitySubModule::class])
interface ApplicationComponent {

    fun mainComponent() : MainActivitySubcompoent.Factory
    fun secondComponent() : SecondActivitySubcompoent.Factory


    fun inject(MainActivity: MainActivity)
    fun inject(secondActivity: SecondActivity)



}