package dynamic_connectivity.weighted_quick_union

class WeightedQuickUnion(n: Int) {

    private var ids = Array(10) { i -> i }

    init {
        for (i in 0 until n) {
            ids[i] = i
        }
    }

    fun connected(q: Int, p: Int) : Boolean {

        val result = root(p) == root(q)

        println("$q and $p are connected = $result, because root of $q is ${root(q)} and root of $p is ${root(p)}")

        return result
    }

        /*
         chase pointers until you reach the root
       */
        private fun root(i: Int): Int {

            var currentPos = i
            while (currentPos != ids[currentPos]) {
                currentPos = ids[currentPos]
            }
            return currentPos
        }


        /*
        Change root of P to point to root of Q
        */
        fun union(q: Int, p: Int) {

            println("union of $q and $p")

            val pRoot = root(p)
            val qRoot = root(q)

            ids[pRoot] = qRoot

        }


        fun printStatus() {
            println()
            print(" ")

            ids.forEachIndexed { i, item->
                print("$i  ")
            }
            println()
            print("[")
            ids.forEach {
                print("$it, ")
            }
            println("]")

            println()

        }
}