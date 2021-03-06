package com.poly.pt_ls.weather.view.splash.home.time

import android.content.Context
import com.englandstudio.basekt.BaseAdapter
import com.englandstudio.basekt.BaseViewHolder
import com.englandstudio.basekt.library.getSDateFromTimeStamp
import com.englandstudio.basekt.library.getTimeFromTimeStamp
import com.englandstudio.basekt.library.load
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.model.Forecast
import com.poly.pt_ls.weather.util.checkImage
import kotlinx.android.synthetic.main.custom_item_timehome.view.*

class TimeAdapter(context: Context, var list: List<Forecast.ListWeather>) :
    BaseAdapter<Forecast.ListWeather, BaseViewHolder>(context, list) {
    override fun layout(type: Int) = R.layout.custom_item_timehome

    override fun view(vh: BaseViewHolder, pos: Int) {
        vh.itemView.txtLvTemp.text = "${list[pos].main.temp.toInt()}"
        vh.itemView.txtLvTime.text = getTimeFromTimeStamp(list[pos].dt)
        vh.itemView.imgImage.load(checkImage(list[pos].weather[0].main))
        vh.itemView.txtLvDate.text = getSDateFromTimeStamp(list[pos].dt)
        vh.itemView.txtLvDate.visibility = list[pos].clouds.all
    }
}