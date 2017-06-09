open class Base {
    var msg: String = ""

    constructor(msg: String) {
        this.msg = msg
        println("initialized with ${this.msg}")
    }
}

class C : Base {
    constructor(msg: String) : super(msg)
}

class C1(msg: String) : Base(msg)

fun main(args: Array<String>) {
    var c = C("hello")
    var c1 = C1("hi")
}
