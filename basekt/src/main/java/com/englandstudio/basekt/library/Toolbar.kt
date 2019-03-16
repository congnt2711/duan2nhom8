package com.englandstudio.basekt.library

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

fun AppCompatActivity.setToolbar(toolbar: Toolbar, icon: Int?, title: String?, message: String?) {
    this.setSupportActionBar(toolbar)
    if (icon != null) {
        this.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        this.supportActionBar?.setHomeAsUpIndicator(icon)
    }
    setTitle(title)
    toolbar.title = title
    toolbar.subtitle = message
}

fun AppCompatActivity.setToolbar(toolbar: Toolbar, icon: Int, title: String) {
    this.setToolbar(toolbar, icon, title, null)
}

fun AppCompatActivity.setToolbar(toolbar: Toolbar, icon: Int) {
    this.setToolbar(toolbar, icon, null, null)
}

fun AppCompatActivity.setToolbar(toolbar: Toolbar) {
    this.setToolbar(toolbar, null, null, null)
}

fun AppCompatActivity.setToolbar(toolbar: Toolbar, title: String) {
    this.setToolbar(toolbar, null, title, null)
}