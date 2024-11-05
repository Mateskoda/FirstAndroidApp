package com.example.kotlinbasics

fun main() {
    //Lambda expressions : consie waY to define anonymus fun


    // basic lambda Eyxopression {parameters -> body

    val add4: () -> Unit = { println("No params no return value") }
    val add: (Int, Int) -> Int = { a, b, -> a + b }

    //
    //aanonymus functons

    val numbers = listOf(1, 2, 3, 4, 5)
    val squareAnonym = fun(x: Int): Int {
        return x * x
    }
    val squaredNumbers = numbers.map(squareAnonym)
    println(squaredNumbers)

    val result = add(5, 3)
    println(result)

    val fruits = listOf("Apple", "Banana ", "cherry")

    for (item in fruits) {
        println(item)
    }
    val vegetables = mutableListOf("Potato", "Tomato", "Broccoli")
    val colors = arrayListOf("Red", "Green", "Blue")

    vegetables.add("Carrots")

    vegetables.removeAt(0)
    for (item in vegetables) {
        println(item)
    }
    vegetables[1] = "Garlic"
    colors[1] = "Yellow"

    for (item in colors) {
        println(item)
    }

    //Immutable set

    val colorsReadOnlUnique = setOf("R", "G", "B")
    for (item in colorsReadOnlUnique) {
        println(item)
    }

    val fruitsMutable = mutableSetOf("Apple", "Banana", "Cherry")

    fruitsMutable.add("melon")
    fruitsMutable.remove("Apple")
    fruitsMutable.add("kivi")

    for (item in fruitsMutable) {
        println(item)
    }

    // mapS
    val mapOfFruits = mapOf("apple" to 5, "banana" to 8)
    for ((key, value) in mapOfFruits) {
        println("$key $value")
    }

    val veggie = mutableMapOf("potato" to 1.4, "broccoli" to 3.4)
    veggie.put("Garlic", 3.6)


    // types of anonoymus functions

    val multioly = fun(a: Int, b: Int) { println("" + a * b) }

    val multiply2 = fun(a: Int, b: Int): Int { return a * b }

    val msg2 = fun(): Unit { "No return values" }

    //higher iorder functoions

    val addresult = operateOnNumbers(5, 3, { x, y -> x + y })
    val multiplyResult = operateOnNumbers(5, 7) { x, y -> x * y }
    println(addresult)
    println(multiplyResult)

}
fun operateOnNumbers(a: Int, b: Int,operation:(Int,Int)-> Int): Int {
    return operation(a,b)

}

//IT keyword - one parameter funczions only