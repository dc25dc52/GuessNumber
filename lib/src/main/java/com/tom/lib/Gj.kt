package com.tom.lib

class Gj (name :String, english :Int,math :Int)
                    :Student(name,english,math,10){

    constructor(name: String):this(name,20,10)
    constructor():this("",0,0)
}

fun main() {
    var jenny = Gj("qqq",10,20)
    jenny.print()
}
