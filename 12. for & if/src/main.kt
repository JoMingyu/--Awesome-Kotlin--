fun main(args: Array<String>) {
    repeat(10) { i ->
        print("$i ")
    }

    println()
    for(i in 0..9) {
        print("$i ")
    }

    println()
    outer@ for(i in 0..9) {
        inner@ for(j in 0..9) {
            if(i == 2) {
                break@outer
            }
            println("$i and $j ")
        }
    }
}
