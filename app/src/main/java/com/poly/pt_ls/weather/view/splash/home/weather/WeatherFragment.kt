package com.poly.pt_ls.weather.view.splash.home.weather

import android.annotation.SuppressLint
import android.os.Bundle
import com.englandstudio.basekt.BaseFragment
import com.englandstudio.basekt.library.load
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.model.City
import com.poly.pt_ls.weather.model.Forecast
import kotlinx.android.synthetic.main.fragment_weather.*

@SuppressLint("ValidFragment,SetTextI18n")
class WeatherFragment @SuppressLint("ValidFragment") constructor(
    var data: Forecast,
    var city: City?
) :
    BaseFragment<WeatherContract.View, WeatherContract.Presenter>(), WeatherContract.View {
    override fun presenter() = WeatherPresenter(this)
    override fun layout() = R.layout.fragment_weather

    override fun view(savedInstanceState: Bundle?) {
        presenter.loadData(city, data)
    }

    override fun displayData(weather: String, info: String, temp: String, image: Int) {
        txtHomeWeather.text = weather
        txtHomeWeatherInfo.text = info
        txtHomeWeatherTemp.text = temp
        txtHomeG.text = data.list[0].wind.speed.toString()
        txtHomeDA.text = "${data.list[0].main.humidity}%"
        txtHomeLM.text = data.list[0].main.sea_level.toInt().toString()
        imgHomeWeather.load(image)
    }

}