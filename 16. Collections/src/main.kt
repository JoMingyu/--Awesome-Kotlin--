fun main(args: Array<String>) {
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3)
    // Can append values
    mutableList.add(4)
    println("Mutable List : $mutableList")

    val list: List<Int> = listOf(1, 2, 3)
    println("Access to List : ${list.first()}, ${list.last()}, ${list.get(1)}, ${list[1]}")
    println("All of List : $list")
    println("Filtered : ${list.filter {it % 2 == 0}}")

    val mutableMap: MutableMap<String, Int> = mutableMapOf("key1" to 2, "key2" to 3)
    mutableMap.put("key3", 4)
    println("HashMap : $mutableMap")
    println("Filtered : ${mutableMap.filter {it.key == "key1"}}")

    val mutableSet: MutableSet<String> = mutableSetOf("first", "second", "third")
    mutableSet.add("fourth")
    for(s: String in mutableSet.iterator()) {
        print("$s ")
    }
    println()
}
