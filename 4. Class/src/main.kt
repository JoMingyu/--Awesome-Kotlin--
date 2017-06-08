class Post constructor(title: String = "", content: String = "", owner: String = "private") {
    init {
        println("In constructor")
    }

    val title = title
    val content = content
    val owner = owner.toUpperCase()
}

class Post2(title: String = "", content: String = "", owner: String = "private") {
    init {
        println("In constructor")
    }

    val title = title
    val content = content
    val owner = owner.toUpperCase()
}

class Post3 {
    var title: String = ""
    var content: String = ""
    var owner: String = ""

    init {
    }

    constructor() {
        // Empty constructor
    }

    constructor(title: String, content: String) {
        this.title = title
        this.content = content
        this.owner = "private"

        println("Initialized ${this.title}, ${this.content}, ${this.owner}")
    }

    constructor(title: String, content: String, owner: String) {
        this.title = title
        this.content = content
        this.owner = owner.toUpperCase()

        println("Initialized ${this.title}, ${this.content}, ${this.owner}")
    }
}

fun main(args: Array<String>) {
    val post = Post3("asdf", "zxcv")
    val post2 = Post3("fasd", "qweqwr", "jomingyu")

    println()
    println("First post = ${post.title}")
    println("Second post = ${post2.title}")
}
