package br.com.fittogether.presentation.feature.start.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

import br.com.fittogether.presentation.component.button.DefaultButton
import br.com.fittogether.presentation.ui.color.Grey400
import br.com.fittogether.presentation.ui.color.Grey600
import br.com.fittogether.presentation.ui.color.Primary
import br.com.fittogether.presentation.ui.color.Secondary

import fittogether.composeapp.generated.resources.Res
import fittogether.composeapp.generated.resources.ic_apple
import fittogether.composeapp.generated.resources.ic_email
import fittogether.composeapp.generated.resources.ic_google
import fittogether.composeapp.generated.resources.logo
import fittogether.composeapp.generated.resources.pattern_background

import org.jetbrains.compose.resources.painterResource

@Composable
fun StartScreen(
    navigateToSignup: () -> Unit
) {
    StartContent(
        navigateToSignup = navigateToSignup
    )
}

@Composable
fun StartContent(
    navigateToSignup: () -> Unit
) {
    Scaffold { innerPadding ->
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(Res.drawable.pattern_background),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
        Box(
            modifier = Modifier.fillMaxSize().background(Primary.copy(alpha = 0.94f))
        ) {
            Column (
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier.weight(0.4f).fillMaxWidth(0.7f),
                    painter = painterResource(Res.drawable.logo),
                    contentDescription = null
                )
                Card(
                    modifier = Modifier.fillMaxWidth().weight(0.6f).fillMaxHeight(),
                    backgroundColor = Color.White,
                    shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "se você já tiver uma conta",
                            color = Grey400
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        DefaultButton(
                            label = "Entrar com e-mail",
                            backgroundColor = Primary,
                            borderColor = Primary,
                            icon = painterResource(Res.drawable.ic_email),
                            onClick = {

                            }
                        )
                        Spacer(modifier = Modifier.height(24.dp))
                        DefaultButton(
                            label = "Entrar com google",
                            backgroundColor = Color.White,
                            borderColor = Grey600,
                            textColor = Grey600,
                            icon = painterResource(Res.drawable.ic_google),
                            onClick = {

                            }
                        )
                        Spacer(modifier = Modifier.height(24.dp))
                        DefaultButton(
                            label = "Entrar com apple",
                            backgroundColor = Color.White,
                            borderColor = Grey600,
                            textColor = Grey600,
                            icon = painterResource(Res.drawable.ic_apple),
                            onClick = {

                            }
                        )
                        Spacer(modifier = Modifier.height(32.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(
                                modifier = Modifier.height(2.dp).fillMaxWidth().background(Grey400).weight(0.3f)
                            )
                            Text(
                                modifier = Modifier.padding(horizontal = 8.dp).weight(0.5f).fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                text = "ou crie sua conta",
                                color = Grey400
                            )
                            Spacer(
                                modifier = Modifier.height(2.dp).background(Grey400).weight(0.3f)
                            )
                        }
                        Spacer(modifier = Modifier.height(32.dp))
                        DefaultButton(
                            label = "Cadastrar",
                            backgroundColor = Secondary,
                            borderColor = Secondary,
                            textColor = Color.White,
                            onClick = {
                                navigateToSignup()
                            }
                        )
                        Spacer(modifier = Modifier.height(24.dp))
                        Text(
                            modifier = Modifier.padding(horizontal = 8.dp).weight(0.5f).fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            text = "Ao entrar você concorda com os termos de uso e política de privacidade",
                            color = Grey400
                        )
                    }
                }
            }
        }
    }
}