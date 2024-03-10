package com.example.jetpackcomposebasic

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StarCountViewModel : ViewModel() {
    val count = MutableLiveData(0)

    fun countUp() {
        val plusCount = count.value ?: 0
        count.value = count.value?.plus(1)
    }
}

