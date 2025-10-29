package com.example.mod4viewmodelnotes

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ListNotesVM : ViewModel() {
    //Liste StateFlow mutable -> Données uniquement modifiables dans ListNotesVM
    private val _listNotes = MutableStateFlow(emptyList<Double>())
    //Liste StateFlow NON mutable utilisable par l'UI -> ListNotesPage
    val listNotes : StateFlow<List<Double>> =_listNotes;

    /***A l'initialisation de ListNotesVM (après l'appel du constructeur)
    On définit la valeur de liste de Notes (ceci va déclencher un changement
    d'état UI)**/
    init{
        _listNotes.value = listOf(
            12.0,23.1,20.0,12.5,
            12.0,23.1,20.0,12.5,
            12.0,23.1,20.0,12.5,
            12.0,23.1,20.0,12.5,
        )
    }
    fun addNote(note:Double) {
        _listNotes.value = _listNotes.value+note
    }
}