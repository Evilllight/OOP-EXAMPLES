package com.evillight.nesnetabanliprogramlama.hashset

fun main(){
    val sayilar= mapOf<Int,String>(1 to "Bir",2 to "Iki")

    val oranlar= mutableMapOf<Double,String>(1.5 to "Oran1",2.7 to "Oran2")

    val iller=HashMap<Int,String>()

    iller.put(41,"Kocaeli")
    iller[34] = "İstanbul"
    println(iller.toString())

    iller[41]="YKocaeli"
    println(iller.toString())

    println(iller[41])
    //println(iller.get(41))

    println(iller.size)
    println(iller.count())

    println(iller.isEmpty())
    println(iller.containsValue("İstanbul"))
    println(iller.containsKey(41))

    for ((key,value) in iller){
        println("$key -- $value")
    }

    iller.remove(34)
    println(iller.toString())

    iller.clear()
    println(iller.toString())
}