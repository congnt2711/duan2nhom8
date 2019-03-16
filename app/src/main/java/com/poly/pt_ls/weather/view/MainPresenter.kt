package com.poly.pt_ls.weather.view

import com.englandstudio.basekt.BasePresenter

class MainPresenter(view : MainContract.View) : BasePresenter<MainContract.View>(view),
    MainContract.Presenter