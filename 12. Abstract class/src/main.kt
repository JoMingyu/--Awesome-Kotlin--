abstract class Base {
    abstract fun f()
}

class C : Base() {
    override fun f() {
        println("Overrided")
    }
}

fun main(args: Array<String>) {
    var c = C()
    c.f()
}
