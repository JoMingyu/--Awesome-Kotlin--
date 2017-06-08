class Post constructor(title: String = "", content: String = "", owner: String = "private") {
    // Class with constructor

    var title: String = ""
    var content: String = ""
    var owner: String = ""

    init {
        this.title = title
        this.content = content
        this.owner = owner.toUpperCase()
        println("Initialized ${this.title}, ${this.content}, ${this.owner}")
    }
}

class Post2(title: String = "", content: String = "", owner: String = "private") {
    // Omit constructor keyword

    var title: String = ""
    var content: String = ""
    var owner: String = ""

    init {
        this.title = title
        this.content = content
        this.owner = owner.toUpperCase()
        println("Initialized ${this.title}, ${this.content}, ${this.owner}")
    }

}

class Post3 {
    // Disperse constructors

    var title: String = ""
    var content: String = ""
    var owner: String = ""

    init {
        // Every instances
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
