package com.poly.pt_ls.weather.view.splash.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import com.englandstudio.basekt.BaseFragment
import com.englandstudio.basekt.library.getStatusBarHeight
import com.englandstudio.basekt.library.load
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.model.City
import com.poly.pt_ls.weather.model.Forecast
import com.poly.pt_ls.weather.util.startFragment
import com.poly.pt_ls.weather.view.splash.home.listcity.ListCityFragment
import kotlinx.android.synthetic.main.fragment_home.*

@SuppressLint("ValidFragment")
class HomeFragment @SuppressLint("ValidFragment") constructor(var data: City?) : BaseFragment<HomeContract.View, HomeContract.Presenter>(), HomeContract.View,
    View.OnClickListener {
    override fun presenter() = HomePresenter(this)
    override fun layout() = R.layout.fragment_home

    private lateinit var adapter: HomePagerAdapter

    override fun view(savedInstanceState: Bundle?) {
        tbMain.setPadding(0, activity!!.getStatusBarHeight(), 0, 0)
        btnMenu.setOnClickListener(this)

        presenter.loadData(data)
    }

    override fun displayData(data: Forecast?, city: City?) {
        imgTinhthanh.load(city!!.image)
        cirimgCity.load(city.image)
        presenter.loadDataPager(data, city)
    }

    override fun displayListPager(list: List<Fragment>) {
        adapter = HomePagerAdapter(childFragmentManager, list)
        vpHome.adapter = adapter
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnMenu -> activity?.startFragment(ListCityFragment(data), true)
        }
    }

}