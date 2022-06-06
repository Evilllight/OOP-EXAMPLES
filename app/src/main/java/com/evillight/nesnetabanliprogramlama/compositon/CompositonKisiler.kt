package com.evillight.nesnetabanliprogramlama.compositon

fun main(){
    val adres=Adres("Kocaeli","izmit")
    val kisi=Kisiler1("ahmet",18, adres)

    println("Kişi ad : ${kisi.ad}")
    println("Kişi yaş : ${kisi.yas}")
    println("Kişi il: ${kisi.adres.il}")
    println("Kişi ilce: ${kisi.adres.ilce}")
}
