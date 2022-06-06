package com.evillight.nesnetabanliprogramlama.compositionOrnek

fun main(){
    val k1=Kategoriler(1,"Dram")
    //val k2=Kategoriler(2,"Komedi")
    val y1=Yonetmenler(1,"Mustafa")
   // val y2=Yonetmenler(2,"Dilla")
    val f1=Filmler(1,"Test",1990,k1,y1)
    //val f2=Filmler(2,"Deneme",2000,k2,y2)

    println("Film id ${f1.film_id}")
    println("Film ad ${f1.film_Ad}")
    println("Film yıl ${f1.film_yil}")
    println("Film kategori id ${f1.kategori.kategori_id}")
    println("Film kategori ad ${f1.kategori.kategori_ad}")
    println("Film yönetmen id ${f1.yonetmen.yonetmen_id}")
    println("Film yönetmen ad ${f1.yonetmen.yonetmen_ad}")

}