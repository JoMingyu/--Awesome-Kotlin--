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
    // Kotlin에서 if는 expression으로, 값을 리턴하기 때문에 일반적인 형태의 삼항 연산자(condition ? [expr_when_true] : [expr_when_false])
    // 를 사용하지 않고 if문을 응용하는 형식으로 사용

    // if 브랜치는 블록일 수 있으며 마지막 식이 블록의 값이 됨
    max = if (a < b) {
        b
    } else {
        a
    }

    println("Max is $max")
}
