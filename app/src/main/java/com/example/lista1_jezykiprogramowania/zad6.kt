package com.example.lista1_jezykiprogramowania

/**
 * @author Aleksandra Bujacz
 */

fun komplement(sekwencja: String): String? {

    val nukleotydy_komplement = mapOf(
        'A' to 'T',  // Zamiana adeniny na tymine
        'T' to 'A',  // Zamiana tyminy na adenine
        'C' to 'G',  // Zamiana cytozyny na guanine
        'G' to 'C'   // Zamiana guaniny na cytozyne
    )

    // Zamiana każdego nukleotydu na jego komplementarny odpowiednik, przy niepoprawnym znaku
    // funkcja zwraca null
    return sekwencja.map { nukleotydy_komplement[it] ?: return null }.joinToString("")
}



fun transkrybuj(sekwencja_matryca: String): String? {
    val nukleotydy_transkrypcja = mapOf(
        'A' to 'U',  // Zamiana adeniny na uracyl
        'T' to 'A',  // Zamiana tyminy na adenine
        'C' to 'G',  // Zamiana cytozyny na guanine
        'G' to 'C'   // Zamiana guaniny na cytozyne
    )

    // Zamiana każdego nukleotydu na jego komplementarny odpowiednik, przy niepoprawnym znaku
    // funkcja zwraca null
    return sekwencja_matryca.map { nukleotydy_transkrypcja[it] ?: return null }.joinToString("")
}

fun main() {
    println("Podaj prosze nić kodującą DNA  i zwróć sekwencję\n" +
            "nici matrycowej")
    //Odczytywanie danych wejsciowych od uzytkownika, uppercase do zwiekszania liter, aby uniknac bledow
    val nicKodujacaDna = readLine()?.uppercase()

    if (nicKodujacaDna.isNullOrEmpty()) {
        println("Upewnij się, że poprawnie wpisano sekwencje DNA")
        return
    }

    val nicMatrycowaDNA = komplement(nicKodujacaDna)
    if (nicMatrycowaDNA == null) {
        println("Upewnij się, że poprawnie wpisano sekwencje DNA")
        return
    }
    println("Nić matrycowa wpisanej przez Ciebie sekwencji DNA to: $nicMatrycowaDNA")

    val RNA = transkrybuj(nicMatrycowaDNA)
    if (RNA == null) {
        println("Upewnij się, że poprawnie wpisano sekwencje DNA")
        return
    }
    println("Sekwencja RNA wpisanej przez ciebie sekwencji DNA to: $RNA")
}