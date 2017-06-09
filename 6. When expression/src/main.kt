fun main(args: Array<String>) {
    println(typeChecker(123))
    println(typeChecker("123"))
}

fun typeChecker(obj: Any): String {
    when(obj) {
        is Int -> return "Int"
        is String -> return "String"
        is Double -> return "Double"
        else -> return ""
    }
}
