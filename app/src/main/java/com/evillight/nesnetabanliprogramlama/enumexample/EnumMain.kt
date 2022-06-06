package com.evillight.nesnetabanliprogramlama.oop2

import com.evillight.nesnetabanliprogramlama.enumexample.KonserveBoyut

fun main(){
    fun ucretAl(boyut: KonserveBoyut){

        when(boyut){
            KonserveBoyut.kucuk-> println(20*30)
            KonserveBoyut.orta-> println(30*30)
            KonserveBoyut.buyuk-> println(40*30)
        }

    }
    ucretAl(KonserveBoyut.kucuk)
    ucretAl(KonserveBoyut.buyuk)
    ucretAl(KonserveBoyut.orta)
}