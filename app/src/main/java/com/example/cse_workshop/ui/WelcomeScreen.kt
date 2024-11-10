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
fun WelcomeScreen(onStartClicked: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Text(
            text = "Welcome to the Quiz App",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 32.dp),
            color = MaterialTheme.colorScheme.onBackground
        )
        Button(
            onClick = { onStartClicked() },
            modifier = Modifier.fillMaxWidth(0.5f)
        ) {
            Text(text = "Start Quiz")
        }
    }
}

@Preview
@Composable
fun WelcomeScreenPreview() {
    CSE_WorkshopTheme {
        WelcomeScreen(onStartClicked = {})
    }
}
