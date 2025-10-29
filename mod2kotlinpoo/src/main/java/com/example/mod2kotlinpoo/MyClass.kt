package com.example.mod2kotlinpoo

class Travail(
    val intitulePoste: String,
    var salaireAnnuel: Int,
    var isCadre: Boolean,
    var ville: String?
)

//fun main() {
//    val developpeurNantais = Travail("Développeur", 34000, true, "Nantes")
//    val designerTeleTravail = Travail("Designer", 44000, true, null)
//    val dirigeantESN = Travail("PDG", 74000, true, "Paris")
//}

class AppareilBluetooth(
    val macAdress: String
) {
    fun connecter() {

    }
}


open class Cle() {
    open fun ouvrirPorte() {
        println("ouverture de porte")
    }

    fun fermerPorte() {
        println("fermerture de porte")
    }
}

class CleVoiture() : Cle() {
    override fun ouvrirPorte() {
        println("ouverture de toutes les portes")
    }

    fun ouvertueCoffre() {
        println("ouverture coffre uniquement")
    }
}

interface Mangeable {
    fun manger() {
        println("Miam")
    }
}

class Pain(val type: String) : Mangeable {
    //override fun manger() {
    //    super.manger()
    //    println ("C'est super bon")
    //}
}

fun main() {
    val pain = Pain("Complet")
    pain.manger()
}