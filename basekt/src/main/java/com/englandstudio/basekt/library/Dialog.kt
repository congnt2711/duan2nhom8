@file:Suppress("DEPRECATION")

package com.englandstudio.basekt.library

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.app.ProgressDialog
import android.view.View
import android.view.View.VISIBLE
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.englandstudio.basekt.R

//Toast
fun Activity.showToast(message: Any, isLong: Boolean) {
    var toast = Toast.LENGTH_SHORT
    when (isLong) {
        true -> toast = Toast.LENGTH_LONG
    }
    Toast.makeText(this, "$message", toast).show()
}

fun Activity.showToast(message: Any) {
    this.showToast("$message", false)
}

//Message
fun Activity.showMessage(title: String, message: String, positive: (() -> Unit)?, negative: (() -> Unit)?) {
    val dialog = AlertDialog.Builder(this)
    dialog.setTitle(title)
    dialog.setMessage(message)
    dialog.setCancelable(false)
    dialog.setPositiveButton(string(R.string.dialog_positive)) { _, _ ->
        positive?.invoke()
    }
    if (negative != null)
        dialog.setNegativeButton(string(R.string.dialog_negative)) { _, _ ->
            negative()
        }
    dialog.create().show()
}

fun Activity.showMessage(title: String, message: String, positive: () -> Unit) {
    showMessage(title, message, positive, null)
}

fun Activity.showMessage(title: String, message: String) {
    showMessage(title, message, null, null)
}

//Option
fun Activity.showOption(title: String?, item: Array<String>, option: (option: Int) -> Unit) {
    val dialog = AlertDialog.Builder(this)
    if (title != null)
        dialog.setTitle(title)
    dialog.setItems(item) { _, which ->
        option(which)
    }
    dialog.create().show()
}

fun Activity.showOption(item: Array<String>, option: (option: Int) -> Unit) {
    showOption(null, item, option)
}

//Progress
private var progress: ProgressDialog? = null

fun Activity.showProgress(title: String?, message: String?) {
    progress = ProgressDialog.show(this, title, message)
}

fun Activity.showProgress(message: String?) {
    showProgress(null, message)
}

fun Activity.showProgress() {
    showProgress(null)
}

fun dismissProgress() {
    progress?.dismiss()
}


//Image Dialog
fun Activity.showImage(
    any: Any,
    hasNegative: Boolean,
    button: ((view: View, position: Int) -> Unit)? = null
) {
    val dialog = Dialog(this)
    dialog.setContentView(R.layout.dialog_image)
    val pos = dialog.findViewById<TextView>(R.id.btnPositive)
    val neg = dialog.findViewById<TextView>(R.id.btnNegative)
    val image = dialog.findViewById<ImageView>(R.id.imgImage)

    image.load(any)
    pos.setOnClickListener {
        dialog.dismiss()
        button?.let { it1 -> it1(it, 1) }
    }
    neg.setOnClickListener {
        dialog.dismiss()
        button?.let { it1 -> it1(it, 2) }
    }

    if (hasNegative) {
        neg.visibility = VISIBLE
    }
    dialog.setCanceledOnTouchOutside(false)
    dialog.show()
}

fun Activity.showImage(any: Any, button: (view: View, position: Int) -> Unit) {
    showImage(any, false, button)
}

fun Activity.showImage(any: Any, hasNegative: Boolean) {
    showImage(any, hasNegative, null)
}

fun Activity.showImage(any: Any) {
    showImage(any, false, null)
}



