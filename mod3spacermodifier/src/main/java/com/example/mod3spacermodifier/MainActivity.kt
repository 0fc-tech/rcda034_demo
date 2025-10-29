package com.example.mod3spacermodifier

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mod3spacermodifier.ui.theme.DemonstrationsTheme
import com.example.mod3spacermodifier.ui.widgets.ConnexionPage
import com.example.mod3spacermodifier.ui.widgets.SpacerModifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemonstrationsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ConnexionPage(Modifier.padding(innerPadding))
                //SpacerModifier(Modifier.padding(innerPadding))
                }
            }
        }
    }
}








