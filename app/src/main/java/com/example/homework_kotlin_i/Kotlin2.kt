package com.example.homework_kotlin_i
import com.example.homework_kotlin_i.Kotlin2.Car
import com.example.homework_kotlin_i.Kotlin2.Person

class Kotlin2 {

    // 1. Declaración y uso de funciones básicas
    fun greet(name: String) {
        // TODO: Imprimir "Hola, {name}!" usando println
        println("Hola, $name!")
    }

    fun add(a: Int, b: Int): Int {
        // TODO: Retornar la suma de a y b
        return a + b
    }

    // 2. Funciones inline y de una sola expresión
    inline fun multiply(a: Int, b: Int) = a * b

    fun square(n: Int) = n * n // TODO: Convertir esta función a una expresión de una sola línea

    inline fun square2(n: Int, jojo: (String) -> Unit ) = n * n

    // 3. Introducción a lambdas y funciones de orden superior
    fun lambdaExample() {
        val numbers = listOf(1, 2, 3, 4, 5)
        // TODO: Usar map para duplicar los valores de numbers y almacenarlo en una nueva lista
        // TODO: Usar filter para obtener solo los números pares
        val duplicados = numbers.map { num -> num * 2 }
        val duplicados2 = numbers.map { it * 2 }

        val pares = numbers.filter { num -> num % 2 == 0 }
        println("Números duplicados: $duplicados")
        println("Números pares: $pares")
    }

    // 4. Clases y objetos
    class Person(
        private val name: String,
        private var age: Int
    ) {
        // TODO: Agregar un método que imprima "Soy {name} y tengo {age} años"
        fun introduce(){
            println("Soy $name y tengo $age años")
        }
    }

    // 5. Constructores y datos encapsulados
    class Car(
        val brand: String,
        val model: String,
        val year: Int
    ) {
        init {
            // TODO: Imprimir "Auto creado: {brand} {model} del año {year}"
            println("Auto creado: $brand $model del año $year")
        }
    }
}

fun main() {
    val kotlin2 = Kotlin2()
    // Llamar a las funciones de prueba
    kotlin2.greet("Gaston")
    println("Suma: ${kotlin2.add(3, 5)}")
    println("Multiplicación: ${kotlin2.multiply(4, 2)}")
    println("Cuadrado: ${kotlin2.square(6)}")
    kotlin2.lambdaExample()

    // Creación de objetos y uso de clases
    val person = Person("Juan", 30)
    // TODO: Llamar al método que imprime la información de la persona
    person.introduce()

    val car = Car("Toyota", "Corolla", 2022)
}
