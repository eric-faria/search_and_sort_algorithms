package sort

fun mergeSort(arr: IntArray) {
    if (arr.size > 1) {
        val mid = arr.size / 2
        val left = arr.sliceArray(0..<mid)
        val right = arr.sliceArray(mid..<arr.size)

        mergeSort(left)
        mergeSort(right)

        var i = 0
        var j = 0
        var k = 0

        while (i < left.size && j < right.size) {
            if (left[i] < right[j]) {
                arr[k] = left[i]
                i++
            } else {
                arr[k] = right[j]
                j++
            }
            k++
        }

        while (i < left.size) {
            arr[k] = left[i]
            i++
            k++
        }

        while (j < right.size) {
            arr[k] = right[j]
            j++
            k++
        }
    }
}

fun main() {
    val list = intArrayOf(38, 27, 43, 3, 9, 82, 10)

    println("Original: ${list.joinToString(", ")}")
    mergeSort(list)
    println("Sorted: ${list.joinToString(", ")}")
}