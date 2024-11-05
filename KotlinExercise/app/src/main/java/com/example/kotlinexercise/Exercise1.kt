package com.example.kotlinexercise

import java.util.List
import java.util.Scanner
import kotlin.collections.ArrayList as ArrayList1
import kotlin.collections.List as List1

fun main() {
    print(reverseString())
}
fun calculation(){
    var s1 = Scanner(System.`in`)
    print("olease enter a number")

    var x = s1.nextInt()
    print("please enter the second number")
    var y = s1.nextInt()

    var div_result = x/y
    var mainder = x%y

    print ("The result =  $div_result and the remainder is $mainder")

}

fun getRadious(){

    var scanner1 = Scanner(System.`in`)

    print("Please enter the radius")
    var r1 = scanner1.nextInt()

    var area = 3.1415*r1*r1
var peri = 2*3.1415*r1

print("The area is $area and the perimeter is $peri")

}

fun swipe(){
    var scanner2 = Scanner(System.`in`)
    print("Enter 2 numbers")
    var a = scanner2.nextInt()
    var b = scanner2.nextInt()


    swiping(a,b)
    var temp = a;
    a = b
    b = temp

}
fun swiping(a:Int,b:Int): IntArray {return intArrayOf(b,a)
}

fun readTheLines(): String? {
 var scannner3 = Scanner(System.`in`)

    val lines = scannner3.nextLine()
return lines
}
fun count(lines:String){
    var numbersCounter=0
    var spacesCounter=0
    var stringsCounter=0
    var othersCounter = 0
    val characterArray= lines.toCharArray()
    for (character in characterArray.withIndex())
        if (Character.isLetter(character.value)) {
            stringsCounter++
        } else if (Character.isDigit(character.value)) {
            numbersCounter++
        } else {
            if (Character.isSpaceChar(character.value)) {
                spacesCounter++
            } else {
                othersCounter++
            }
        }

    print ("Letters: $stringsCounter \n Spaces: $spacesCounter \n numbers: $numbersCounter \n others: $othersCounter")
}

fun reverseString(): String {
    var scanner4 = Scanner(System.`in`)
    var lines = scanner4.nextLine().toCharArray()

    var reverse = ""

    for (i in lines.size-1 downTo  0) {
        reverse += lines[i]
    }

    return reverse
}