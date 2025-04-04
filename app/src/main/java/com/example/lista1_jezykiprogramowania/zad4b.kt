package com.example.lista1_jezykiprogramowania

/**
 * @author Aleksandra Bujacz
 */


fun FibonacciRekurencja(n: Int): List<Int> {
    try {
        // Rzucenie wyjątku jeśli n nie będzie dodatnie
        if (n <= 0)
            throw IllegalArgumentException("n musi być większe od 0")

        // Funkcja rekurencyjna, która oblicza n-ty wyraz ciągu
        fun rekurencja(n: Int): Int {
            return when (n) {
                0 -> 0   // Pierwszy wyraz ciągu
                1 -> 1   // Drugi wyraz ciągu
                else -> rekurencja(n - 1) + rekurencja(n - 2) // suma dwóch poprzednich wyrazow
            }
        }

        // Lista, która będzie przechowywać ciąg Fibonacciego
        val ciag = mutableListOf<Int>()

        // Pętla, która wywołuje funkcję rekurencyjną dla każdego n i dodaje do listy
        for (i in 0 until n) {
            ciag.add(rekurencja(i))
        }

        return ciag

    } catch (e: IllegalArgumentException) {
        // Obsługa wyjątku, jeśli n <= 0
        println("Nastąpił błąd: ${e.message}")
        return emptyList()
    }
}

fun main() {
    try {
        val elementy = 7  // Liczba elementów ciągu Fibonacciego
        println("Ciąg dla podanej liczby elementów to: "+ FibonacciRekurencja(elementy))  // Wywołanie funkcji i wypisanie wyniku
    } catch (e: IllegalArgumentException) {
        // Obsługa wyjątku
        println("Nastąpił błąd: ${e.message}")
    }
}