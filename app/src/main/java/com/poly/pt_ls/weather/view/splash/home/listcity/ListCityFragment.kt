package com.poly.pt_ls.weather.view.splash.home.listcity

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.englandstudio.basekt.BaseAdapter
import com.englandstudio.basekt.BaseFragment
import com.englandstudio.basekt.BaseViewHolder
import com.englandstudio.basekt.library.getStatusBarHeight
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.model.City
import com.poly.pt_ls.weather.util.startFragment
import com.poly.pt_ls.weather.view.splash.home.HomeFragment
import kotlinx.android.synthetic.main.fragment_list_city.*

@SuppressLint("ValidFragment")
class ListCityFragment(var data: City?) : BaseFragment<ListCityContract.View, ListCityContract.Presenter>(), ListCityContract.View,
    View.OnClickListener, BaseAdapter.OnCallBack<City> {
    override fun presenter(): ListCityContract.Presenter = ListCityPresenter(this)

    override fun layout(): Int = R.layout.fragment_list_city

    override fun view(savedInstanceState: Bundle?) {
        tbListcity.setPadding(0, activity!!.getStatusBarHeight(), 0, 0)
        presenter.loadCity()
        btnBackLC.setOnClickListener(this)
    }

    override fun displayCity(arrLC: List<City>) {
        val adapter = context?.let { ListCityAdapter(it, arrLC,this) }
        lvListcity.layoutManager = LinearLayoutManager(context)
        lvListcity.adapter = adapter
    }

    override fun onItemClick(data: City, holder: BaseViewHolder, position: Int) {
        super.onItemClick(data, holder, position)
        activity?.startFragment(HomeFragment(data), false)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btnBackLC -> activity?.startFragment(HomeFragment(data), false)
//            R.id.btnBackLC -> activity?.removeFragment()
        }
    }

}