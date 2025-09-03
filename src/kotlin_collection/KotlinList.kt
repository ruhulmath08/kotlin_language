package kotlin_collection

fun main(){
    // Immutable List
    val fruits: List<String> = listOf("Apple", "Banana", "Orange")
    println(fruits) //[Apple, Banana, Orange]
    println(fruits[1]) //Banana
    //fruits.add('Grapes') //Unresolved reference 'add'.

    //Mutable list
    val names: MutableList<String> = mutableListOf("Ruhul", "Reza", "Mezbah")
    println(names) //[Ruhul, Reza, Mezbah]
    names.remove("Mezbah")
    names.add("Emon")
    println(names) //[Ruhul, Reza, Emon]

    //Prevent unwanted modifications
    val readOnlyNames: List<String> = names // Assigning mutable list to immutable
    println(readOnlyNames) //[Ruhul, Reza, Emon]
    //readOnlyNames.add("New Name") // Error: Unresolved reference: add
}