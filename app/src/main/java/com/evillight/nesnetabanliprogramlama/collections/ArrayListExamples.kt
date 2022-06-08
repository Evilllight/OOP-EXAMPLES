package com.evillight.nesnetabanliprogramlama.collections

fun main(){
    val liste=ArrayList<String>()
    val liste2=ArrayList<Int>()
    val meyveler=ArrayList<String>()

    meyveler.add("çilek")
    meyveler.add("muz")
    meyveler.add("elma")
    meyveler.add("kivi")
    meyveler.add("kiraz")

    println(meyveler)

    val str=meyveler.get(2)
    println(str)
    val str1=meyveler[4]
    println(str1)
}