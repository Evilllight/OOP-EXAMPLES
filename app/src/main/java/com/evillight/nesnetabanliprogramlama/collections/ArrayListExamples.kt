package com.evillight.nesnetabanliprogramlama.collections

fun main(){
    val meyveler=ArrayList<String>()

    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    println(meyveler)

    val str=meyveler.get(2)
    println(str)

    val str1=meyveler[4]
    println(str1)

    meyveler.add("Mandalina")
    println(meyveler)

    meyveler[2]="Ananas"
    println(meyveler)

    meyveler.add(3,"Portakal")
    println(meyveler)
}