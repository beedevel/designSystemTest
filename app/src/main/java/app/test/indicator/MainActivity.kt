package app.test.indicator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import app.test.indicator.compose.ComposeMainActivityContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(
            ComposeView(this).apply {
                setContent {
                    MaterialTheme {
                        ComposeMainActivityContent(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.White)
                        )
                    }
                }
            })
    }
}