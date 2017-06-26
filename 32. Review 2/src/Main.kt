// Focus on classes

open class Over(v: String) {
    open fun f() {

    }
}

class Sub: Over {
    constructor(v: String) : super(v)
    // First way, constructor on sub class' body
}

class Sub2(v: String): Over(v) {
    // Second way, constructor with sub class

    override fun f() {
        super.f()
    }
}

class Custom(msg: String): Exception(msg)

class Custom2: Exception {
    constructor(msg: String, another: String) : super(msg)
}

abstract class AbstC {
    abstract fun f()
    abstract fun f2()
}

interface Interface {
    abstract fun f()
}

class Under : AbstC(), Interface {
    override fun f() {
        
    }

    override fun f2() {

    }
}
