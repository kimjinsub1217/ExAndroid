package com.jinsub.fastcampus_blind.data.source.local

import androidx.room.TypeConverter
import com.jinsub.fastcampus_blind.util.DateUtil
import java.util.Date

class DateConverter {

    @TypeConverter
    fun toDate(timestamp: String?): Date? {
        return timestamp?.let {
            DateUtil.dbDAteFormat.parse(it)
        }
    }

    @TypeConverter
    fun toTimeStamp(date: Date?): String? {
        return DateUtil.dbDAteFormat.format(date)
    }


}