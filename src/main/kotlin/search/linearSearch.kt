package search

fun linearSearch(list: List<Int>, value: Int): Int {
    for (i in list.indices) {
        if (list[i] == value) {
            return i
        }
    }
    return -1
}

fun main() {
    val list = listOf(1, 3, 5, 7, 9, 11, 13, 15)
    val value = 7

    val res = linearSearch(list, value)

    if (res != -1) {
        println("The value $value was found at index $res.")
    } else {
        println("The value $value was not found.")
    }
}