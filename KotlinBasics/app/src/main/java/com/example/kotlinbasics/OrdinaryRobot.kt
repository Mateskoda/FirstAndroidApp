package com.example.kotlinbasics

import java.time.Year

class OrdinaryRobot:GeneralRobot {
    constructor(name:String,modelYear: String):super(name,modelYear)
    constructor(name:String):super(name)
    fun turnOnLight(){
        println("the light is turned On")
    }

    override fun start() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }


}