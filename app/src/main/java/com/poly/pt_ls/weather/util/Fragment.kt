package com.poly.pt_ls.weather.util

import android.app.Activity
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.poly.pt_ls.weather.R

fun Activity.startFragment(fragment: Fragment, leftToRight: Boolean?) {
    val ft = (this as AppCompatActivity).supportFragmentManager.beginTransaction()
    if(leftToRight != null) {
        if (leftToRight) ft.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right)
        else ft.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left)
    }
    ft.replace(R.id.rootView, fragment, null)
    ft.commit()
}

fun Activity.startFragment(fragment: Fragment) {
    startFragment(fragment, null)
}

fun Activity.removeFragment() {
    (this as AppCompatActivity).supportFragmentManager.popBackStack()
}
