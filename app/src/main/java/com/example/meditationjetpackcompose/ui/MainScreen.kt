package com.example.meditationjetpackcompose.ui

import android.graphics.drawable.PaintDrawable
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meditationjetpackcompose.R
import com.example.meditationjetpackcompose.ui.theme.*
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun MainScreen(){

    Box(modifier = Modifier
        .fillMaxSize()
        .background(DeepBlue)
    ){
        Column {
            Greeting()
            Chips(listOf<String>("Sweet Sleep","Insomnia","Depression"))
            Dailythought()
            Featured(
                listOf(
                    FeaturedData(
                        title = "Sleep meditation",
                        iconid = R.drawable.ic_headphone,
                        color = BlueViolet3
                    ),
                    FeaturedData(
                        title = "Tips for sleeping",
                        iconid = R.drawable.ic_videocam,
                        color = LightGreen3
                    ),
                    FeaturedData(
                        title = "Night island",
                        iconid = R.drawable.ic_music,
                        color = OrangeYellow3
                    ),
                    FeaturedData(
                        title = "Calming sounds",
                        iconid = R.drawable.ic_play,
                        color = Beige3
                    )

                )
            )
        }
    }
}
@Composable
fun Greeting(name:String="Pranish"){
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(25.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(verticalArrangement = Arrangement.Center) {
                Text(text = "Good Morning , $name",
                    style = MaterialTheme.typography.h2

                )
                Text(text = "We wish you have a good day!",
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.padding(top = 10.dp)
                    )
            }

            Icon(painter = painterResource(id = R.drawable.ic_search), contentDescription = "Search"
            , tint = Color.White,
                modifier = Modifier
                    .size(44.dp)
                    .padding(end = 15.dp)
            )
        }
}

@Composable
fun Chips(listOf: List<String>) {

    var selectedChip by remember {
        mutableStateOf(0)
    }

    LazyRow{
        items(listOf.size){

            Box(modifier = Modifier
                .padding(start = 25.dp, top = 15.dp, bottom = 15.dp)
                .clip(RoundedCornerShape(10.dp))
                .clickable {
                    selectedChip = it
                }
                .background(
                    if (selectedChip == it) ButtonBlue
                    else DarkerButtonBlue
                )
                .padding(15.dp)
            ){
                Text(text = listOf[it], color = TextWhite)
            }

        }
    }
}

@Composable
fun Dailythought(){

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(25.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(pink)
            .padding(horizontal = 15.dp, vertical = 20.dp)
    ) {
        Column {
            Text(text = "Daily Thought", color = TextWhite, style = MaterialTheme.typography.h1,
            modifier = Modifier.padding(bottom = 5.dp)
                )
            Text(text = "Meditation ~ 3-10 min", color = TextWhite, style = MaterialTheme.typography.h2)
        }

        Box(modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
            .background(ButtonBlue)
            .padding(10.dp)
            ,
            Alignment.Center
        ){
            Icon(painter = painterResource(R.drawable.ic_play), contentDescription ="Play", tint = TextWhite, modifier = Modifier.size(16.dp))
        }
    }
}

@Composable
fun Featured(featuredList:List<FeaturedData>){
        Column {
            Text(text = "Featured", style = MaterialTheme.typography.h1, color = TextWhite,
                modifier = Modifier.padding(15.dp)
                )

            LazyVerticalGrid(columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(start = 7.5.dp, end = 7.5.dp, bottom = 100.dp),
                modifier = Modifier.fillMaxHeight()){
                items(featuredList.size){
                    index ->
                    VerticalGrid(data = featuredList[index])

                }
            }

        }
    }


@Composable
fun VerticalGrid(data: FeaturedData){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(10.dp))
            .background(data.color)
    ) {
        Text(text = data.title,
            style = MaterialTheme.typography.h1,
            lineHeight = 26.sp,
            color = TextWhite,
            modifier = Modifier.align(Alignment.TopStart)
                .padding(15.dp)
            )
        Icon(painter = painterResource(id = data.iconid),
            contentDescription ="featuredicon",
            tint = TextWhite,
            modifier = Modifier.align(Alignment.BottomStart)
                .padding(15.dp)
            )


        Text(
            text = "Start",
            color = TextWhite,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(15.dp, 10.dp)
                .background(ButtonBlue, RoundedCornerShape(10.dp))
                .clickable { /* Handling button click */ }
                .padding(vertical = 8.dp, horizontal = 15.dp)
        )
    }
}

@Composable
fun BottomMenu(menudata:List<BottomMenuData>){

    Row(){
        
    }
}

