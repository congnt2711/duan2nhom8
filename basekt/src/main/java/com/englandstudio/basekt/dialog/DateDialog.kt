package com.englandstudio.basekt.dialog

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import com.englandstudio.basekt.R
import java.util.*

class DateDialog(
    activity: Activity,
    private val calendar: Calendar? = null,
    private val positive: (calendar: Calendar) -> Unit
) : Dialog(activity), View.OnClickListener {
    private val datePicker by lazy { findViewById<DatePicker>(R.id.datePicker) }
    private val btnNegative by lazy { findViewById<Button>(R.id.btnNegative) }
    private val btnPositive by lazy { findViewById<Button>(R.id.btnPositive) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_date)
        setCanceledOnTouchOutside(false)
        setCancelable(false)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        datePicker.maxDate = Calendar.getInstance().timeInMillis
        calendar?.let {
            datePicker.updateDate(
                it.get(Calendar.YEAR),
                it.get(Calendar.MONTH),
                it.get(Calendar.DAY_OF_MONTH)
            )
        }

        btnPositive.setOnClickListener(this)
        btnNegative.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnPositive -> {
                val calendar = Calendar.getInstance()
                calendar.set(datePicker.year, datePicker.month, datePicker.dayOfMonth)
                positive(calendar)
            }
        }
        dismiss()
    }

}