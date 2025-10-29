package com.example.mod3layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mod3layout.ui.theme.DemonstrationsTheme
import com.example.mod3layout.ui.widgets.RowColumnProduct

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemonstrationsTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title={Text("HelloWorld")}
                        )
                    },
                    modifier = Modifier.fillMaxSize()) { innerPadding ->
                    RowColumnProduct(Modifier.padding(innerPadding))
                }
            }
        }
    }

}
