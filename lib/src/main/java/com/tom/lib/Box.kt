package com.tom.lib

class Box(var length:Int,var winth:Int ,var height:Int) {

   fun test(){
           if(length <= 10 && winth <=10 && height<=10 ){
                println("箱子１")
            }else if(length <= 10 && winth <=10 && height<=15){
               println("箱子2")
           }else{
               println("箱子3")
           }

   }
}

fun main() {
    var person1 = Box(10,10,15).test()

}