package com.evillight.nesnetabanliprogramlama.arraylistfilter.example

import kotlin.random.Random

fun main(){
    val sayilar=ArrayList<Int>()
    for (i in 1..100){
        val randomNumber= Random.nextInt(1,101)
        sayilar.add(randomNumber)
    }
    sayilar.sort()

    for (s in sayilar){
        println(s)
    }
}