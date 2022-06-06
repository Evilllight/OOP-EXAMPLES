package com.evillight.nesnetabanliprogramlama.interfaceExample

fun main(){

    val aslan=Aslan()
    val amasyaElmasi:Elma=AmasyaElmasi()
    val elma=Elma()
    val tavuk:Eatable=Tavuk()

    val nesneler= arrayOf(aslan,amasyaElmasi,elma,tavuk)

    for(nesne in nesneler){
        if (nesne is Eatable){
            nesne.howtoEat()
        }
        if (nesne is Squeezable){
            nesne.howtoSqueeze()
        }
        if (nesne !is Eatable&& nesne !is Squeezable){
            println("Yenilemez ve ya sıkılamaz")
        }
    }
}