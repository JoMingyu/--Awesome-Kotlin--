class Gen<T>(t: T) {
    var value = t
}

fun main(args: Array<String>) {
//    val gen: Gen<Int> = Gen<Int>(2)
//    val gen = Gen<Int>(2)
    val gen = Gen(2)

    println(gen.value)
}
