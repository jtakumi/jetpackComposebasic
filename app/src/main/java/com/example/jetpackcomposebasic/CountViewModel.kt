package com.example.jetpackcomposebasic

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    val starCount = MutableLiveData(0)
    val triangleCount = MutableLiveData(0)

    //宣言した変数の値を読み込んで上書きする
    fun starCountUp() {
        val starPlusCount = starCount.value ?: 0
        starCount.value = starCount.value?.plus(1)
    }

    fun triangleCountUp() {
        val trianglePlusCount = triangleCount.value ?: 0
        triangleCount.value = triangleCount.value?.plus(1)
    }
}