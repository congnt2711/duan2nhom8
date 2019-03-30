package com.poly.pt_ls.weather.view.splash.home

import android.support.v4.app.Fragment
import com.englandstudio.basekt.BaseContract
import com.poly.pt_ls.weather.model.City
import com.poly.pt_ls.weather.model.Forecast

interface HomeContract {
    interface View:BaseContract.View {
        fun displayListPager(list: List<Fragment>)
        fun displayData(data: Forecast?, city: City?)
    }

    interface Presenter:BaseContract.Presenter<View> {
        fun loadDataPager(data: Forecast?, city: City?)
        fun loadData(data: City?)
    }
}