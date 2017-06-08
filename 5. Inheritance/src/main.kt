open class Base {
    var msg: String = ""

    constructor(msg: String) {
        this.msg = msg
        println("Initialized ${this.msg}")
    }
}

class Use1(msg: String) : Base(msg)

class Use2 : Base {
    constructor(msg: String) : super(msg)
}

fun main(args: Array<String>) {
    Use1("qweqwe")
    Use2("asdfasdf")
}
