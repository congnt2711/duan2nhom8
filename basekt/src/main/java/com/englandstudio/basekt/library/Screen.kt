package com.englandstudio.basekt.library

import android.content.res.Resources

fun getHeight(): Float {
    return Resources.getSystem().displayMetrics.heightPixels.toFloat()
}

fun getWidth(): Float {
    return Resources.getSystem().displayMetrics.widthPixels.toFloat()
}