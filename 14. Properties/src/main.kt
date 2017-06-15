class C {
    private var title: String = ""
        get() = field
        set(value) {
            println("Set title $value")
            field = value
        }

    private var content: String = ""
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
    c.title = "qwe"
    c.content = "sdqwe"

    println("${c.title}, ${c.content}")
}
