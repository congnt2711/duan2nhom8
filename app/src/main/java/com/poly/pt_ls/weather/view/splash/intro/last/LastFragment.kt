package com.poly.pt_ls.weather.view.splash.intro.last

import android.os.Bundle
import com.englandstudio.basekt.BaseFragment
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.util.getListCity
import com.poly.pt_ls.weather.util.startFragment
import com.poly.pt_ls.weather.view.splash.home.HomeFragment
import kotlinx.android.synthetic.main.fragment_last.*

class LastFragment:BaseFragment<LastContract.View,LastContract.Presenter>(),LastContract.View {


    override fun presenter()=LastPresenter(this )

    override fun layout()= R.layout.fragment_last
    override fun view(savedInstanceState: Bundle?) {
        txtDone.setOnClickListener{
            activity?.startFragment(HomeFragment(getListCity()[23]), true)
        }
    }
}