class C constructor(msg: String)

class C1(msg: String)

class C2 {
    var msg: String = ""

    constructor(msg: String) {
        this.msg = msg
        println("Initialized with ${this.msg}")
    }
}

fun main(args: Array<String>) {
    var c = C("hello")
    var c1 = C1("hello")
    var c2 = C2("hello")
}
