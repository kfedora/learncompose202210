package com.github.kfedora.learncompose202210

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.kfedora.learncompose202210.ui.theme.LearnJetpackComposeOctober2022Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnJetpackComposeOctober2022Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RenderMainComposable("Beyonce")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    LearnJetpackComposeOctober2022Theme {
        Greeting("Person")
    }
}

@Preview(showBackground = true)
@Composable
fun RenderMainComposable(name: String = "Beyonce") {
    Column {
        Row {
            Image(
                painter = painterResource(id = R.drawable.arielviewofkathmandu_1_2092022091946),
                contentDescription = "Kathmandu from above",
                modifier = Modifier
                    .size(80.dp)
                    .padding(20.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Row {
                Column {
                    Text(text = "When no one is around you, say baby I love you " +
                            "if you ain't running game. " +
                            "You're acting kind of shady and calling me baby " +
                            "why the sudden change?...")
                    Greeting(name)
                }
            }
        }
        Spacer(modifier = Modifier.width(300.dp))
        Image(
            painter = painterResource(id = R.drawable.arielviewofkathmandu_3_2092022091959),
            contentDescription = "Kathmandu from above",
            modifier = Modifier
                .padding(2.dp)
        )
    }
}