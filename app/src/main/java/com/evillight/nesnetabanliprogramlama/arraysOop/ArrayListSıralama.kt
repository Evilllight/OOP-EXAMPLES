package com.evillight.nesnetabanliprogramlama.arraysOop

import com.evillight.nesnetabanliprogramlama.compositon.Kisiler1
import com.evillight.nesnetabanliprogramlama.oop2.Kisiler

fun main(){

    val k1=Kisiler2(1,"Ahmet")
    val k2=Kisiler2(2,"Dilla")
    val k3=Kisiler2(3,"Mustafa")

    val kisilerArraylist=ArrayList<Kisiler2>()

    kisilerArraylist.add(k1)
    kisilerArraylist.add(k2)
    kisilerArraylist.add(k3)

    println("Önce")
    for (k in kisilerArraylist){
        println("${k.kisiNo},${k.kisiAd}")
    }
    println("Sayısal Küçükten Büyüğe")

    val siralamaArrayList=kisilerArraylist.sortedWith(compareBy { it.kisiNo })

    for (k in siralamaArrayList){
        println("${k.kisiNo},${k.kisiAd}")
    }
    println("Sayısal Büyükten Küçüğe")

    val siralamaArrayList2=kisilerArraylist.sortedWith(compareByDescending { it.kisiNo })

    for (k in siralamaArrayList2){
        println("${k.kisiNo},${k.kisiAd}")

    }

    println("Harfsel Küçükten Büyüğe")

    val siralamaArrayList3=kisilerArraylist.sortedWith(compareByDescending { it.kisiAd })

    for (k in siralamaArrayList3){
        println("${k.kisiNo},${k.kisiAd}")
    }

}