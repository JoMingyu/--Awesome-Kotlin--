fun whenF(obj: Any) {
    when(obj) {
        is String -> println("String $obj")
        is Int -> println("Integer $obj")
    }
}

fun main(args: Array<String>) {
    whenF("123")
    whenF(123)
}
