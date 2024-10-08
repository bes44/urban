import kotlin.math.roundToInt

/**
 *
*1. Дан порядковый номер месяца года. Нужно написать программу, которая будет выводить на экран время года и название месяца. Пример вывода: «Зима: Январь.»
*2. Дана переменная с плавающей точкой. Написать программу, которая округляет эту переменную до целого числа.
*3. Написать программу, которая определяет время суток. Допустим с 0 часов до 5 -"Раннее утро", с 6 до 11 – утро, с 12 до 17 - день, с 17 – 20 – вечер, после 20 до 23 – поздний вечер.
*4. Даны две переменные a = 8, b = 5. Написать алгоритм, при котором a = 5, b = 8.
*Примечания:
*- Для вывода значений на экран используйте функцию println().
*/

fun main() {

    println("Задание 1")
    val month = 1 // Замените на нужный номер месяца
    val seasons = mapOf(
        1 to "Зима: Январь", 2 to "Зима: Февраль", 3 to "Весна: Март",
        4 to "Весна: Апрель", 5 to "Весна: Май", 6 to "Лето: Июнь",
        7 to "Лето: Июль", 8 to "Лето: Август", 9 to "Осень: Сентябрь",
        10 to "Осень: Октябрь", 11 to "Осень: Ноябрь", 12 to "Зима: Декабрь"
    )
    println(seasons[month] ?: "Неверный номер месяца")

    println("Задание 2")
    val number = 5.67
    var roundedNumber = number.roundToInt()
 //   if ((number-roundedNumber)>0.5) roundedNumber++
    println("Округленное число: $roundedNumber")

    println("Задание 3")
    val hour = 14 // Замените на нужный час
    val timeOfDay = when (hour) {
        in 0..5 -> "Раннее утро"
        in 6..11 -> "Утро"
        in 12..17 -> "День"
        in 17..20 -> "Вечер"
        in 21..23 -> "Поздний вечер"
        else -> "Неверное время"
    }
    println(timeOfDay)

    println("Задание 4")
    var a = 8
    var b = 5
    val temp = a
    a = b
    b = temp
    println("a = $a, b = $b")


}