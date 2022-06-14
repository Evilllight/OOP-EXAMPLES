package com.evillight.nesnetabanliprogramlama.hashset

class Ogrenci3(var no:Int,var ad:String,var sinif:String) {
    override fun hashCode(): Int {
        return this.no
    }

    override fun equals(other: Any?): Boolean {
        return this.no==(other as Ogrenci3).no
    }
}