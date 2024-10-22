package com.example.kotlinbasics

//
// open allows another claasses to inherit

//open -> implementation,
// abstract must be implemented ins ubclass
abstract class GeneralRobot ():RobotActions {
    //Visibility modifier public,
//internal : one module/package
    //protected : subclasses
    //global variables
    var name:String
    var modelYear:String = ""

    //abstract fun start()
        internal var serialNumber: String = "12345"
        //getter
    get(){
        println("Getting the Name.Please wait")
        return field
    }

//    Setter
set(value) {
    println("Changing...")
    if (value.equals(2025)) {
        println("You cannot")
    }else{
        field=value
    }

}
    //automatically when you initialise
    init{
        //using Strings needs to initialize
        name =""
       modelYear
        println("A new robot is created")
    }
    fun walk(){
        println("the Robot is walking Now")
    }
    fun speak(message: String){
        println("$name says: $message")
    }

    //Primary constructor
    constructor(name:String,modelYear:String):this(){
        this.name =name
        this.modelYear = modelYear
    }
    //Secondary constructor
        constructor(name:String):this(){
            this.name=name
            this.modelYear="Undefined modelYear"
        }

}