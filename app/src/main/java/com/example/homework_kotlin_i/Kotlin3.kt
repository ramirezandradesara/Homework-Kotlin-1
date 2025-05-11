package com.example.homework_kotlin_i
import com.example.homework_kotlin_i.Kotlin3.Dog
import com.example.homework_kotlin_i.Kotlin3.Animal

class Kotlin3 {

    // 1. Herencia y polimorfismo básicos
    open class Animal(val name: String) {
        open fun makeSound() {
            // TODO: Imprimir "El animal hace un sonido"
            println("El animal hace un sonido")
        }
    }

    class Dog(name: String) : Animal(name) {
        override fun makeSound() {
            // TODO: Imprimir "$name ladra"
            println("$name ladra")
        }
    }

    // 2. Colecciones en Kotlin
    fun collectionOperations() {
        val numbers = mutableListOf(1, 2, 3, 4, 5)
        // TODO: Agregar el número 6 a la lista
        numbers.add(6)

        // TODO: Remover el número 2 de la lista
        numbers.remove(2)
        println("Numbers: $numbers")

        // TODO: Usar map para duplicar los valores
        val duplicatedNumbers = numbers.map { it * 2 }
        println("Duplicados: $duplicatedNumbers")

        // TODO: Usar filter para obtener solo los números impares
        val oddNumbers = numbers.filter{ it % 2 != 0 }
        println("Odd: $oddNumbers")
    }

    // 3. Clases de datos y destructuración
    data class Person(
        val name: String,
        val age: Int
    )

    fun dataClassExample() {
        val person1 = Person("Juan", 30)
        // TODO: Crear una copia de person1 con otro nombre
        val person2 = person1.copy("Damián")

        // TODO: Comparar person1 con su copia
        println("Is person1 equal to person2? ${person1.hashCode() == person2.hashCode()}")

        // TODO: Usar destructuración para obtener name y age
        val (name, age) = person1
        println("Name: $name, age: $age ")
    }
}

fun main() {
    // Herencia y polimorfismo
    val kotlin = Kotlin3()
    val animal = Animal("Milo")
    animal.makeSound()
    val dog = Dog("Firulais")
    dog.makeSound()

    // Colecciones
    kotlin.collectionOperations()

    // Clases de datos y destructuración
    kotlin.dataClassExample()
}