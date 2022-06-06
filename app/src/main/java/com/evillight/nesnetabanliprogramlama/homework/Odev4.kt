package com.evillight.nesnetabanliprogramlama.homework

class Odev4 {
    //Parametre	olarak	girilen	kelime	ve	harf	için	harfin	kelime	içinde	kaç
    //adet	olduğunu	gösteren	bir	metod yazınız.

    fun kelimebul(kelime:String,harf:Char){

        var sonuc=0

        for (k in kelime){
           if (k==harf){
               sonuc+=1
           }
        }
        println(sonuc)
    }
}