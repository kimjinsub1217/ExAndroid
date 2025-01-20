package com.jinsub.fastcampus_blind.data.source.local

import androidx.room.TypeConverter
import com.jinsub.fastcampus_blind.util.DateUtil
import java.util.Date

class DateConverter {

    @TypeConverter
    fun toDate(timestamp: String?): Date? {
        return timestamp?.let { DateUtil.dbDateFormat.parse(it) }
    }

    @TypeConverter
    fun toTimestamp(date: Date?): String? {
        return DateUtil.dbDateFormat.format(date)
    }
}