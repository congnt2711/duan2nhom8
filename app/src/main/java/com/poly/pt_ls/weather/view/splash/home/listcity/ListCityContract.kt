package com.poly.pt_ls.weather.view.splash.home.listcity

import com.englandstudio.basekt.BaseContract
import com.poly.pt_ls.weather.model.City

interface ListCityContract {
    interface View : BaseContract.View {
        fun displayCity(arrLC: List<City>)
    }

    interface Presenter : BaseContract.Presenter<View> {
        fun loadCity()
    }
}