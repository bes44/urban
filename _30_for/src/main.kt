import kotlin.math.sqrt

/**
  * 1. Даны два числа a и b. Найти их среднее арифметическое.
2. Дана площадь S круга. Найти его диаметр D и длину L окружности, ограничивающей этот круг, учитывая, что L=π∗D, S=π∗D2/4. В качестве значения π использовать 3.14.
3. Даны координаты двух противоположных вершин прямоугольника: (x1,y1), (x2,y2). Стороны прямоугольника параллельны осям координат. Найти периметр и площадь данного прямоугольника.
4. Необходимо вывести на консоль такую последовательность чисел:
1 2 4 8 16 32 64 128 256 512
5. Дано целое число n = 20. Уменьшая его до 0, вывести на экран только четные числа.
 */
fun main() {
    println("Задание 1")
    val a = 10
    val b = 20
    val average = (a + b) / 2.0
    println("Среднее арифметическое: $average")

    println("Задание 2")
    val S = 50.0
    val pi = 3.14
    val D = sqrt(4 * S / pi)
    val L = pi * D
    println("Диаметр: $D")
    println("Длина окружности: $L")

    println("Задание 3")
    val x1 = 1
    val y1 = 2
    val x2 = 4
    val y2 = 6
    val width = kotlin.math.abs(x2 - x1)
    val height = kotlin.math.abs(y2 - y1)
    val perimeter = 2 * (width + height)
    val area = width * height
    println("Периметр: $perimeter")
    println("Площадь: $area")

    println("Задание 4")
    var number = 1
    while (number <= 512) {
        print("$number ")
        number *= 2
    }
    println()
    println("Задание 5")
    var n = 20
    while (n >= 0) {
        if (n % 2 == 0) {
            println(n)
        }
        n--
    }

}