package com.englandstudio.basekt.dialog

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.TextView
import com.englandstudio.basekt.R

class ProgressDialog(
    activity: Activity,
    private val message: String
) : Dialog(activity) {

    private val txtMessage by lazy { findViewById<TextView>(R.id.txtMessage) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_progress)
        setCanceledOnTouchOutside(false)
        setCancelable(false)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }

    override fun onStart() {
        super.onStart()
        txtMessage.text = message
    }
}