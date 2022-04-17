



fun main(args: Array<String>) {


    val arr = arrayOf(4, 2, 6, 3, 9)

    println("arr = $arr")

    var sorted = false

    while(!sorted) {
        sorted = true
        for (i in 0..arr.size) {
            if(arr[i] < arr[i - 1]) {
                val temp = arr[i]
                arr[i] = arr[i - 1]
                arr[i - 1] = temp;
                sorted = false;
            }
        }
    }

    println("arr sorted = $arr")

}