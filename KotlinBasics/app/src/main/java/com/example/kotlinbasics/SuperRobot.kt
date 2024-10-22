package com.example.kotlinbasics

import java.time.Year

class SuperRobot: GeneralRobot {
constructor(name:String,modelYear: String):super(name,modelYear)
constructor(name:String):super(name)
    fun cleanHouse(){
        println("Cleaned")
    }

    override fun start() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }
}