package com.poly.pt_ls.weather.view.splash.home.listcity

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.englandstudio.basekt.BaseFragment
import com.englandstudio.basekt.library.getStatusBarHeight
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.model.City
import com.poly.pt_ls.weather.util.removeFragment
import com.poly.pt_ls.weather.util.startFragment
import com.poly.pt_ls.weather.view.splash.home.HomeFragment
import kotlinx.android.synthetic.main.fragment_list_city.*

class ListCityFragment : BaseFragment<ListCityContract.View, ListCityContract.Presenter>(), ListCityContract.View,
    View.OnClickListener {
    override fun presenter(): ListCityContract.Presenter = ListCityPresenter(this)

    override fun layout(): Int = R.layout.fragment_list_city

    override fun view(savedInstanceState: Bundle?) {
        tbListcity.setPadding(0, activity!!.getStatusBarHeight(), 0, 0)
        presenter.loadCity()
        btnBackLC.setOnClickListener(this)
    }

    override fun displayCity(arrLC: List<City>) {
        val adapter = context?.let { ListCityAdapter(it, arrLC) }
        lvListcity.layoutManager = LinearLayoutManager(context)
        lvListcity.adapter = adapter
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btnBackLC -> activity?.startFragment(HomeFragment(), false)
//            R.id.btnBackLC -> activity?.removeFragment()
        }
    }

}