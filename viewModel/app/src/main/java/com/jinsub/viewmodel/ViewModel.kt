package com.jinsub.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {

//    private var dollarText = ""

//    private var result: Float = 0f

//    private var result: MutableLiveData<Float> = MutableLiveData()
    private val usd_to_eu_rate = 0.74f
    var dollarValue: MutableLiveData<String> = MutableLiveData()
    var result: MutableLiveData<Float> = MutableLiveData()

//    fun setAmount(value: String) {
//        this.dollarText = value
////        result = value.toFloat() * usd_to_eu_rate
//        result.value = value.toFloat() * usd_to_eu_rate
//    }
//
//    fun getResult(): MutableLiveData<Float> {
//        return result
//    }

    fun convertValue() {
        dollarValue.let {
            if (!it.value.equals("")) {
                result.value = it.value?.toFloat()?.times(usd_to_eu_rate)
            } else {
                result.value = 0f
            }
        }
    }
}