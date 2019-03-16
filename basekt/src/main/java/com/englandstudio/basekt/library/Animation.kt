package com.englandstudio.basekt.library

import android.transition.TransitionManager
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils

fun View.makeTransition() {
    TransitionManager.beginDelayedTransition(this as ViewGroup)
}

fun View.startAnim(anim: Int) {
    startAnimation(AnimationUtils.loadAnimation(context, anim))
}