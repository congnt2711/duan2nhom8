package com.englandstudio.basekt

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.ViewGroup

@Suppress("UNCHECKED_CAST", "FINAL_UPPER_BOUND")
abstract class BaseAdapter<M : BaseModel, VH : BaseViewHolder>(
    context: Context,
    private var list: List<M>,
    private var callback: OnCallBack<M>? = null,
    private var onTouchItem: OnCallBack<M>? = null
) : RecyclerView.Adapter<VH>() {

    open var inflater: LayoutInflater = LayoutInflater.from(context)

    protected abstract fun layout(type: Int): Int

    protected abstract fun view(vh: VH, pos: Int)

    open fun type(pos: Int): Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val view = inflater.inflate(layout(viewType), parent, false)
        val holder = BaseViewHolder(view) as VH
        onItemClick(holder)
        return holder
    }

    override fun onBindViewHolder(viewHolder: VH, position: Int) {
        view(viewHolder, position)
    }

    override fun getItemViewType(position: Int): Int {
        return type(position)
    }

    open fun onItemClick(holder: VH) {
        holder.itemView.setOnClickListener {
            callback?.onItemClick(list[holder.adapterPosition], holder, holder.adapterPosition)
        }
        holder.itemView.setOnLongClickListener {
            callback?.onItemLongClick(list[holder.adapterPosition], holder, holder.adapterPosition)
            false
        }
        holder.itemView.setOnTouchListener { _, event ->
            callback?.onItemTouch(list[holder.adapterPosition], holder, holder.adapterPosition, event)
            onTouchItem?.onItemTouch(list[holder.adapterPosition], holder, holder.adapterPosition, event)
            false
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface OnCallBack<M : BaseModel> {
        fun onItemClick(
            data: M,
            holder: BaseViewHolder,
            position: Int
        ) {
        }

        fun onItemLongClick(
            data: M,
            holder: BaseViewHolder,
            position: Int
        ) {
        }

        fun onItemTouch(
            data: M,
            holder: BaseViewHolder,
            position: Int,
            event: MotionEvent
        ) {
        }
    }
}