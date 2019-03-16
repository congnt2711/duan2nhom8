package com.poly.pt_ls.weather.view.splash.home

import android.support.v4.app.Fragment
import com.englandstudio.basekt.BaseContract

interface HomeContract {
    interface View:BaseContract.View {
        abstract fun displayListPager(list: List<Fragment>)
    }

    interface Presenter:BaseContract.Presenter<View> {
        fun loadDataPager()
    }
}