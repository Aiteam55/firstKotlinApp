package com.aiteam.firstkotlinapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aiteam.firstkotlinapp.ui.theme.FirstKotlinAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstKotlinAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Mitia",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    LazyColumn {
        items(10) {
            i -> Icon(imageVector = Icons.Default.Add, contentDescription = null)
        }
    }
//    Column {
//        for(i in 1..10) {
//            Icon(imageVector = Icons.Default.Add, contentDescription = null)
//        }
//    }
//    Image(
//        painter = painterResource(id = R.drawable.ic_launcher_foreground),
//        contentDescription = null,
//        modifier = Modifier.background(Color.Black)
//    )
//    Column (
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
//        modifier = Modifier
//            .size(400.dp)
//    ){
//        Text(
//            text = "Hello $name!",
//            modifier = modifier
//        )
//        Text(
//            text = "Some other text lavalava be",
//            modifier = modifier
//        )
//    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstKotlinAppTheme {
        Greeting("Android")
    }
}