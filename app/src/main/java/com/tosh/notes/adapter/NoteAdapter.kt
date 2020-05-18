package com.tosh.notes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tosh.notes.R
import com.tosh.notes.foundations.BaseRecyclerAdapter
import com.tosh.notes.model.Note
import kotlinx.android.synthetic.main.item_note.view.*

class NoteAdapter(noteList: MutableList<Note> = mutableListOf()): BaseRecyclerAdapter<Note>(noteList){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_note, parent, false))

    class ViewHolder(view: View): BaseViewHolder<Note>(view){
        override fun onBind(data: Note) {
            view.descriptionView.text = data.description
        }
    }
}