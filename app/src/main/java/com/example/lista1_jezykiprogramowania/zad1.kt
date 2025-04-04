package com.example.lista1_jezykiprogramowania
/**
 * @author Aleksandra Bujacz
 */
//Skorzystano z pomocy przy wyjątkach ze strony: https://kotlinlang.org/docs/exceptions.html
import kotlin.math.sqrt

fun heron(a: Double, b: Double, c: Double): Double {

    // Rzucanie wyjątku, jeśli wartości boków trójkąta są niedodatnie.
    if (a <= 0 || b <= 0 || c <= 0) {
        throw IllegalArgumentException("Boki trójkąta nie mogą być ani zerowe, ani ujemne...")
    }

    // Rzucanie wyjątku, jeśli boki nie spełniają warunku tworzenia trójkąta
    if (a + b <= c || a + c <= b || b + c <= a) {
        throw IllegalArgumentException("Boki nie tworzą trójkąta")
    }

    // Obliczanie pola - wzór Herona
    val s = (a + b + c) / 2 // wzór na połowe obwodu
    return sqrt(s * (s - a) * (s - b) * (s - c)) // wzór na pole trójkąta
}

fun main() {
    try {
        val a = 4.7
        val b = 4.5
        val c = 9.0
        println("Pole trójkąta wynosi: ${heron(a, b, c)}")

    // Obsluga wyjatku
    } catch (e: IllegalArgumentException) {
        println("Nastąpił błąd: ${e.message}")
    }
}