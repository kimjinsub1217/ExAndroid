package com.jinsub.fastcampus_blind.util

import java.text.SimpleDateFormat
import java.util.Date

object DateUtil {

    val yyyy_MM_dd = SimpleDateFormat("yyyy.MM.dd")
    val dbDAteFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
    val serverDateFormat=SimpleDateFormat("yyyy-MM=dd'T'HH:mm:ss.SSS")

    fun convertPrintDateString(date: Date?=Date()) = yyyy_MM_dd.format(date)

}