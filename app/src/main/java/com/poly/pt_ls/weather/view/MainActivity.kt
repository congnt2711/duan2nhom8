package com.poly.pt_ls.weather.view

import android.os.Bundle
import com.englandstudio.basekt.BaseActivity
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.util.startFragment
import com.poly.pt_ls.weather.view.splash.SplashFragment

class MainActivity : BaseActivity<MainContract.View, MainContract.Presenter>(),
    MainContract.View {
    override fun presenter() = MainPresenter(this)
    override fun layout() = R.layout.activity_main
    override fun menuLayout() = R.menu.main_menu

    override fun view(savedInstanceState: Bundle?) {
        startFragment(SplashFragment())
    }

}