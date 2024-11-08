package com.example.cse_workshop

data class Question(
    val questionText: String,
    val options: List<String>,
    val answerIndex: Int,
    val image: Int = R.drawable.logo
)
