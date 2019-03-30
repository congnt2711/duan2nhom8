package com.poly.pt_ls.weather.view.splash.intro.second

import android.os.Bundle
import com.englandstudio.basekt.BaseFragment
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.util.getListCity
import com.poly.pt_ls.weather.util.startFragment
import com.poly.pt_ls.weather.view.splash.home.HomeFragment
import com.poly.pt_ls.weather.view.splash.intro.last.LastFragment
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment:BaseFragment<SecondContract.View,SecondContract.Presenter>(),SecondContract.View {
    override fun presenter()=SecondPresenter(this)

    override fun layout()= R.layout.fragment_second

    override fun view(savedInstanceState: Bundle?) {
        txtSkipS.setOnClickListener{
            activity?.startFragment(HomeFragment(getListCity()[23]), true)
        }
        txtTiepS.setOnClickListener {
            activity?.startFragment(LastFragment(),false)
        }

    }
}