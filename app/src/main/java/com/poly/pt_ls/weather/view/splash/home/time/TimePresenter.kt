package com.poly.pt_ls.weather.view.splash.home.time

import android.view.View
import com.englandstudio.basekt.BasePresenter
import com.englandstudio.basekt.library.getDateFromTimeStamp
import com.englandstudio.basekt.library.getSDateFromTimeStamp
import com.poly.pt_ls.weather.model.Forecast
import com.poly.pt_ls.weather.util.checkImage
import com.poly.pt_ls.weather.util.checkWeather

class TimePresenter(view: TimeContract.View) : BasePresenter<TimeContract.View>(view), TimeContract.Presenter {
    override fun loadData(list: List<Forecast.ListWeather>) {
        val timeDay = getDateFromTimeStamp(list[0].dt)
        val timeTime = "Ngày: ${list[0].main.temp_max.toInt()}°C - Đêm: ${list[0].main.temp_min.toInt()}°C"
        val timeWeather = list[0].weather[0].main


        view.displayData(checkList(list), timeDay, timeTime, checkWeather(timeWeather), checkImage(timeWeather))
    }



}

private fun checkList(list: List<Forecast.ListWeather>): List<Forecast.ListWeather> {
    var temp = ""
    val newList = ArrayList<Forecast.ListWeather>()
    for (item in list) {
        if (temp == getSDateFromTimeStamp(item.dt)) {
            item.clouds.all = View.INVISIBLE
        } else {
            item.clouds.all = View.VISIBLE
            temp = getSDateFromTimeStamp(item.dt)
        }
        newList.add(item)
    }
    return newList
}