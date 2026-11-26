fun main() {
    val n = 5
    var fact = 1
    var i = 1
    while (i <= n) {
        fact = fact * i
        i++
    }
    println("factoriel de $n = $fact")
}