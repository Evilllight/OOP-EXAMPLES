package com.evillight.nesnetabanliprogramlama.homework

class Odev7 {
    //Parametre	olarak	girilen	kota	miktarına	göre	ücreti	hesaplayarak	geri	döndüren	 metodu	yazınız. •
    // 50GB	100	TL
    //• Kota	aşımından	sonra	her	1GB	4	TL
    fun KotaHesap(kota:Int):Int{

        var ucret=0
        if (kota>50){
            val fazlakota=kota-50
            ucret=100+(fazlakota*4)
            println("Harcanan kota $kota")
            println(ucret)
        }else{
            ucret=100
            println("Harcanan kota $kota")
            println(ucret)
        }
        return ucret
    }
}