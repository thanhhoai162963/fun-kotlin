package com.example.packageimportkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        normal()
        void()
        return1(1)
        nothing("bad")
        unlimeted(1,2,3,4)
        NameParameter(name = "t1", age = 12)
        DefaultParameter()
    }
    fun normal () = println("123")
    fun void(): Unit = println("123")
    fun return1(so1: Int): Int = so1
    fun nothing (msg: String): Nothing{
        throw Exception(msg)
    }
    fun unlimeted (vararg ints: Int): IntArray {
        return ints
    }
    fun NameParameter (name: String, age: Int){
        print(name)
    }
    fun DefaultParameter (name: String = "thanh", age: Int= 20){
        print(name)
    }
}
