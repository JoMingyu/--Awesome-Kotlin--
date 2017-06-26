class SimpleClass
class ClassWithConstructor constructor(title: String) {
    // class with constructor
    init {
        println("Initialized with $title")
    }
}
class OmitConstructor(title: String) {
    // omit constructor keyword
    init {
        println("initialized with $title")
    }
}
class SeveralConstructors {
    var title: String? = ""

    constructor() {
        println("initialized with nothing")
        title = null
    }
    constructor(title: String) {
        this.title = title
        println("initialized with ${this.title}")
    }
}

open class Base(x: Int) {
    open fun f() {

    }
}
open class Under(x: Int) : Base(x) {
    var x: Int = 0

    init {
        this.x = x
    }

    final override fun f() {
        // Open class' overriding method is default open
        when(this.x) {
        // When expression
            is Int -> println("Integer")
            4 -> println("four")
            1, 2, 3 -> println("1 or 2 or 3")
            in 1..10 -> println("between 1~10")
            else -> println("I don't know!")
        }
    }
}

abstract class AbstC {
    abstract fun f()
}
interface AbstI {
    fun f() { println("interface A") }
    fun f2()
}
interface AbstI2 {
    fun f() { println("interface B") }
    fun f2()
}
class C : AbstC(), AbstI, AbstI2 {
    override fun f() {
        println("override method")
        super<AbstI>.f()
        super<AbstI2>.f()
    }

    override fun f2() {
        println("override f2")
    }
}

class Singleton private constructor() {
    companion object {
        private val singleton = Singleton()
        fun getInstance() : Singleton {
            return singleton
        }
    }
}

fun main(args: Array<String>) {
    var a: Int = 5
    var s: String? = null // Elvis operator, nullable data
    val v: Int = 8 // Read-only
    // v = 9

    for(i in 1..10) {

    }

    repeat(10) { i ->
        println("repeat loop $i")
    }

    val inherited = C()
    inherited.f()
    inherited.f2()

    val singleton = Singleton.getInstance()
    val singleton2 = Singleton.getInstance()
    println("Object 1 -> ${singleton.hashCode()}")
    println("Object 2 -> ${singleton2.hashCode()}")

    val simple = SimpleClass()
    val withConstructor = ClassWithConstructor("hello")
    val omitConstructor = OmitConstructor("hi")
    val severalConstructors = SeveralConstructors()

    val whenEx = Under(2)
    whenEx.f()
}
