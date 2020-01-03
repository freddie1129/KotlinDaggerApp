package com.freddie.daggerdemokotlin.di

import com.freddie.daggerdemokotlin.di.mode.LocalRepository
import com.freddie.daggerdemokotlin.di.mode.RemoteRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule {

    @Singleton
    @Provides
    fun remoteRepository() : RemoteRepository = RemoteRepository()



    @Singleton
    @Provides
    fun localRepository() : LocalRepository = LocalRepository()


}