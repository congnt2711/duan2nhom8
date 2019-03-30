package com.poly.pt_ls.weather.view.splash.home.time

import android.annotation.SuppressLint
import android.os.Bundle
import com.englandstudio.basekt.BaseFragment
import com.englandstudio.basekt.library.load
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.model.Forecast
import kotlinx.android.synthetic.main.fragment_time.*


@Suppress("DEPRECATION")
@SuppressLint("ValidFragment,SetTextI18n")
class TimeFragment @SuppressLint("ValidFragment") constructor(var list: List<Forecast.ListWeather>) :
    BaseFragment<TimeContract.View, TimeContract.Presenter>(), TimeContract.View {
    override fun presenter() = TimePresenter(this)
    override fun layout() = R.layout.fragment_time

    override fun view(savedInstanceState: Bundle?) {
        presenter.loadData(list)
        presenter.loadChart(list)
    }

    override fun displayData(
        list: List<Forecast.ListWeather>?,
        timeDay: String,
        timeTime: String,
        timeWeather: String,
        image: Int
    ) {
        lvTimeHome.adapter = TimeAdapter(context!!, list!!)
        txtTimeDay.text = timeDay
        txtTimeTime.text = timeTime
        txtTimeWeather.text = timeWeather
        imgTimeWeather.load(image)

    }

    override fun displayChart(list: ArrayList<Entry>) {
        val dataSet = LineDataSet(list, "")
        dataSet.setDrawCircles(false)
        dataSet.setDrawFilled(true)
        dataSet.lineWidth = 1.8f
        dataSet.mode = LineDataSet.Mode.CUBIC_BEZIER
        dataSet.valueTextColor = resources.getColor(R.color.colorTransparent)
        dataSet.color = resources.getColor(R.color.colorBlack)
        dataSet.fillColor = resources.getColor(R.color.colorBlack)
        dataSet.fillAlpha = 100
        val lineData = LineData(dataSet)

        chart.data = lineData
        val xAxis = chart.xAxis
        xAxis.isEnabled = false
        xAxis.setDrawGridLines(false)
        xAxis.setDrawAxisLine(false)

        val leftAxis = chart.axisLeft
        leftAxis.isEnabled = false
        leftAxis.setDrawGridLines(false)
        leftAxis.setDrawAxisLine(false)

        val rightAxis = chart.axisRight
        rightAxis.isEnabled = false
        rightAxis.setDrawGridLines(false)
        rightAxis.setDrawAxisLine(false)
        chart.legend.isEnabled = false
        chart.description.isEnabled = false
        chart.invalidate()
    }
}