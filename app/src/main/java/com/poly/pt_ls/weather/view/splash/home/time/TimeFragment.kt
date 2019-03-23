package com.poly.pt_ls.weather.view.splash.home.time

import android.annotation.SuppressLint
import android.os.Bundle
import com.englandstudio.basekt.BaseFragment
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.model.Forecast
import kotlinx.android.synthetic.main.fragment_time.*

@SuppressLint("ValidFragment")
class TimeFragment @SuppressLint("ValidFragment") constructor( var list: List<Forecast.ListWeather>) : BaseFragment<TimeContract.View,TimeContract.Presenter>(),TimeContract.View {
    override fun presenter() = TimePresenter(this)
    override fun layout() = R.layout.fragment_time

    override fun view(savedInstanceState: Bundle?) {
        presenter.loadData(list)
    }

    override fun displayData(list: List<Forecast.ListWeather>?) {
        lvTimeHome.adapter = TimeAdapter(context!!,list!!)
    }
}