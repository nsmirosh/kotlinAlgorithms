package sorting.insertion_sort

// Java program for implementation of Insertion Sort
internal class InsertionSort {
    /*Function to sort array using insertion sort*/
    fun sort(arr: IntArray) {
        val n = arr.size
        for (i in 1 until n) {
            val key = arr[i]
            print("saving arr[$i] in key = $key, ")
            var j = i - 1
            println("j = $j, ")

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            // basically make room for the key and where to insert it

            println("performing check arr[$j] > $key ")

            while (j >= 0 && arr[j] > key) {
                print("arr[$j] > $key so ")
                arr[j + 1] = arr[j]
                println("move arr[$j] up to arr[${j+1}] ")
                j = j - 1
            }
            arr[j + 1] = key
            println("set $key at arr[${j+1}]")

            print("array = ")
            printArray(arr)
            println()

        }
    }

    companion object {
        /* A utility function to print array of size n*/
        fun printArray(arr: IntArray) {
            val n = arr.size
            for (i in 0 until n) print(arr[i].toString() + " ")
            println()
        }

        // Driver method
        @JvmStatic
        fun main(args: Array<String>) {
            val arr = intArrayOf(12, 11, 13, 5, 6)
            printArray(arr)
            val ob = InsertionSort()
            ob.sort(arr)
            printArray(arr)
        }
    }
} /* This code is contributed by Rajat Mishra. */