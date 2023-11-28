package com.example.meditationjetpackcompose.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.meditationjetpackcompose.ui.theme.DeepBlue

@Composable
fun MainScreen(){

    Box(modifier = Modifier
        .fillMaxSize()
        .background(DeepBlue)
    ){
        Text(text = "Hello World")
    }


}