package com.example.cse_workshop.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.CSE_WorkshopTheme

@Composable
fun ResultScreen(
    score: Int,
    totalQuestions: Int,
    onRestartClicked: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Quiz Completed!",
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = "Your Score: $score / $totalQuestions",
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(bottom = 32.dp)
        )
        Button(onClick = { onRestartClicked() }) {
            Text(text = "Restart Quiz")
        }
    }
}


@Composable
@Preview
fun ResultScreenPreview() {
    CSE_WorkshopTheme {
        ResultScreen(
            score = 5,
            totalQuestions = 10,
            onRestartClicked = {}
        )
    }
}