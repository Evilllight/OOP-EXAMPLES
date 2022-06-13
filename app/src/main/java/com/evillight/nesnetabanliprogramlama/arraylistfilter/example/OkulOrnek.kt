package com.evillight.nesnetabanliprogramlama.arraylistfilter.example

import java.util.*

fun main(){
    val girdi=Scanner(System.`in`)

    var sayac=1
    while (true){
        println("Öğrenci adını giriniz")
        val ad=girdi.next()
        println("Öğrenci sınıfını giriniz")
        val sinif=girdi.next()
        val yeniOgrenci=Ogrenci(1,"Ahmet","11F")
        sayac += 1
        println("Çıkmak için 1 -- Devam etmek için diğer sayilar")
        val cikis=girdi.nextInt()

        if (cikis==1){
            println("Çıkış yapıldı")
            break
        }
    }
}