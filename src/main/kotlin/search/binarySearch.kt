package search

fun binarySearch(list: List<Int>, value: Int): Int {
    var left = 0
    var right = list.size - 1

    while (left <= right) {
        val middle = left + (right - left) / 2

        if (list[middle] == value) {
            return middle
        }

        if (list[middle] < value) {
            left = middle + 1
        } else {
            right = middle - 1
        }
    }

    return -1
}

fun main() {
    val list = listOf(1, 3, 5, 7, 9, 11, 13, 15)
    val value = 13

    val res = binarySearch(list, value)

    if (res != -1) {
        println("The value $value was found at index $res.")
    } else {
        println("The value $value was not found.")
    }
}
