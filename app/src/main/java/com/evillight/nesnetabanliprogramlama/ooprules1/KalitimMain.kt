package com.evillight.nesnetabanliprogramlama.ooprules1

fun main(){
    val araba=Araba("Beyaz","Manuel","Sedan")

    println(araba.kasaTipi)
    println(araba.renk)
    println(araba.vites)

    val nissan=Nissan("Micra","Kırmızı","otomatik","Sedan")
    println(nissan.model)
    println(nissan.renk)
    println(nissan.vites)
    println(nissan.kasaTipi)
}