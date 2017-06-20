fun main(args: Array<String>) {
    val map: Map<String, Int> = mapOf("key1" to 1, "key2" to 2)
    for((key, value) in map) {
        println("$key : $value")
    }
}
