package me.sgomez.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PalatalCheck() {
    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(R.drawable.pfp),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )
        Spacer(Modifier.height(16.dp))
        Text(
            text = "Samuel Gomez",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold)
        Text(
            text = "Estudiante de Ingeniería",
            color = Color.Gray)
        HorizontalDivider(thickness = 3.dp)
        Spacer(Modifier.height(12.dp))

        Text(
            text = "Edad: 20",
            fontSize = 25.sp
            )
        Spacer(Modifier.height(12.dp))
        Text(
            text = "Correo: sgomez724@unab.edu.co",
            fontSize = 25.sp
            )
        Spacer(Modifier.height(12.dp))
        Text(
            text = "Ciudad: Bucaramanga",
            fontSize = 25.sp
            )
        Spacer(Modifier.height(16.dp))
        Column(
            modifier = Modifier
                .padding(all = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "Contactar amigo",
                fontSize = 30.sp,
                color = Color.White,
                modifier = Modifier
                    .background(
                        color = Color.Blue,
                        shape = RoundedCornerShape(16.dp)
                    )
            )

    }
  }
}