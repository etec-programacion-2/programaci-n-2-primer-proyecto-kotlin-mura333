/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}
fun main() {
    println("¡Hola, Kotlin!")
    mostrarTiposDeDatos()
    println(positivonegativocero)
}
fun mostrarTiposDeDatos() {
    val nombre: String = "mura"
    val edad: Int = 25
    val altura: Double = 1.75
    val esEstudiante: Boolean = true
    
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Altura: $altura")
    println("Es estudiante: $es estudiante")
}
fun esParOImpar(numero: Int): String {
    return when {
        numero % 2 == 0 -> "Par"
        else -> "Impar"
    }
}