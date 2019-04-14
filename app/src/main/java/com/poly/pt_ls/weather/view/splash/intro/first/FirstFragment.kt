package com.poly.pt_ls.weather.view.splash.intro.first

import android.os.Bundle
import com.englandstudio.basekt.BaseFragment
import com.englandstudio.basekt.local.DataPreference
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.util.getListCity
import com.poly.pt_ls.weather.util.startFragment
import com.poly.pt_ls.weather.view.splash.home.HomeFragment
import com.poly.pt_ls.weather.view.splash.intro.second.SecondFragment
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment:BaseFragment<FirstContract.View,FirstContract.Presenter>(),FirstContract.View {
    override fun presenter()=FirstPresenter(this)

    override fun layout()= R.layout.fragment_first


    override fun view(savedInstanceState: Bundle?) {
        val id = DataPreference.mPreferences.getInt("id", 23)
        txtSkipF.setOnClickListener{
            activity?.startFragment(HomeFragment(getListCity()[id]), true)
        }
        txtTiepF.setOnClickListener {
            activity?.startFragment(SecondFragment(),false)
        }

    }
}