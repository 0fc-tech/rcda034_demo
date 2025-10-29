package com.example.mod4viewmodelnotes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ListNotesPage(modifier: Modifier = Modifier,
                  vm: ListNotesVM = viewModel()) {
    //Je collecte ma liste de notes en tant qu'état
    // Dès qu'une nouvelle liste de notes est disponible je 'recompose'
    val listNotes by vm.listNotes.collectAsState()
    var noteForm by remember { mutableStateOf("") }
    Scaffold(
        bottomBar = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                TextField(
                    value = noteForm,
                    onValueChange = { noteForm = it },
                    modifier = Modifier.padding(16.dp)
                )
                IconButton(onClick = {
                    val note = noteForm.toDoubleOrNull()
                    if (note != null) {
                        vm.addNote(note)
                    }
                }) {
                    Icon(
                        Icons.AutoMirrored.Filled.Send,
                        contentDescription = ""
                    )
                }
            }        },
        modifier=Modifier.fillMaxSize()

    ) { innerPadding ->
    Column(Modifier.padding(innerPadding).fillMaxSize()) {
        LazyColumn {
            items(listNotes) {
                Text(it.toString())
            }
        }


    }
    }
}