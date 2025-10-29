package com.example.mod2functions

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

fun startVehicle() : Boolean{
    val motorSpeed = 0
    val soCVehicle = 2
    if(soCVehicle > 2){
        return true
    }
    return false
}
fun LocalDateTime.showDateTimeInFrench(): String {
    //Création format conversionde date pour
    val formatter = DateTimeFormatter.ofPattern(
        "'le' d MMMM 'à' HH'h'mm", Locale.FRENCH)
    // Formatage du LocalDateTime avec le format donnée
     return this.format(formatter)
}

fun main() {
    val vehicleCanStart = startVehicle()
    println("Le véhicule peut démarrer : $vehicleCanStart")
    println(LocalDateTime.now().showDateTimeInFrench())
}






