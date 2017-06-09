class C private constructor() {
    companion object {
        val c = C()
        fun getInstance(): C {
            return c
        }
    }
}

class NonCompanion

fun main(args: Array<String>) {
    var c = C.getInstance()
    var c2 = C.getInstance()

    var nonC = NonCompanion()
    var nonC2 = NonCompanion()

    println("c : ${c.hashCode()}, c2 : ${c2.hashCode()}")
    println("nonC : ${nonC.hashCode()}, nonC2 : ${nonC2.hashCode()}")
}
