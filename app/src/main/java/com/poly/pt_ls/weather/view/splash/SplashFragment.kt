package com.poly.pt_ls.weather.view.splash

import android.os.Bundle
import android.os.Handler
import com.englandstudio.basekt.BaseFragment
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.util.startFragment
import com.poly.pt_ls.weather.view.splash.intro.IntroFragment

class SplashFragment : BaseFragment<SplashContract.View, SplashContract.Presenter>(), SplashContract.View {
    override fun presenter() = SplashPresenter(this)
    override fun layout() = R.layout.fragment_splash

    private val DELAY_MILLIS = 3000L

    override fun view(savedInstanceState: Bundle?) {

        Handler().postDelayed({
            activity?.startFragment(IntroFragment(), false)
        }, DELAY_MILLIS)
    }
}