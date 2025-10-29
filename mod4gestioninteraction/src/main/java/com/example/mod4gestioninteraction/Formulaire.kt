package com.example.mod4gestioninteraction

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier

private const val TAG = "Formulaire"
@Composable
fun Formulaire(modifier: Modifier = Modifier) {
    var prenom : String = ""
    var nomFamille by remember { mutableStateOf("") }
    var dateNaissance by rememberSaveable { mutableStateOf("") }
    Column(modifier) {
        TextField(
            value = prenom,
            onValueChange = {
                prenom = it
                Log.i(TAG, "Formulaire: $prenom")},
            label={Text("Prénom")}
        )
        TextField(
            value = nomFamille,
            onValueChange = {
                nomFamille = it},
            label={Text("Nom famille")}
        )
        TextField(
            value = dateNaissance,
            onValueChange = {dateNaissance = it},
            label={Text("Date naissance")}
        )
    }
}