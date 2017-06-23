fun main(args: Array<String>) {
    val s: String? = null // Elvis operator

    // Null check 1. use method
    if (s.isNullOrEmpty()) {
        println("s is null or empty")
    }

    // Null check 2. safe call operator
    println("s' length is ${s?.length}")

    // 3. for NullPointerException lovers
    println("s' length is ${s!!.length}")
}
