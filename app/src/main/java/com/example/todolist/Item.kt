package com.example.todolist

data class Item(
    val title: String,
    val description: String,
    var isChecked: Boolean = false
) {
    val name: CharSequence?
        get() {
            TODO()
        }
}
