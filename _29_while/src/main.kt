/**
 * 1.Пользователь вводит с клавиатуры число. Требуется посчитать факториал числа. Например, если введено 3, факториал числа 1*2*3 = 6.
 * 2.Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1, 2, …, 10 кг конфет.
 * 3.Даны два целых числа A и B (A<B). Вывести в порядке возрастания все целые числа, расположенные между A и B (включая сами числа A и B), а также количество N этих чисел.
 * 4.Дано целое число N (>0). Используя операции деления нацело и взятия остатка от деления, вывести все его цифры, начиная с самой правой.
 * 5.Напишите программу, в которой выводятся на экран числа от 1 до 20 включительно со следующими условиями:
 * если числа нечетные – их не выводить на экран, если делятся на 4 без остатка – умножаем на 2, если число равно 19 завершаем программу.
 * 6.За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите программу, в которой вычисляется конечная сумму вклада
 * с учетом начисления процентов за каждый месяц. Сумма вклада равна 350, количество месяцев – 9.
 cher1  1*/

fun factorial(n: Int): Long {
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun main() {
    println("Задание 1")
    println("Введите число: ")
    val number = readLine()!!.toInt()
    println("Факториал числа $number = ${factorial(number)}")

    println("Задание 2")
    println("Введите цену за 1 кг конфет: ")
    val pricePerKg = readLine()!!.toDouble()
    for (i in 1..10) {
        println("Стоимость $i кг конфет = ${pricePerKg * i}")
    }
    println("Задание 3")
    print("Введите число A: ")
    val A = readLine()!!.toInt()
    print("Введите число B: ")
    val B = readLine()!!.toInt()
    val numbers = (A..B).toList()
    println("Числа между A и B: $numbers")
    println("Количество чисел: ${numbers.size}")

    println("Задание 4")
    print("Введите число N: ")
    var N = readLine()!!.toInt()
    while (N > 0) {
        println(N % 10)
        N /= 10
    }

    println("Задание 5")
    for (i in 1..20) {
        if (i % 2 != 0) continue
        if (i % 4 == 0) {
            println(i * 2)
        } else {
            println(i)
        }
        if (i == 19) break
    }

    println("Задание 6")
    var deposit = 350.0
    val months = 9
    val rate = 0.07

    for (i in 1..months) {
        deposit += deposit * rate
    }
    println("Конечная сумма вклада: %.2f".format(deposit))
}