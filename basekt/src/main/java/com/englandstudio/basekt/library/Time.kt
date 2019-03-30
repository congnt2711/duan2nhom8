package com.englandstudio.basekt.library

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*


fun getCurrentTime(): String {
    val calendar = Calendar.getInstance()
    val hour = calendar.get(Calendar.HOUR)
    val minute = calendar.get(Calendar.MINUTE)
    return "$hour:$minute"
}

fun getCurrentTimeStamp(): Long {
    return Calendar.getInstance().timeInMillis
}

fun getTimeStampFromCalendar(calendar: Calendar): Long {
    return calendar.timeInMillis
}

fun getCalendarFromTimeStamp(timeInMillis: Long): Calendar {
    val calendar = Calendar.getInstance()
    calendar.timeInMillis = timeInMillis
    return calendar
}

fun getCalendarFromStringDate(string: String): Calendar {
    val calendar = Calendar.getInstance()
    if (string.isEmpty()) {
        return calendar
    }
    val date = string.split("/")
    calendar.set(date[2].toInt(), date[1].toInt() - 1, date[0].toInt())
    return calendar
}

@SuppressLint("SimpleDateFormat")
fun getDateTimeFromTimeStamp(time: Long): String {
    val formatter = SimpleDateFormat("dd/MM/yyyy hh:mm")
    val calendar = Calendar.getInstance()
    calendar.timeInMillis = time
    return formatter.format(calendar.time)
}

fun getDateTimeFromCalendar(calendar: Calendar): String {
    return getDateTimeFromTimeStamp(calendar.timeInMillis)
}

@SuppressLint("SimpleDateFormat")
fun getDateFromTimeStamp(time: Long): String {
    val formatter = SimpleDateFormat("'Ngày' dd 'tháng' MM 'năm' yyyy")
    val calendar = Calendar.getInstance()
    calendar.timeInMillis = time * 1000
    return formatter.format(calendar.time)
}

@SuppressLint("SimpleDateFormat")
fun getSDateFromTimeStamp(time: Long): String {
    val formatter = SimpleDateFormat("dd/MM")
    val calendar = Calendar.getInstance()
    calendar.timeInMillis = time * 1000
    return formatter.format(calendar.time)
}

@SuppressLint("SimpleDateFormat")
fun getTimeFromTimeStamp(time: Long): String {
    val formatter = SimpleDateFormat("HH:mm")
    val calendar = Calendar.getInstance()
    calendar.timeInMillis = time * 1000
    return formatter.format(calendar.time)
}

fun getDateFromCalendar(calendar: Calendar): String {
    return getDateFromTimeStamp(calendar.timeInMillis)
}