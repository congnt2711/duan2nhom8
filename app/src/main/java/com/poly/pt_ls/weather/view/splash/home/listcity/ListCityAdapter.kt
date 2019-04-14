package com.poly.pt_ls.weather.view.splash.home.listcity

import android.content.Context
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.englandstudio.basekt.BaseAdapter
import com.englandstudio.basekt.BaseApplication.Companion.context
import com.englandstudio.basekt.BaseViewHolder
import com.englandstudio.basekt.library.load
import com.englandstudio.basekt.local.DataPreference
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.model.City
import com.poly.pt_ls.weather.util.DEFAULT_VALUE
import kotlinx.android.synthetic.main.custom_item_listcity.view.*

class ListCityAdapter(context: Context, var list: List<City>, callback: OnCallBack<City>, var check: OnCheckCallback) :
    BaseAdapter<City, BaseViewHolder>(context, list, callback) {
    override fun layout(type: Int) = R.layout.custom_item_listcity

    override fun view(vh: BaseViewHolder, pos: Int) {
        vh.itemView.customTxtcity.text = list[pos].name
        vh.itemView.customImgcity.load(list[pos].image)
        vh.itemView.startAnimation(AnimationUtils.loadAnimation(context, R.anim.zoom))
        if (pos == DataPreference.mPreferences.getInt("id", DEFAULT_VALUE)) {
            vh.itemView.btnCheck.visibility = VISIBLE
            check.checkCallback(vh.itemView.btnCheck)
        } else vh.itemView.btnCheck.visibility = INVISIBLE
    }

    interface OnCheckCallback {
        fun checkCallback(imageView: ImageView)
    }

}