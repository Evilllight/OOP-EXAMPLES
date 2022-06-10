package com.evillight.nesnetabanliprogramlama.arrayswithoop

fun main(){
    val u1=Urun(1,"Saat",150.0)
    val u2=Urun(2,"Televizyon",1750.0)
    val u3=Urun(3,"Bilgisayar",960.0)

    val urunler=ArrayList<Urun>()
    urunler.add(u1)
    urunler.add(u2)
    urunler.add(u3)

    for (urun in urunler){
        println("Ürün no :${urun.urunNo}")
        println("Ürün adı :${urun.urunAd}")
        println("Ürün fiyat :${urun.urunFiyat }")
    }
}