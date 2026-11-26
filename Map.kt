fun main() {
    val promotions: MutableMap<String, Int> = mutableMapOf(
        "L1Info" to 350,
        "L2Info" to 200,
        "L3Info" to 100
    )
    promotions["M1Info"] = 50
    promotions["M2Info"] = 35
    val clesPromotions: MutableList<String> = mutableListOf()
    for (k in promotions.keys) {
        clesPromotions.add(k)
    }

    val valeursPromotions: MutableList<Int> = mutableListOf()
    for (v in promotions.values) {
        valeursPromotions.add(v)
    }
    println("cles : $clesPromotions")
    println("valeurs : $valeursPromotions")
    println("nombre items map : ${promotions.count()}")
    println("nombre elements cles : ${clesPromotions.count()}")
    println("nombre elements valeurs : ${valeursPromotions.count()}")
}