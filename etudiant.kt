fun main() {
    val phrase = "Je suis etudiant en M1 Info a l'Universite de Mbujimayi"
    val voyelles: MutableList<Char> = mutableListOf()
    val consonnes: MutableList<Char> = mutableListOf()
    var index = 0
    while (index < phrase.length) {
        val c = phrase[index]
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y') {
            voyelles.add(c)
        } else if (c in 'a'..'z' || c in 'A'..'Z') {
            consonnes.add(c)
        }

        index++
    }
    println("voyelles : $voyelles")
    println("nombre de voyelles : ${voyelles.count()}")
    println("consonnes : $consonnes")
    println("nombre de consonnes : ${consonnes.count()}")
}