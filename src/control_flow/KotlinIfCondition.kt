package control_flow

fun main() {
    val d: Int
    val i: Int
    val check = true
    d = if (check) {
        10
    } else {
        20
    }
    println("Value of d = $d")

    i = if (check) {
        30
    } else {
        20
    }

    println("Value of i = $i")

    // There is no ternary operator in Kotlin.
    val a = 1;
    val b = 2;

    println("The large value from $a and $b is: ${if (a > b) a else b}")
}