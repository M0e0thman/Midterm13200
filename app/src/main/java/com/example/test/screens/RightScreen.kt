package com.example.test.screens
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test.timers.RightScreenViewModel
import kotlinx.coroutines.delay

@Composable
fun RightScreen(name: String, myViewModel: RightScreenViewModel) {
    val currentTime = remember { mutableStateOf(0L) }
    val isTimerRunning = remember { mutableStateOf(false) }
    val timerScope = rememberCoroutineScope()

    LaunchedEffect(isTimerRunning.value) {
        if (isTimerRunning.value) {
            while (true) {
                delay(1000)
                currentTime.value++
            }
        }
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top, // Align text to the top
            modifier = Modifier.fillMaxSize(0.75F)
        ) {
            Text(
                text = "Timer",
                fontSize = 60.sp, // Increase font size
            )
            Spacer(modifier = Modifier.padding(25.dp))
            Text(
                text = "Time elapsed: ${currentTime.value} seconds",
                fontSize = 30.sp, // Increase font size
                modifier = Modifier
                    .padding(vertical = 16.dp) // Add space top and bottom
                    .wrapContentWidth(Alignment.CenterHorizontally) // Center horizontally
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Surface(
                shape = RoundedCornerShape(4.dp),
                color = Color.Black
            ) {
                Button(
                    onClick = {
                        isTimerRunning.value = !isTimerRunning.value
                    },
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth(), // Make the button fill the width
                    content = {
                        Text(if (isTimerRunning.value) "Stop" else "Start", color = Color.White)
                    }
                )
            }
        }
    }
}
