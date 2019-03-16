package com.poly.pt_ls.weather.view.splash.intro.second

import android.os.Bundle
import com.englandstudio.basekt.BaseFragment
import com.poly.pt_ls.weather.R

class SecondFragment:BaseFragment<SecondContract.View,SecondContract.Presenter>(),SecondContract.View {
    override fun presenter()=SecondPresenter(this)

    override fun layout()= R.layout.fragment_second

    override fun view(savedInstanceState: Bundle?) {

    }
}