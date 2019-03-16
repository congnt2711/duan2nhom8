package com.poly.pt_ls.weather.view.splash.home

import com.englandstudio.basekt.BasePresenter
import com.poly.pt_ls.weather.view.splash.home.time.TimeFragment
import com.poly.pt_ls.weather.view.splash.home.weather.WeatherFragment

class HomePresenter(view : HomeContract.View):BasePresenter<HomeContract.View>(view),HomeContract.Presenter {
    override fun loadDataPager() {
        val list = listOf(WeatherFragment(),TimeFragment())
        view.displayListPager(list)
    }
}