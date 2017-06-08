fun f(msg: String?): String? {
    return msg
}

fun main(args: Array<String>) {
    println(f("qwe"))
    println(f(null))
}
