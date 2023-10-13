package sort

fun quickSort(arr: IntArray, start: Int, end: Int) {
    if (start < end) {
        val pivotIndex = partition(arr, start, end)
        quickSort(arr, start, pivotIndex - 1)
        quickSort(arr, pivotIndex + 1, end)
    }
}

fun partition(arr: IntArray, start: Int, end: Int): Int {
    val pivot = arr[end]
    var i = start - 1

    for (j in start until end) {
        if (arr[j] < pivot) {
            i++
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
        }
    }

    val temp = arr[i + 1]
    arr[i + 1] = arr[end]
    arr[end] = temp

    return i + 1
}

fun main() {
    val list = intArrayOf(38, 27, 43, 3, 9, 82, 10)

    println("Original: ${list.joinToString(", ")}")
    quickSort(list, 0, list.size - 1)
    println("Sorted: ${list.joinToString(", ")}")
}