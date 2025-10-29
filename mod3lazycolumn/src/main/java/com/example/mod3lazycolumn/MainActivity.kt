package com.example.mod3lazycolumn

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mod3lazycolumn.ui.theme.DemonstrationsTheme
import com.example.mod3lazycolumn.ui.theme.Typography

private const val TAG = "MainActivity"
private val listItems by lazy {List(99999){index->"Item numéro $index"}}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemonstrationsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LazyColumn(Modifier
                        .padding(innerPadding)
                        .fillMaxWidth()){
                        item{
                            Text("Liste des Items", style = Typography.displayMedium)
                        }
                        items(20){
                            Text("Item numéro $it")
                        }
                        items(listItems){
                            Log.i(TAG, "onCreate: $it")
                            OutlinedCard(Modifier
                                .fillMaxWidth()
                                .padding(8.dp)) {
                                ListItem(
                                    headlineContent =
                                        {Text(it)},
                                    supportingContent = {Text("supporting")},
                                    leadingContent = {
                                        Icon(Icons.Default.Face,
                                        contentDescription = "")
                                    },
                                    trailingContent = {
                                        IconButton(onClick = {}) {Icon(
                                            Icons.Default.Call,
                                            contentDescription = ""
                                        ) }
                                    }
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DemonstrationsTheme {
        Greeting("Android")
    }
}