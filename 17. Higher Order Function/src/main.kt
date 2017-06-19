fun main(args: Array<String>) {
    val map: Map<String, Int> = mapOf("key1" to 1, "key2" to 12, "key3" to 110, "key4" to 150, "key5" to -3, "key6" to -99, "key17" to 15)

    println(map.filterKeys { it.matches(Regex("key\\d")) }.filterValues { it > 0 && it % 2 == 0 }.count { it.value > 100 })
}
