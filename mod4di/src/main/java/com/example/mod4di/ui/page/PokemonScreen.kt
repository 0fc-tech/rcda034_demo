package com.example.mod4di.ui.page

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mod4di.vm.PokemonViewModel

@Composable
fun PokemonScreen(
    modifier: Modifier = Modifier,
    vm : PokemonViewModel = viewModel()
) {
    val pokemonList by vm.pokemons.collectAsState()
    LazyColumn {
        items(pokemonList){
            Text(it)
        }
    }
}