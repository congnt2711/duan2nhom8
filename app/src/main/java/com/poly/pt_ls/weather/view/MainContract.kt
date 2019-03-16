package com.poly.pt_ls.weather.view

import com.englandstudio.basekt.BaseContract

interface MainContract {
    interface View : BaseContract.View

    interface Presenter : BaseContract.Presenter<View>

}