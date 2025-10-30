package com.example.mod4di.data.repository

class PokemonRepository {
    private val _pokemons = listOf(
        "Pikachu","Dracofeu", "Bulbizarre","Rondoudou", "Tortank",
        "Salamèche", "Carapuce", "Chenipan", "Aspicot", "Roucool",
        "Rattata", "Abo", "Raichu", "Sabelette", "Nidoran♀",
        "Nidoran♂", "Mélofée", "Goupix", "Nosferapti", "Mystherbe",
        "Paras", "Mimitoss", "Taupiqueur", "Miaouss", "Psykokwak",
        "Férosinge", "Caninos", "Ptitard", "Abra", "Machoc",
        "Chétiflor", "Racaillou", "Ponyta", "Ramoloss", "Magnéti",
        "Doduo", "Otaria", "Tadmorv", "Kokiyas", "Fantominus",
    )

    fun getPokemons() = _pokemons
//
//    fun getPokemons() :List<String>{
//      return _pokemons;
//    }
}