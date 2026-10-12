package com.example.sunflower_mega

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sunflower_mega.ui.theme.Sunflower_MegaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Sunflower_MegaTheme {
            Scaffold(
                modifier = Modifier.fillMaxSize()
            ) { innerPadding ->
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                        .background(Color(0xFF22396F))
                ) {
                    Navbar()
                    sunFlower()

                }
            }
                }
            }
        }
    }


@Composable
fun Navbar(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(Color(0xFF22396F)),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Menanam bunga matahari",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}
@Composable
fun sunFlower(modifier: Modifier = Modifier) {
    var tahap by remember { mutableIntStateOf(1) }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFBFC9D1))
            .padding(16.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        when (tahap) {
            1 -> {
                Image(
                    painter = painterResource(R.drawable.benih),
                    contentDescription = "Benih",
                    modifier = Modifier
                        .size(250.dp)
                        .clickable {
                            tahap = 2
                        }
                )
                Text(
                    text = "Selamat kamu sudah menanam benih, klik gambar untuk melihat pertumbuhannya!",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 25.dp).padding(horizontal = 10.dp),
                    textAlign = TextAlign.Center
                )
            }
            2 -> {

                Image(
                    painter = painterResource(R.drawable.tumbuh),
                    contentDescription = "Tumbuh",
                    modifier = Modifier
                        .size(250.dp)
                        .clickable {
                            tahap = 3
                        }
                )
                Text(
                    text = "Klik gambar untuk melihat pertumbuhan selanjutnya! ",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 25.dp).padding(horizontal = 10.dp),
                    textAlign = TextAlign.Center
                )
            }
            3 -> {

                Image(
                    painter = painterResource(R.drawable.daun),
                    contentDescription = "Daun",
                    modifier = Modifier
                        .size(250.dp)
                        .clickable {
                            tahap = 4
                        }
                )
                Text(
                    text = "Klik gambar untuk melihat pertumbuhan selanjutnya!",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 25.dp).padding(horizontal = 10.dp),
                    textAlign = TextAlign.Center
                )
            }
            4 -> {
                Image(
                    painter = painterResource(R.drawable.d_banyak),
                    contentDescription = "Banyak",
                    modifier = Modifier
                        .size(250.dp)
                        .clickable {
                            tahap = 5
                        }
                )
                Text(
                    text = "Klik gambar untuk melihat pertumbuhan selanjutnya!",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 25.dp).padding(horizontal = 10.dp),
                    textAlign = TextAlign.Center
                )
            }
            5 -> {
                Image(
                    painter = painterResource(R.drawable.start),
                    contentDescription = "start",
                    modifier = Modifier
                        .size(250.dp)
                        .clickable {
                            tahap = 6
                        }
                )
                Text(
                    text = "Klik gambar untuk melihat pertumbuhan selanjutnya!",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 25.dp).padding(horizontal = 10.dp),
                    textAlign = TextAlign.Center
                )
            }
            6 -> {
                Image(
                    painter = painterResource(R.drawable.sunflower),
                    contentDescription = "sunflower",
                    modifier = Modifier
                        .size(250.dp)
                        .clickable {
                            tahap = 7
                        }
                )
                Text(
                    text = "Klik gambar untuk melihat pertumbuhan selanjutnya!",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 25.dp).padding(horizontal = 10.dp),
                    textAlign = TextAlign.Center
                )
            }
            7 -> {
                Image(
                    painter = painterResource(R.drawable.tua),
                    contentDescription = "Mulai tua",
                    modifier = Modifier
                        .size(250.dp)
                        .clickable {
                            tahap = 8
                        }
                )
                Text(
                    text = "Klik gambar untuk melihat pertumbuhan selanjutnya!",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 25.dp).padding(horizontal = 10.dp),
                    textAlign = TextAlign.Center
                )
            }
            8 -> {
                Image(
                    painter = painterResource(R.drawable.panen),
                    contentDescription = "Panen",
                    modifier = Modifier
                        .size(250.dp)
                        .clickable {
                            tahap = 1
                        }
                )
                Text(
                    text = "Selamat kamu telah berhasil menanam, klik gambar untuk memulai kembali",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 25.dp).padding(horizontal = 10.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Sunflower_MegaTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF22396F))
        ) {
            Navbar()
            sunFlower()
        }

    }
}