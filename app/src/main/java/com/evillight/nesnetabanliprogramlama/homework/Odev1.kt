package com.evillight.nesnetabanliprogramlama.homework

class Odev1 {
    // Parametre	olarak	girilen	dereceyi	fahrenhiet’a dönüştürdükten
    //sonra	geri	döndüren	bir	metod yazınız.	T(°F) = T(°C) × 1.8	+	32

    fun donustur(derece:Double):Double{
        val fahrenhiet=derece*1.8+32
        return fahrenhiet
    }
}