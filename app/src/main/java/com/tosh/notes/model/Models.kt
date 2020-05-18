package com.tosh.notes.model

data class Task (
    var title : String?,
    var todos: MutableList<Todo>? = mutableListOf(),
    var tag: Tag? = null
)

data class Todo(
    var description: String,
    var isComplete: Boolean = false
)


data class Note(
    var description: String?,
    var tag: Tag? = null
)

data class Tag(
    var name: String,
    var colourResId:Int
)