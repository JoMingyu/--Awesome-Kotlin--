class Comp private constructor() {
    companion object {
        fun getInstance() = Comp()
    }
}

fun main(args: Array<String>) {
    var c = Comp.getInstance()
}
