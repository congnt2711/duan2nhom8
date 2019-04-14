package com.poly.pt_ls.weather.view.splash.home.listcity

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.ImageView
import com.englandstudio.basekt.BaseAdapter
import com.englandstudio.basekt.BaseFragment
import com.englandstudio.basekt.BaseViewHolder
import com.englandstudio.basekt.library.getStatusBarHeight
import com.englandstudio.basekt.library.showToast
import com.englandstudio.basekt.local.DataPreference
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.model.City
import com.poly.pt_ls.weather.util.startFragment
import com.poly.pt_ls.weather.view.splash.home.HomeFragment
import kotlinx.android.synthetic.main.custom_item_listcity.view.*
import kotlinx.android.synthetic.main.fragment_list_city.*

@SuppressLint("ValidFragment")
class ListCityFragment(var data: City?) : BaseFragment<ListCityContract.View, ListCityContract.Presenter>(),
    ListCityContract.View,
    View.OnClickListener, BaseAdapter.OnCallBack<City>, ListCityAdapter.OnCheckCallback {
    override fun presenter(): ListCityContract.Presenter = ListCityPresenter(this)

    override fun layout(): Int = R.layout.fragment_list_city

    private var oldCheck: ImageView? = null

    override fun view(savedInstanceState: Bundle?) {
        tbListcity.setPadding(0, activity!!.getStatusBarHeight(), 0, 0)
        presenter.loadCity()
        btnBackLC.setOnClickListener(this)
    }

    override fun displayCity(arrLC: List<City>) {
        val adapter = context?.let { ListCityAdapter(it, arrLC, this, this) }
        lvListcity.layoutManager = LinearLayoutManager(context)
        lvListcity.adapter = adapter
    }

    override fun checkCallback(imageView: ImageView) {
        oldCheck = imageView
    }

    override fun onItemClick(data: City, holder: BaseViewHolder, position: Int) {
        super.onItemClick(data, holder, position)
        activity?.startFragment(HomeFragment(data), false)
    }

    override fun onItemLongClick(data: City, holder: BaseViewHolder, position: Int) {
        super.onItemLongClick(data, holder, position)
        activity!!.showToast("Check ${data.name}")
        activity?.startFragment(HomeFragment(data), false)
        DataPreference.mPreferences.edit().putInt("id", position).apply()
        oldCheck?.visibility = INVISIBLE
        holder.itemView.btnCheck.visibility = VISIBLE
        oldCheck = holder.itemView.btnCheck

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnBackLC -> activity?.startFragment(HomeFragment(data), false)
//            R.id.btnBackLC -> activity?.removeFragment()
        }
    }

}