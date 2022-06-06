package com.evillight.nesnetabanliprogramlama.polymorphismexample

class Mudur:Personel() {

    fun iseAl(p:Personel){
        p.iseAlindi()
    }

    fun terfiEttir(p:Personel){
        if (p is Ogretmen) {
            p.maasArttir()
        }
        if (p is Isci){
            println("İşçiye Terfi yok")
        }
    }
}