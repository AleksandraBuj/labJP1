package com.example.lista1_jezykiprogramowania

/**
 * @author Aleksandra Bujacz
 */

fun podzbiory(zbior: List<String>): List<List<String>> {
    try {
        // Rzucenie wyjątku, jeśli zbiór jest pusty
        if (zbior.isEmpty()) {
            throw IllegalArgumentException("Zbiór nie może być pusty")
        }

        // Lista, która będzie przechowywała wszystkie podzbiory
        val podzbior = mutableListOf<List<String>>()

        // Zdefiniowanie pustego podzbioru
        podzbior.add(emptyList())

        // Pętla dla każdego argumentu w zbiorze
        for (argument in zbior) {
            val nowy_zbior = mutableListOf<List<String>>()
            for (podzbior in podzbior) {
                nowy_zbior.add(podzbior + argument)
            }
            // Połaczenie podzbiorow w jeden
            podzbior.addAll(nowy_zbior)
        }

        return podzbior

    } catch (e: IllegalArgumentException) {
        // Obsługa wyjątku
        println("Nastąpił błąd: ${e.message}")
        return emptyList() // Zwrócenie pustej listy, gdy zbiór jest pusty
    }
}

fun main() {
    try {
        // Przykładowy zbiór
        val lista = listOf("o", "l", "a")

        // Wywołanie funkcji i wypisanie wszystkich podzbiorów
        println("Podzbiory należące do zbioru ${lista} to: ${podzbiory(lista)}")

    } catch (e: IllegalArgumentException) {
        // Obsługa wyjątku
        println("Wystąpił błąd: ${e.message}")
    }
}