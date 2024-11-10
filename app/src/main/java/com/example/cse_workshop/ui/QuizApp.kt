package com.example.cse_workshop.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.CSE_WorkshopTheme
import com.example.cse_workshop.SampleData


@Composable
fun QuizApp() {
    var hasStarted by remember { mutableStateOf(false) }
    var questionIndex by remember { mutableStateOf(0) }
    var score by remember { mutableStateOf(0) }
    var showResult by remember { mutableStateOf(false) }

    if (!hasStarted) {
        WelcomeScreen(onStartClicked = {
            hasStarted = true
        })
    } else if (showResult) {
        ResultScreen(
            score = score,
            totalQuestions = SampleData.questionList.size,
            onRestartClicked = {
                // Reset the quiz and navigate back to the welcome screen
                questionIndex = 0
                score = 0
                showResult = false
                hasStarted = false
            }
        )
    } else {
        val question = SampleData.questionList[questionIndex]
        QuestionScreenState(
            question = question,
            onNextClicked = { isCorrect ->
                if (isCorrect) score++
                if (questionIndex < SampleData.questionList.size - 1) {
                    questionIndex++
                } else {
                    showResult = true
                }
            }
        )
    }
}

@Composable
@Preview
fun QuizAppPreview() {
    CSE_WorkshopTheme {
        QuizApp()
    }
}
