package com.freddie.daggerdemokotlin.di.mode

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(val repository: LocalRepository, val remoteRepository: RemoteRepository) {
}