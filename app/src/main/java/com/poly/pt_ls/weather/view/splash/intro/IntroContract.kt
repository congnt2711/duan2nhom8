package com.poly.pt_ls.weather.view.splash.intro

import android.support.v4.app.Fragment
import com.englandstudio.basekt.BaseContract

interface IntroContract {
    interface View:BaseContract.View {
        fun displayListPager(list: List<Fragment>)
    }

    interface Presenter:BaseContract.Presenter<View> {
        fun loadDataPager()
    }
}