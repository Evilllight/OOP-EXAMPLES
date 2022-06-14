package com.evillight.nesnetabanliprogramlama.arraylistfilter.example

import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val girdi=Scanner(System.`in`)

    val dersNotlar=ArrayList<Karne>()


    while (true){
        println("Ders Giriniz")
        val ders=girdi.next()
        println("Not Giriniz")
        val not=girdi.nextInt()

        val yeniNot=Karne(ders,not)
        dersNotlar.add(yeniNot)
        println("Çıkmak için 1 e basınız, Devam etmek için diğer sayılar")
        val cikis=girdi.nextInt()
        if (cikis==1){
            var toplam=0
            for (s in dersNotlar){
                println("${s.ders}:${s.not}")
                toplam+=not
            }
            val ortalama=toplam/dersNotlar.size
            println("Ortalama $ortalama")
            if(ortalama>=50){
                println("Geçtiniz")
            }else{
                println("Kaldınız")
            }


            println("Çıkış yapıldı")
            break
        }
    }
}