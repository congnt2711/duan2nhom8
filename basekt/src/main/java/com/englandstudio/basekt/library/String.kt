@file:Suppress("DEPRECATION")

package com.englandstudio.basekt.library

import android.app.Activity

fun Activity.string(resource: Int): String {
    return resources.getString(resource)
}

fun Activity.integer(resource: Int) : Int {
    return resources.getInteger(resource)
}

fun Activity.color(resource: Int) : Int {
    return resources.getColor(resource)
}