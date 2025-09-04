package control_flow

fun main() {
    // Use when, when you have a conditional expression with multiple branches.
    val a = 5;
    when (a) {
        1 -> println("a is 1")
        2 -> println("a is 2")
        3 -> println("a is 3")
        4 -> println("a is 4")
        5 -> println("a is 5")
    }

    val b = 10
    val result = when (b) {
        10 -> "a is 1"
        20 -> "a is 2"
        else -> "Unknown value"
    }
    println("Result: $result")

    trafficSignal()
    trafficSignalAsSubject()
}

fun trafficSignal() {
    val trafficLightState: String = "Red"
    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Green" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }

    println("Traffic action: $trafficAction")
}

//Introduce 'trafficLightState' as subject of 'when'
fun trafficSignalAsSubject() {
    val trafficLightState: String = "Yellow"
    val trafficAction = when (trafficLightState) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }

    println("Traffic action: $trafficAction") //Slow down

}