package com.example.kotlinbasics

fun main() {
    val robot1 :Robot = Robot("Buddy")

    val ordinaryRobot = OrdinaryRobot("Brazz")
    ordinaryRobot.walk()

    val superRobot = SuperRobot("Suppi")
    superRobot.cleanHouse()

    val firingRobot = FiringRobot("hero")
    val firingRobot2 = FiringRobot("HHero","2023")
    firingRobot.fire()
    println(firingRobot2.modelYear)

    robot1.walk()
    robot1.speak("HI")
    // polimorf -> type general, amugy meg ordinary
    val generalRobot:GeneralRobot = OrdinaryRobot("Rob")
generalRobot.walk()


    //this line will print
    println("Hello Kotlin Developers")

    /*A varoiable is a named


     */
// Mutable variable
    var mayAge: Int = 25

    //Immutable Variable
    val pi: Double = 3.14

    println("May Age is :" + mayAge)

    /* kotlin provides several integer data types


     */

    val myByte: Byte = 127

    val short: Short = 32767

    val myInt: Int = 2000000000

    val myLong: Long = 9000000000000000000

    val myFloat: Float = 3.1411111f

    val myDouble: Double = 2.754456456111111

    var isRaining: Boolean = true

    if (isRaining) {
        println("it is raining")
    }

    //default default deja default default

    //Characters:represent single
//0-255
    val myChar: Char = '\n'

    //logical ! || &&
    //aroithmetic operator + - * % modulus /

    val result: Int = 7 % 3
    println("The result = $result")
    //assignment operator
    //relational operators

    // String Declaration
    val text1: String = "Hello My Friends"
    val text2: String = "Welcome Back"

    val text3 = text1 + text2

    val Name = "Jack"
    val age = 30
    //val info =

    var x = 5
    val result2 = " the resulte is ${age + x}"
    println(result2)

    val length = result2.length
    val subText = result2.substring(0, 7)
    println(" the substring is $subText")

    val str1 = "Hello"
    val comparisonResult = str1.equals(subText)

    // String literals
    val newLine = "this is first \n second"

    //if else
    val score = 85
    if (score < 80) {
        println(true)
    } else {
        println("false")
    }
    //when
    val day = 3
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        else -> println("other")
    }

    isRaining = true
    val isCold = false

    if (isRaining) {
        if (isCold) {
            println("Use Umbrella and Coat")
        } else {
            println("Umrella")
        }
    } else {
        println("No need for umbrella")
    }
    //for Loop _defoned steartong and endong points
    for (i in 1..5) {
        println(i)
    }
    //while
    var count = 0
    while (count < 5) {
        println("count: $count")
        count++
    }
//do-while loop : it guarantee that the loop body is executed

    x = 1
    do {
        println("at once")
    } while (x > 3)

//break
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }
    for (i in 1..10) {
        if ((i % 2) == 0) {
            continue
        }
        println(i)
    }
//Array : is a collection of elements of same data type
    val osNames = arrayOf("Windows", "Android", "MacOs", "Linux")

//Accessing Elementes
    val firstElement = osNames[0]
//Modify
    osNames[1] = "IOs"
    println(osNames[1])
//Size
    val size = osNames.size
    println("Size: $size")
//iterating
    for (name in osNames) {
        println(name)
    }
    osNames.forEach { name -> println(name) }

    //sum,avg,sort

    //Range :interval between 2 values
    // Closed range
    val range = 1..5

    //half open range
    val halfRange = 1 until 5

    for (i in halfRange) {
        println(i)
    }
// 450.content
//
// functions : are blocks of Code that encapsulate a specific
    //task or functionality

    /* fun functionName(par1:Type,par2:Type):ReturnType{

    }*/
    sayHello("Jack")
}

class Robot(val name: String) {
    fun walk(){
        println("the Robot is walking Now")
    }
    fun speak(message: String){
        println("$name says: $message")
    }

}

fun sayHello(name:String,age:String = "Not Specified"){
        println("Hello $name,your age is $age")
    }
//void -> :Unit / ""
fun sumTwonumbers (x:Int,y:Int):Int{
var z = x + y
return z
}

//overloading, ua a nev, paramok kulonboznek

fun sumTwoNumbers (x:Double,y :Double):Double {
    var z = x + x
    return z
}