package com.freddie.daggerdemokotlin.app

import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.classTag(): String {
    return  "classTag : ${this.javaClass.simpleName}"
}

