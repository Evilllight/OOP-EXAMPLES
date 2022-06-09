package com.evillight.nesnetabanliprogramlama.collections

fun main(){

    val meyveler=ArrayList<String>()

    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    println(meyveler.isEmpty())
    println(meyveler.count())
    println(meyveler.size)
    println(meyveler.first())
    println(meyveler.last())
    println(meyveler.contains("Kiraz"))
    println(meyveler.minOrNull())
    println(meyveler.maxOrNull())

    meyveler.sort()
    println(meyveler)

    meyveler.reverse()
    println(meyveler)

    meyveler.removeAt(3)
    println(meyveler)

    meyveler.remove("Kivi")
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}