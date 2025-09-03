package kotlin_collection

fun main() {
    //ImmutableMap
    val phonesPrices: Map<String, String> = mapOf(
        "iPhone" to "$999",
        "Samsung" to "$899",
        "OnePlus" to "$699"
    )
    println(phonesPrices) //{iPhone=$999, Samsung=$899, OnePlus=$699}
    //phonesPrices.add("Nokia" to "$499") //Error: Unresolved reference: add

    //MutableMap
    val laptopPrices: MutableMap<String, String> = mutableMapOf(
        "MacBook" to "$1300",
        "DELL" to "$1000",
        "HP" to "$900"
    )

    println(laptopPrices) //{MacBook=$1300, DELL=$1000, HP=$900}
    laptopPrices["HP"] = "$1100"
    println(laptopPrices) //{MacBook=$1300, DELL=$1000, HP=$1100}
    laptopPrices["Lenovo"] = "$800"
    println(laptopPrices) //{MacBook=$1300, DELL=$1000, HP=$1100, Lenovo=$800}

    //Prevent unwanted modifications
    val readOnlyLaptopPrices: Map<String, String> = laptopPrices // Assigning mutable map to immutable
    //readOnlyLaptopPrices["Sony"] = "$999" //No 'set' operator method providing array access.
}
