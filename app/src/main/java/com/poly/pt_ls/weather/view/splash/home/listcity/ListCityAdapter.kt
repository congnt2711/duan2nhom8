package com.poly.pt_ls.weather.view.splash.home.listcity

import android.content.Context
import com.englandstudio.basekt.BaseAdapter
import com.englandstudio.basekt.BaseViewHolder
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.model.City
import kotlinx.android.synthetic.main.custom_item_listcity.view.*

class ListCityAdapter(context: Context, var list:List<City>) : BaseAdapter<City, BaseViewHolder>(context, list) {
    override fun layout(type: Int) = R.layout.custom_item_listcity

    override fun view(vh: BaseViewHolder, pos: Int) {
        vh.itemView.customTxtcity.text = list[pos].name
//        vh.itemView.customImgcity.load()
    }
}