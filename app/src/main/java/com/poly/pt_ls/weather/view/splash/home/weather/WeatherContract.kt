package com.poly.pt_ls.weather.view.splash.home.weather

import com.englandstudio.basekt.BaseContract
import com.poly.pt_ls.weather.model.City
import com.poly.pt_ls.weather.model.Forecast

interface WeatherContract {
    interface View : BaseContract.View {
        fun displayData(weather: String, info: String, temp: String, image: Int)

    }

    interface Presenter : BaseContract.Presenter<View> {
        fun loadData(city: City?, data: Forecast)

    }
}