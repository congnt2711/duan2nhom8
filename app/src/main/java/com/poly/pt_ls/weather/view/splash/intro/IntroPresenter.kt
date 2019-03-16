package com.poly.pt_ls.weather.view.splash.intro

import com.englandstudio.basekt.BasePresenter
import com.poly.pt_ls.weather.view.splash.intro.first.FirstFragment
import com.poly.pt_ls.weather.view.splash.intro.last.LastFragment
import com.poly.pt_ls.weather.view.splash.intro.second.SecondFragment

class IntroPresenter(view: IntroContract.View) : BasePresenter<IntroContract.View>(view),IntroContract.Presenter {
    override fun loadDataPager() {
        val list = listOf(FirstFragment(),SecondFragment(),LastFragment())
        view.displayListPager(list)
    }
}