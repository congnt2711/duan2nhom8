package com.englandstudio.basekt.library

import android.annotation.SuppressLint
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

@SuppressLint("CheckResult")
fun ImageView.load(any: Any, placeholder: Int? = null) {
    val glide = Glide.with(this)
    val requestOption = placeholder?.let { RequestOptions().placeholder(it).centerCrop() }
    requestOption?.let { glide.setDefaultRequestOptions(it) }
    glide.load(any).into(this)
}

const val DEFAULT = -1
fun View.fixSize(width: Int, height: Int) {
    if (width != DEFAULT)
        layoutParams.width = width

    if (height != DEFAULT)
        layoutParams.height = height
}