package com.evillight.nesnetabanliprogramlama.arraylistfilter.example

import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val girdi=Scanner(System.`in`)

    val isimler=ArrayList<String>()
    isimler.add("Ahmet")
    isimler.add("Mehmet")
    isimler.add("Zeynep")
    isimler.add("Aysel")
    isimler.add("Mustafa")

    println("Aratmak için isim giriniz")
    val isim=girdi.next()

    for (i in isimler)
    {
            if (i==isim){
                println("İsim Mevcut : $isim")
                break
            }else{
                println("İsim listede mevcut değil")
            }
    }
}