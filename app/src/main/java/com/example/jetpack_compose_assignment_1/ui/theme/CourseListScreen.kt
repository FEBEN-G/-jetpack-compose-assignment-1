package com.example.jetpack_compose_assignment_1.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack_compose_assignment_1.ui.theme.CourseAppTheme
import com.example.jetpack_compose_assignment_1.data.Course

@Composable
fun CourseListScreen(courseList: List<Course>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        // Header section with a blue background
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF023E8A)) // Blue background
                .padding(vertical = 16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Academic Courses",
                style = MaterialTheme.typography.headlineLarge.copy(
                    fontWeight = FontWeight.Bold, // Bold text
                    color = Color.White // White color for the text
                ),
            )
        }

        // Horizontal line to differentiate the header and the course list
        Divider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))

        // List of courses
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(courseList) { course ->
                CourseCard(course = course)
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun CourseListScreenPreview() {
    val sampleCourses = listOf(
        Course(
            "Cyber Security",
            "CS203",
            4,
            "Introduces fundamental concepts of cyber security including threat types, network vulnerabilities, encryption, firewalls, authentication mechanisms, and best practices for securing digital systems and data.",
            "Intro to CS"
        ),
        Course(
            "Database Systems",
            "CS204",
            3,
            "Focuses on relational databases, SQL, and basic database design principles.",
            "Intro to CS"
        ),

        Course(
            "Operating Systems",
            "CS302",
            4,
            "Covers memory management, process scheduling, and file systems.",
            "Data Structures"
        ),
        Course(
            "Software Engineering",
            "CS303",
            3,
            "Introduces software development life cycle, UML, and project management.",
            "Object-Oriented Programming"
        ),
        Course(
            "Computer Graphics",
            "CS304",
            3,
            "Covers the principles of computer graphics, including 2D and 3D transformations, rendering, shading, and modeling techniques, with applications in interactive graphics and visualization.",
            "Object-Oriented Programming"
        ),
        Course(
            "Web Development",
            "CS305",
            3,
            "Covers HTML, CSS, JavaScript, and web application frameworks.",
            "Intro to CS"
        ),
        Course(
            "Artificial Intelligence",
            "CS306",
            3,
            "Covers basic AI concepts such as search algorithms, knowledge representation, and machine learning.",
            "Data Structures"
        )
    )


    CourseAppTheme {
        CourseListScreen(courseList = sampleCourses)
    }
}