package com.tosh.notes.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tosh.notes.R
import com.tosh.notes.adapter.TaskAdapter
import com.tosh.notes.model.Task
import com.tosh.notes.model.Todo
import com.tosh.notes.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.fragment_tasks.*

class TasksFragment : Fragment() {

    private lateinit var tasksViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tasks, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tasksRv.layoutManager = LinearLayoutManager(context)

        val adapter = TaskAdapter(
            mutableListOf(
                Task("Testing one", mutableListOf(
                    Todo("Todo 1", true),
                    Todo("Todo 2")
                )),
                Task("Testing two")
            )
        )

        tasksRv.adapter = adapter


    }
}
