package com.example.viewmodelpractice

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class MyViewModel :ViewModel() {

    private val _count = mutableIntStateOf(0)
    val count = _count

    fun increment (){
        _count.intValue++
    }

}