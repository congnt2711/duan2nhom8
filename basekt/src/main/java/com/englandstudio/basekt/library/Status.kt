package com.englandstudio.basekt.library

import android.app.Activity

fun Activity.getStatusBarHeight(): Int {
    var result = 0
    val resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android")
    if (resourceId > 0) {
        result = getResources().getDimensionPixelSize(resourceId)
    }
    return result
}