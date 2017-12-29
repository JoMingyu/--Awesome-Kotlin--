fun main(args: Array<String>) {
    // When 절은 C나 Java같은 언어의 switch 표현에 해당됨
    val v = 20

    when(v) {
        1, 2 -> println("1 or 2")
        in 3..13 -> println("between 3 and 13")
        is Int -> println("int")
        else -> println("else")
    }
}
