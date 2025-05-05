package com.example.homework_kotlin_i
// Ejercicios Kotlin 1
// Completa los ejercicios siguiendo las instrucciones en cada función

class kotlin1 {

    // Ejercicio 1: Variables y tipos de datos
    // Completa las variables con los tipos correctos
    fun ejercicio1() {
        // TODO: Declara una variable inmutable (val) llamada nombre de tipo String
        val nombre: String = "Sara"

        // TODO: Declara una variable mutable (var) llamada edad de tipo Int
        var edad: Int = 26

        // TODO: Declara una variable nullable llamada direccion de tipo String
        var direccion: String? = null

        // Imprime las variables aquí
        println("---- Ejercicio 1 ----")
        println("Nombre: $nombre, edad: $edad, direccion: $direccion")
    }

    // Ejercicio 2: Operaciones matemáticas
    // Corrige las operaciones para obtener el resultado correcto
    // Los resultados deberian ser
    // Suma = 15
    // Multiplicación = 50
    // División = 2
    fun ejercicio2() {
        val numero1 = 10
        val numero2 = 5

        val suma = numero1 + numero2
        val multiplicacion = numero1 * numero2
        val division = numero1 / numero2

        println("---- Ejercicio 2 ----")
        println("Suma: $suma")
        println("Multiplicación: $multiplicacion")
        println("División: $division")
    }

    // Ejercicio 3: Operadores relacionales
    // Completa las comparaciones para que todas devuelvan true
    fun ejercicio3() {
        val a = 10
        val b = 20

        val comparacion1 = a < b  // TODO: Modifica el operador
        val comparacion2 = a != b  // TODO: Modifica el operador
        val comparacion3 = a <= b  // TODO: Modifica el operador

        println("---- Ejercicio 3 ----")
        println("Comparaciones: $comparacion1, $comparacion2, $comparacion3")
    }

    // Ejercicio 4: Control de flujo con if
    // Completa la función para clasificar la edad
    fun ejercicio4(edad: Int) {
        println("---- Ejercicio 4 ----")
        // TODO: Implementa una estructura if-else que imprima:
        // "Menor de edad" si edad < 18
        // "Adulto" si edad está entre 18 y 65
        // "Adulto mayor" si edad > 65
        if (edad < 18){
            println("Menor de edad")
        }else if(edad >= 18 && edad < 65){
            println("Adulto")
        }else if (edad > 65){
            println("Adulto mayor")
        }
    }

    // Ejercicio 5: Control de flujo con when
    // Completa el when para clasificar las notas
    fun ejercicio5(nota: Int) {
        println("---- Ejercicio 5 ----")
        // TODO: Implementa una estructura when que imprima:
        // "Sobresaliente" si nota está entre 9 y 10
        // "Notable" si nota está entre 7 y 8
        // "Aprobado" si nota está entre 5 y 6
        // "Suspenso" si nota es menor a 5

        var mensaje: String = when {
            (nota in 9..10) ->  "Sobresaliente"
            (nota in 7..8) ->  "Notable"
            (nota in 5..6) ->  "Aprobado"
            else -> "Suspenso"
        }

        println(mensaje)
    }

    // Ejercicio 6: Bucles
    // Corrige el bucle para imprimir los números del 1 al 5
    fun ejercicio6() {
        println("---- Ejercicio 6 ----")
       // for (i in 1 downTo 5) {  // ERROR: Rango incorrecto
        for (i in 1 .. 5) {  // ERROR: Rango incorrecto
            println(i)
        }
    }

    // Ejercicio 7: Manejo de nullables
    // Completa el código para manejar valores nulos de forma segura
    fun ejercicio7(texto: String?) {
        println("---- Ejercicio 7 ----")
        // TODO: Usa el operador Elvis (?:) para imprimir el texto
        // o "Texto vacío" si es null
        var mensaje = texto ?: "Texto vacío"
        println(mensaje)
    }

    // Ejercicio 8: While y operadores lógicos
    // Completa el bucle while para encontrar el primer número
    // que sea divisible por 2 y por 3
    fun ejercicio8() {
        println("---- Ejercicio 8 ----")
        var numero = 1
        var respuesta: Int? = null
        // TODO: Implementa un bucle while que encuentre el primer número
        // divisible por 2 y por 3, comenzando desde numero = 1
        while (respuesta == null){
            if (numero % 2 == 0 && numero % 3 == 0) {
                respuesta = numero
            }
            numero++
        }

        println("Respuesta: $respuesta")
    }
}

// Puedes comentar con doble barra (//) las funciones que no quieras ejecutar para probar una a una
fun main() {
    val ejercicios = kotlin1()
    ejercicios.ejercicio1()
    ejercicios.ejercicio2()
    ejercicios.ejercicio3()
    ejercicios.ejercicio4(25)
    ejercicios.ejercicio5(8)
    ejercicios.ejercicio6()
    ejercicios.ejercicio7(null)
    ejercicios.ejercicio8()
}