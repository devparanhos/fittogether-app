package br.com.fittogether.presentation.feature.signup.verifyEmail.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fittogether.presentation.component.button.DefaultButton
import br.com.fittogether.presentation.component.input.DefaultInput
import br.com.fittogether.presentation.ui.color.Background
import br.com.fittogether.presentation.ui.color.Grey400
import br.com.fittogether.presentation.ui.color.Grey600
import br.com.fittogether.presentation.ui.color.Secondary
import fittogether.composeapp.generated.resources.Res
import fittogether.composeapp.generated.resources.ic_apple
import fittogether.composeapp.generated.resources.ic_arrow_back
import fittogether.composeapp.generated.resources.ic_google
import org.jetbrains.compose.resources.painterResource

@Composable
fun VerifyEmailScreen() {
    VerifyEmailContent()
}

@Composable
fun VerifyEmailContent() {
    var text by remember { mutableStateOf("") }

    Scaffold(
        modifier = Modifier.background(Background),
        topBar = {
            Row(
                modifier = Modifier.padding(24.dp)
            ) {
                Image(
                    modifier = Modifier.size(18.dp),
                    painter = painterResource(Res.drawable.ic_arrow_back),
                    contentDescription = null
                )
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding).padding(24.dp)
        ) {
            Text(
                text = "Crie sua conta",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Text(
                text = "Informe seu e-mail para iniciar o cadastro",
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            DefaultInput(
                text = text,
                placeholder = "E-mail",
                onValueChange = {
                    text = it
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            DefaultButton(
                label = "Enviar código de verificação",
                backgroundColor = Secondary,
                borderColor = Secondary,
                textColor = White,
                onClick = {

                }
            )
            Spacer(modifier = Modifier.height(32.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Spacer(
                    modifier = Modifier.height(1.dp).background(Grey400).weight(1f)

                )
                Text(
                    modifier = Modifier.padding(horizontal = 8.dp),
                    textAlign = TextAlign.Center,
                    text = "ou cadastre-se com",
                    color = Grey400
                )
                Spacer(
                    modifier = Modifier.height(1.dp).background(Grey400).weight(1f)

                )
            }
            Spacer(modifier = Modifier.height(24.dp))
            DefaultButton(
                label = "Cadastrar com google",
                backgroundColor = White,
                borderColor = Grey600,
                textColor = Grey600,
                icon = painterResource(Res.drawable.ic_google),
                onClick = {

                }
            )
            Spacer(modifier = Modifier.height(24.dp))
            DefaultButton(
                label = "Cadastrar com apple",
                backgroundColor = White,
                borderColor = Grey600,
                textColor = Grey600,
                icon = painterResource(Res.drawable.ic_apple),
                onClick = {

                }
            )
        }
    }
}