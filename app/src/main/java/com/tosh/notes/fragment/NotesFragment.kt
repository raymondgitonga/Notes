package com.tosh.notes.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.tosh.notes.viewmodel.MainViewModel
import com.tosh.notes.R
import com.tosh.notes.adapter.NoteAdapter
import com.tosh.notes.model.Note
import kotlinx.android.synthetic.main.fragment_notes.*

class NotesFragment : Fragment() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        return   inflater.inflate(R.layout.fragment_notes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        notesRv.layoutManager = LinearLayoutManager(context)

        val adapter = NoteAdapter(
            mutableListOf(
               Note("What is going on"),
                Note("Kenya, Kenya, Kenya")
            )
        )

        notesRv.adapter = adapter
    }
}
