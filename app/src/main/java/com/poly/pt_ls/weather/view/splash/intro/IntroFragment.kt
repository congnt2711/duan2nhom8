package com.poly.pt_ls.weather.view.splash.intro

import android.os.Bundle
import android.support.v4.app.Fragment
import com.englandstudio.basekt.BaseFragment
import com.poly.pt_ls.weather.R
import kotlinx.android.synthetic.main.fragment_intro.*

class IntroFragment : BaseFragment<IntroContract.View, IntroContract.Presenter>(), IntroContract.View {
    override fun presenter() = IntroPresenter(this)

    override fun layout() = R.layout.fragment_intro

    override fun view(savedInstanceState: Bundle?) {
        presenter.loadDataPager()
    }

    override fun displayListPager(list: List<Fragment>) {
        vpIntro.adapter= IntroPagerAdapter(childFragmentManager, list)
    }
}