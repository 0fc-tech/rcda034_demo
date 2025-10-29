package com.example.mod3spacermodifier.ui.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.mod3spacermodifier.ui.theme.Typography

@Composable
fun SpacerModifier(modifier: Modifier = Modifier) {
    Column(modifier) {
        Text("La communauté de l'anneau")
        Spacer(Modifier.weight(1f))
        Text("Les deux tours")
        Spacer(Modifier.weight(4f))
        Text("Le retour du roi")
    }
}

@Composable
fun ConnexionPage(modifier: Modifier = Modifier) {
    Column (modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Spacer(Modifier.weight(0.1f))
        Box(Modifier
            .padding(16.dp)
            .background(Color.Red)
            .border(
                BorderStroke(5.dp,Color.Blue)
            )
        ) {
            Text("Mon Application", style = Typography.displayLarge)
        }
        Spacer(Modifier.weight(0.1f))
        OutlinedTextField(
            "Prenom",
            onValueChange = {},
            label = { Text("Prenom") },
            placeholder = { Text("Prenom") },
        )
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(
            "Nom",
            onValueChange = {},
            label = { Text("Nom") },
            placeholder = { Text("Nom") },
        )
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(
            "Mot de passe",
            onValueChange = {},
            label = { Text("Mot de passe") },
            placeholder = { Text("Mot de passe") },
        )
        Spacer(Modifier.weight(1f))
        Button(onClick = {},Modifier
            .fillMaxWidth()
            .padding(16.dp)) {
            Text("Se connecter")
        }
    }
}