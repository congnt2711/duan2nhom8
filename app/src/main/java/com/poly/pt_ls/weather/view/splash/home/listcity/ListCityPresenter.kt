package com.poly.pt_ls.weather.view.splash.home.listcity

import com.englandstudio.basekt.BasePresenter
import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.model.City
import com.poly.pt_ls.weather.util.getListCity

class ListCityPresenter(view:ListCityContract.View): BasePresenter<ListCityContract.View>(view),ListCityContract.Presenter {
    override fun loadCity() {
        val arrLC = getListCity()
        view.displayCity(arrLC)
    }
}