package com.evillight.nesnetabanliprogramlama.interfaceExample

open class Elma:Eatable,Squeezable {
    override fun howtoEat() {
        println("Dilimle ve Ye")
    }

    override fun howtoSqueeze() {
         println("Blender ile sık")
    }
}