package com.example.mod4di

import com.example.mod4di.data.repository.PokemonRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

//Ici on retrouve toutes les fonctions qui retournent les classes à Injecter
//Exemple le "RepositoryPokemon" ou la "DaoPokemon"
//@InstallIn(DiApplication::class)
//@InstallIn(ApplicationComponent::class)
@Module
@InstallIn(SingletonComponent::class)
object HiltModule {
    @Provides
    fun providePokemonRepository() = PokemonRepository()
}