package com.englandstudio.basekt.dialog

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.widget.Button
import android.widget.TextView
import com.englandstudio.basekt.R

class MessageDialog(
    activity: Activity,
    private val message: String,
    private val negative: (() -> Unit)? = null,
    private val positive: () -> Unit
) : Dialog(activity), View.OnClickListener {

    private val txtMessage by lazy { findViewById<TextView>(R.id.txtMessage) }
    private val btnNegative by lazy { findViewById<Button>(R.id.btnNegative) }
    private val btnPositive by lazy { findViewById<Button>(R.id.btnPositive) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_message)
        setCanceledOnTouchOutside(false)
        setCancelable(false)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        btnPositive.setOnClickListener(this)
        btnNegative.setOnClickListener(this)
    }

    override fun onStart() {
        super.onStart()
        txtMessage.text = message
        if (negative == null) {
            btnNegative.visibility = GONE
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnPositive -> {
                positive()
            }
            R.id.btnNegative -> {
                negative?.let { it() }
            }
        }
        dismiss()
    }

}