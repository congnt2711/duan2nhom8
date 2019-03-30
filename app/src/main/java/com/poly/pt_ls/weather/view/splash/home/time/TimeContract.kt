package com.poly.pt_ls.weather.view.splash.home.time

import com.englandstudio.basekt.BaseContract
import com.poly.pt_ls.weather.model.Forecast

interface TimeContract {
    interface View: BaseContract.View {
        fun displayData(
            list: List<Forecast.ListWeather>?,
            timeDay: String,
            timeTime: String,
            timeWeather: String,
            image: Int
        )
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadData(list: List<Forecast.ListWeather>)

    }
}