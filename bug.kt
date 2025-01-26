fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    //This will cause an IndexOutOfBoundsException
    for (i in 0..list.size) {
        println(list[i])
    }
}