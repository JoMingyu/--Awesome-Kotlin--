fun main(args: Array<String>) {
    var x = 10

    while (x > 0) {
        x--
    }

    do {
        val y = null
    } while (y != null)
    // 블록 내부의 변수 사용 가능

    // 코틀린은 루프에서 전통적인 break와 continue 키워드를 지원함
    while (true) {
        break
    }
}
