/**
 *
1.Найти минимальный элемент в целочисленном массиве размера 3 х 3.
2.Создать матрицу размером 3 х 5. Найти элемент в этом массиве, который является средним(медиана).

3. Дана матрица размером 5 х 5. Заполнить ее единицами в таком   порядке:
0 0 0 0 0
0 0 0 0 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1
4. Дан набор целых чисел. Найти второе максимальное число.
 */

fun findMin(matrix: Array<Array<Int>>): Int {
    var min = matrix[0][0]
    for (row in matrix) {
        for (element in row) {
            if (element < min) {
                min = element
            }
        }
    }
    return min
}

fun findMedian(matrix: Array<Array<Int>>): Double {
    val flattened = matrix.flatten().sorted()
    val middle = flattened.size / 2
    return if (flattened.size % 2 == 0) {
        (flattened[middle - 1] + flattened[middle]) / 2.0
    } else {
        flattened[middle].toDouble()
    }
}

fun fillMatrix(): Array<Array<Int>> {
    val matrix = Array(5) { Array(5) { 0 } }
    for (i in 0 until 5) {
        for (j in 0..i) {
            matrix[4 - i + j][j] = 1
        }
    }
    return matrix
}

fun findSecondMax(numbers: List<Int>): Int? {
    val uniqueNumbers = numbers.distinct().sortedDescending()
    return if (uniqueNumbers.size >= 2) uniqueNumbers[1] else null
}

fun main() {
    println("Задание 1")
    val matrix = arrayOf(
        arrayOf(3, 5, 1),
        arrayOf(7, 2, 8),
        arrayOf(9, 4, 6)
    )
    println("Минимальный элемент: ${findMin(matrix)}")
    println("Задание 2")
    val matrix2 = arrayOf(
        arrayOf(1, 3, 5, 7, 9),
        arrayOf(2, 4, 6, 8, 10),
        arrayOf(11, 13, 15, 17, 19)
    )
    println("Медиана: ${findMedian(matrix2)}")
    println("Задание 3")
    val matrix3 = fillMatrix()
    for (row in matrix3) {
        println(row.joinToString(" "))
    }
    println("Задание 4")
    val matrix4 = listOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)
    val secondMax = findSecondMax(matrix4)
    if (secondMax != null) {
        println("Второе максимальное число: $secondMax")
    } else {
        println("Нет второго максимального числа.")
    }

}