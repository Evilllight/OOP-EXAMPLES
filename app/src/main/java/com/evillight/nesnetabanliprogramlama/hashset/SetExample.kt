package com.evillight.nesnetabanliprogramlama.hashset

fun main(){
    val meyveler= setOf<String>("Elma","Kiraz","Kivi")
    val iller= mutableSetOf<String>("as","asd","er")
    val sayilar=HashSet<Int>()

    sayilar.add(100)
    sayilar.add(58)
    sayilar.add(29)
    sayilar.add(124)
    sayilar.add(235)
    println(sayilar.toString())
    println(sayilar)

    println(sayilar.elementAt(1))

    println(sayilar.size)

    println(sayilar.count())

    println(sayilar.isEmpty())

    println(sayilar.contains(124))

    for (s in sayilar){
        println(s)
    }
    for ((i,s) in sayilar.withIndex()){
        println("$i. --- $s")
    }
    sayilar.remove(235)
    println(sayilar)

    sayilar.clear()
    println(sayilar.toString())
}