package com.evillight.nesnetabanliprogramlama.arraylistfilter.example

fun main(){

    val sayilar=ArrayList<Int>()

    sayilar.add(1)
    sayilar.add(2)
    sayilar.add(3)
    sayilar.add(4)
    sayilar.add(5)
    sayilar.add(6)

    for ((indeks,sayi) in sayilar.withIndex()){
        val sonuc=sayi*2
        sayilar[indeks]=sonuc

    }
    for( s in sayilar){
    println(s)
    }
}