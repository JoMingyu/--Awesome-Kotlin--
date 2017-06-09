open class Base {
    open fun sum(a: Int, b: Int): Int {
        return a + b
    }
}

class C : Base() {
    override fun sum(a: Int, b: Int): Int {
        return super.sum(a, b)
    }
}

fun main(args: Array<String>) {
    var c = C()

    println(c.sum(1, 5))
}
