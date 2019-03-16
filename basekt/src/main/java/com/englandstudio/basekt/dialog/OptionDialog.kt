package com.englandstudio.basekt.dialog

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.MotionEvent
import android.view.View
import android.widget.TextView
import com.englandstudio.basekt.BaseAdapter
import com.englandstudio.basekt.BaseAdapter.OnCallBack
import com.englandstudio.basekt.BaseModel
import com.englandstudio.basekt.BaseViewHolder
import com.englandstudio.basekt.R

@SuppressLint("ClickableViewAccessibility")
class OptionDialog(
    private var activity: Activity,
    private var list: List<Option>,
    private var onCallBack: OnCallBack<Option>
) : Dialog(activity) {

    private val rvMessage by lazy { findViewById<RecyclerView>(R.id.rvMessage) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_option)

        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        rvMessage.layoutManager = LinearLayoutManager(activity)
        rvMessage.adapter = OptionAdapter(activity, list, onCallBack, object : OnCallBack<Option> {
            override fun onItemTouch(data: Option, holder: BaseViewHolder, position: Int, event: MotionEvent) {
                val txtOption =
                    holder.itemView.findViewById(com.englandstudio.basekt.R.id.txtOption) as TextView
                when (event.action) {
                    MotionEvent.ACTION_DOWN, MotionEvent.ACTION_MOVE -> itemClick(txtOption, false)
                    else -> itemClick(txtOption, true)
                }
            }
        })
        rvMessage.overScrollMode = View.OVER_SCROLL_NEVER
    }

    private fun itemClick(title: TextView, onClick: Boolean) {
        if (onClick) {
            title.setTextColor(context.getColor(R.color.colorGray))
        } else {
            title.setTextColor(context.getColor(R.color.colorAccent))
        }
    }

    class OptionAdapter(
        private var context: Context,
        private var list: List<Option>,
        onCallBack: OnCallBack<Option>,
        onTouchItem: OnCallBack<Option>
    ) :
        BaseAdapter<Option, BaseViewHolder>(context, list, onCallBack, onTouchItem) {

        override fun layout(type: Int) = R.layout.item_option

        private lateinit var txtOption: TextView

        override fun view(vh: BaseViewHolder, pos: Int) {
            txtOption = vh.itemView.findViewById(R.id.txtOption) as TextView
            txtOption.text = list[pos].option
        }

        private fun itemClick(title: TextView, onClick: Boolean) {
            if (onClick) {
                title.setTextColor(context.getColor(R.color.colorGray))
            } else {
                title.setTextColor(context.getColor(R.color.colorAccent))
            }
        }

    }

    class Option(var option: String) : BaseModel

}