package com.poly.pt_ls.weather.view.splash.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import com.englandstudio.basekt.BaseFragment
import com.englandstudio.basekt.library.getStatusBarHeight
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.util.startFragment
import com.poly.pt_ls.weather.view.splash.home.listcity.ListCityFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment<HomeContract.View, HomeContract.Presenter>(), HomeContract.View,
    View.OnClickListener {
    override fun presenter() = HomePresenter(this)
    override fun layout() = R.layout.fragment_home

    private lateinit var adapter: HomePagerAdapter

    override fun view(savedInstanceState: Bundle?) {
        tbMain.setPadding(0, activity!!.getStatusBarHeight(), 0, 0)
        btnMenu.setOnClickListener(this)

        presenter.loadDataPager()
    }

    override fun displayListPager(list: List<Fragment>) {
        adapter = HomePagerAdapter(activity!!.supportFragmentManager, list)
        vpHome.adapter = adapter
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnMenu -> activity?.startFragment(ListCityFragment(), true)
        }
    }

    override fun onResume() {
        super.onResume()
        adapter.notifyDataSetChanged()
    }

}