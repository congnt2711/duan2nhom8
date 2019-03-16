package com.englandstudio.basekt.library

fun sleep(time: Long, action: () -> Unit) {
    android.os.Handler().postDelayed({
        action()
    }, time)
}

fun sleep(action: () -> Unit) {
    sleep(3000, action)
}