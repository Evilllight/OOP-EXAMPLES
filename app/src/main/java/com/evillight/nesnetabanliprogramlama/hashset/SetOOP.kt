package com.evillight.nesnetabanliprogramlama.hashset

fun main(){
    val o1=Ogrenci3(1,"Ahmet","11F")
    val o2=Ogrenci3(2,"Zeynep","11A")
    val o3=Ogrenci3(3,"Dilla","11B")
    val o4=Ogrenci3(4,"Mustafa","11C")
    val o5=Ogrenci3(1,"Veli","11D")

    val ogreciler=HashSet<Ogrenci3>()
    ogreciler.add(o1)
    ogreciler.add(o2)
    ogreciler.add(o3)
    ogreciler.add(o4)
    ogreciler.add(o5)
    for (i in ogreciler){
        println("****")
        println(i.no)
        println(i.ad)
        println(i.sinif)
    }
}