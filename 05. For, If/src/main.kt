fun main(args: Array<String>) {
    outer@ for(i in 0..9) {
        inner@ for(j in 0..9) {
            if(i == 2) {
                break@outer
            }
            println("Inner for $i and $j")
        }
    }

    repeat(10) { i ->
        println("Repeat $i")
    }

    var index: Int = 0
    while(true) {
        if(index++ == 100) {
            break
        }
    }
}
