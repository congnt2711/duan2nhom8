package com.poly.pt_ls.weather.view.splash.home

import com.englandstudio.basekt.BasePresenter
import com.englandstudio.basekt.library.showLog
import com.poly.pt_ls.weather.api.ApiManager
import com.poly.pt_ls.weather.model.City
import com.poly.pt_ls.weather.model.Forecast
import com.poly.pt_ls.weather.view.splash.home.time.TimeFragment
import com.poly.pt_ls.weather.view.splash.home.weather.WeatherFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomePresenter(view : HomeContract.View):BasePresenter<HomeContract.View>(view),HomeContract.Presenter {
    override fun loadDataPager(data: Forecast?, city: City?) {
        val list = listOf(WeatherFragment(data!!,city),TimeFragment(data.list))
        view.displayListPager(list)
    }
    override fun loadData(city: City?) {
        ApiManager.getForecast(city!!.lat, city.long, object : Callback<Forecast> {
            override fun onFailure(call: Call<Forecast>, t: Throwable) {
                showLog(t.toString())
            }

            override fun onResponse(call: Call<Forecast>, response: Response<Forecast>) {
                view.displayData(response.body(), city)
            }

        })
    }
}