fun main(args: Array<String>) {
    val a = 3
    val b = 5

    var max = 0
    // 전통적인 용법
    if (a < b) {
        max = b
    } else {
        max = a
    }

    // 식 형태의 삼항 연산
    max = if (a < b) b else b

    // if 브랜치는 블록일 수 있으며 마지막 식이 블록의 값이 됨
    max = if (a < b) {
        b
    } else {
        a
    }

    println("Max is $max")
}
