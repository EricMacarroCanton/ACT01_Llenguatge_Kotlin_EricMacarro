package com.example.act01_llenguatge_kotlin

data class Persona(
    val name: String,
    val age: Int,
    val entreteniments: List<String>
)
fun main() {
    val jo = Persona(
        name = "Eric",
        age = 19,
        entreteniments = listOf("Basket", "Videojocs", "Gimnàs", "Futbol", "Amics")
    )

}