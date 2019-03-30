package com.poly.pt_ls.weather.view.splash.home.listcity

import android.content.Context
import android.view.animation.AnimationUtils
import com.englandstudio.basekt.BaseAdapter
import com.englandstudio.basekt.BaseApplication.Companion.context
import com.englandstudio.basekt.BaseViewHolder
import com.englandstudio.basekt.library.load
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.model.City
import kotlinx.android.synthetic.main.custom_item_listcity.view.*

class ListCityAdapter(context: Context, var list: List<City>, callback: OnCallBack<City>) :
    BaseAdapter<City, BaseViewHolder>(context, list, callback) {
    override fun layout(type: Int) = R.layout.custom_item_listcity

    override fun view(vh: BaseViewHolder, pos: Int) {
        vh.itemView.customTxtcity.text = list[pos].name
        vh.itemView.customImgcity.load(list[pos].image)
        vh.itemView.startAnimation(AnimationUtils.loadAnimation(context, R.anim.zoom))
    }

}