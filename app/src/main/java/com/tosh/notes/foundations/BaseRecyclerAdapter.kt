package com.tosh.notes.foundations

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerAdapter<T>(protected val masterList: MutableList<T> = mutableListOf()): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount() = masterList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        (holder as BaseViewHolder<T>).onBind(masterList[position])

    abstract class BaseViewHolder<T>(val view: View): RecyclerView.ViewHolder(view){

        abstract fun onBind(data: T)

    }
}