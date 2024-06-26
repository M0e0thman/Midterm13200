package com.example.test.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width




@Composable
fun MainScreen(navController: NavController) {
    var text by remember { mutableStateOf("") }
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 50.dp)
    ) {
        Button(
            onClick = {
                navController.navigate(ScreenRoutes.LeftScreen.route)
            },
            modifier = Modifier.weight(1f)
        ) {
            Text("Time1", fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.width(10.dp))
        Button(
            onClick = {
                navController.navigate(ScreenRoutes.RightScreen.route)
            },
            modifier = Modifier.weight(1f)
        ) {
            Text("Time2", fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.width(10.dp))
        Button(
            onClick = {
                navController.navigate(ScreenRoutes.RightScreen.route)
            },
            modifier = Modifier.weight(1f)
        ) {
            Text("Time3", fontSize = 20.sp)
        }
    }
}

