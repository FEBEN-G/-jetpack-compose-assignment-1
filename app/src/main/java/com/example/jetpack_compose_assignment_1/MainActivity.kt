package com.example.jetpack_compose_assignment_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.jetpack_compose_assignment_1.data.Course
import com.example.jetpack_compose_assignment_1.ui.theme.CourseListScreen
import com.example.jetpack_compose_assignment_1.ui.theme.CourseAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CourseAppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
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
                    CourseListScreen(courseList = sampleCourses)
                }
            }
        }
    }
}