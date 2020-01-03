package com.freddie.daggerdemokotlin.main

import dagger.Module
import dagger.Provides

@Module(subcomponents = [MainActivitySubcompoent::class])
class MainActivitySubModule {
    @Provides
    fun mainViewModel() = MainViewModel()
}