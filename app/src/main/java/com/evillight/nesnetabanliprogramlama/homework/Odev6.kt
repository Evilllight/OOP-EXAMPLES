package com.evillight.nesnetabanliprogramlama.homework

class Odev6 {
    //Parametre	olarak	girilen	gün	sayısına	göre	maaş	hesabı	yapan	ve	elde	edilen	 değeri	geri	döndüren	metod yazınız.
    //1	Günde	8	saat	çalışılabilir.
    //Çalışma	saat	ücreti	:	10	tl
    //Mesai	saat	ücreti	:	20tl
    //160	saat	üzeri	mesai	sayılır.
    fun maashesap(gunsayisi:Int):Int{
        val saat=gunsayisi*8

        println("Çalışma saati $saat")

        var maas=0

        if (saat>160){

           val fazlamesai=saat-160
            maas=10*160+fazlamesai*20
        }
        else{
            maas=10*saat
        }
        return maas
    }
}