package com.poly.pt_ls.weather.view.splash.intro.first

import android.os.Bundle
import com.englandstudio.basekt.BaseFragment
import com.poly.pt_ls.weather.R

class FirstFragment:BaseFragment<FirstContract.View,FirstContract.Presenter>(),FirstContract.View {
    override fun presenter()=FirstPresenter(this)

    override fun layout()= R.layout.fragment_first

    override fun view(savedInstanceState: Bundle?) {

    }
}