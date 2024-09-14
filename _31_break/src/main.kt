import kotlin.math.sqrt

/**
 *
1. Дано целое число n (>0). Найти сумму 1+1/2+1/3+…+1/n (вещественное число).
2. Даны два целых числа a и b (a<b). Найти сумму квадратов всех целых чисел от a до b включительно.
3. Даны целые числа A и B (A<B). Вывести все целые числа от A до B включительно; при этом число A должно выводиться 1 раз, число A+1 должно выводиться 2 раза и т. д. (допустим a = 3, b = 5 à 3,4,4,5,5,5)
4. Дано число n. Написать программу, которая проверяет, является ли оно простым.
5. Есть загадка: "Что это такое: синий, большой, с усами и полностью набит зайцами?" Ответ: троллейбус. Представим, что Вы загадываете эту загадку пользователю. Создайте программу, которая будет считывать с консоли ответ.

Условия задачи:
У пользователя есть 3 попытки. После трех ответов программа должна завершиться;
Если пользователь вводит "Троллейбус", мы выводим в консоль "Правильно!" и выходим из цикла;
Если пользователь вводит "Сдаюсь", мы выводим в консоль "Правильный ответ: троллейбус." и выходим из цикла;
Если пользователь вводит любой другой ответ, мы выводим в консоль "Подумай еще." и продолжаем цикл.
 */

fun harmonicSum(n: Int): Double {
    var sum = 0.0
    for (i in 1..n) {
        sum += 1.0 / i
    }
    return sum
}

fun sumOfSquares(a: Int, b: Int): Int {
    var sum = 0
    for (i in a..b) {
        sum += i * i
    }
    return sum
}

fun printNumbersWithRepetitions(a: Int, b: Int) {
    for (i in a..b) {
        repeat(i - a + 1) {
            print("$i ")
        }
    }
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    println("Задание 1")
    var n = 5
    println("Сумма: ${harmonicSum(n)}")

    println("Задание 2")
    var a = 3
    var b = 6
    println("Сумма квадратов: ${sumOfSquares(a, b)}")

    println("Задание 3")
 //   a = 3
 //   b = 5
    printNumbersWithRepetitions(a, b)
    println()
    println("Задание 4")
    n = 29
    println("Число $n простое: ${isPrime(n)}")

    println("Задание 5")
    val correctAnswer = "Троллейбус"
    var attempts = 3
    while (attempts > 0) {
        println("Что это такое: синий, большой, с усами и полностью набит зайцами?")
        val answer = readLine()
        if (answer.equals(correctAnswer, ignoreCase = true)) {
            println("Правильно!")
            break
        } else if (answer.equals("Сдаюсь", ignoreCase = true)) {
            println("Правильный ответ: троллейбус.")
            break
        } else {
            attempts--
            if (attempts > 0) {
                println("Подумай еще. Осталось попыток: $attempts")
            } else {
                println("Попытки закончились. Правильный ответ: троллейбус.")
            }
        }
    }
}