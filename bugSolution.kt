fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    // Correct way to iterate:
    for (i in list.indices) {
        println(list[i])
    }

    //Alternative using forEach
    list.forEach { println(it) }
}