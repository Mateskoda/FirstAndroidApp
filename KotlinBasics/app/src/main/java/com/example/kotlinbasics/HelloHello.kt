package com.example.kotlinbasics

fun main(){
    //this line will print
    println("Hello Kotlin Developers")

    /*A varoiable is a named


     */
// Mutable variable
    var mayAge :Int =25

    //Immutable Variable
    val pi : Double = 3.14

    println("May Age is :" +mayAge)

    /* kotlin provides several integer data types


     */

    val myByte :Byte = 127

    val short:Short = 32767

    val myInt: Int = 2000000000

    val myLong:Long = 9000000000000000000

    val myFloat: Float = 3.1411111f

    val myDouble : Double = 2.754456456111111

    val isRaining : Boolean = true

    if (isRaining){
        println("it is raining")
    }

    //default default deja default default

    //Characters:represent single
//0-255
    val myChar : Char = '\n'

    //logical ! || &&
    //aroithmetic operator + - * % modulus /

    val result : Int = 7%3
    println("The result =" + result)
    //assignment operator
    //relational operators

    // String Declaration
    val text1 : String = "Hello My Friends"
    val text2 : String = "Welcome Back"

    val text3 = text1+ text2

    val Name = "Jack"
    val age =30
    //val info =

    val x = 5
    val result2 = " the resulte is ${age +x}"
    println(result2)

    val length = result2.length
    val subText = result2.substring(0,7)
    println(" the substring is $subText")

val str1 = "Hello"
    val comparisonResult = str1.equals(subText)

    // String literals
    val newLine = "this is first \n second"

}