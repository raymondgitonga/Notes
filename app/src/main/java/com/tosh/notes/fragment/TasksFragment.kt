package com.tosh.notes.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.tosh.notes.R
import com.tosh.notes.viewmodel.MainViewModel

class TasksFragment : Fragment() {

    private lateinit var tasksViewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasksViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)

        tasksViewModel.taskText.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
