package sort

fun selectionSort(arr: IntArray) {
    val n = arr.size

    for (i in 0..<n - 1) {
        var minIndex = i

        for (j in i + 1..<n) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j
            }
        }

        if (minIndex != i) {
            val temp = arr[i]
            arr[i] = arr[minIndex]
            arr[minIndex] = temp
        }
    }
}

fun main() {
    val list = intArrayOf(64, 25, 12, 22, 11)

    println("Original: ${list.joinToString(", ")}")
    selectionSort(list)
    println("Sorted: ${list.joinToString(", ")}")
}