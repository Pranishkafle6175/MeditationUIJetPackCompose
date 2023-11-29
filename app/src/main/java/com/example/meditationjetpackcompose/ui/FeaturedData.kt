package com.example.meditationjetpackcompose.ui

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.example.meditationjetpackcompose.ui.theme.DeepBlue

data class FeaturedData(
    var title:String,
    @DrawableRes var iconid:Int,
    var color: Color
)
