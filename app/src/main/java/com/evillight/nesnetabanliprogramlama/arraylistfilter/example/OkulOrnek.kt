package com.evillight.nesnetabanliprogramlama.arraylistfilter.example

import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val girdi=Scanner(System.`in`)

    var sayac=1
    val ogrenciler=ArrayList<Ogrenci>()
    while (true){
        println("Öğrenci adını giriniz")
        val ad=girdi.next()
        println("Öğrenci sınıfını giriniz")
        val sinif=girdi.next()
        val yeniOgrenci=Ogrenci(sayac,ad,sinif)
        sayac += 1
        ogrenciler.add(yeniOgrenci)
        println("Çıkmak için 1 -- Devam etmek için diğer sayilar")
        val cikis=girdi.nextInt()

        if (cikis==1){
            for (ogrenci in ogrenciler){
                println("********")
                println("Öğrenci No: ${ogrenci.no}")
                println("Öğrencinin Adı :${ogrenci.ad}")
                println("Öğrencinin Sınıfı :${ogrenci.sinif}")
            }
            println("Çıkış yapıldı")
            break
        }
    }
}