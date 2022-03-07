package com.tom.guessnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tom.guessnumber.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    //觸發按鈕
    var num = (1..100).random()
    var count = 0
    fun Guess(view: View){
        count++
        if(count >= 5){
            println("次數已到 重新一局")
            binding.textView2.text = "次數已到 重新一局"
            count = 0
            num = (1..100).random()
        }
        println("a: $num , $count")
        var go = binding.TV01.text.toString().toInt()
        if(go>num){
            println("請猜小一點")
            binding.textView2.text = "請猜小一點"
        }else if(go<num){
            println("請猜大一點")
            binding.textView2.text = "請猜大一點"
        }else{
            println("答對")
            binding.textView2.text = "答對"
            //猜對重新一局
            num = (1..100).random()
        }

    }



}


