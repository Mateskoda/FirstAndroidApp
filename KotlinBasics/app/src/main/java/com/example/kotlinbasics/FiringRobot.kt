package com.example.kotlinbasics

import java.time.Year

//class FiringRobot( name :String):GeneralRobot(name) {
class FiringRobot:GeneralRobot {
    constructor(name:String,modelYear: String):super(name,modelYear)
    constructor(name:String):super(name)
    fun fire(){
        println("Fire")
    }

    override fun start() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }
}