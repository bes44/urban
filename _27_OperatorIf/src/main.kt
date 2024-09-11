import java.sql.SQLOutput

/**
 * Цель: Написать программу на языке Kotlin для работы с переменными и типами данных.

1. Дано целое число. Если оно является положительным, то прибавить к нему 1; в противном случае не изменять его. Вывести полученное число.
2. Даны целые числа: 4, 45, -2, 8. Найти количество положительных чисел в исходном наборе.
3. Даны два числа. Вывести большее из них.
4. Дано целое число в диапазоне 1–7. Вывести строку — название дня не дели, соответствующее данному числу (1 — «понедельник», 2 — «вторник» и т. д.).
5. Дано целое число K. Вывести строку-описание оценки, соответствующей числу (1 — «плохо», 2 — «неудовлетворительно», 3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»).
Если не лежит в диапазоне 1–5, то вывести строку «ошибка».
6. Арифметические действия над числами пронумерованы следующим образом: 1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление.
Дан номер действия (целое число в диапазоне 1–4) и числа типа double(не равно 0). Выполнить над числами указанное действие и вывести результат.
 */

fun main() {
    println("Задача 1")
    val number = 5
    val result = if (number > 0) number + 1 else number
    println("Результат: $result")

    println("Задача 2")
    val numbers = listOf(4, 45, -2, 8)

    //   решение красивее
    //   val positiveCount = numbers.count { it > 0 }
    var positiveCount = 0
    for (number: Int in numbers) {
        if (number > 0) positiveCount++
    }
    println("Количество положительных чисел: $positiveCount")

    println("Задача 3")
    val num1 = 10
    val num2 = 20
    val max = if (num1 > num2) num1 else num2
    println("Большее число: $max")

    println("Задача 4")
    val dayNumber = 2

    /*  решение красивее
       val dayName = when (dayNumber) {
           1 -> "понедельник"
           2 -> "вторник"
           3 -> "среда"
           4 -> "четверг"
           5 -> "пятница"
           6 -> "суббота"
           7 -> "воскресенье"
           else -> "на неделе нет такого дня"
       }
    */
    var dayName: String = ""
    if ( dayNumber == 1) dayName = "понедельник"
    else if ( dayNumber == 2) dayName = "вторник"
    else if ( dayNumber == 3) dayName = "среда"
    else if ( dayNumber == 4) dayName = "четверг"
    else if ( dayNumber == 5) dayName = "пятница"
    else if ( dayNumber == 6) dayName = "суббота"
    else if ( dayNumber == 7) dayName = "воскресенье"
    else dayName = "на неделе нет такого дня"
    println("День недели: $dayName")

    println("Задача 5")
    val grade = 4
    /* решение красивее
    val gradeDescription = when (grade) {
        1 -> "плохо"
        2 -> "неудовлетворительно"
        3 -> "удовлетворительно"
        4 -> "хорошо"
        5 -> "отлично"
        else -> "Такие оценки в России не ставят"
    }
     */
    var gradeDescription: String = ""
    if ( grade == 1) gradeDescription = "плохо"
    else if ( grade == 2) gradeDescription = "неудовлетворительно"
    else if ( grade == 3) gradeDescription = "удовлетворительно"
    else if ( grade == 4) gradeDescription = "хорошо"
    else if ( grade == 5) gradeDescription = "отлично"
    else gradeDescription = "Такие оценки в России не ставят"
    println("Описание оценки: $gradeDescription")

    println("Задача 6")
    val actionNumber = 3
    val a = 10.0
    val b = 5.0
    /* решение красивее
    val actionResult = when (actionNumber) {
        1 -> a + b
        2 -> a - b
        3 -> a * b
        4 -> a / b
        else -> "ошибка"
    }
     */
    var actionResult = 0.0
    if ( actionNumber == 1) {actionResult = a+b}
    else if ( actionNumber == 2) {actionResult = a-b}
    else if ( actionNumber == 3) {actionResult = a*b}
    else if ( actionNumber == 4) { if (b != 0.0) actionResult =a / b
         else  println("Ошибка: деление на ноль")
    }
    else println("Операция не предусмотрена")
    println("Результат действия: $actionResult")
}
