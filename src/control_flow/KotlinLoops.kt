package control_flow

import kotlin.random.Random

fun main() {
    simpleForLoops()
    collectionsIteratedOverByLoops()
    whileLoop()
    doWhileLoop()
}

//simple for loops
fun simpleForLoops() {
    println("Simple for loops")
    for (number in 1..5) {
        print("$number ") //1 2 3 4 5
    }
}

//Collections iterated over by loops:
fun collectionsIteratedOverByLoops() {
    println("\nCollections iterated over by loops")
    val names = listOf<String>("Ruhul", "Nishat", "Hozaifa")
    for (name in names) {
        print("$name ") //Ruhul Nishat Hozaifa
    }

}

//while loop
fun whileLoop() {
    println("\nWhile loop")
    var number = 0
    while (number < 3) {
        print("$number ") //0 1 2
        number++
    }

}

//do-while loop
fun doWhileLoop() {
    println("\nDo-while loop")
    var number = 0
    do {
        print("$number ") //0 1 2
        number++
    }while (number <3)
}