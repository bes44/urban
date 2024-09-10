/**
 * Цель: Написать программу на языке Kotlin для работы с переменными и типами данных.
   1. Дана сторона квадрата a. Найти его периметр P=4∗a.
   2. Дана сторона квадрата a. Найти его площадь S=a*a
   3. Даны стороны прямоугольника a и b. Найти его площадь S=a∗b и периметр P=2∗(a+b).
   4. Дан диаметр окружности d. Найти ее длину L=π∗d. В качестве значения π использовать константу 3.14.
   5. Дано расстояние L в сантиметрах. Используя операцию деления нацело, найти количество полных метров в нем (1 метр = 100 см).
   6. Даны целые положительные числа A и B (A>B). На отрезке длины A размещено максимально возможное количество отрезков длины B (без наложений).
    Используя операцию деления нацело, найти количество отрезков B, размещенных на отрезке A.
Примечания:
- Для вывода значений на экран используйте функцию println().
Пример результата выполнения программы:
P = 25 | S = 30 | L=40 | A=50
 */

fun main(){

    val a = 5
    val b = 10
    val d = 8
    val l = 250
    val aA = 20
    val bB = 3

    val perimeterSquare = 4 * a
    println("Периметр квадрата: P = $perimeterSquare")

    val areaSquare = a * a
    println("Площадь квадрата: S = $areaSquare")

    val areaRectangle = a * b
    val perimeterRectangle = 2 * (a + b)
    println("Площадь прямоугольника: S = $areaRectangle")
    println("Периметр прямоугольника: P = $perimeterRectangle")

    val pi = 3.14
    val circumference = pi * d
    println("Длина окружности: L = $circumference")

    val fullMeters = l / 100
    println("Количество полных метров в $l см: $fullMeters")

    val segments = aA / bB
    println("Количество отрезков длины $bB на отрезке длины $aA: $segments")
    println()
    println("P = $perimeterSquare | S = $areaSquare| S = $areaRectangle | P = $perimeterRectangle| L = $circumference | в $l см: $fullMeters м | на отрезке $aA помещается $segments отрезков $bB |")


}