interface BaseInterface {
    fun onStart()
}

open class Base {
    open fun f() {
        // Enable override
        println("f")
    }

    fun nf() {}
    // Disable override
}

class UseBase : Base(), BaseInterface {
    override fun onStart() {
        println("On start")
    }

    override fun f() {
        super.f()
    }
}

fun main(args: Array<String>) {
    var base = UseBase()
    base.onStart()
    base.f()
}
