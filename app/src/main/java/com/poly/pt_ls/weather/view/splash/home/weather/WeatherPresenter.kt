package com.poly.pt_ls.weather.view.splash.home.weather

import com.englandstudio.basekt.BasePresenter
import com.poly.pt_ls.weather.model.City
import com.poly.pt_ls.weather.model.Forecast
import com.poly.pt_ls.weather.util.checkImage
import com.poly.pt_ls.weather.util.checkWeather

class WeatherPresenter(view: WeatherContract.View) : BasePresenter<WeatherContract.View>(view),
    WeatherContract.Presenter {
    override fun loadData(city: City?, data: Forecast) {
        val weather = city!!.name
        val info = data.list[0].weather[0].main
        val temp = "${data.list[0].main.temp.toInt()}°C"

        view.displayData(weather, checkWeather(info), temp, checkImage(info))
    }

}