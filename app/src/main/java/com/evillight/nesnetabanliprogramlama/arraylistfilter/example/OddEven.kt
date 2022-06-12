package com.evillight.nesnetabanliprogramlama.arraylistfilter.example

fun main(){
    val sayilar=ArrayList<Int>()
    sayilar.add(50)
    sayilar.add(11)
    sayilar.add(23)
    sayilar.add(74)
    sayilar.add(87)
    sayilar.add(94)

    val odd=ArrayList<Int>()
    val even=ArrayList<Int>()

    for (s in sayilar){
        val sonuc=s%2

        if (sonuc==0){
            even.add(s)
        }else{
            odd.add(s)
        }

    }
    //println("$odd - $even")
    println("ODD")
    for (t in odd){
        println(t)
    }
    println("EVEN")
    for (t in even){
        println(t)
    }
}