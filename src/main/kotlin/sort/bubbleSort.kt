package sort

fun bubbleSort(arr: IntArray) {
    val n = arr.size
    var switch: Boolean

    do {
        switch = false

        for (i in 0..<n - 1) {
            if (arr[i] > arr[i + 1]) {
                val temp = arr[i]
                arr[i] = arr[i + 1]
                arr[i + 1] = temp
                switch = true
            }
        }
    } while (switch)
}

fun main() {
    val list = intArrayOf(64, 34, 25, 12, 22, 11, 90)

    println("Original: ${list.joinToString(", ")}")
    bubbleSort(list)
    println("Sorted: ${list.joinToString(", ")}")
}