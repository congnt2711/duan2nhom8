package com.poly.pt_ls.weather.api

import com.poly.pt_ls.weather.model.Forecast
import com.poly.pt_ls.weather.model.Weather
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiManager {
    private var retrofit: Retrofit

    private const val base_url = "http://api.openweathermap.org/data/2.5/"
    private const val api = "974e735aae20c083fbf215c7ae426706"
    private const val units = "metric"

    init {
        retrofit = Retrofit.Builder()
            .baseUrl(base_url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private var startApi = retrofit.create(ApiInterface::class.java)


    fun getForecast(lat: Double, lon: Double, callback : Callback<Forecast>) {
        startApi.getForecast(lat, lon, api, units).enqueue(callback)
    }

    fun getWeather(lat: Double, lon: Double, callback : Callback<Weather>) {
        startApi.getWeather(lat, lon, api, units).enqueue(callback)
    }


}