class C {
    var title: String = ""
        get() = field
        set(value) {
            println("Set title $value")
            field = value
        }

    var content: String = ""
        get() = field
        set(value) {
            println("Set content $value")
            field = value
        }

    constructor()
    constructor(title: String, content: String) {
        this.title = title
        this.content = content
    }
}

fun main(args: Array<String>) {
    var c = C()
    c.title = "hello"
    c.content = "hi"

    println("${c.title}, ${c.content}")
}
