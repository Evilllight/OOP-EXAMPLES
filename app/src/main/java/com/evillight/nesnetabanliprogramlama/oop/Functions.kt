package com.evillight.nesnetabanliprogramlama.oop

fun main() {
    fun selamla(){
        val sonuc="Merhaba Ahmet"
        println(sonuc)
    }
    selamla()

    fun selamla1():String{
        val sonuc="Merhaba"
        return sonuc
    }
    val gelenSonuc=selamla1()
    println(gelenSonuc)

    fun selamla2(isim:String){
        val sonuc="Merhaba $isim"
        println(sonuc)
    }
    selamla2("asd")

    fun toplama(){
        val toplam=30+40
        println("Toplama =$toplam")
    }
    toplama()

    fun toplama1():Int{
        val toplam=50+55
        return toplam
    }
    val t1=toplama1()
    println("t1 : $t1")

    fun toplama2(sayi1:Int,sayi2:Int):Int{
        val topla=sayi1+sayi2
        return topla
    }
    val t2=toplama2(15,20)
    println("t2:$t2")
}