package com.example.lista1_jezykiprogramowania

/**
 * @author Aleksandra Bujacz
 */
//Skorzystano z metody mutableListOf wzorujac się na:
// https://www.surowiecki.org/blog/flesz/kotlin-definicja-listy-listof/

fun wspolne(multizbior_x: List<Double>, multizbior_y: List<Double>): List<Double> {
    try {
        // Rzucenie wyjątku, jeśli któryś z multizbiorów jest pusty
        if (multizbior_x.isEmpty() || multizbior_y.isEmpty()) {
            throw IllegalArgumentException("Multizbiory nie mogą być puste")
        }

        // Stworzenie listy, która bedzie przechowywala czesc wspolna multizbiorow
        val wspolny_multizbior = mutableListOf<Double>()

        // Petla for, która sprawdza czy argument z multizbioru_x wystepuje w multizbiorze_y
        for (argument in multizbior_x) {
            // Jeśli argument występuje w multizbiorze_y, dodajemy go do wspolnego multizbioru
            if (multizbior_y.contains(argument)) {
                wspolny_multizbior.add(argument)
            }
        }

        return wspolny_multizbior

    } catch (e: IllegalArgumentException) {
        // Obsługa wyjatku
        println("Nastąpił błąd: ${e.message}")
        return emptyList() // Zwrócenie pustego zbioru
    }
}

fun main() {
    try {
        val lista1 = listOf(5.0, 8.0, 6.7, 10.0, 100.1)
        val lista2 = listOf(1.0, 1.0, 1.0, 5.0)

        println("Wspólnym multizbiorem jest: ${wspolne(lista1, lista2)}")

        //Obsługa wyjatku
    } catch (e: IllegalArgumentException) {
        println("Nastąpił błąd: ${e.message}")
    }
}