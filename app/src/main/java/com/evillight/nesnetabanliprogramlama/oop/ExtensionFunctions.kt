package com.evillight.nesnetabanliprogramlama.oop

fun main(){

    fun Int.carpi(sayi:Int):Int{
        return this*sayi
    }
    infix fun Int.topla(sayi:Int):Int{
        return this+sayi
    }
    val sonuc=5.carpi(2)
    val sonuc2=5 topla 6
    println(sonuc)
    println(sonuc2)
}