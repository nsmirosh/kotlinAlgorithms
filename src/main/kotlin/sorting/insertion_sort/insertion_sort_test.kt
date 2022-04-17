package sorting.insertion_sort

fun main(args: Array<String>) {


    val arr = intArrayOf(4, 2, 6, 3, 9)

    val insertionSort = InsertionSort()
    insertionSort.sort(arr)

    println("arr sorted = $arr")

}