class CustomArray(private val array: Array<Int>) {
    override fun toString(): String {
        return array.joinToString(prefix = "[", postfix = "]")
    }
}

/**
1. Создать массив из 10 чисел с плавающей точкой. Найти произведение его элементов.
2. Создать массив из 8 целых чисел. Найти среднее арифметическое его элементов.
3. Дан массив размерностью size. Вывести в том же порядке все четные числа из данного набора и количество K таких чисел.
4. Дано целое число N(>0). Сформировать и вывести целочисленный массив размера N, содержащий степени двойки от первой до N-й: 2,4,8,16,….
 */


fun main() {
    println("Задание 1")
    val array = arrayOf(1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.0)
    var result = 1.0
    for (num in array) {
        result *= num
    }
    println("Произведение элементов массива: $result")

    println("Задание 2")
    result = 0.0
    val intarray = arrayOf<Int>(4,3,5,2,12,5,6,4)
    for (num in intarray) {
        result += num
    }
    result = (result.toDouble() / intarray.size)
    println("Среднее арифметическое элементов массива: $result")

    println("Задание 3")
    val resultArray = intarray.filter { it % 2 == 0 }
    println("Массив  ${intarray.contentToString()}") // Почему так?
    println("Массив  ${intarray.toString()}")  // Почему так?
    println("Четные элементы массива ${resultArray.toString()}, Количество элементов ${resultArray.size}") // Почему так работает для resultArray?

    println("Задание 4")
    val n = 5
    val array2 = Array(n) { i -> Math.pow(2.0, (i + 1).toDouble()).toInt() }
    println("Массив элементов двойки в $n степени: ${array2.joinToString(", ")}")
}