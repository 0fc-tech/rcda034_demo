package com.example.mod2demovariable

var test = "Hello World"

fun main() {
    //Portée variable
    println("Coucou $test")

    //VAL VAR
    val valeurNonChangeable = "JeNePeuxPasModifier 😒😒"
    //pas de changement possible
    // valeurNonChangeable = "Et bah moi je veux changer 😫😫😤😤😤"

    var valeurChangeable = "Je peux être changé 😛☺"
    valeurChangeable = "Ouah c'est génial c'est changeable"

    //By Lazy
    var mot = "World !"
    val message by lazy { "Hello $mot" }
    mot = "MonPrénom"
    println(message)

    //Nullable
    //var variableNonNullable : String = null
    var variableNullable : String? = null
    println("La taille de ma variable nullable est ${variableNullable?.length ?: 0}")

}





