package com.example.test.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test.timers.FrontScreenViewModel

@Composable
fun FrontScreen(name: String, myViewModel: FrontScreenViewModel) {
    val counter = myViewModel.counter

    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxSize(0.75F)
    ) {
        Text(" $name",fontSize = 40.sp)
        Spacer(modifier = Modifier.padding(25.dp))
        Text(" ${counter.value.toString()}")
        TextField(
            value = counter.value.toString(),
            onValueChange = { },
            label = { Text("No label") }
        )
        Button(onClick = { myViewModel.increment() }) {
            Text(counter.value.toString())
        }
    }
}
