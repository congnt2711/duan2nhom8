package com.poly.pt_ls.weather.util

import com.poly.pt_ls.weather.R


fun checkWeather(weather : String) : String {
    return when(weather.toLowerCase()) {
        "clouds" -> "Mây Mù"
        "wind" -> "Gió"
        "sun" -> "Nắng"
        "rain" -> "Mưa"
        else -> "Trời Trong"
    }
}

fun checkImage(weather: String) : Int {
    return when(weather.toLowerCase()) {
        "clouds" -> R.drawable.weather_cloud
        "wind" -> R.drawable.weather_wind
        "sun" -> R.drawable.weather_clear
        "rain" -> R.drawable.weather_rain
        else -> R.drawable.weather_clear
    }
}