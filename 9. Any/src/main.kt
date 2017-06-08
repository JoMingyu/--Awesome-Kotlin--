fun getType(obj: Any): String {
    // Kotlin's any = Java's object
    return obj.javaClass.name
}

fun main(args: Array<String>) {
    println(getType("qweqw"))
}