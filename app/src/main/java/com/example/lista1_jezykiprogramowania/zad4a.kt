package com.example.lista1_jezykiprogramowania

/**
 * @author Aleksandra Bujacz
 */

fun FibonacciIteracja(n: Int): List<Int> {
    try {
        // Rzucenie wyjątku jeśli n nie bedzie dodatnie
        if (n <= 0)
            throw IllegalArgumentException("n musi być większe od 0")

        // Lista, która będzie przechowywać ciąg Fibonacciego
        val ciag = mutableListOf(0, 1)

        // Pętla obliczająca kolejne elementy ciągu Fibonacciego
        for (element in 2 until n) {
            val nowyElement = ciag[element - 1] + ciag[element - 2]
            ciag.add(nowyElement)
        }

        return ciag  // Zwrocenie elementow ciagu

    } catch (e: IllegalArgumentException) {
        // Obsługa wyjątku
        println("Nastąpił błąd: ${e.message}")
        return emptyList()
    }
}

fun main() {
    try {
        val n = 7  // Liczba elementów ciągu Fibonacciego
        println("Ciąg dla podanej liczby elementów to: "+FibonacciIteracja(n))  //
    } catch (e: IllegalArgumentException) {
        // Obsługa wyjątku
        println("Nastąpił błąd: ${e.message}")
    }
}