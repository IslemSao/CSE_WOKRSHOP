package com.example.cse_workshop.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
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
fun QuestionScreen(
    question: Question,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Question text
        Text(
            text = question.questionText,
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.secondary,
            textAlign = TextAlign.Center
        )

        // Options with selectable RadioButtons
        question.options.forEachIndexed { _, optionText ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .selectable(
                        selected = false,
                        onClick = { },
                        role = Role.RadioButton
                    )
                    .padding(8.dp)
            ) {
                RadioButton(
                    selected = false,
                    onClick = { }
                )
                Text(
                    text = optionText,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Displaying the image
        Image(
            painter = painterResource(id = question.image),
            contentDescription = "image description",
            modifier = Modifier.size(200.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.weight(1f))

        // Next button
        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Next")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun QuestionScreenPreview2() {
    CSE_WorkshopTheme {
        val question = Question(
            questionText = "What is the capital of France?",
            options = listOf("Paris", "London", "Berlin", "Madrid"),
            answerIndex = 0
        )
        QuestionScreen(question = question)
    }
}

