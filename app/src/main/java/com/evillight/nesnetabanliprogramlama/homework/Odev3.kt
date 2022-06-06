package com.evillight.nesnetabanliprogramlama.homework

class Odev3 {
    //Parametre	olarak	girilen	sayının	faktoriyel değerini	hesaplayıp	geri
    //döndüren	metodu	yazınız.

    fun faktoriyelHesap(sayi:Int):Int{
        var sonuc=1
        for(i in 1..sayi){
            sonuc*=i
        }
        return sonuc
    }
}