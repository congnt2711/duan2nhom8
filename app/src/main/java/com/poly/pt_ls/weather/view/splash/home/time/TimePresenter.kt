package com.poly.pt_ls.weather.view.splash.home.time

import com.englandstudio.basekt.BasePresenter
import com.englandstudio.basekt.library.showLog
import com.poly.pt_ls.weather.api.ApiManager
import com.poly.pt_ls.weather.model.Forecast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TimePresenter(view:TimeContract.View):BasePresenter<TimeContract.View>(view), TimeContract.Presenter {
    override fun loadData(list: List<Forecast.ListWeather>) {
        view.displayData(list)
    }

}