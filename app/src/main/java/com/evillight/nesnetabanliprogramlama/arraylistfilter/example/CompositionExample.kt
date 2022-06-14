package com.evillight.nesnetabanliprogramlama.arraylistfilter.example

import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val girdi=Scanner(System.`in`)
    val personeller=ArrayList<Personel>()

    for (i in 1..5){
        println("$i. Personelin Adı:")
        val isim=girdi.next()
        println("$i. Personelin İli:")
        val il=girdi.next()
        println("$i. Personelin İlçesi")
        val ilce=girdi.next()
        val adres=Adres(il,ilce)
        val personel=Personel(i,isim,adres)
        personeller.add(personel)
    }
    for (i in personeller){
        println("****")
        println("Personel No: ${i.no}")
        println("Personel No: ${i.isim}")
        println("Personel No: ${i.adres.il}")
        println("Personel No: ${i.adres.ilce}")
    }
}