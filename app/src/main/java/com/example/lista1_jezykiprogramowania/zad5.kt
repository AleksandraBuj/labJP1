package com.example.lista1_jezykiprogramowania

/**
 * @author Aleksandra Bujacz
 */

fun collatz(c_0: Int): List<Int> {
    try {
        // Rzucenie wyjątku jeśli parametr c_0 nie jest dodatni
        if (c_0 <= 0)
            throw IllegalArgumentException("Parametr c_0 musi być większy od zera!")

        // Lista przechowująca kolejne wartości ciągu Collatza
        val ciag_Collatz = mutableListOf(c_0)
        var kolejna_wartosc = c_0

        // Pętla obliczająca kolejne wyrazy ciągu Collatza
        while (kolejna_wartosc != 1) {
            kolejna_wartosc = if (kolejna_wartosc % 2 == 0) {
                kolejna_wartosc / 2  // Jeśli liczba jest parzysta, zostanie podzielona przez 2
            } else {
                3 * kolejna_wartosc + 1  // Jeśli liczba jest nieparzysta, zostanie pomnozona
            // przez 3, a nastepnie zostanie dodana cyfra 1
            }
            ciag_Collatz.add(kolejna_wartosc)
        }

        return ciag_Collatz  // Zwrócenie elementow ciągu przed wpadnięciem w cykl

    } catch (e: IllegalArgumentException) {
        // Obsługa wyjątku
        println("Nastąpił błąd: ${e.message}")
        return emptyList()
    }
}

fun main() {
    try {
        val c_0 = 7  // Wartosc poczatkowego parametru c_0
        val wynik = collatz(c_0)
        println("Ciąg Collatza dla wybranego parametru c_0 - $c_0 jest równy: $wynik.")

        // Obliczenie i wyswietlenie maksymalnej wartosci oraz dlugosci ciągu
        println("Wychodzi na to, że maksymalna wartość w ciągu wynosi: ${wynik.maxOrNull()}.")
        println("Natomiast długość ciągu przed cyklem wynosi: ${wynik.size}.")
    } catch (e: IllegalArgumentException) {
        // Obsługa wyjątku
        println("Nastąpił błąd: ${e.message}")
    }
}
