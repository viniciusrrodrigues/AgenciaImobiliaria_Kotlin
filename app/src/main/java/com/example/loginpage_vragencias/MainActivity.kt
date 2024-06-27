package com.example.loginpage_vragencias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginpage_vragencias.ui.theme.LoginPage_VRagenciasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginPage_VRagenciasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()
                }
            }
        }
    }
}

@Composable
fun registrar(text: String, modifier: Modifier = Modifier) {
    Column(modifier) {
        Text(
            text = text,
            fontSize = 24.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray,
            modifier = Modifier.padding(bottom = 50.dp) // Espaço abaixo do texto
        )
        EmailInput()
        Spacer(modifier = Modifier.height(40.dp)) // Espaço entre os inputs
        PasswordInput()

        // Adicionando os botões
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            Button(
                onClick = { /*  Implementar ação para login */ },
                modifier = Modifier.padding(
                    top = 100.dp,
                    end = 100.dp
                )
            ) {
                Text("Login")
            }
            Button(
                onClick = { /* Implementar ação para cadastro */ },
                modifier = Modifier.padding(
                   top = 100.dp
                    )
            ) {
                Text("Cadastre-se")
            }
        }
    }
}

@Composable
fun EmailInput() {
    OutlinedTextField(
        value = "",
        onValueChange = { /*  email change */ },
        label = { Text("Email") },
        modifier = Modifier.fillMaxWidth()
            .padding(
                start = 5.dp,
                end = 40.dp
            )
    )
}

@Composable
fun PasswordInput() {
    OutlinedTextField(
        value = "",
        onValueChange = { /*   password change */ },
        label = { Text("Senha") },
        modifier = Modifier.fillMaxWidth()
            .padding(
                start = 5.dp,
                end = 40.dp
            )
    )
}

@Composable
fun Loginimage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.fundologin)
    val text = "VR agências"
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        registrar(
            text = text,
            modifier = Modifier
                .padding(start = 40.dp, top = 100.dp)
        )
    }
}

@Composable
fun LoginScreen() {
    Column {
        Loginimage()
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    LoginPage_VRagenciasTheme {
        LoginScreen()
    }
}

