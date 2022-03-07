package com.tom.lib

fun main() {
    for(i in 1..9 ){
        for(y in 1..9){

            println("$i * $y = " + "${if(i*y < 10) " " else ""}" +i*y +" " )

        }
    }
}
