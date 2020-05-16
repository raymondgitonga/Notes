package com.tosh.notes.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val notes_txt = MutableLiveData<String>().apply {
        value = "This is notes Fragment"
    }
    private val tasks_text = MutableLiveData<String>().apply {
        value = "This is tasks Fragment"
    }
    val taskText: LiveData<String> = tasks_text
    val notesText: LiveData<String> = notes_txt
}