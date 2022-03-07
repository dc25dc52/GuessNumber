package com.tom.lib

import kotlin.random.Random

//fun main() {
//    var max = 100
//    var min = 1
//    val ran = Random.nextInt(max)+1
//    println("作弊數字 $ran")
//    var number = 0
//    while (number != ran){
//    println("輸入在$min 到 $max 之間")
//        number = readLine()!!.toInt()
//        if(number<ran){
//            min = number
//        }else if(number>ran){
//            max = number
//        }else{
//            println("yes")
//        }
//    }
//}
fun main() {
    var max = 100
    var min = 1
    val ran = Random.nextInt(max)+1
    println("作弊數字 $ran")
    var number = 0
    var temp = 0
    var count = 0;
    while (number != ran){
        if(count ==3){
            println("end")
            break;
        }
        count++
        println("輸入在$min 到 $max 之間")
        number = readLine()!!.toInt()
        if(number<ran){
            min = number
        }else if(number>ran){
            max = number
        }else{
            println("yes")
        }
    }
}
class Guess {
}