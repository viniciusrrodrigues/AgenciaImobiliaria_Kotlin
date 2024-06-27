package com.example.segundatela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginpage_vragencias.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RealEstateTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RealEstateCard()
                }
            }
        }
    }
}

@Composable
fun RealEstateCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp)
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(id = R.drawable.house_image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(460.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Casa moderna em condomínio",
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 10.dp)
        )

        Text(
            text = "SP - Alphaville\n120m quadrados",
            fontSize = 16.sp,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = "990 500R$",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = { /*  Implementar ação para ver outras */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF03DAC5), contentColor = Color.White),
                shape = MaterialTheme.shapes.small.copy(all = CornerSize(16.dp)),
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                Text(text = "ver outras", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = { /*  Implementar ação para agendar visita */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF03DAC5), contentColor = Color.White),
                shape = MaterialTheme.shapes.small.copy(all = CornerSize(16.dp)),
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                Text(text = "agendar visita", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RealEstateCardPreview() {
    RealEstateTheme {
        RealEstateCard()
    }
}

@Composable
fun RealEstateTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = lightColorScheme(), // Defina a paleta de cores
        typography = Typography(), // Defina a tipografia
        content = content
    )
}




