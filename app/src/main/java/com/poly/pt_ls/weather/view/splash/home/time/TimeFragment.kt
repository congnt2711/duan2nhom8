package com.poly.pt_ls.weather.view.splash.home.time

import android.os.Bundle
import com.englandstudio.basekt.BaseFragment
import com.poly.pt_ls.weather.R

class TimeFragment : BaseFragment<TimeContract.View,TimeContract.Presenter>(),TimeContract.View {
    override fun presenter() = TimePresenter(this)
    override fun layout() = R.layout.fragment_time

    override fun view(savedInstanceState: Bundle?) {

    }
}