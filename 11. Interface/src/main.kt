interface Intf {
    fun f()
    fun f2() {
        // Optional
    }
}

class C : Intf {
    override fun f() {
        println("asdf")
    }

    override fun f2() {
        super.f2()
    }
}

fun main(args: Array<String>) {

}
