// File: SampleData.kt
package com.example.cse_workshop

object SampleData {
    val questionList = listOf(
        // Question 1
        Question(
            questionText = "In Kotlin, which keyword is used to declare a read-only variable?",
            options = listOf("var", "val", "let", "const"),
            answerIndex = 1 // "val"
        ),
        // Question 2
        Question(
            questionText = "What is the correct way to declare a function in Kotlin?",
            options = listOf(
                "fun myFunction() { }",
                "function myFunction() { }",
                "def myFunction() { }",
                "void myFunction() { }"
            ),
            answerIndex = 0 // "fun myFunction() { }"
        ),
        // Question 3
        Question(
            questionText = "Which of the following is the correct syntax for a data class in Kotlin?",
            options = listOf(
                "data class User(val name: String, val age: Int)",
                "class data User(val name: String, val age: Int)",
                "data User class(val name: String, val age: Int)",
                "class User data(val name: String, val age: Int)"
            ),
            answerIndex = 0 // "data class User(val name: String, val age: Int)"
        ),
        // Question 4
        Question(
            questionText = "What function is used to create a mutable list in Kotlin?",
            options = listOf(
                "listOf()",
                "arrayListOf()",
                "mutableListOf()",
                "createList()"
            ),
            answerIndex = 2 // "mutableListOf()"
        ),
        // Question 5
        Question(
            questionText = "How do you handle a nullable variable 'name' of type String in Kotlin?",
            options = listOf(
                "if (name != null) { }",
                "name?.let { }",
                "Both A and B",
                "You cannot have nullable types in Kotlin"
            ),
            answerIndex = 2 // "Both A and B"
        ),
        // Question 6
        Question(
            questionText = "Which of these is NOT a control flow statement in Kotlin?",
            options = listOf("if", "when", "switch", "for"),
            answerIndex = 2 // "switch"
        ),
        // Question 7
        Question(
            questionText = "What is the purpose of the '?.' operator in Kotlin?",
            options = listOf(
                "To call a method only if the object is not null",
                "To force a null pointer exception",
                "To compare two values",
                "To assign a default value"
            ),
            answerIndex = 0 // "To call a method only if the object is not null"
        ),
        // Question 8
        Question(
            questionText = "How do you declare an extension function in Kotlin?",
            options = listOf(
                "fun ClassName.functionName() { }",
                "fun functionName() : ClassName { }",
                "ClassName.functionName() { }",
                "function ClassName.functionName() { }"
            ),
            answerIndex = 0 // "fun ClassName.functionName() { }"
        ),
        // Question 9
        Question(
            questionText = "Which keyword is used in Kotlin to represent a singleton class?",
            options = listOf("object", "singleton", "static", "final"),
            answerIndex = 0 // "object"
        ),
        // Question 10
        Question(
            questionText = "What is the correct way to handle exceptions in Kotlin?",
            options = listOf(
                "try { } catch (e: Exception) { }",
                "try { } except (Exception e) { }",
                "do { } while (exception) { }",
                "handle { } exception (e) { }"
            ),
            answerIndex = 0 // "try { } catch (e: Exception) { }"
        )
    )
}
