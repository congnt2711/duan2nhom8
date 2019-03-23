package com.poly.pt_ls.weather.view.splash.home.weather

import android.annotation.SuppressLint
import android.os.Bundle
import com.englandstudio.basekt.BaseFragment
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.model.Forecast
import kotlinx.android.synthetic.main.fragment_weather.*

@SuppressLint("ValidFragment")
class WeatherFragment @SuppressLint("ValidFragment") constructor(var data: Forecast) :
    BaseFragment<WeatherContract.View, WeatherContract.Presnter>(), WeatherContract.View {
    override fun presenter() = WeatherPresenter(this)
    override fun layout() = R.layout.fragment_weather

    @SuppressLint("SetTextI18n")
    override fun view(savedInstanceState: Bundle?) {
        txtHomeWeather.text = data.city.name
        txtHomeWeatherInfo.text = data.list[0].weather[0].main
        txtHomeWeatherTemp.text = "${data.list[0].main.temp.toInt()}°C"
    }

}