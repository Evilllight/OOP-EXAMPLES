package com.evillight.nesnetabanliprogramlama.oop

class Araba(var renk:String,var hiz:Int,var calisiyormu:Boolean) {
    fun BigiAl(){
        println("Renk : $renk, Hız : $hiz, Çalışıyor mu : $calisiyormu")
    }
    fun calistir(){
        calisiyormu=true
        hiz=19
    }
    fun durdur(){
        calisiyormu=false
        hiz=0
    }
    fun hizlan(KM:Int){
        hiz=hiz+KM
    }
    fun yavasla(KM: Int){
        hiz=hiz-KM
    }
}