package com.poly.pt_ls.weather.view.splash.home.weather

import android.os.Bundle
import com.englandstudio.basekt.BaseFragment
import com.poly.pt_ls.weather.R

class WeatherFragment : BaseFragment<WeatherContract.View, WeatherContract.Presnter>(), WeatherContract.View {
    override fun presenter() = WeatherPresenter(this)
    override fun layout() = R.layout.fragment_weather

    override fun view(savedInstanceState: Bundle?) {

    }
}