package com.englandstudio.basekt

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseItemAdapter<M : BaseModel>(
    private val context: Context, private val list: List<M>,
    private var callback: OnCallBack<M>? = null
) : PagerAdapter() {

    protected abstract fun layout(): Int

    protected abstract fun view(view: View, position: Int)

    override fun getCount() = list.size

    override fun isViewFromObject(view: View, obj: Any) = (view == obj as View)

    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        container.removeView(obj as View)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(layout(), container, false)

        view(view, position)
        onItemClick(view, list[position], position)

        container.addView(view)
        return view
    }

    open fun onItemClick(view: View?, data: M, position: Int) {
        view?.setOnClickListener {
            callback?.onItemClick(data, position)
        }
    }

    interface OnCallBack<M : BaseModel> {
        fun onItemClick(
            data: M,
            position: Int
        )
    }


}