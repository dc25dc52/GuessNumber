package com.tom.lib

fun main() {
    var p = Student("bbb",222,333,33)
    p.print()
}

open class Student (
    var name:String,
    var age :Int,
    var english:Int ,
    var math :Int
    ) {
//constructor(name: String):this(name,english,age,math){
//
//}
    fun print(){
        println(name + age)
    }
    fun avg() : Int{
        return (age+english)
    }
    fun grading() =when(avg()/10){
            8 -> 'B'
            7 -> 'C'
            6 -> 'D'
            else -> 'F'
    }
}