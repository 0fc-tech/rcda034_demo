package com.example.mod2conditionsboucle

fun main() {
    //If Else
    val customerLivingFrance = true
    val customerLivingNl = false
    val shippingCost = if(customerLivingFrance)
        5
    else if(customerLivingNl)
        8
    else 78

    //When
    val idCategory = 9832
    val mainCategory = when(idCategory){
        in 1..1000 -> "Alimentaire"
        in 1001..4500 -> "Culture"
        else -> "Santé"
    }

    //for loop
    val listClients = listOf("John Doe","Peter Parker", "Harry Potter", "Tony Stark")
    for (client in listClients){
        print("La bienvenue à toi $client")
    }

    for(j in 10 downTo 1 step 2){
        println(j)
    }
    val generatorList = List(1000){ index->
        "Item numéro $index"
    }

    val generatorList2 = List(1000, { index-> "Item numéro $index" })
}







