package com.example.jetpack_compose_assignment_1.ui.theme


import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_assignment_1.data.Course

@Composable
fun CourseCard(course: Course) {
    var isExpanded by rememberSaveable { mutableStateOf(false) }

    val backgroundColor = Color(0xFF023E8A)
    val textColor = Color.White
    val buttonTextColor = backgroundColor

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .animateContentSize()
        ) {
            // Title and Button Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = course.title,
                    style = MaterialTheme.typography.headlineSmall,
                    color = textColor
                )
                Button(
                    onClick = { isExpanded = !isExpanded },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = buttonTextColor
                    ),
                    shape = RoundedCornerShape(6.dp),
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp)
                ) {
                    Text(text = if (isExpanded) "Show less" else "Show more")
                }
            }

            // Code and Credit Hours
            Column {
                Text(
                    text = course.code,
                    style = MaterialTheme.typography.bodyMedium,
                    color = textColor
                )
                Text(
                    text = "${course.creditHours} Cr",
                    style = MaterialTheme.typography.bodySmall,
                    color = textColor
                )
            }

            // Expanded Details
            if (isExpanded) {
                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "Description",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontWeight = FontWeight.Bold
                    ),
                    color = textColor
                )
                Text(
                    text = course.description,
                    style = MaterialTheme.typography.bodySmall,
                    color = textColor
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Prerequisites",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontWeight = FontWeight.Bold
                    ),
                    color = textColor
                )
                Text(
                    text = course.prerequisites,
                    style = MaterialTheme.typography.bodySmall,
                    color = textColor
                )
            }

        }
    }
}