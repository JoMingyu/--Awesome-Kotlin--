class CustomException : Exception {
    constructor(msg: String) : super(msg)
}

class ExceptionUse {
    fun f() {
        throw CustomException("errorerror")
    }
}

fun main(args: Array<String>) {
    var s = "123l"
    try {
        var i = s as Int
    } catch(e: ClassCastException) {
        println("Exception")
    }

    ExceptionUse().f()
}
