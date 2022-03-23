import quick_union.QuickUnion


fun main(args: Array<String>) {

    val quickUnion = QuickUnion(10)


    quickUnion.union(2, 3)

    quickUnion.printStatus()

    quickUnion.union(3, 4)

    quickUnion.printStatus()


    quickUnion.union(8, 9)
    quickUnion.printStatus()


    quickUnion.union(9, 2)
    quickUnion.printStatus()

    quickUnion.connected(3, 9)

    quickUnion.union(5, 7)

    quickUnion.union(1, 5)

    quickUnion.printStatus()

    quickUnion.union(0, 1)
    quickUnion.printStatus()

    quickUnion.union(4, 7)

    quickUnion.printStatus()

}