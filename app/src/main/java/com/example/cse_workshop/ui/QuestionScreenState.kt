package com.example.cse_workshop.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.CSE_WorkshopTheme
import com.example.cse_workshop.Question

@Composable
fun QuestionScreenState(
    question: Question,
    onNextClicked: (Boolean) -> Unit

) {
    var selectedOptionIndex by remember { mutableStateOf(-1) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = question.questionText,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp),
            color = MaterialTheme.colorScheme.secondary,
            textAlign = TextAlign.Center
        )

        // Display options
        question.options.forEachIndexed { index, optionText ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .selectable(
                        selected = (selectedOptionIndex == 0),
                        onClick = { selectedOptionIndex = index },
                        role = Role.RadioButton
                    )
                    .padding(8.dp)
            ) {
                RadioButton(
                    selected = (selectedOptionIndex == index),
                    onClick = { selectedOptionIndex = index }
                )
                Text(
                    text = optionText,
                    color = MaterialTheme.colorScheme.onBackground,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        Image(painter = painterResource(id = question.image), contentDescription = "image description" ,
            modifier = Modifier.size(200.dp) , contentScale = ContentScale.Fit)

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = {
                val isCorrect = selectedOptionIndex == question.answerIndex
                onNextClicked(isCorrect)
                selectedOptionIndex = -1 // Reset selection for next question
            },
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(text = "Next")
        }
    }
}

@Composable
@Preview(backgroundColor = 0xF3EC3333)
fun QuestionScreenStatePreview() {
    CSE_WorkshopTheme {
        val question = Question(
            questionText = "What is the capital of France?",
            options = listOf("Paris", "London", "Berlin", "Madrid"),
            answerIndex = 0
        )
        QuestionScreenState(question = question , {})
    }
}

//preview for dark mode
