package kotlin_collection

fun main(){
    //Immutable Set
    val skills: Set<String> = setOf("Flutter", "Dart", "Kotlin", "Java")
    println(skills) // Output: [Flutter, Dart, Kotlin, Java]
    //skills.add("Python") // Error: Unresolved reference: add

    //MutableSet
    val mySkills: MutableSet<String> = mutableSetOf("Flutter", "Dart", "Kotlin", "Java")
    println(skills) // Output: [Flutter, Dart, Kotlin, Java]
    mySkills.add("Python")
    println(mySkills) // Output: [Flutter, Dart, Kotlin, Java, Python]

    // Note: Sets do not allow duplicate elements
    mySkills.add("Dart") //Set ignore this duplicate items
    println(mySkills) // Output: [Flutter, Dart, Kotlin, Java, Python]


    val readOnlySkills: Set<String> = mySkills // Assigning mutable set to immutable
    //readOnlySkills.add("New Skill") // Error: Unresolved reference: add
}